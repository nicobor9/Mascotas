package com.nicobor.mascotas;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PantallaSecundaria extends AppCompatActivity {

    private RecyclerView list2Mascotas;
    ArrayList<Mascotas> mascotas2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_secundaria);

        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText(R.string.textoMascotas);
        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        list2Mascotas = (RecyclerView) findViewById(R.id.rvFavoritos);

        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);

        list2Mascotas.setLayoutManager(llm2);

        init2Mascotas();
        inicializarAdaptador();
    }

    public void setSupportActionBar(Toolbar miActionBar) {
    }

    private void inicializarAdaptador(){
        Adaptador adaptador = new Adaptador(mascotas2,this);
        list2Mascotas.setAdapter(adaptador);
    }

    public void init2Mascotas(){
        mascotas2 = new ArrayList<Mascotas>();
        mascotas2.add(new Mascotas(12,"Tommy",R.drawable.perro1,"4"));
        mascotas2.add(new Mascotas(12,"Rocko",R.drawable.perro2,"8"));
        mascotas2.add(new Mascotas(12,"Esti",R.drawable.perro4,"0"));
        mascotas2.add(new Mascotas(12,"Yuli",R.drawable.perro3,"5"));
        mascotas2.add(new Mascotas(12,"Peteco",R.drawable.gato2,"1"));
    }

}
