/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import entities.Sessao;
import javax.swing.JOptionPane;

/**
 *
 * @author luizz
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        Sessao sessao = Sessao.getInstance();
        String msgBoasVindas = "Bem-Vindo " + sessao.user.getName();
        labelEntradaUser.setText(msgBoasVindas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBarba = new javax.swing.JButton();
        btnSobrancelhas = new javax.swing.JButton();
        btnCorteCabelo = new javax.swing.JButton();
        btnCabeloBarba = new javax.swing.JButton();
        labelEntradaUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBarbearias = new javax.swing.JMenu();
        barberPrimeira = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        barberSegunda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        barberTerceira = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();
        btnMenuHorarios = new javax.swing.JMenu();
        btnMeusAgendamentos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seja Bem-Vindo");

        btnBarba.setText("Barbas");
        btnBarba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarbaActionPerformed(evt);
            }
        });

        btnSobrancelhas.setText("Sobrancelhas");
        btnSobrancelhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobrancelhasActionPerformed(evt);
            }
        });

        btnCorteCabelo.setText("Corte de Cabelo");
        btnCorteCabelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteCabeloActionPerformed(evt);
            }
        });

        btnCabeloBarba.setText("Cabelo e Barba");
        btnCabeloBarba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabeloBarbaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSobrancelhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCabeloBarba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBarba, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCorteCabelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCorteCabelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBarba, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCabeloBarba, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSobrancelhas, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelEntradaUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEntradaUser.setText("Bem-Vindo, {@User}");
        labelEntradaUser.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                labelEntradaUserComponentAdded(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Escolha um dos nossos serviços!");

        menuBarbearias.setText("Barbearias");

        barberPrimeira.setText("Barbearia Tio João");
        barberPrimeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barberPrimeiraActionPerformed(evt);
            }
        });
        menuBarbearias.add(barberPrimeira);
        menuBarbearias.add(jSeparator2);

        barberSegunda.setText("Barbearia da Isa");
        barberSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barberSegundaActionPerformed(evt);
            }
        });
        menuBarbearias.add(barberSegunda);
        menuBarbearias.add(jSeparator1);

        barberTerceira.setText("Barbearia Celeiro");
        barberTerceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barberTerceiraActionPerformed(evt);
            }
        });
        menuBarbearias.add(barberTerceira);

        jMenuBar1.add(menuBarbearias);

        menuAjuda.setText("Ajuda");

        help.setText("Ainda não fornecemos ;)");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        menuAjuda.add(help);

        jMenuBar1.add(menuAjuda);

        btnMenuHorarios.setText("Meus Horários");
        btnMenuHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuHorariosActionPerformed(evt);
            }
        });

        btnMeusAgendamentos.setText("Meus Agendamentos");
        btnMeusAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeusAgendamentosActionPerformed(evt);
            }
        });
        btnMenuHorarios.add(btnMeusAgendamentos);

        jMenuBar1.add(btnMenuHorarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEntradaUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelEntradaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barberPrimeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barberPrimeiraActionPerformed
        ListagemHorarios listagemHorarios = new ListagemHorarios();        
        listagemHorarios.setVisible(true);
    }//GEN-LAST:event_barberPrimeiraActionPerformed

    private void barberSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barberSegundaActionPerformed
        ListagemHorarios listagemHorarios = new ListagemHorarios();        
        listagemHorarios.setVisible(true);
    }//GEN-LAST:event_barberSegundaActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

    private void btnBarbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarbaActionPerformed
        Sessao sessao = Sessao.getInstance();
        sessao.id_corte = 2;
        sessao.nome_corte = "Barba";
        
        Agendamento agendamento = new Agendamento();
        agendamento.setVisible(true);
    }//GEN-LAST:event_btnBarbaActionPerformed

    private void btnSobrancelhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobrancelhasActionPerformed
        Sessao sessao = Sessao.getInstance();
        sessao.id_corte = 4;
        sessao.nome_corte = "Sobrancelho";
        
        Agendamento agendamento = new Agendamento();        
        agendamento.setVisible(true);
    }//GEN-LAST:event_btnSobrancelhasActionPerformed

    private void btnCabeloBarbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabeloBarbaActionPerformed
        Sessao sessao = Sessao.getInstance();
        sessao.id_corte = 3;
        sessao.nome_corte = "Corte de cabelo e Barba";
        
        Agendamento agendamento = new Agendamento();        
        agendamento.setVisible(true);
    }//GEN-LAST:event_btnCabeloBarbaActionPerformed

    private void btnCorteCabeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteCabeloActionPerformed
        Sessao sessao = Sessao.getInstance();
        sessao.id_corte = 1;
        sessao.nome_corte = "Corte de cabelo";
        
        Agendamento agendamento = new Agendamento();        
        agendamento.setVisible(true);
    }//GEN-LAST:event_btnCorteCabeloActionPerformed

    private void barberTerceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barberTerceiraActionPerformed
        ListagemHorarios listagemHorarios = new ListagemHorarios();        
        listagemHorarios.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_barberTerceiraActionPerformed

    private void labelEntradaUserComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_labelEntradaUserComponentAdded

    }//GEN-LAST:event_labelEntradaUserComponentAdded

    private void btnMenuHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuHorariosActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuHorariosActionPerformed

    private void btnMeusAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeusAgendamentosActionPerformed
        ListagemHorarios listagemHorarios = new ListagemHorarios();        
        listagemHorarios.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnMeusAgendamentosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem barberPrimeira;
    private javax.swing.JMenuItem barberSegunda;
    private javax.swing.JMenuItem barberTerceira;
    private javax.swing.JButton btnBarba;
    private javax.swing.JButton btnCabeloBarba;
    private javax.swing.JButton btnCorteCabelo;
    private javax.swing.JMenu btnMenuHorarios;
    private javax.swing.JMenuItem btnMeusAgendamentos;
    private javax.swing.JButton btnSobrancelhas;
    private javax.swing.JMenuItem help;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelEntradaUser;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuBarbearias;
    // End of variables declaration//GEN-END:variables
}
