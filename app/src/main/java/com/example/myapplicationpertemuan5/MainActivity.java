package com.example.myapplicationpertemuan5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aplikasi Proyek1-JMP_A");
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