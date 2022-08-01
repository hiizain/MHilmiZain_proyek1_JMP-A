package com.example.myapplicationpertemuan5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class NegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);

        getSupportActionBar().setTitle("Aplikasi List Negara");

        String[] negara = getResources().getStringArray(R.array.daftar_negara);

        ListView lvNegara = findViewById(R.id.lv_negara);
        lvNegara.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l){
                Toast.makeText(NegaraActivity.this, "Clicked! "+negara[i], Toast.LENGTH_SHORT).show();
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