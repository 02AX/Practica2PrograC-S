package com.mycompany.practica2;

public class Reserva {
    
    private String cedulaUsuario;
    private String fechaComida;
    private String tipoComida;
    private String guarnicion1;
    private String guarnicion2;
    private String proteina;
    private String ensalada;
    
    //Constructor de Reserva;
    public Reserva(String cedulaUsuario, String fechaComida, String tipoComida, String guarnicion1, String guarnicion2, String proteina, String ensalada) {
        this.cedulaUsuario = cedulaUsuario;
        this.fechaComida = fechaComida;
        this.tipoComida = tipoComida;
        this.guarnicion1 = guarnicion1;
        this.guarnicion2 = guarnicion2;
        this.proteina = proteina;
        this.ensalada = ensalada;
    }
    
    public String toString(){
         return "Fecha de comida: " + fechaComida +
                "\nTipo de comida: " + tipoComida +
                "\nGuarnicion 1: " + guarnicion1 +
                "\nGuarnicion 2: " + guarnicion2 +
                "\nProteína: " + proteina +
                "\nEnsalada: " + ensalada;
        }
   
}//Fin de la clase
