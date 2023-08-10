package com.example.recipeview.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeview.R;
import com.example.recipeview.model.Filme;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;
    public Adapter(List<Filme> Lista){
        this.listaFilmes = Lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item_lista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent,false) ;

        return new MyViewHolder(item_lista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Filme filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView ano;
        TextView genero;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textTitulo);
            genero = itemView.findViewById(R.id.textTitulo);
        }
    }

}
