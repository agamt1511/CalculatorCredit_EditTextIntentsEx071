package com.example.calculatorcredit_edittextintentsex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, multiplies, divide, ac, equal, credits;
    EditText et;
    int checkPressed = 0;
    String st;
    float num1 = 0;
    float sum = 0;
    String sumSt;
    int lis = 0;
    int meq = 0;


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

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                lis = 0;

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                lis = 1;
            }

            @Override
            public void afterTextChanged(Editable s) {
                lis = 1;

            }
        });

    }


    public void add(View view) {
        st = et.getText().toString();
        et.getText().clear();
        num1 = Float.parseFloat(st);
        sum = sum + num1;
        et.getText().clear();

        if (lis == 1){
            et.getText().clear();
        }
        checkPressed = 1;
    }

    public void subtract(View view) {
        st = et.getText().toString();
        et.getText().clear();
        num1 = Float.parseFloat(st);
        sum = sum - num1;
        et.getText().clear();

        if (lis == 1){
            et.getText().clear();
        }
        checkPressed = 2;
    }

    public void multiply(View view) {
        st = et.getText().toString();
        et.getText().clear();
        num1 = Float.parseFloat(st);
        sum = sum * num1;
        et.getText().clear();

        if (lis == 1){
            et.getText().clear();
        }
        checkPressed = 3;
    }

    public void todivide(View view) {
        st = et.getText().toString();
        et.getText().clear();
        if (st == "0") {
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }
        else {
            num1 = Float.parseFloat(st);
            sum = sum / num1;
            et.getText().clear();

            if (lis == 1){
                et.getText().clear();
            }
        }
        checkPressed = 4;
    }

    public void delete(View view) {

        int length = et.length();
        et.getText().delete(0,length);

        sum = 0;
    }

    public void worth(View view) {

        st = et.getText().toString();
        et.getText().clear();
        num1 = Float.parseFloat(st);
        if (meq != 1) {
            if (checkPressed == 1) {
                sum = sum + num1;
            } else if (checkPressed == 2) {
                sum = sum - num1;
            } else if (checkPressed == 3) {
                sum = sum * num1;
            } else if (checkPressed == 4) {
                sum = sum / num1;
            }
        }
        sumSt = String.valueOf(sum);
        et.getText().clear();
        et.setText(sumSt);
        meq = 1;
    }

    public void gocredits(View view) {
        Intent si = new Intent(this,SecondActivity2.class);
        si.putExtra("lastResult",sum);
        startActivity(si);

    }

}

