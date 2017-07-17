package com.example.xu.chenfinalproject;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.xu.chenfinalproject.dialog.ServingDialog;
import com.example.xu.chenfinalproject.dialog.ServingDialog2;
import com.example.xu.chenfinalproject.dialog.ServingDialog3;
import com.example.xu.chenfinalproject.dialog.ServingDialog4;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ServingActivity extends BaseActivity {

    private int checkedID;

    @BindView(R.id.activity_radio_group)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_radio_group_submit)
    public void submit(View view){
      //  shortToast("You chose Radio Button: "+checkedID);
        if(checkedID == R.id.rb1){
            servingDialog();

        }
        if(checkedID == R.id.rb2){
            servingDialog2();

        }
        if(checkedID == R.id.rb3){

            servingDialog3();
        }
        if(checkedID == R.id.rb4){

            servingDialog4();
        }
        if(checkedID == R.id.rb5){

            servingDialog();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serving);
        ButterKnife.bind(this);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged (RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;

            }
        });

    }

    private void servingDialog(){
        ServingDialog servingDialog = new ServingDialog(this, new ServingDialog.IServingDialogListener(){
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }

        });
        servingDialog.setCanceledOnTouchOutside(true);
        servingDialog.show();

    }

    private void servingDialog2(){
        ServingDialog2 servingDialog2 = new ServingDialog2(this, new ServingDialog2.IServingDialogListener(){
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }

        });
        servingDialog2.setCanceledOnTouchOutside(true);
        servingDialog2.show();

    }

    private void servingDialog3(){
        ServingDialog3 servingDialog3 = new ServingDialog3(this, new ServingDialog3.IServingDialogListener(){
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }

        });
        servingDialog3.setCanceledOnTouchOutside(true);
        servingDialog3.show();

    }

    private void servingDialog4(){
        ServingDialog4 servingDialog4 = new ServingDialog4(this, new ServingDialog4.IServingDialogListener(){
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }

        });
        servingDialog4.setCanceledOnTouchOutside(true);
        servingDialog4.show();

    }
}



