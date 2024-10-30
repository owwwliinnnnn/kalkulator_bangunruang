package com.qualia.kalkulator_bangunruang;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editpanjang, editlebar, edittinggi, editHasil;
    private Button buttonluas, buttonkeliling, buttonvolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.balok);

        editpanjang=findViewById(R.id.editpanjang);
        editlebar=findViewById(R.id.editlebar);
        edittinggi=findViewById(R.id.edittinggi);
        editHasil=findViewById(R.id.editHasil);

        buttonluas=findViewById(R.id.buttonluas);
        buttonkeliling=findViewById(R.id.buttonkeliling);
        buttonvolume=findViewById(R.id.buttonvolume);

        buttonluas.setOnClickListener(this::Luas);
        buttonvolume.setOnClickListener(this::Volume);
        buttonkeliling.setOnClickListener(this::Keliling);
    }
    private void Luas(View view){
        try{
            double panjang = Double.parseDouble(editpanjang.getText().toString());
            double lebar = Double.parseDouble(editlebar.getText().toString());
            double tinggi = Double.parseDouble(edittinggi.getText().toString());
            double luas = 2*panjang*lebar+2*lebar*tinggi+2*panjang*tinggi;
            editHasil.setText(String.valueOf(luas));
        }catch (NumberFormatException e){
            Toast.makeText(this, "Masukkan Nilai yang Benar", Toast.LENGTH_SHORT).show();
        }
    }
    private void Keliling(View view){
        try{
            double panjang = Double.parseDouble(editpanjang.getText().toString());
            double lebar = Double.parseDouble(editlebar.getText().toString());
            double tinggi = Double.parseDouble(edittinggi.getText().toString());
            double keliling = 4*(panjang+lebar+tinggi);
            editHasil.setText(String.valueOf(keliling));
        }catch (NumberFormatException e){
            Toast.makeText(this, "Masukkan Nilai yang Benar", Toast.LENGTH_SHORT).show();
        }
    }
    private void Volume(View view){
        try{
            double panjang = Double.parseDouble(editpanjang.getText().toString());
            double lebar = Double.parseDouble(editlebar.getText().toString());
            double tinggi = Double.parseDouble(edittinggi.getText().toString());
            double volume = panjang*lebar*tinggi;
            editHasil.setText(String.valueOf(volume));
        }catch (NumberFormatException e){
            Toast.makeText(this, "Masukkan Nilai yang Benar", Toast.LENGTH_SHORT).show();
        }
    }
}

