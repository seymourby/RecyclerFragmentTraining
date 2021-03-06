package com.seymour.recyclerfragmenttraining;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            RecyclerFragment fragment = new RecyclerFragment();
            transaction.replace(R.id.container,fragment);
            transaction.commit();
        }
    }
}
