package com.example.aj047884.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        int val1= getIntent().getIntExtra("num1",0);
        int val2= getIntent().getIntExtra("num2",0);
        sumclass sumobj = new sumclass();
        sumobj.setintA(val1);
        sumobj.setintB(val2);
        int sumvalue = sumobj.cals();
//        int sumvalue = val1 + val2;
//        int sumvalue=12;
        String value= Integer.toString(sumvalue);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(value);
//        textView.setText(sumvalue);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);

    }
}
