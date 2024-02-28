package com.mycompany.practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Practica2 {

    private static String USUARIOS_FILE;

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Menú:");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Agregar Reserva");
        System.out.println("3. Guardar Reservas y Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                agregarUsuario();
                break;
            case 2:
                agregarReserva();
                break;
            case 3:
                guardarReservasYSalir();
                break;
            default:
                System.out.println("Inténtelo de nuevo, esta opción no es válida.");
        }
    }
}

private static void agregarUsuario() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese la cédula del usuario:");
    String cedula = scanner.nextLine();

    System.out.println("Ingrese el nombre del usuario:");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese el número de telefono del usuario:");
    String telefono = scanner.nextLine();

    Usuario nuevoUsuario = new Usuario(cedula, nombre, telefono);
    System.out.println("Usuario agregado correctamente.");
}

private static void agregarReserva() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la cédula del usuario:");
    String cedula = scanner.nextLine();

    if (existeUsuario(cedula)) {
        System.out.println("Usuario encontrado. Continuando con la reserva...");

        System.out.println("Ingrese la fecha de comida (día/mes/año):");
        String fechaComida = scanner.nextLine();
        System.out.println("Ingrese el tipo de comida (Desayuno/Almuerzo/Cena):");
        String tipoComida = scanner.nextLine();
        System.out.println("Ingrese la guarnición 1 (Arroz/Frijoles/Pancakes/Frutas):");
        String guarnicion1 = scanner.nextLine();
        System.out.println("Ingrese la guarnición 2 (Arroz/Frijoles/Pancakes/Frutas):");
        String guarnicion2 = scanner.nextLine();
        System.out.println("Ingrese la proteína (Carne/Pescado/Pollo/Huevos):");
        String proteina = scanner.nextLine();
        System.out.println("Ingrese la ensalada (Verde/Rusa):");
        String ensalada = scanner.nextLine();

        Reserva nuevaReserva = new Reserva(cedula, fechaComida, tipoComida, guarnicion1, guarnicion2, proteina, ensalada);
        System.out.println("Reserva agregada correctamente.");
    } else {
        System.out.println("Error: Este usuario no está registrado. No se puede realizar la reserva");
    }
}

private static void guardarReservasYSalir() {
   System.exit(0);
}

// Verificar si un usuario ya existe o no
private static boolean existeUsuario(String cedula) {
    try (Scanner scanner = new Scanner(new File(USUARIOS_FILE))) {
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            if (linea.contains(cedula)) {
                return true;
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return false;
}

}//Fin de la clase
