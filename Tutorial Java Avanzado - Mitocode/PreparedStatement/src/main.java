package PreparedStatement.src;

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

    public boolean leerPreparedStatement(Persona per) throws SQLException {
        boolean rpta = false;
        PreparedStatement ps = null;

        try {
            String sql = "SELECT * FROM persona WHERE nombre = ? and pass = ?";
            System.out.println("Query => " + sql);

            ps = con.prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getPass());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("existen datos");
                rpta = true;
            } else {
                System.out.println("no existen datos");
            }

            System.out.println("Consulta existosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        return rpta;
    }

    public void modificarBatchStatement(Persona per) throws SQLException {
        long ini = System.currentTimeMillis();
        try {
            con.setAutoCommit(false);

            for (int i = 0; i < 20; i++) {
                Statement st = con.createStatement();
                String sql = "UPDATE persona SET nombre = '" + per.getNombre() + "', pass = '" + per.getPass() + "'";
                //System.out.println("Query => " + sql);
                int numeroFilas = st.executeUpdate(sql);
                //System.out.println("#Filas Afectadas - Statement " + numeroFilas);
            }
            con.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            con.rollback();
        }
        long fin = System.currentTimeMillis();

        System.out.println("Statement : " + (fin - ini));
    }

    public void modificarBatchPreparedStatement(Persona per) throws SQLException {
        long ini = System.currentTimeMillis();
        try {
            con.setAutoCommit(false);
            PreparedStatement ps = null;
            for (int i=0; i<20; i++) {
                String sql = "UPDATE persona SET nombre = ?,pass = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, per.getNombre());
                ps.setString(2, per.getPass());
                ps.addBatch();
                //System.out.println("Query => " + sql);
                int numeroFilas = ps.executeUpdate();
                //System.out.println("#Filas Afectadas - PreparedStatement " + numeroFilas);
            }
            ps.executeBatch();
            con.commit();
        } catch (Exception e) {
            con.rollback();
            System.out.println(e.getMessage());
        }
        long fin = System.currentTimeMillis();

        System.out.println("PreparedStatement : " + (fin - ini));
    }

    public static void main(String[] args) throws SQLException {
        main app = new main();
        app.conectar();

        app.modificarBatchStatement(new Persona("Giaccomo", "miau"));
        System.out.println("********************");
        app.modificarBatchPreparedStatement(new Persona("Giaccomo", "miau"));

        app.desconectar();


    }
}
