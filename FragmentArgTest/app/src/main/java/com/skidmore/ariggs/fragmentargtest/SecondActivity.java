package com.skidmore.ariggs.fragmentargtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.second_frag_container);

        if (fragment == null) {
            fragment = new SecondFragment();
            fragmentManager.beginTransaction().add(R.id.second_frag_container, fragment).commit();
        }
    }
}
