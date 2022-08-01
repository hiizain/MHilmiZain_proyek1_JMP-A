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
import android.widget.Toast;

public class NamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        getSupportActionBar().setTitle("Aplikasi Mobile");

        EditText etNama = findViewById(R.id.et_nama);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String tampil = "Hai, "+nama+"!";

                Toast.makeText(NamaActivity.this, tampil, Toast.LENGTH_SHORT).show();
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