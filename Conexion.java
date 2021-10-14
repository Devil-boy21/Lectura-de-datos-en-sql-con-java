package Conex;

import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conexion {

    ArrayList<Persona> listaPersonas;
    Persona persona;
    public String URL = "jdbc:mysql://localhost:3306/bd?characterEncoding=latin1";
    public String password = "root";
    public String user = "root";
    float ingresa;
    Scanner entrada = new Scanner(System.in);
    ConsultasSQL csql = new ConsultasSQL();

    public Connection getConnection() {

        Connection conexion = null;
        csql.consultasDatos();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, user, password);
            System.out.println("Conexion establecida");
            Statement sentencia = (Statement) conexion.createStatement();
            System.out.println("Ingrese los datos del clientes\nNombre:");
//            ingresa= Integer.parseInt(JOptionPane.showInputDialog("Ingresa los datos del nuevo cliente");
            
            
            String nombre = entrada.next();
            System.out.println("Apellido:");
            String apellido = entrada.next();
            System.out.println("Cédula:");
            String cedula = entrada.next();
            System.out.println("Dirección:");
            String direccion = entrada.next();
            System.out.println("telefono:");

            String sentenciaSql = "insert into clientes values ('" + cedula + "',"
                    + "'" + nombre + "','" + apellido + "','" + direccion + "')";
            int insert = sentencia.executeUpdate(sentenciaSql);
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {

        }
        return conexion;

    }

}
