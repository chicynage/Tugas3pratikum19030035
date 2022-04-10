package com.example.tugas3pratikum19030035;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkorAktivity extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor_aktivity);

        TextView namatimA = findViewById(R.id.TimA);
        TextView namatimB = findViewById(R.id.TimB);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namatimA.setText("Team" + " " + namaA);
        namatimB.setText("Team" + " " + namaB);
    }

    public void tambah(View view){
        if(view.getId()==R.id.satuA){
            skorA=skorA+1;
        } else if (view.getId()==R.id.duaA){
            skorA=skorA+2;
        } else if (view.getId()==R.id.tigaA){
            skorA=skorA+3;
        } else if (view.getId()==R.id.satuB){
            skorB=skorB+1;
        } else if (view.getId()==R.id.duaB){
            skorB=skorB+2;
        } else if (view.getId()==R.id.tigaB){
            skorB=skorB+3;
        }

        TextView skortimA = findViewById(R.id.skorA);
        TextView skortimB = findViewById(R.id.skorB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
    public void Reset(View view){
        if(view.getId()==R.id.ResetA){
            skorA=0;
        }
        else if (view.getId()==R.id.ResetB){
            skorB=0;
        }
        TextView skortimA = findViewById(R.id.skorA);
        TextView skortimB = findViewById(R.id.skorB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}