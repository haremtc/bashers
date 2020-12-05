package com.example.activity2_magtajas;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        BottomNavigationView NavigationView = (BottomNavigationView) findViewById(R.id.Navigation);
        Menu menu = NavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        NavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.button1:
                        Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.button2:
                        break;
                    case R.id.button3:
                        Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(intent2);
                        break;
                }
                return false;
            }
        });
    }
}
