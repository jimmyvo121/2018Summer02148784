package edu.httpscsgsu.a2018summer02148784.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;
import edu.httpscsgsu.a2018summer02148784.R;

public class AnimatorActivity extends BaseActivity {
    private ValueAnimator repeatAnimator;

    @BindView(R.id.text_anim)
    TextView textView;

    @OnClick(R.id.animator_trans)
    public void trans(){
        ObjectAnimator animator =
                ObjectAnimator.ofFloat(textView, "translationX", 0, 120); //translationY
        animator.setDuration(2000);
        animator.start();
    }
    @OnClick(R.id.animator_set)
    public void scale(){
        ObjectAnimator animator =
                ObjectAnimator.ofFloat(textView, "scaleX", 0,3,1,2,5,1); //scaleY
        animator.setDuration(5000);
        animator.start();
    }
    @OnClick(R.id.animator_color)
    public void color(){
        ObjectAnimator animator =
                ObjectAnimator.ofInt
                        (textView, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
        animator.setDuration(8000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.start();
    }
    @OnClick(R.id.animator_char)
    public void charFAnim(){
        ValueAnimator animator =
                ValueAnimator.ofObject
                        (new CharEvaluator(),new Character('A'),new Character('Z'));
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                char text = (char)animation.getAnimatedValue();
                textView.setText(String.valueOf(text));
            }
        });
        animator.setDuration(10000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();
    }
    @OnClick(R.id.animator_alpha)
    public void alpha(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView,"alpha",1,0,1);
        animator.setDuration(2000);
        animator.start();
    }
    @OnClick(R.id.animator_rotation)
    public void rotation(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView,"rotationY",0,360,0);//rotationX   rotationY
        animator.setDuration(4000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(2);
        animator.start();
    }

    @OnClick(R.id.anim_start_bt)
    public void startAnimator(){
        repeatAnimator = doAnimatorListener();
//        repeatAnimator.setStartDelay(3000);
        repeatAnimator.start();
    }

    @OnClick(R.id.anim_cancel_bt)
    public void cancleAnimator(){
        repeatAnimator.cancel();
        repeatAnimator.removeAllListeners();
        repeatAnimator.removeAllUpdateListeners();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
    }
    private ValueAnimator doAnimatorListener() {
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 400);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int curValue = (int) animation.getAnimatedValue();
                textView.layout(textView.getLeft(), curValue, textView.getRight(), curValue + textView.getHeight());

            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                AnimatorActivity.this.toastShort("Start");
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                AnimatorActivity.this.toastShort("end");

            }

            @Override
            public void onAnimationCancel(Animator animation) {
                AnimatorActivity.this.toastShort("cancel");

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                AnimatorActivity.this.toastShort("repeat");

            }


        });
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
        valueAnimator.setRepeatCount(2);
//        animator.setInterpolator(new CycleInterpolator(10));
        valueAnimator.setDuration(2000);

        return valueAnimator;

    } private class CharEvaluator implements TypeEvaluator<Character> {
        @Override
        public Character evaluate(float fraction, Character startValue, Character endValue) {
            int startInt  = (int)startValue;
            int endInt = (int)endValue;
            int curInt = (int)(startInt + fraction *(endInt - startInt));
            char result = (char)curInt;
            return result;
        }
    }
    public class ArgbEvaluator implements TypeEvaluator {
        public Object evaluate(float fraction, Object startValue, Object endValue) {
            int startInt = (Integer) startValue;
            int startA = (startInt >> 24);//0x(A)ff(R)ff(G)ff(B)
            int startR = (startInt >> 16) & 0xff;
            int startG = (startInt >> 8) & 0xff;
            int startB = startInt & 0xff;
            int endInt = (Integer) endValue;
            int endA = (endInt >> 24);
            int endR = (endInt >> 16) & 0xff;
            int endG = (endInt >> 8) & 0xff;
            int endB = endInt & 0xff;
            return (int)((startA + (int)(fraction * (endA - startA))) << 24) |
                    (int)((startR + (int)(fraction * (endR - startR))) << 16) |
                    (int)((startG + (int)(fraction * (endG - startG))) << 8) |
                    (int)((startB + (int)(fraction * (endB - startB))));
        }
    }
}
