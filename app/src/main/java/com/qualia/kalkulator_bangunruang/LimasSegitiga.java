package com.qualia.kalkulator_bangunruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LimasSegitiga extends AppCompatActivity {

    EditText editAlasSegitiga, editTinggiLimas, editTinggiSegitiga, editHasil;
    Button buttonLuas, buttonVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas_segitiga);

        // Menghubungkan komponen XML ke kode Java
        editAlasSegitiga = findViewById(R.id.editTSegitiga);
        editTinggiLimas = findViewById(R.id.editTLimas);
        editTinggiSegitiga = findViewById(R.id.editTextText3);
        editHasil = findViewById(R.id.editHasil);
        buttonLuas = findViewById(R.id.buttonLuas);
        buttonVolume = findViewById(R.id.buttonVolume);

        // Menambahkan event listener pada tombol hitung luas
        buttonLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });

        // Menambahkan event listener pada tombol hitung volume
        buttonVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolume();
            }
        });
    }

    // Fungsi untuk menghitung luas permukaan limas segitiga
    private void hitungLuas() {
        try {
            double alas = Double.parseDouble(editAlasSegitiga.getText().toString());
            double tinggiSegitiga = Double.parseDouble(editTinggiSegitiga.getText().toString());
            double tinggiLimas = Double.parseDouble(editTinggiLimas.getText().toString());

            // Menghitung luas alas segitiga
            double luasAlas = 0.5 * alas * tinggiSegitiga;

            // Menghitung luas selubung limas (3 sisi segitiga lainnya)
            double luasSelubung = 3 * 0.5 * alas * tinggiLimas;

            // Luas permukaan total limas segitiga
            double luasPermukaan = luasAlas + luasSelubung;

            // Menampilkan hasil
            editHasil.setText(String.valueOf(luasPermukaan));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan nilai yang valid!", Toast.LENGTH_SHORT).show();
        }
    }

    // Fungsi untuk menghitung volume limas segitiga
    private void hitungVolume() {
        try {
            double alas = Double.parseDouble(editAlasSegitiga.getText().toString());
            double tinggiSegitiga = Double.parseDouble(editTinggiSegitiga.getText().toString());
            double tinggiLimas = Double.parseDouble(editTinggiLimas.getText().toString());

            // Menghitung luas alas segitiga
            double luasAlas = 0.5 * alas * tinggiSegitiga;

            // Menghitung volume limas
            double volume = (1.0 / 3.0) * luasAlas * tinggiLimas;

            // Menampilkan hasil
            editHasil.setText(String.valueOf(volume));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan nilai yang valid!", Toast.LENGTH_SHORT).show();
        }
    }
}