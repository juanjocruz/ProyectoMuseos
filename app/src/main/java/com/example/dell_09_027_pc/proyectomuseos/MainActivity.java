package com.example.dell_09_027_pc.proyectomuseos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initActivity();

    }

    public void initActivity(){
        JSONAsyncTaskActivity miJSONAsincTaskActivity = new JSONAsyncTaskActivity();
    }
}
