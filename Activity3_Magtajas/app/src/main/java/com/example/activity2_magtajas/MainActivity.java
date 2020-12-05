package com.example.activity2_magtajas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private SectionStatePagerAdapter sectionStatePagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabBar);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("Call");;
        tabLayout.getTabAt(1).setText("Video");;
        tabLayout.getTabAt(2).setText("Swap");;;

        BottomNavigationView NavigationView = (BottomNavigationView) findViewById(R.id.Navigation);
        Menu menu = NavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        NavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.button1:
                        break;
                    case R.id.button2:
                        Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent1);
                        break;
                    case R.id.button3:
                        Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(intent2);
                        break;
                }
                return false;
            }
        });
    }
    private void setupViewPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1());
        adapter.addFragment(new Fragment2());
        adapter.addFragment(new Fragment3());
        this.viewPager.setAdapter(adapter);
    }
    public void setViewPager (int FragmentNumber){
        viewPager.setCurrentItem(FragmentNumber);
    }
}