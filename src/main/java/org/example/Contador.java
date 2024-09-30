package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int numeroUno=0;
        int numeroDos=0;
        try {
            System.out.println("Ingresa el primer numero:");
            numeroUno = datos.nextInt();
            System.out.println("Ingresa el segundo numero:");
            numeroDos = datos.nextInt();
        }catch (Exception e) {
            System.out.println("Debe ingresarse valores enteros");
        }
        try {
            contar(numeroUno, numeroDos);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void contar(int numeroUno, int numeroDos)throws ParametrosInvalidosException {
        if(numeroUno>numeroDos) {
            throw new ParametrosInvalidosException("El segundo numero debe ser mayor al primero");
        }
        int cuenta=numeroDos-numeroUno;
        for(int i=1;i<=cuenta;i++) {
            System.out.println("Imprimiendo el numero:"+i);
        }
    }
    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}