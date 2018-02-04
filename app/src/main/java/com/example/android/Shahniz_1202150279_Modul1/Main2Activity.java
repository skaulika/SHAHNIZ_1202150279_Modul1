package com.example.android.Shahniz_1202150279_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tempat;
    TextView makanan;
    TextView jumlah;
    TextView total;
    private  final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tempat = findViewById(R.id.textViewtempat);
        makanan = findViewById(R.id.textViewmakanan);
        jumlah = findViewById(R.id.textViewjumlah);
        total = findViewById(R.id.textViewtotal);

        Intent a = getIntent();

        String namatempat = a.getStringExtra("namatempat");
        String namamakanan = a.getStringExtra("namamakanan");
        String jumlahporsi = a.getStringExtra("jumlahporsi");
        String totalharga = a.getStringExtra("totalharga");

        int totalHarga = Integer.valueOf(totalharga) * Integer.valueOf(jumlahporsi);

        tempat.setText(namatempat);
        makanan.setText(namamakanan);
        jumlah.setText(jumlahporsi);
        total.setText(String.valueOf(totalHarga));

        if (totalHarga <= uang){
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}
