package com.example.gitdeam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startTextActivity(View view) {
      startActivity(new Intent(this, oneActivity.class));
        Toast.makeText(this,"你是不是",Toast.LENGTH_LONG);
    }
}
