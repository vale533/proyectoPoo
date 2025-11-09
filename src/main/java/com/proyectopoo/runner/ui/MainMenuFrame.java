
package com.proyectopoo.runner.ui;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MainMenuFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenuFrame.class.getName());


    public MainMenuFrame() {
    initComponents();
    setSize(800, 500);
    setLocationRelativeTo(null);
    setResizable(false);

    
    jButton1.setFocusPainted(false);

    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton1.setBackground(new java.awt.Color(255,0,0)); 
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton1.setBackground(new java.awt.Color(255,200,0)); 
        }
    });
    
   

}private void reproducirSonido(String ruta) {
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


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        System.out.println(getClass().getResource("/imagenes/fondo.gif"));
        System.out.println(getClass().getResource("/imagenes/tituloufromon.png"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tituloufromon.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(60, 90, 690, 110);
        getContentPane().add(jLabel1);

        jButton1.setBackground(new java.awt.Color(255, 200, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("COMENZAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(230, 210, 340, 100);
        getContentPane().add(jButton1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pikachurun.gif"))); // NOI18N
        jLabel3.setBounds(520, 290, 230, 200);
        getContentPane().add(jLabel3);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("SALIR :(");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(320, 380, 170, 60);
        getContentPane().add(jButton2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.gif"))); // NOI18N
        jLabel2.setBounds(-20, -10, 970, 540);
        getContentPane().add(jLabel2);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
   reproducirSonido("/sound/sonidoSelect.wav");
        
        LoginFrame login = new LoginFrame();
    login.setVisible(true);

    this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);

        
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new MainMenuFrame().setVisible(true));
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

}
