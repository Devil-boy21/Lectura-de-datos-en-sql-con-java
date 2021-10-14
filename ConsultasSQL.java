package Conex;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsultasSQL {

    Scanner entrada = new Scanner(System.in);

    public void consultasDatos() {

        Connection conexion = null;

        Conexion c = new Conexion();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(c.URL, c.user, c.password);
            System.out.println("Conexion establecida");

            // metodo para consulta datos     
            String sentenciaSql = "SELECT * FROM clientes;";
//            String sentenciaSql = "SELECT * FROM clientes WHERE id LIKE '%" + c + "'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sentenciaSql);

            while (rs.next()) {

//                String cedula = rs.getString("cedula");
//                String nom = rs.getString("nombre");
//                String apellido = rs.getString("apellido");
//                String direccion = rs.getString("direccion");
                //Metodo para buscar
                String cedula = rs.getString("cedula");
                String nom = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");

//                ArrayList<Persona> listaNombres = new ArrayList<Persona>();
//                String nombre = rs.getNString("nombre");
//                String apellido = rs.getNString("apellido");
//                String id = rs.getNString("id");
                // print the results
//                System.out.format("%s, %s, %s, %s\n", cedula, nom, apellido, direccion);
                System.out.format("%s, %s, %s, %s\n", cedula, nom, apellido, direccion);
            }
            st.close();

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error en la matrix");
            System.err.println(ex.getMessage());

//        
        }

    }

}
