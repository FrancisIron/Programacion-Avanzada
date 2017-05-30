package StatementSQL.src;

import java.sql.*;

/**
 * Created by R22bot2.15 Pocket on 29/05/2017.
 */
public class main {

    private Connection con = null;

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "fierro", "1234");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
    }

    public void desconectar() throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public boolean leerStatement(Persona per) throws SQLException {
        boolean rpta = false;

        try (Statement st = con.createStatement()){
            String sql = "SELECT * FROM persona WHERE nombre = '" + per.getNombre() + "' and pass = '" + per.getPass() + "'";
            System.out.println("Query => "+ sql);
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()){
                System.out.println("existen datos");
                rpta=true;
            } else {
                System.out.println("no existen datos");
            }

            System.out.println("Consulta existosa");
        }
        return rpta;
    }

    public static void main (String[] args) throws SQLException{
        main app = new main();
        app.conectar();
        //boolean rpta = app.leerStatement(new Persona("Giaccomo", "miau"));
        boolean rpta = app.leerStatement(new Persona("Giaccomo", "miau' OR 'M' = 'M'"));
        app.desconectar();

        if (rpta){
            System.out.println("Verificación correcta, ingresando al sistema...");
        } else {
            System.out.println("Credenciales incorrectas, acesso denegado");
        }
    }
}
