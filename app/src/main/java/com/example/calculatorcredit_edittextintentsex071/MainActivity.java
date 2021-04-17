package com.example.calculatorcredit_edittextintentsex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, multiplies, divide, ac, equal, credits;
    EditText et;
    int checkPressed = 0;
    float lastResult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiplies = (Button)findViewById(R.id.multiplies);
        divide = (Button)findViewById(R.id.divide);
        ac = (Button)findViewById(R.id.ac);
        equal = (Button)findViewById(R.id.equal);
        credits = (Button)findViewById(R.id.credits);
        et = (EditText)findViewById(R.id.et);
    }

    public void add(View view) {


    }

    public void subtract(View view) {

    }

    public void multiply(View view) {

    }

    public void todivide(View view) {

    }

    public void delete(View view) {
        if (checkPressed==0) {
            int length = et.length();
            et.getText().delete(length-1,length);
        }
        else if (checkPressed==1){
            lastResult = 0;
            et.getText().clear();
            checkPressed=0;
        }

    }

    public void worth(View view) {
    }

    public void gocredits(View view) {
        Intent si = new Intent(this,SecondActivity2.class);
        si.putExtra("lastResult",lastResult);
        startActivity(si);

    }

    public void question(View view) {
    }
}