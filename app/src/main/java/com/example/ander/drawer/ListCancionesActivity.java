package com.example.ander.drawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.ander.drawer.adapter.CancionAdapter;
import com.example.ander.drawer.vo.Cancion;

import java.util.ArrayList;

public class ListCancionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_canciones);

        ArrayList<Cancion> data = new ArrayList<Cancion>();
        data.add(new Cancion("Smell like free spirit","Nirvana","4:38"));
        data.add(new Cancion("Come as your are","Nirvana","3:46"));
        data.add(new Cancion("Lithium","Nirvana","4:16"));
        data.add(new Cancion("Heart-Sahpped Box","Nirvana","3:38"));
        data.add(new Cancion("The man who sold the world","Nirvana","2:45"));
        data.add(new Cancion("Aero Zeppelin lyrics ","Nirvana","2:25"));
        data.add(new Cancion("Big Cheese lyrics","Nirvana","3:08"));
        data.add(new Cancion("Curmudgeon lyrics ","Nirvana","8:45"));
        data.add(new Cancion("Dive lyrics ","Nirvana","2:25"));
        data.add(new Cancion("Down In The Dark lyrics ","Nirvana","2:38"));
        data.add(new Cancion("Downer lyrics","Nirvana","1:45"));

        ListView lvCanciones = (ListView)findViewById(R.id.lv_canciones);
        CancionAdapter adapter = new CancionAdapter(this, data);
        lvCanciones.setAdapter(adapter);

    }
}
