package telas;


import java.util.LinkedList;
import javax.swing.JOptionPane;
import simpleclass.Usuario;

public class TelaCadastro extends javax.swing.JFrame {

    /** Variáveis*/
    private Usuario user;
    private LinkedList<Usuario> userLista = new LinkedList<Usuario>();
    
    public TelaCadastro(LinkedList<Usuario> userLista) {
        this.userLista = userLista;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTelaCadastra = new javax.swing.JPanel();
        lblTCNomeUsuario = new javax.swing.JLabel();
        txtTCNomeUsuario = new javax.swing.JTextField();
        lblTCSenha = new javax.swing.JLabel();
        btnTCCadastra = new javax.swing.JButton();
        lblTCConfirmaSenha = new javax.swing.JLabel();
        txtTCSenha = new javax.swing.JPasswordField();
        txtTCConfirmaSenha = new javax.swing.JPasswordField();
        lblTCEmail = new javax.swing.JLabel();
        txtTCEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTCNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTCNomeUsuario.setText("Nome de Usuário:");

        txtTCNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTCNomeUsuarioActionPerformed(evt);
            }
        });

        lblTCSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTCSenha.setText("Senha:");

        btnTCCadastra.setText("Cadastrar");
        btnTCCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTCCadastraActionPerformed(evt);
            }
        });

        lblTCConfirmaSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTCConfirmaSenha.setText("Confirmar Senha:");

        lblTCEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTCEmail.setText("Email:");

        txtTCEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTCEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTelaCadastraLayout = new javax.swing.GroupLayout(pnlTelaCadastra);
        pnlTelaCadastra.setLayout(pnlTelaCadastraLayout);
        pnlTelaCadastraLayout.setHorizontalGroup(
            pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelaCadastraLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTelaCadastraLayout.createSequentialGroup()
                        .addComponent(lblTCConfirmaSenha)
                        .addGap(10, 10, 10)
                        .addComponent(txtTCConfirmaSenha))
                    .addGroup(pnlTelaCadastraLayout.createSequentialGroup()
                        .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTCNomeUsuario)
                            .addComponent(lblTCSenha)
                            .addComponent(lblTCEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTCEmail)
                            .addComponent(txtTCNomeUsuario)
                            .addComponent(txtTCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaCadastraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTCCadastra)
                .addGap(225, 225, 225))
        );
        pnlTelaCadastraLayout.setVerticalGroup(
            pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelaCadastraLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTCEmail)
                    .addComponent(txtTCEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTCNomeUsuario)
                    .addComponent(txtTCNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTCSenha)
                    .addComponent(txtTCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTelaCadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTCConfirmaSenha)
                    .addComponent(txtTCConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnTCCadastra)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTelaCadastra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTelaCadastra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTCNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTCNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTCNomeUsuarioActionPerformed

    private void btnTCCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTCCadastraActionPerformed
        // TODO add your handling code here:
        int cadastra = 1;
        TelaLogin loginTela = new TelaLogin();
        String nomeUsuario = txtTCNomeUsuario.getText();
        String senhaUsuario = new String(txtTCSenha.getPassword());
        String confirmaSenhaUsuario = new String(txtTCConfirmaSenha.getPassword());
        if(nomeUsuario.equals("") || senhaUsuario.equals("") || confirmaSenhaUsuario.equals("")){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            if(senhaUsuario.equals(confirmaSenhaUsuario)){
                for(Usuario us: userLista){
                    if(txtTCNomeUsuario.getText().equals(us.getNomeUsuario())){
                        cadastra = 0;
                        break;
                    }
                }
                if(cadastra == 1){
                    user = new Usuario(nomeUsuario, senhaUsuario);
                    loginTela.addUsuarioLista(user);
                    JOptionPane.showMessageDialog(this, "Usuário Cadastrado!");
                    txtTCNomeUsuario.setText("");
                    txtTCSenha.setText("");
                    txtTCConfirmaSenha.setText("");                    
                }else{
                    JOptionPane.showMessageDialog(this, "Nome de usuário já existe");
                    txtTCSenha.setText("");
                    txtTCConfirmaSenha.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Você digitou senhas diferentes", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnTCCadastraActionPerformed

    private void txtTCEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTCEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTCEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTCCadastra;
    private javax.swing.JLabel lblTCConfirmaSenha;
    private javax.swing.JLabel lblTCEmail;
    private javax.swing.JLabel lblTCNomeUsuario;
    private javax.swing.JLabel lblTCSenha;
    private javax.swing.JPanel pnlTelaCadastra;
    private javax.swing.JPasswordField txtTCConfirmaSenha;
    private javax.swing.JTextField txtTCEmail;
    private javax.swing.JTextField txtTCNomeUsuario;
    private javax.swing.JPasswordField txtTCSenha;
    // End of variables declaration//GEN-END:variables
}
