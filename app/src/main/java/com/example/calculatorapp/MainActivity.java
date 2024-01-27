package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_n1, et_n2;
    TextView tv_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_n1=findViewById(R.id.et_n1);
        et_n2=findViewById(R.id.et_n2);
        tv_res=findViewById(R.id.tv_res);
    }
    public void add(View view)
    {
        int n1, n2, res;
        n1=Integer.parseInt(et_n1.getText().toString());
        n2=Integer.parseInt((et_n2.getText().toString()));
        res=n1+n2;
        tv_res.setText("Result="+res);
    }
    public void sub(View view){
        int n1, n2, res;
        n1=Integer.parseInt(et_n1.getText().toString());
        n2=Integer.parseInt(et_n2.getText().toString());
        res=n1-n2;
        tv_res.setText("Result="+res);
    }
    public void mul(View view){
        int n1, n2, res;
        n1=Integer.parseInt(et_n1.getText().toString());
        n2=Integer.parseInt(et_n2.getText().toString());
        res=n1*n2;
        tv_res.setText("Result="+res);
    }
    public void div(View view){
        int n1, n2, res;
        n1=Integer.parseInt(et_n1.getText().toString());
        n2=Integer.parseInt(et_n2.getText().toString());
        res=n1/n2;
        tv_res.setText("Result="+res);
    }
}