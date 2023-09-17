package classes;

import java.awt.Font;

public class TelaGenio extends javax.swing.JFrame {

    public TelaGenio() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um valor entre 1 e 10. Tente adivinhar</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVal = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/akinator.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, -1));

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao-fala.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 150, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Valor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, -1));

        btnPalpite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
       double n = 1 + Math.random() * (11 - 1);
       int valor = (int) n;
       
       int num = Integer.parseInt(txtVal.getValue().toString());
       
       String f1 = "<html>ACERTOU!</html>";
       String f2 = "<html>ERROU! Pensei no valor " + valor + "</html>";
       
       String res = (valor == num) ? f1 : f2;
       
       lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 14));
       
       lblFrase.setText(res);
    }//GEN-LAST:event_btnPalpiteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables
}
