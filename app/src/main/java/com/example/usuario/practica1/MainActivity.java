package com.example.usuario.practica1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment f=fm.findFragmentById(R.id.main_frame);
        if(f==null)
        {
            AuthFragment au = AuthFragment.newInstance("pepe", "12345");
            ft.add(R.id.main_frame, au);
            ft.addToBackStack(null);
        }
        ft.commit();
    }



}
