package com.example.ejercicio2recicledview;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String username;
    private int image;

    public Empleado(String username, Integer image) {
        this.username = username;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
