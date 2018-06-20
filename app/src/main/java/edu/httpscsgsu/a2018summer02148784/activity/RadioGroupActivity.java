package edu.httpscsgsu.a2018summer02148784.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.httpscsgsu.a2018summer02148784.R;

public class RadioGroupActivity extends BaseActivity{

   private int checkedId;

    @BindView(R.id.radio_radiogroup )
        RadioGroup radioGroup;

    @onClick(R.id.radio_group_bt)
    public void submit(View view){
        switch(checkedId){
            case R.id.radio_rb1:
                toastShort("chose 1");
                break;
            case R.id.radio_rb2:
                toastShort("chose 2");
                break;
            case R.id.radio_rb3:
                toastShort("chose 3");
                break;
        }
    }
    @BindView(R.id.radio_group_bt)
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        setContentView(R.layout.activity_radio_group);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioGroupActivity.this.checkedId = checkedId;
            }
        });
    }
}
