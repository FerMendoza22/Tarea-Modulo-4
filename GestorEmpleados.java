/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorempleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author DELL VOSTRO
 */
class GestorEmpleados {
    
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                empleado.imprimirInformacion();
                System.out.println("---------------");
            }
        }
    }
}