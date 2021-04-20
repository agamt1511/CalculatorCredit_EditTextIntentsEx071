package com.example.calculatorcredit_edittextintentsex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    Button btn;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        btn = (Button)findViewById(R.id.btn);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

        start();
    }

    private void start() {
        Intent gi = getIntent();
        float lastResult = gi.getIntExtra("lastResult",0);
        tv2.setText("The last result obtained in the calculator is: " + lastResult);
    }

    public void back(View view) {
        Intent ri = new Intent(this,MainActivity.class);
        startActivity(ri);
    }
}