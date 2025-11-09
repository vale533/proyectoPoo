
package com.proyectopoo.runner.ui;


import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class LoginFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginFrame.class.getName());

    public LoginFrame() {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null); 
        setResizable(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
  private void reproducirSonido(String ruta) {
    try {
        java.net.URL url = getClass().getResource(ruta);
        javax.sound.sampled.AudioInputStream audio = javax.sound.sampled.AudioSystem.getAudioInputStream(url);
        javax.sound.sampled.Clip clip = javax.sound.sampled.AudioSystem.getClip();
        clip.open(audio);
        clip.start();
    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        System.out.println("Error sonido: " + e.getMessage());
    }
}
    public void keyTyped(java.awt.event.KeyEvent evt) {
        reproducirSonido("/sound/escrituraPop.wav");
    }});

        
    }

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresarUser.png"))); // NOI18N
        jLabel2.setBounds(140, 100, 550, 140);
        getContentPane().add(jLabel2);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresarUser - copia.png"))); // NOI18N
        jLabel4.setBounds(270, 130, 310, 200);
        getContentPane().add(jLabel4);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setBounds(170, 280, 480, 80);
        getContentPane().add(jTextField1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.gif"))); // NOI18N
        jLabel1.setBounds(0, 0, 970, 540);
        getContentPane().add(jLabel1);
        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }


    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;

}
