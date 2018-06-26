package com.developer.dinhduy.animation_demo2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager mviewPager;
    private  SelectionAdapter madapterselect;
    private TabLayout mtablayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar=(Toolbar) findViewById(R.id.tool_bar_include);


        mviewPager=(ViewPager) findViewById(R.id.tab_viewpaper);
        madapterselect=new SelectionAdapter(getSupportFragmentManager());
        mviewPager.setAdapter(madapterselect);


        mtablayout=(TabLayout) findViewById(R.id.main_tab);
        mtablayout.setupWithViewPager(mviewPager);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Life Book");
    }
}
