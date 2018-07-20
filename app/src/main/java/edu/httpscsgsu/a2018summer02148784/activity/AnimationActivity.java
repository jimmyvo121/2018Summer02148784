package edu.httpscsgsu.a2018summer02148784.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.adapter.AdvancePageAdapter;
import edu.httpscsgsu.a2018summer02148784.fragment.Test1Fragment;
import edu.httpscsgsu.a2018summer02148784.fragment.WorkFragment;

public class AnimationActivity extends BaseActivity{

   private Animation alpha;
    private Animation set;
    private Animation trans;
    private Animation scale;
    private Animation rotate;

    @BindView((R.id.anim_area))
    TextView textView;
    @OnClick( R.id.trans_bt)
        public void trans (View view) {
        textView.startAnimation(trans);
    }

    @OnClick( R.id.alpha_bt)
    public void alpha (View view) {
        textView.startAnimation(alpha);
    }

    @OnClick( R.id.set_bt)
    public void set (View view) {
        textView.startAnimation(set);
    }
    @OnClick( R.id.scale_bt)
    public void scale (View view) {
        textView.startAnimation(scale);
    }
    @OnClick(R.id.rotate_bt)
    public void rotate (View view) {
        textView.startAnimation(rotate);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this );
        initAnimation();

    }
    private void  initAnimation(){
        trans = AnimationUtils.loadAnimation(this,R.anim.anim_trans);
        alpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        set = AnimationUtils.loadAnimation(this, R.anim.anim_set);
        scale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        rotate = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
    }

}
