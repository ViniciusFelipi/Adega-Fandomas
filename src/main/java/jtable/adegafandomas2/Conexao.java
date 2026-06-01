package jtable.adegafandomas2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudio
 */
public class Conexao {
    // Altere a 'senha' conforme sua configuração
    private static final String URL = "jdbc:mysql://localhost:3306/adega_fandomas";
    private static final String USER = "root";
    private static final String PASS = "Senai@118"; // Senha Super Secreta :)

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + e.getMessage());
            return null;
        }
    }
}
