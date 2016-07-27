package com.example.dell_09_027_pc.proyectomuseos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Dell_09_027-PC on 21/07/2016.
 */

public class JSONAsyncTask extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


                LeerJSON lectorJSON = new LeerJSON();

                lectorJSON.execute("http://datos.gijon.es/doc/cultura-ocio/museos.json");



    }
}