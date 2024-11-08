/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorempleados;

import java.util.Scanner;

/**
 * Hola Ingeniero, adjunto la tarea con tiempo de retraso porque tuve problemas con mi computadora. Se arruino y la envie a reparar y hasta hace poco me la devolvieron
 * Se lo comente en el foro, pero no recibi respuesta de su parte, espero me comprenda.
 * @author DELL VOSTRO
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); 

                    Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}