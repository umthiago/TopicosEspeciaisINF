package com.example.recipeview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipeview.R;
import com.example.recipeview.adapter.Adapter;
import com.example.recipeview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();


    public void criarFilmes(){
        Filme filme = new Filme("Homem aranha","aventura", "2018" );
        this.listaFilmes.add(filme);
        filme = new Filme("Barbie","aventura", "2023");
        this.listaFilmes.add(filme);
        filme = new Filme("Vingadores","ação", "2022");
        this.listaFilmes.add(filme);
        filme = new Filme("Poderoso Chefao","drama", "1972");
        this.listaFilmes.add(filme);
        filme = new Filme("Matrix","ficção", "2002");
        this.listaFilmes.add(filme);
        filme = new Filme("Era uma vez em Holywood","comedia", "2018");
        this.listaFilmes.add(filme);
        filme = new Filme("Uncharted","ação", "2022");
        this.listaFilmes.add(filme);
        filme = new Filme("Opennheimer","ação", "2023");
        this.listaFilmes.add(filme);
        filme = new Filme("Jogos Mortais","terror", "2023");
        this.listaFilmes.add(filme);
        filme = new Filme("Panico","terror", "2022");
        this.listaFilmes.add(filme);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //listagem de filmes
        this.criarFilmes();

        //configurar adapter;
        Adapter adapter = new Adapter(listaFilmes);



        //configurar RecycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter); //criar adapter
   }
}