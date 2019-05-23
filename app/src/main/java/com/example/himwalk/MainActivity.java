package com.example.himwalk;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;


import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anuj Sharma on 24/05/19.
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout mDrawerLayout;

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView nme,em;

    private ActionBarDrawerToggle ad;
    private CharSequence mTitle;
    android.support.v7.app.ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView nvgv=(NavigationView)findViewById(R.id.nvgv);
        View headerView = nvgv.getHeaderView(0);
        em = (TextView) headerView.findViewById(R.id.em);
        em.setText(""+getIntent().getExtras().getString("email"));
        tabLayout=findViewById(R.id.tab1);
        viewPager=findViewById(R.id.viewpage);
        PageAdapter pageAdapter=new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        setupToolbar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
        ad=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(ad);
        ad.syncState();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        setupDrawerToggle();
        Menu menu = nvgv.getMenu();
        MenuItem ho = menu.findItem(R.id.home);
        MenuItem se=menu.findItem(R.id.setting);
        nvgv.setNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void setupToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    void setupDrawerToggle(){
        mDrawerToggle = new android.support.v7.app.ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.app_name, R.string.app_name);
        mDrawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id= menuItem.getItemId();
        if(id==R.id.home)
        {
            Toast.makeText(this, "Logout button", Toast.LENGTH_SHORT).show();

        }

        if(id==R.id.rte)
        {
            Intent i=new Intent(MainActivity.this,feedback.class);
            startActivity(i);
            mDrawerLayout.closeDrawer(Gravity.START,false);

        }

        if(id==R.id.log)
        {
            Intent i=new Intent(MainActivity.this,Login.class);
            startActivity(i);
            mDrawerLayout.closeDrawer(Gravity.START,false);
        }
        return false;
    }
}