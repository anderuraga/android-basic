package com.example.ander.drawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListviewActivity extends AppCompatActivity {

    private RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //juego de datos
        final String[] datos =
                new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5","Elem1","Elem2","Elem3","Elem4","Elem5","Elem1","Elem2","Elem3","Elem4","Elem5"};

        //Adapatador
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, datos);

        ListView lvUsuarios = (ListView)findViewById(R.id.listaUsuarios);
        lvUsuarios.setAdapter(adaptador);


    }
}
