package edu.httpscsgsu.a2018summer02148784.bean;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;



public class CustomDialog extends Dialog {

    private CustomDialogEventListener listener;

    public interface CustomDialogeventListner{
        public void onClickListner (String msg);
    }

    public CustomDialog(@NonNull Context context, CustomDialogEventListener listener) {

        super(context);
        this.listener = listener;
    }

}
