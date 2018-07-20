package edu.httpscsgsu.a2018summer02148784.activity;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.dialog.Quiz3Dialog;

public class Quiz3Activity extends BaseActivity
{
    @OnClick(R.id.quiz3_dialog)
    public void showDialog()
    {
        Quiz3Dialog.IQuiz3DialogEventListener listener = new Quiz3Dialog.IQuiz3DialogEventListener() {
            @Override
            public void onYesClickListener(String msg)
            {
                toastShort(msg);
            }

            @Override
            public void onNoClickListener(String msg)
            {
                toastShort(msg);
            }

            @Override
            public void onExitClickListener(String msg)
            {
                toastShort(msg);
                close();
            }
        };
        Quiz3Dialog dialog = new Quiz3Dialog(Quiz3Activity.this, listener);
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        ButterKnife.bind(this);
    }

    public void close()
    {
        this.finish();
    }
}