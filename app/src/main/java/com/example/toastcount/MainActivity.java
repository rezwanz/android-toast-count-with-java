package com.example.toastcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tv;
int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.textView);
    }

    public void showToast(View view) {
        Toast.makeText(this,tv.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    public void Count(View view) {
        a++;
        tv.setText(String.valueOf(a));
    }
}