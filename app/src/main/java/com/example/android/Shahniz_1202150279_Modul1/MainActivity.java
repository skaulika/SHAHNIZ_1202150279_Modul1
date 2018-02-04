package com.example.android.Shahniz_1202150279_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText menu, porsi;
    Button eatbus, abnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.editTextmenu);
        porsi = findViewById(R.id.editTextporsi);
        eatbus = findViewById(R.id.buttoneatbus);
        abnormal = findViewById(R.id.buttonabnormal);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent eatbus = new Intent(MainActivity.this, Main2Activity.class);
                eatbus.putExtra("namatempat", "Eatbus");
                eatbus.putExtra("namamakanan", menu.getText().toString());
                eatbus.putExtra("jumlahporsi", porsi.getText().toString());
                eatbus.putExtra("totalharga", "50000");
                startActivity(eatbus);
            }
        });

        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abnormal = new Intent(MainActivity.this,Main2Activity.class);
                abnormal.putExtra("namatempat", "Abnormal");
                abnormal.putExtra("namamakanan", menu.getText().toString());
                abnormal.putExtra("jumlahporsi", porsi.getText().toString());
                abnormal.putExtra("totalharga", "30000");
                startActivity(abnormal);
            }
        });
    }
}
