package com.vitalinvent.restfullapp;

//import androidx.appcompat.app.AppCompatActivity;
//import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMain;

public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_MAIN_TAG = "FRAGMENT_MAIN_TAG";
    public static Toolbar toolbar=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Restful тестовое приложение");
//        try {
            setContentView(R.layout.activity_main);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
//            toolbar = findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
//            if (getSupportActionBar() != null) {
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                getSupportActionBar().setHomeButtonEnabled(true);
//            }
//            toolbar.setNavigationOnClickListener(v -> getSupportFragmentManager().popBackStack());
            if (savedInstanceState == null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new FragmentMain())
                        .commit();
            }
//        } catch (Exception ex) { ex.printStackTrace(); }

    }
}
