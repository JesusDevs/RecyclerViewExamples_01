package com.crisspian.recyclerviewexamples_01.adapter;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.crisspian.recyclerviewexamples_01.R;
import com.crisspian.recyclerviewexamples_01.databinding.ItemListDataBinding;
import com.crisspian.recyclerviewexamples_01.model.Item;

import java.util.ArrayList;
import java.util.List;
//extender dentro de < clase de la vista en este caso Public class donde se encuentran los objtos >
//al extender se deben implementar los metodos

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.WordViewHolder> {

    private List<Item> ListItem;

    @NonNull
    @Override
    //inflar la vista de nuestras layout se utiliza el LayoutInflater en vez de inflate como en fragmentos
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListDataBinding binding = ItemListDataBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

    }
    //En esta metodo se dimensiona con.size el tamaño de la lista de objetos
    @Override
    public int getItemCount() {

        return ListItem.size();
    }

    //2. Crear clase interna llamada , puede ser una clase tipo cantante,perro gato ,
    // con atributos en xml XXX ViewHolder , contenedor de las vistas
    public class WordViewHolder extends RecyclerView.ViewHolder {
        //atributos
        public TextView textView;
        public ImageView imageView;
        //2.1 reemplazar por binding para evitar  null point
        public WordViewHolder(@NonNull ItemListDataBinding binding) {
            super(binding.getRoot());
            // findView
            // textView = itemView.findViewById(R.id.tv_item);
            textView = binding.tvItem;
            imageView = binding.ivItem;
        }
    }
}
