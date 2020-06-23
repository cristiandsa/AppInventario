package com.example.appinventario;

import android.os.Bundle;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.appinventario.ui.main.SectionsPagerAdapter;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        TabLayout tabs = findViewById(R.id.tabs);
        TabItem tabUsuario = findViewById(R.id.tabUsu);
        TabItem tabProveedor = findViewById(R.id.tabProv);
        TabItem tabAlmacen = findViewById(R.id.tabAlm);
        TabItem tabActivo = findViewById(R.id.tabAct);
        final ViewPager viewPager = findViewById(R.id.view_pager);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(),tabs.getTabCount());

        viewPager.setAdapter(sectionsPagerAdapter);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}