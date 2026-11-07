package pe.edu.pucp.iweb.lab8.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import pe.edu.pucp.iweb.lab8.beans.Cancion;

public class CancionDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */


    public ArrayList<Cancion> listar() {
        // TODO
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = (PreparedStatement) conn.createStatement();
             ResultSet rs = pstmt.executeQuery("select * from cancion as c, left join genero as g where g.idgenero=c.idgenero");) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

        /**
     * Ejercicio 2: la canción con ese id, o null si no existe.
     */
    public Cancion buscarPorId(int idCancion) {
        // TODO
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = (PreparedStatement) conn.createStatement();
             ResultSet rs = pstmt.executeQuery("select * from cancion as c where c.idcancion=idCancion");) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     * Ejercicio 2: INSERT de una canción nueva (PreparedStatement).
     */
    public void crear(Cancion cancion) {
        // TODO
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = (PreparedStatement) conn.createStatement();
             ResultSet rs = pstmt.executeQuery("select * from cancion");) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Ejercicio 2: UPDATE de una canción existente (PreparedStatement).
     */
    public void actualizar(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 3: DELETE por id (PreparedStatement).
     */
    public void eliminar(int idCancion) {
        // TODO
    }
}
