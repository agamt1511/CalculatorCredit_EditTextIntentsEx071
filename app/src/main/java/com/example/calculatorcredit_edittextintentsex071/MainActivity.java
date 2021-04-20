package com.example.calculatorcredit_edittextintentsex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
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
    float lastResult;


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
        worth(view);
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
            sum = num1 + sum;
        }
        checkPressed = 1;
    }

    public void subtract(View view) {
        worth(view);
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
        }
        checkPressed = 2;
    }

    public void multiply(View view) {
        worth(view);
        st = et.getText().toString();
        et.getText().clear();
        num1 = Float.parseFloat(st);
        checkPressed = 3;
    }

    public void todivide(View view) {
        worth(view);
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
        }
        checkPressed = 4;
    }

    public void delete(View view) {
        et.getText().delete(0,et.length());
        sum = 0;
        checkPressed = 0;
    }

    public void worth(View view) {
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            st = et.getText().toString();
            et.getText().clear();
            sum = Float.parseFloat(st);
            if (checkPressed == 1) {
                sum = num1 + sum;
            } else if (checkPressed == 2) {
                sum = num1 - sum;
            } else if (checkPressed == 3) {
                sum = num1 * sum;
            } else if (checkPressed == 4) {
                if (st == "0") {
                    Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                } else {
                    sum = num1 / sum;
                }
            }
            sumSt = String.valueOf(sum);
            et.getText().clear();
            et.setText(sumSt);
            checkPressed = 5;
            lastResult = sum;
        }
    }


    public void gocredit(View view) {
        Intent si = new Intent(this,SecondActivity2.class);
        si.putExtra("lastResult",lastResult);
        startActivity(si);
    }
}
