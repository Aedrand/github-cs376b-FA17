package com.skidmore.ariggs.fragmentargtest;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.second_frag_container);

        if (fragment == null) {
            UUID courseID = (UUID) getIntent().getSerializableExtra(EXTRA_COURSE_ID);
            fragment = SecondFragment.newInstance(courseID);
            fragmentManager.beginTransaction().add(R.id.second_frag_container, fragment).commit();
        }
    }

    private static final String EXTRA_COURSE_ID = "com.skidmore.ariggs.fragmentargtest.course_name";

    public static Intent newIntent(Context packageContext, UUID courseID) {
        Intent intent = new Intent(packageContext, SecondActivity.class);
        intent.putExtra(EXTRA_COURSE_ID, courseID);
        return intent;
    }

}
