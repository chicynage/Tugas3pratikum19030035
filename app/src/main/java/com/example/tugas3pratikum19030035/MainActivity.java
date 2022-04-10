package com.example.tugas3pratikum19030035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void input (View view) {
        EditText inputnamatimA = findViewById(R.id.txtTimA);
        EditText inputnamatimB = findViewById(R.id.txtTimB);

        String namatimA = inputnamatimA.getText().toString();
        Log.d(TAG, namatimA);
        String namatimB = inputnamatimB.getText().toString();
        Log.d(TAG, namatimB);

        Intent intent = new Intent(this, SkorAktivity.class);
        intent.putExtra("Tim A", namatimA);
        intent.putExtra("Tim B", namatimB);
        startActivity(intent);

    }
}