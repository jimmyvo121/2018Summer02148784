package edu.httpscsgsu.a2018summer02148784.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import edu.httpscsgsu.a2018summer02148784.R;

public class CheckBoxActivity extends BaseActivity {
    @BindView(R.id.checkbox1)
    CheckBox ck1;
    @BindView(R.id.checkbox1)
    CheckBox ck2;
    @BindView(R.id.checkbox1)
    CheckBox ck3;

    @OnClick(R.id.checkSubmit)
    public void submit(View v){
        String msg = " You Checked:";
        for(Map.Entry<Integer,Boolean> entry : checkList.entrySet()){
            if(entry.getValue()){
                switch (entry.getKey()){
                    case R.id.checkbox1:
                        msg += "checkbo1";
                        break;
                    case R.id.checkbox2:
                        msg += "checkbo1";
                        break;
                    case R.id.checkbox3:
                        msg += "checkbo1";
                        break;
                        default:
                            msg += ("nothing");
                            break;
                }
            }
        }
    }

    private Map<Integer,Boolean> checkList= new HashMap<Integer,Boolean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });



    }
}
