package InterfazGrafica;

import java.awt.Color;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main extends javax.swing.JFrame 
{
    public Clip clip;
    public String ruta = "/Audio/";
    
    public Main() 
    {
        initComponents();
        musicaDeLogin("MusicaDeLogin");
        this.setTitle("Epic Card Game");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        CampoDeContraseña.setBackground(new Color(0,0,0,0));
        CampoDeContraseña.setOpaque(false);
        CampoDeContraseña.setBorder(null);
        CampoDeUsuario.setBackground(new Color(0,0,0,0));
        CampoDeUsuario.setOpaque(false);
        CampoDeUsuario.setBorder(null);
        
        
        
    }
    
    public void musicaDeLogin (String archivo)
    {
        try
        {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        }
        catch(Exception e)
        {
            
                    
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoDeUsuario = new javax.swing.JTextField();
        CampoDeContraseña = new javax.swing.JPasswordField();
        FondoMenuLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoDeUsuario.setForeground(new java.awt.Color(255, 153, 0));
        CampoDeUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoDeUsuario.setSelectionColor(new java.awt.Color(255, 255, 51));
        getContentPane().add(CampoDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 180, 30));

        CampoDeContraseña.setForeground(new java.awt.Color(255, 153, 0));
        CampoDeContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoDeContraseña.setSelectionColor(new java.awt.Color(255, 255, 51));
        CampoDeContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoDeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 180, 30));

        FondoMenuLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLogin1280x720.jpg"))); // NOI18N
        getContentPane().add(FondoMenuLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDeContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeContraseñaActionPerformed
        
    }//GEN-LAST:event_CampoDeContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Main().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CampoDeContraseña;
    private javax.swing.JTextField CampoDeUsuario;
    private javax.swing.JLabel FondoMenuLogin;
    // End of variables declaration//GEN-END:variables
}
