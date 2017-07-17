package com.example.xu.chenfinalproject.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;


import com.example.xu.chenfinalproject.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by xu on 6/21/17.
 */

public class ServingDialog extends Dialog {

    private final IServingDialogListener listener;

    public interface IServingDialogListener{
        public void onOKClicked(String msg);
//        public void onCancelClicked();

    }

    @OnClick(R.id.Serving_ok1)
    public void ok(View view){
        listener.onOKClicked("You clicked OK");
        cancel();

    }
    public ServingDialog(@NonNull Context context, IServingDialogListener listener) {
        super(context,R.style.dialog);
        setContentView(R.layout.serving_dialog);
        ButterKnife.bind(this);
        this.listener = listener;
    }
}

