package com.example.dell_09_027_pc.proyectomuseos;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Dell_09_027-PC on 21/07/2016.
 */
public class LeerMuseo extends AsyncTask<Museo, Double, Museo> {


    private Museo museo;

    public LeerMuseo(Museo museo) {
        this.museo= museo;
    }



    @Override
    protected Museo doInBackground(Museo... params) {

        Museo museo= null;

        URL url = null;
        try {
            url = new URL(params[0]);
            InputStream is = new BufferedInputStream(url.openStream());
            museo = BitmapFactory.decodeStream(is);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return museo;
    }

    @Override
    protected void onPostExecute(Museo museo) {

        LeerMuseo tareaLeerMuseo= new LeerMuseo(this.museo);
        tareaLeerMuseo.execute(museo);
    }
}

