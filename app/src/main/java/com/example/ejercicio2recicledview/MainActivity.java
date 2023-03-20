package com.example.ejercicio2recicledview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Empleado> listaEmpleados;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycledView);
        listaEmpleados = new ArrayList<>();
        
        setEmpleadoInfo();
        setAdapter();
    }

    private void setAdapter(){
        Adapter adapter = new Adapter(listaEmpleados, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setEmpleadoInfo() {
        listaEmpleados.add(new Empleado("María", R.drawable.primero));
        listaEmpleados.add(new Empleado("Manolo", R.drawable.segundo));
        listaEmpleados.add(new Empleado("Luís", R.drawable.tercero));
        listaEmpleados.add(new Empleado("Antonio", R.drawable.cuarto));
        listaEmpleados.add(new Empleado("Felipe", R.drawable.quinto));
    }
}