package com.mycompany.practica2;

public class Usuario {
   private String cedula;
   private String nombre;
   private String numeroTelefono;
   
   //Constructor de Usuario
   public Usuario(String cedula, String nombre, String numeroTelefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }//Fin del constructor
   
   
   //Getters y Setters de Usuario

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return cedula + " - " + nombre + " - " + numeroTelefono;
    }//Fin del toString
         
}//Fin de la clase
