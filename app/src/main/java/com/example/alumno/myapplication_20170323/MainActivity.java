package com.example.alumno.myapplication_20170323;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)super.findViewById(R.id.btn1);
        txt1 = (TextView)super.findViewById(R.id.txt);

        View.OnClickListener listener = new MyListener();
        btn1.setOnClickListener(listener);
    }
}