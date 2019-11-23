package com.vitalinvent.restfullapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

import com.vitalinvent.restfullapp.fragments.fragment_main.FragmentMain;

public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_MAIN_TAG = "FRAGMENT_MAIN_TAG";
    public static Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Restful тестовое приложение");
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new FragmentMain())
                    .commit();
        }

    }
}
