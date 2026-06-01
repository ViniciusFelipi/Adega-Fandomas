package jtable.adegafandomas2;

/**
 *
 * @author Aluno
 */
public class AdegaFandomas2 {

    public static void main(String[] args) {
        try {
            // Iniciando a biblioteca:
            com.formdev.flatlaf.FlatLightLaf.setup();
            
            InterfaceAdega adega = new InterfaceAdega();
            adega.setVisible(true);
            adega.setLocationRelativeTo(null);
        } catch (Exception ex) {
            System.err.println("Falha ao iniciar o tema moderno.");
        }
    }
}
