package edu.httpscsgsu.a2018summer02148784.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.gesture.Gesture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.util.LogUtil;
import edu.httpscsgsu.a2018summer02148784.util.UtilLog;

public class Quiz5Activity extends BaseActivity implements View.OnTouchListener {


    @BindView(R.id.quiz5_textView)
    TextView tv;
    @BindView(R.id.text_bingo)
    TextView Bingo;

    private GestureDetector gestureDetector;
    private int sumX=0;
    private int sumY=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        ButterKnife.bind(this);
        gestureDetector = new GestureDetector(this,new simpleGestureListener());
        tv.setOnTouchListener(this);
        tv.setFocusable(true);
        tv.setClickable(true);
        tv.setLongClickable(true);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }
    private ValueAnimator doAnimatorListener(){
        ValueAnimator animator = ValueAnimator.ofInt(0,400);


        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int curValue = (int)animation.getAnimatedValue();
                Bingo.layout(Bingo.getLeft(),curValue,Bingo.getRight(),curValue+Bingo.getHeight());
            }
        });


        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                toastShort("Started");
                LogUtil.LogD("Yan","animation start");
            }
            @Override
            public void onAnimationEnd(Animator animation) {
                toastShort("Ended");
                LogUtil.LogD("Yan","animation end");
            }
            @Override
            public void onAnimationCancel(Animator animation) {
                toastShort("Canceled");
                LogUtil.LogD("Yan","animation cancel");
            }
            @Override
            public void onAnimationRepeat(Animator animation) {
                toastShort("Repeated");
                LogUtil.LogD("Yan","animation repeat");
            }
        });
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(2);
//        animator.setInterpolator(new CycleInterpolator(10));
        animator.setDuration(2000);
        return animator;
    }

    private  class simpleGestureListener extends
            GestureDetector.SimpleOnGestureListener {
        /***** onDown->onShowPress->onLongPress*****/
        boolean isToast = false;

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            UtilLog.LogD("Gesture", "onScroll");
            UtilLog.LogD("Gesture", "distanceY:" + distanceY);
            UtilLog.LogD("Gesture", "distanceX:" + distanceX);
            sumX += distanceX;
            if (!isToast) {
                if (sumX < 0) {
                    if (Math.abs(sumX) > 1000) {
                        isToast = true;
                        //sumX=0;
                        Bingo.setVisibility(View.VISIBLE);
                        ObjectAnimator animator =
                                ObjectAnimator.ofFloat(Bingo, "translationX", 0, 100); //translationY

                        toastShort("You scroll from left to right");

                        //Bingo.setWidth();
//                        ObjectAnimator animator =
//                                ObjectAnimator.ofFloat(Bingo, "scaleX", 0,1); //scaleY
                        animator.setDuration(3000);
                        animator.start();


                    }
                }
                if (sumX > 0) {
                    if (Math.abs(sumX) > 1000) {
                        isToast = true;
                        //sumX=0;


                        ObjectAnimator animator =
                                ObjectAnimator.ofFloat(Bingo, "translationX", 0, 100); //translationY
//
//                        ObjectAnimator animator =
//                                ObjectAnimator.ofFloat(Bingo, "scaleX", 1,0); //scaleY

                        toastShort("You scroll from right to left");
                        animator.setDuration(3000);
                        animator.start();

                        Bingo.setVisibility(View.INVISIBLE);

                    }
                }


            }


            return super.onScroll(e1, e2, distanceX, distanceY);
        }
        public boolean onDown(MotionEvent e) {
            UtilLog.LogD("Gesture","onDown");
            isToast=false;
            sumX=0;
            sumY=0;
            return super.onDown(e);
        }

    }
}
