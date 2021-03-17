package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        TextView result = findViewById(R.id.output);

        Button btn = (Button) view;
        String str = btn.getText().toString();
        result.setText(str);

    }

    public void doSwitch(View view) {
        TextView result = findViewById(R.id.output);

        Button btn = (Button) view;
        String str = btn.getText().toString();
        result.setText(str);

    }
    public void clear(View view) {
        TextView result = findViewById(R.id.output);

        Button btn = (Button) view;
        String str = btn.getText().toString();
        result.setText(str);

    }


}