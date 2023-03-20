package com.example.ejercicio2recicledview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.ejercicio2recicledview.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Empleado empleado = (Empleado) getIntent().getSerializableExtra("Empleado");
        if(empleado != null){
            binding.imageSecond.setImageResource(empleado.getImage());
            binding.nombreSecond.setText(empleado.getUsername());
        }
    }
}