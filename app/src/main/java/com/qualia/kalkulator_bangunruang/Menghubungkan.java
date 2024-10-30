package com.qualia.kalkulator_bangunruang;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

    public class Menghubungkan extends AppCompatActivity {

        Button buttonKubus, buttonBalok, buttonLimasSegita;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main); // Sesuaikan dengan nama file XML Anda

            // Menghubungkan komponen tombol dari XML ke Java
            buttonKubus = findViewById(R.id.buttonKubus);
            buttonBalok = findViewById(R.id.buttonBalok);
            buttonLimasSegita = findViewById(R.id.buttonLimasSegita);

            // Mengatur onClickListener untuk setiap tombol
            buttonKubus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Membuka KubusActivity
                    Intent intent = new Intent(Menghubungkan.this, MainActivity.class);
                    startActivity(intent);
                }
            });

            buttonBalok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Membuka BalokActivity
                    Intent intent = new Intent(Menghubungkan.this, MainActivity.class);
                    startActivity(intent);
                }
            });

            buttonLimasSegita.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Membuka LimasSegitigaActivity
                    Intent intent = new Intent(Menghubungkan.this, LimasSegitiga.class);
                    startActivity(intent);
                }
            });
        }
    }
