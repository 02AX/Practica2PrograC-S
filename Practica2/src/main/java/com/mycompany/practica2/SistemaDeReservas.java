package com.mycompany.practica2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SistemaDeReservas {
    
    private static final String USUARIOS_FILE = "usuarios.txt";
    private static final String RESERVAS_FILE = "reservas.txt";
    private static final int THREAD_POOL_SIZE = 5;

    private static ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    private static PrintWriter usuariosWriter;
    private static PrintWriter reservasWriter;

    static {
        try {
            usuariosWriter = new PrintWriter(new FileWriter(USUARIOS_FILE, true));
            reservasWriter = new PrintWriter(new FileWriter(RESERVAS_FILE, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//Fin de la clase
