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
    int lis = 0;


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
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            if (lis != 0) {
                if (checkPressed == 1) {
                    sum = num1 + sum;
                } else if (checkPressed == 2) {
                    sum = num1 - sum;
                } else if (checkPressed == 3) {
                    sum = num1*sum;
                } else if (checkPressed == 4) {
                    if (st == "0") {
                        Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                    } else {
                        sum = num1 / sum;
                    }
                }
            }

            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
            sum = num1 + sum;
        }
        checkPressed = 1;
        lis++;
    }

    public void subtract(View view) {
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            if (lis != 0) {
                if (checkPressed == 1) {
                    sum = num1 + sum;
                } else if (checkPressed == 2) {
                    sum = num1 - sum;
                } else if (checkPressed == 3) {
                    sum = num1*sum;
                } else if (checkPressed == 4) {
                    if (st == "0") {
                        Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                    } else {
                        sum = num1 / sum;
                    }
                }
            }

            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
            sum = num1 - sum;
        }
        checkPressed = 2;
        lis++;
    }

    public void multiply(View view) {
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            if (lis != 0) {
                if (checkPressed == 1) {
                    sum = num1 + sum;
                } else if (checkPressed == 2) {
                    sum = num1 - sum;
                } else if (checkPressed == 3) {
                    sum = num1*sum;
                } else if (checkPressed == 4) {
                    if (st == "0") {
                        Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                    } else {
                        sum = num1 / sum;
                    }
                }
            }

            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
            if (sum != 0){
                sum = sum *num1;
            }
            else {
                sum = 1;
                sum = sum *num1;
            }
        }
        checkPressed = 3;
        lis++;
    }

    public void todivide(View view) {
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            if (lis != 0) {
                if (checkPressed == 1) {
                    sum = num1 + sum;
                } else if (checkPressed == 2) {
                    sum = num1 - sum;
                } else if (checkPressed == 3) {
                    sum = num1*sum;
                } else if (checkPressed == 4) {
                    if (st == "0") {
                        Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                    } else {
                        sum = num1 / sum;
                    }
                }
            }

            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
            if (num1 != 0){
                if (sum !=0){
                    sum = sum/num1;}
                else {
                    sum = 1;
                }
            }
            else {
                Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
            }
        }
        checkPressed = 4;
        lis++;
    }

    public void delete(View view) {
        et.getText().delete(0,et.length());
        sum = 0;
        checkPressed = 0;
        lis = 0;
    }

    public void worth(View view) {
        if ((TextUtils.isEmpty(et.getText().toString()))) {
            Toast.makeText(this, "ERROR, You did not enter input", Toast.LENGTH_LONG).show();
        }
        else {
            st = et.getText().toString();
            et.getText().clear();
            num1 = Float.parseFloat(st);
            if (lis > 1) {
                if (checkPressed == 1) {
                    sum = sum + num1;
                } else if (checkPressed == 2) {
                    sum = sum - num1;
                } else if (checkPressed == 3) {
                    sum = sum * num1;
                } else if (checkPressed == 4) {
                    if (st == "0") {
                        Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                    } else {
                        sum = sum / num1;
                    }
                }
            }
            if (checkPressed == 1) {
                sum = sum + num1;
            } else if (checkPressed == 2) {
                sum = sum - num1;
            } else if (checkPressed == 3) {
                sum = sum * num1;
            } else if (checkPressed == 4) {
                if (st == "0") {
                    Toast.makeText(this, "ERROR, Can not divide by zero", Toast.LENGTH_LONG).show();
                } else {
                    sum = sum / num1;
                }
            }

            st = et.getText().toString();
            sumSt = String.valueOf(sum);
            et.getText().clear();
            et.setText(sumSt);
            checkPressed = 5;
        }
    }


    public void gocredit(View view) {
        Intent si = new Intent(this,SecondActivity2.class);
        si.putExtra("lastResult",sum);
        startActivity(si);
    }
}
