package com.example.myapplicationpertemuan5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        getSupportActionBar().setTitle("Aplikasi Kalkulator");

        EditText etAngka1 = findViewById(R.id.et_angka1);
        EditText etAngka2 = findViewById(R.id.et_angka2);

        Button bTambah = findViewById(R.id.b_tambah);
        Button bKurang = findViewById(R.id.b_kurang);
        Button bBagi = findViewById(R.id.b_bagi);
        Button bKali = findViewById(R.id.b_kali);
        Button bClear = findViewById(R.id.b_clear);

        TextView tvHasil = findViewById(R.id.tv_hasil);

        bTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    // ambil inputan
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    // lakukan operasi
                    double hasil = angka1 + angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bKurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    // ambil inputan
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    // lakukan operasi
                    double hasil = angka1 - angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bBagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    // ambil inputan
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    // lakukan operasi
                    double hasil = angka1 / angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bKali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (etAngka1.getText().toString().length()>0 && etAngka2.getText().toString().length()>0){
                    // ambil inputan
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    // lakukan operasi
                    double hasil = angka1 * angka2;
                    tvHasil.setText("Hasil\n"+hasil);
                }
            }
        });

        bClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                etAngka1.setText("");
                etAngka2.setText("");
                tvHasil.setText("");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        if (item.getItemId() == R.id.m_nama){
            intent = new Intent(this, NamaActivity.class);
        } else if (item.getItemId() == R.id.m_kalkulator){
            intent = new Intent(this, KalkulatorActivity.class);
        } else if (item.getItemId() == R.id.m_negara){
            intent = new Intent(this, NegaraActivity.class);
        } else{
            intent = new Intent(this, MainActivity.class);
        }
        startActivity(intent);
        return true;
    }
}