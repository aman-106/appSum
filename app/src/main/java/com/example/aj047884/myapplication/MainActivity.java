package com.example.aj047884.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//import static android.provider.AlarmClock.EXTRA_MESSAGE;

//import sumclass.java;
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sumfunction(View view )
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        sumclass sumobj = new sumclass();
        EditText text1 = (EditText) findViewById(R.id.number1);
        EditText text2= (EditText) findViewById(R.id.number2);
        int num1= Integer.parseInt(text1.getText().toString());
        int num2= Integer.parseInt(text2.getText().toString());
        intent.putExtra("num1",num1);
        intent.putExtra("num2",num2);
//        intent.putExtra("objvar", sumobj );
        startActivity(intent);
    }


}
