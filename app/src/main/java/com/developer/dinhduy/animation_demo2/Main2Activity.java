package com.developer.dinhduy.animation_demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TabHost tabHost=(TabHost) findViewById(R.id.tab_host);
        tabHost.setup();

        TabHost.TabSpec tab1= tabHost.newTabSpec("TAB ONE");
        tab1.setIndicator("TAB ONE");
        tab1.setContent(R.id.tab_host1);


        TabHost.TabSpec tab2= tabHost.newTabSpec("TAB TWO");
        tab2.setIndicator("TAB TWO");
        tab2.setContent(R.id.tab_host2);

        TabHost.TabSpec tab3= tabHost.newTabSpec("TAB THREE");
        tab3.setIndicator("TAB TWO");
        tab3.setContent(R.id.tab_host3);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
