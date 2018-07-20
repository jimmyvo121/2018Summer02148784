package edu.httpscsgsu.a2018summer02148784.bean;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.httpscsgsu.a2018summer02148784.R;


public class CustomDialog extends Dialog {

    //Define variable of the listener
    private ICustomDialogEventListener listener;

    //Define interface: Listener
    public interface ICustomDialogEventListener
    {
        public void onClickListener(String msg);
    }

    public CustomDialog(@NonNull Context context, ICustomDialogEventListener listener)
    {
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_custom);
        //receive the listener from outside
        ButterKnife.bind(this);
        this.listener = listener;
    }

    @OnClick(R.id.dialog_submit)
    public void ok(View view){
        listener.onClickListener("OK");
        dismiss();
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_custom);
        ButterKnife.bind(this);
    }

}
