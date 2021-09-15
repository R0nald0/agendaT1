package com.example.agendaa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Inicio extends AppCompatActivity {

  private BottomNavigationView bottomNView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
         bottomNView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayaouiD,new Fragment_home()).commit();


         bottomNView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                      Fragment fragmentSelect = null;

                 switch (item.getItemId()){
                     case R.id.home:
                         fragmentSelect = new Fragment_home();
                         break;

                     case R.id.action_navigation:
                         fragmentSelect = new Tes_fragem();
                         break;
                     case R.id.contatos:
                         fragmentSelect=new Add_fragment();
                         break;
                 }

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayaouiD,fragmentSelect).commit();
                 return true;
             }
         });
    }
}