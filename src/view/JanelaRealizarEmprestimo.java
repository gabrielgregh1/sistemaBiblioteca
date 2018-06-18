/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Emprestimo;
import model.bean.Livro;
import model.bean.Professor;
import model.dao.AlunoDAO;
import model.dao.EmprestimoDAO;
import model.dao.LivroDAO;
import model.dao.ProfessorDAO;

/**
 *
 * @author gabri
 */
public class JanelaRealizarEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCadasroAlunos
     */
    public JanelaRealizarEmprestimo() {
        initComponents();
        jTextFieldDevolucao.setEditable(false);
        jTextFieldCargoP.setEditable(false);
        jTextFieldISBR.setEditable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        LivroDAO daoBook = new LivroDAO();
        AlunoDAO daoAluno = new AlunoDAO();
        ProfessorDAO daoProf = new ProfessorDAO();
        for(Livro livroPonteiro : daoBook.readBook()){
            jComboBoxLivro.addItem(livroPonteiro.getTitulo());
        }
        for(Aluno alunoPonteiro : daoAluno.read()){
            jComboBoxResposavel.addItem(alunoPonteiro.getNome());        
        }
        for(Aluno alunoPonteiro : daoAluno.read()){
            jComboBoxResposavel.addItem(alunoPonteiro.getNome());        
        }
        for(Professor profPonteiro : daoProf.read()){
            jComboBoxResposavel.addItem(profPonteiro.getNome());        
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmprestimo = new javax.swing.JTextField();
        jComboBoxLivro1 = new javax.swing.JComboBox<>();
        jTextFieldDevolucao1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelResponsavel = new javax.swing.JLabel();
        jLabelEmprestimo = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelCargo = new javax.swing.JLabel();
        jLabelISBR = new javax.swing.JLabel();
        jLabelDevolucao = new javax.swing.JLabel();
        jTextFieldDevolucao = new javax.swing.JTextField();
        jButtonGeraDevolucao = new javax.swing.JButton();
        jFormattedTextFieldEmprestimo = new javax.swing.JFormattedTextField();
        jComboBoxLivro = new javax.swing.JComboBox<>();
        jComboBoxResposavel = new javax.swing.JComboBox<>();
        jTextFieldCargoP = new javax.swing.JTextField();
        jButtonGeraCargo = new javax.swing.JButton();
        jLabelISBR1 = new javax.swing.JLabel();
        jTextFieldISBR = new javax.swing.JTextField();
        jButtonGerarISBR = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jTextFieldEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmprestimoActionPerformed(evt);
            }
        });

        jComboBoxLivro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLivro1ActionPerformed(evt);
            }
        });

        jTextFieldDevolucao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDevolucao1ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("REALIZAR EMPRESTIMO");

        jLabelResponsavel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelResponsavel.setText("RESPONSÁVEL: ");

        jLabelEmprestimo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelEmprestimo.setText("DATA EMPRESTIMO:");

        jButtonConfirmar.setText("CONFIRMAR");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabelCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCargo.setText("CARGO: ");

        jLabelISBR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelISBR.setText("LIVRO: ");

        jLabelDevolucao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDevolucao.setText("DATA DEVOLUÇÃO:");

        jTextFieldDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDevolucaoActionPerformed(evt);
            }
        });

        jButtonGeraDevolucao.setText("?");
        jButtonGeraDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeraDevolucaoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldEmprestimo.setToolTipText("");
        jFormattedTextFieldEmprestimo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jFormattedTextFieldEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldEmprestimoActionPerformed(evt);
            }
        });

        jComboBoxLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLivroActionPerformed(evt);
            }
        });

        jComboBoxResposavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResposavelActionPerformed(evt);
            }
        });

        jTextFieldCargoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCargoPActionPerformed(evt);
            }
        });

        jButtonGeraCargo.setText("?");
        jButtonGeraCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeraCargoActionPerformed(evt);
            }
        });

        jLabelISBR1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelISBR1.setText("ISBR");

        jTextFieldISBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBRActionPerformed(evt);
            }
        });

        jButtonGerarISBR.setText("?");
        jButtonGerarISBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarISBRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelResponsavel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelCargo)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelISBR1)
                                            .addComponent(jLabelISBR))))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDevolucao)
                                    .addComponent(jLabelEmprestimo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxResposavel, 0, 181, Short.MAX_VALUE)
                                .addComponent(jTextFieldCargoP))
                            .addComponent(jTextFieldISBR)
                            .addComponent(jFormattedTextFieldEmprestimo)
                            .addComponent(jTextFieldDevolucao)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGeraCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonGeraDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonGerarISBR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsavel)
                    .addComponent(jComboBoxResposavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo)
                    .addComponent(jButtonGeraCargo)
                    .addComponent(jTextFieldCargoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelISBR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelISBR1)
                    .addComponent(jTextFieldISBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerarISBR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDevolucao)
                    .addComponent(jButtonGeraDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonLimpar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmprestimoActionPerformed
       
    }//GEN-LAST:event_jTextFieldEmprestimoActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
       
        String responsavel = String.valueOf(jComboBoxResposavel.getSelectedItem());
        String status = "Valido";
        String dataEmprestimo = jFormattedTextFieldEmprestimo.getText();
        String dataDevolucao = jTextFieldDevolucao.getText();
        String cargo = jTextFieldCargoP.getText();
        String titulo = String.valueOf(jComboBoxLivro.getSelectedItem());
        String isbr = jTextFieldISBR.getText();
        Livro livro = new Livro(titulo, isbr);
        Emprestimo emprestimo = new Emprestimo(responsavel, status, dataEmprestimo, dataDevolucao, cargo, livro);
        EmprestimoDAO dao = new EmprestimoDAO();
        
        dao.create(emprestimo);  
        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jComboBoxResposavel.setSelectedIndex(0);
        jTextFieldEmprestimo.setText("");
        jTextFieldDevolucao.setText("");
        jComboBoxLivro.setSelectedIndex(0);
        jTextFieldCargoP.setText("");
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonGeraDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeraDevolucaoActionPerformed
        String dataEmprestimo = jFormattedTextFieldEmprestimo.getText();
        try{
        int dia = Integer.parseInt(jFormattedTextFieldEmprestimo.getText().substring(0,2));
        int mes = Integer.parseInt(jFormattedTextFieldEmprestimo.getText().substring(3,5));
        int ano = Integer.parseInt(jFormattedTextFieldEmprestimo.getText().substring(6,10));
        int prazoEmprestimo = 15;
        if(dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 1000 ){
            if(dia > 15){
                jTextFieldDevolucao.setText(String.valueOf(dia - 15)+"/"+String.valueOf(mes + 1)+"/"+String.valueOf(ano));
                System.out.println(dia);
                if(mes > 11)
                    jTextFieldDevolucao.setText(String.valueOf(dia)+"/"+String.valueOf(mes)+"/"+String.valueOf(ano + 1));
            }if(dia < 16)
                jTextFieldDevolucao.setText(String.valueOf(dia += 15)+"/"+String.valueOf(mes)+"/"+String.valueOf(ano));
        
        }else
            JOptionPane.showMessageDialog(null, "Data Invalida");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Data Invalida");
        }
    }//GEN-LAST:event_jButtonGeraDevolucaoActionPerformed

    private void jFormattedTextFieldEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldEmprestimoActionPerformed

    private void jTextFieldDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDevolucaoActionPerformed

    }//GEN-LAST:event_jTextFieldDevolucaoActionPerformed

    private void jComboBoxLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLivroActionPerformed
        
    }//GEN-LAST:event_jComboBoxLivroActionPerformed

    private void jComboBoxLivro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLivro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLivro1ActionPerformed

    private void jComboBoxResposavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResposavelActionPerformed
        
        
        
    }//GEN-LAST:event_jComboBoxResposavelActionPerformed

    private void jTextFieldDevolucao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDevolucao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDevolucao1ActionPerformed

    private void jTextFieldCargoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCargoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCargoPActionPerformed

    private void jButtonGeraCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeraCargoActionPerformed
        AlunoDAO daoAluno = new AlunoDAO();
        ProfessorDAO daoProf = new ProfessorDAO();
        
        boolean achou = false;
        for(Aluno alunoPonteiro : daoAluno.read()){
            if(String.valueOf(jComboBoxResposavel.getSelectedItem()).equals(alunoPonteiro.getNome()))
                jTextFieldCargoP.setText("ALUNO");
                achou = true;
        }
        if(achou != false){
        for(Professor professorPonteiro : daoProf.read()){
            if(String.valueOf(jComboBoxResposavel.getSelectedItem()).equals(professorPonteiro.getNome()))
                jTextFieldCargoP.setText("PROFESSOR");         
            }
        
        }
        
        
    }//GEN-LAST:event_jButtonGeraCargoActionPerformed

    private void jTextFieldISBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBRActionPerformed

    private void jButtonGerarISBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarISBRActionPerformed
        LivroDAO daoBook = new LivroDAO();
        for(Livro livroPonteiro : daoBook.readBook()){
            if(String.valueOf(jComboBoxLivro.getSelectedItem()).equals(livroPonteiro.getTitulo()))
                jTextFieldISBR.setText(livroPonteiro.getIsbr());
        }
        
    }//GEN-LAST:event_jButtonGerarISBRActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaRealizarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame janelaCadastroAlunos = new JanelaRealizarEmprestimo();
                janelaCadastroAlunos.setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonGeraCargo;
    private javax.swing.JButton jButtonGeraDevolucao;
    private javax.swing.JButton jButtonGerarISBR;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxLivro;
    private javax.swing.JComboBox<String> jComboBoxLivro1;
    private javax.swing.JComboBox<String> jComboBoxResposavel;
    private javax.swing.JFormattedTextField jFormattedTextFieldEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelDevolucao;
    private javax.swing.JLabel jLabelEmprestimo;
    private javax.swing.JLabel jLabelISBR;
    private javax.swing.JLabel jLabelISBR1;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCargoP;
    private javax.swing.JTextField jTextFieldDevolucao;
    private javax.swing.JTextField jTextFieldDevolucao1;
    private javax.swing.JTextField jTextFieldEmprestimo;
    private javax.swing.JTextField jTextFieldISBR;
    // End of variables declaration//GEN-END:variables
}
