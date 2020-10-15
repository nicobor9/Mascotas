package com.nicobor.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    private RecyclerView listMascotas;
    ArrayList<Mascotas> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText(R.string.textoMascotas);
        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        listMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listMascotas.setLayoutManager(llm);

        initMascotas();
        inicilizarAdaptador();
    }

    public void setSupportActionBar(Toolbar miActionBar) {
    }

    private void inicilizarAdaptador(){
        Adaptador adaptador = new Adaptador(mascotas,this);
        listMascotas.setAdapter(adaptador);
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas(1,"Misi",R.drawable.gato3,"2"));
        mascotas.add(new Mascotas(1,"Tommy",R.drawable.perro1,"4"));
        mascotas.add(new Mascotas(1,"Orni",R.drawable.gato4,"5"));
        mascotas.add(new Mascotas(1,"Claudio",R.drawable.gato1,"6"));
        mascotas.add(new Mascotas(1,"Rocko",R.drawable.perro2,"8"));
        mascotas.add(new Mascotas(1,"Esti",R.drawable.perro4,"0"));
        mascotas.add(new Mascotas(1,"Yuli",R.drawable.perro3,"5"));
        mascotas.add(new Mascotas(1,"Peteco",R.drawable.gato2,"1"));
        mascotas.add(new Mascotas(1,"Lupo",R.drawable.perro5,"5"));
        mascotas.add(new Mascotas(1,"Esteban",R.drawable.gato5,"9"));
    }

    public void irSegundaActividad(View v){
        Intent intent = new Intent(this,PantallaSecundaria.class);
        startActivity(intent);
    }
}
