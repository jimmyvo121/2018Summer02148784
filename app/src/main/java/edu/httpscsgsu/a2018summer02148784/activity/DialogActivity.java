package edu.httpscsgsu.a2018summer02148784.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.bean.CustomDialog;

public class DialogActivity extends BaseActivity{

    private int checkedId;
    @OnClick(R.id.dialog_submit)
    public void submit(View view)
    {
        switch (checkedId)
        {
            case R.id.dialog_custom:
                CustomDialog.ICustomDialogEventListener listener = new CustomDialog.ICustomDialogEventListener() {
                    public void onClickListener(String msg)
                    {
                        toastShort(msg);
                    }
                };

                CustomDialog dialog = new CustomDialog(this, listener);
                dialog.show();

                break;

        }
    }

    @BindView(R.id.dialog_radiogroup)
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedId = checkedId;
            }
        });
    }
}
