package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// switch
       /* switch (condicion){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro número");
        int num2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada:\n1)Suma\n2)Resta\n3)Multiplicación\n4)División");
        int operacion = sc.nextInt();
        sc.nextLine();
        //sc.close();
        float result = 0;
        switch (operacion){
            case 1: //suma
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("opción NO válida");
                break;

        }
        System.out.println(result);
        // Pedir un número al usuario y dependiendo la respuesta
        // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        // Si elige un numero fuera de ese rango mostar un mensaje de error;
        System.out.println("Ingresa un número del 1 al 7");
        int dia = sc.nextInt();
        sc.nextLine();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("opción NO válida");
                break;

        }


    }
}
