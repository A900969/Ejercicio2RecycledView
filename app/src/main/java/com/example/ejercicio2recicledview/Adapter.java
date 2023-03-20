package com.example.ejercicio2recicledview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> implements AdapterView.OnItemClickListener {
    private ArrayList<Empleado> listaEmpleados;
    private Context contexto;

    public Adapter(ArrayList<Empleado> lista, Context contexto){
        listaEmpleados = lista;
        this.contexto = contexto;

    }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private ImageView photo;
        public MyViewHolder(final View view){
            super(view);
            nombre = view.findViewById(R.id.txt_nombre);
            photo = view.findViewById(R.id.image);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        Intent intento = new Intent(, SecondActivity.class);
//          intento.putExtra("Empleado", listaEmpleados.get(i));
    }

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.elemento,parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.itemView.setOnClickListener(view -> {
            Intent intento = new Intent(contexto, SecondActivity.class);
            intento.putExtra("Empleado", listaEmpleados.get(position));
            holder.itemView.getContext().startActivity(intento);
        });
        String name = listaEmpleados.get(position).getUsername();
        holder.nombre.setText(name);
        int photo = listaEmpleados.get(position).getImage();
        holder.photo.setImageResource(photo);
    }

    @Override
    public int getItemCount() {
        return listaEmpleados.size();
    }
}
