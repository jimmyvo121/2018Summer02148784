package edu.httpscsgsu.a2018summer02148784.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.bean.CustomDialog;

public class DialogActivity extends AppCompatActivity {

    private int checkedId;
    @onClick(R.id.dialog_submit)
    public void submit(View view){

    }

    @BindView(R.id.dialog_radiogroup)
    RadioGroup radioGroup;

    protected void


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener((new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (checkedId){
                    case R.id.dialog_custom:
                        CustomDialog.CustomDialogeventListner listner
                                = new CustomDialog.CustomDialogeventListner() {
                            @Override
                            public void onClickListner(String msg) {

                            }
                        }

                }
            }
        }));
    }
}
