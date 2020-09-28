package com.farussif.semana3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar miActionBar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setLogo(R.drawable.dog_paw);
        setTitle("");

        listaMascotas = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        InicializarListaContactos();
        InicializarAdaptador();


        }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;

    }

/*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAbout:
                Intent intent = new Intent(this,Activity_About.class);
                startActivity(intent);
                break;
            case R.id.mSettings:


        }

        return super.onOptionsItemSelected(item);
    }*/



    public void InicializarAdaptador(){
        Adaptador adaptador = new Adaptador(contactos, MainActivity.this);
        listaMascotas.setAdapter(adaptador);
    }
    public void InicializarListaContactos(){

        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto(R.drawable.cat1,"Félix","8",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.dog1,"Arwen","2",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.cat2,"Kitty","4",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.dog2,"Andy","1",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.cat3,"Anubis","2",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.dog3,"Geisha","11",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.cat4,"Tiger","6",R.drawable.dog_bone,R.drawable.dog_bone_yellow));
        contactos.add(new Contacto(R.drawable.dog4,"Dafnis","9",R.drawable.dog_bone,R.drawable.dog_bone_yellow));

    }


    public void Raiting(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,RaitingActivity.class);


        startActivity(intent);
    }
}