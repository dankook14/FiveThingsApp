package com.example.android.fivethingsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void who(View view) {

        CheckBox gdCheckBox = (CheckBox) findViewById(R.id.gd_checkbox);
        boolean clickGd = gdCheckBox.isChecked();

        CheckBox tyCheckBox = (CheckBox) findViewById(R.id.ty_checkbox);
        boolean clickTy = tyCheckBox.isChecked();

        CheckBox topCheckBox = (CheckBox) findViewById(R.id.top_checkbox);
        boolean clickTop = topCheckBox.isChecked();

        CheckBox daeCheckBox = (CheckBox) findViewById(R.id.dae_checkbox);
        boolean clickDae = daeCheckBox.isChecked();

        CheckBox viCheckBox = (CheckBox) findViewById(R.id.vi_checkbox);
        boolean clickVi = viCheckBox.isChecked();

        String summaryMessage = createSummary(clickGd, clickTy, clickTop, clickDae, clickVi);

        displayMessage(summaryMessage);
    }

//    private String whoIsHe(boolean clickGd, boolean clickTy, boolean clickTop, boolean clickDae, boolean clickVi) {
//
//        if(clickGd){
//            basePrice = basePrice + 1;
//        }
//
//        if(addChocolate) {
//            basePrice = basePrice + 2;
//        }
//
//        return quantity * basePrice;
//    }


    private String createSummary(boolean clickGd, boolean clickTy, boolean clickTop, boolean clickDae, boolean clickVi) {
        String Message = "Hello!";

        Message += "\nDo you want to know G-drangon?" + clickGd;
        if(clickGd){
            Message += "\nReal name : Gwon Jiyong";
            Message += "\nBirth : 1988/8/18";
            Message += "\nHeight : 177cm";
            Message += "\nWeight : 58kg";
            Message += "\nDebut : 2006/08/19";
        }

        Message += "\nDo you want to know Taeyang?" + clickTy;
        if(clickTy){
            Message += "\nReal name : Dong Yeongbae";
            Message += "\nBirth : 1988/5/18";
            Message += "\nHeight : 173cm";
            Message += "\nWeight : 58kg";
            Message += "\nDebut : 2006/08/19";
        }

        Message += "\nDo you want to know T.O.P?" + clickTop;
        if(clickTop){
            Message += "\nReal name :  Choi Seunghyun";
            Message += "\nBirth : 1987/11/4";
            Message += "\nHeight : 181cm";
            Message += "\nWeight : 65kg";
            Message += "\nDebut : 2006/08/19";
        }

        Message += "\nDo you want to know Daeseong?" + clickDae;
        if(clickDae){
            Message += "\nReal name : Kang Daeseong";
            Message += "\nBirth : 1989/4/26";
            Message += "\nHeight : 178cm";
            Message += "\nWeight : 63kg";
            Message += "\nDebut : 2006/08/19";
        }

        Message += "\nDo you want to know V.I?" + clickVi;
        if(clickGd){
            Message += "\nReal name : Lee seunghyun";
            Message += "\nBirth : 1990/12/12";
            Message += "\nHeight : 177cm";
            Message += "\nWeight : 60kg";
            Message += "\nDebut : 2006/08/19";
        }

        Message += "\nThank you!";
        return Message;
    }


    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.summary_text_view);
        orderSummaryTextView.setText(message);
    }
}