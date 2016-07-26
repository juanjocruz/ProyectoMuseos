package com.example.dell_09_027_pc.proyectomuseos;

import android.os.AsyncTask;
import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Dell_09_027-PC on 21/07/2016.
 */
public class LeerJSON extends AsyncTask<String, Double, ListaDeMuseos> {


    private Museo museo;
    private ListaDeMuseos mListaDeMuseos;

    public LeerJSON(ListaDeMuseos listaDeMuseos) {
        this.mListaDeMuseos = listaDeMuseos;
    }
    public LeerJSON() {
        this.mListaDeMuseos = new ListaDeMuseos();
    }
    @Override
    protected ListaDeMuseos doInBackground(String... params) {

        URL url = null;
        String pagina = "";


        ListaDeMuseos listaDeMuseos;

        JSONObject objeto_json = null;

        JSONArray listaJSONMuseos = new JSONArray();


        try {
            url = new URL(params[0]);

            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();


            if (conexion.getResponseCode() == HttpURLConnection.HTTP_OK) {

                BufferedReader bufferLectura = new BufferedReader(new InputStreamReader(conexion.getInputStream()));

                String linea = bufferLectura.readLine();

                while (linea != null) {
                    pagina += linea;
                    linea = bufferLectura.readLine();
                }

                bufferLectura.close();
            }

            objeto_json = new JSONObject(pagina);

             listaJSONMuseos = objeto_json.getJSONObject("directorios").getJSONArray("directorio");

        } catch (Exception e) {
            e.printStackTrace();
        }

       //    Trasnformar y devolver
        listaDeMuseos= transformar(listaJSONMuseos);

        return new ListaDeMuseos( );
    }

    @Override
    protected void onPostExecute(ListaDeMuseos lista) {

     //   Meterlas en el array adapter

        LeerMuseo tareaLeerMuseo= new LeerMuseo(this.museo);
        tareaLeerMuseo.execute(museo);
    }

    public ListaDeMuseos transformar(JSONArray lista){
        ListaDeMuseos listaDeMuseos=null;

        Museo museo;

        for (int i =0; i<lista.length();i++) {

            museo = new Museo();
            try {



                    museo.setNombre(lista.getJSONObject(i).getJSONObject("nombre").getString("content"));
                    museo.setDireccion(lista.getJSONObject(i).getJSONObject("direccion").getString("0"));
                    museo.setTelefono(lista.getJSONObject(i).getJSONObject("telefono").getString("content"));
                    museo.setUrl(lista.getJSONObject(i).getJSONObject("url").getString("url"));
                    museo.setEmail(lista.getJSONObject(i).getJSONObject("correo-electronico").getString("correo-electronico"));
                    museo.setGps(lista.getJSONObject(i).getJSONObject("localizacion").getString("content"));
                    museo.setHorarios(lista.getJSONObject(i).getJSONObject("horario").getString("horario"));
                    museo.setFoto(lista.getJSONObject(i).getJSONObject("foto").getString("content"));
                    museo.setDescripcion(lista.getJSONObject(i).getJSONObject("descripcion").getString("content"));
                    museo.setDescripcion(lista.getJSONObject(i).getJSONObject("tipo").getString("tipo"));

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        return listaDeMuseos;
    }
}