package Conex;

import java.sql.Connection;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opciones;
        float ingresa, resultado;

        ConsultasSQL con = new ConsultasSQL();

        Conexion conexion = new Conexion();
        JOptionPane jp = new JOptionPane();
//        String lectura = null;
        int select = 1;
        while (select == 1) {

           opciones = Integer.parseInt(JOptionPane.showInputDialog("Eligue las siguientes opciones: \n"
                   + "1. Ingresar un nuevo cliente " + "\n"
                   + "2. Hacer una busqueda " + "\n"
                   + "0. Salir"));
           switch (opciones) {
               case 1:
//
//                    ingresa = Integer.parseInt(JOptionPane.showInputDialog("ingrese los datos del cliente:"));
//                    conexion.getConnection();
//
//                    break;
//                          
        //En esta parte consultamos los datoas de la tabla
               case 2:
                    ingresa = Integer.parseInt(JOptionPane.showInputDialog("Consulta datos:"));
        con.consultasDatos();

//
                default:
                   System.out.println("la opcion ingresada es invalida");
                  break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Adios!");
                   break;
    }

           int salir = jp.getMessageType();
           if (salir == 1) {
                select = 1;
           break;
}

//}

//}
//d
