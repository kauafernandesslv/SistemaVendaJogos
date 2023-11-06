/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.pessoa;

import com.mycompany.dao.DaoCidade;
import com.mycompany.dao.DaoEndereco;
import com.mycompany.dao.DaoEstado_civil;
import com.mycompany.dao.DaoPessoa;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.modelo.ModEndereco;
import com.mycompany.modelo.ModPessoa;
import com.mycompany.visao.endereco.CadEndereco;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaua.1880
 */
public class ListPessoa extends javax.swing.JFrame {

    /**
     * Creates new form LIstPessoa
     */
    public ListPessoa() {
        initComponents();
        
             setLocationRelativeTo(null);
        
        listarTodos();;
    }

    public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
             String id = resultSet.getString(1);
             String nome = resultSet.getString(2);
             String sobrenome = resultSet.getString(3);
             String rua = resultSet.getString(4);
             String numRes = resultSet.getString(5);
             String genero = resultSet.getString(6);
             String telefone = resultSet.getString(7);
             String email = resultSet.getString(8);
             String estado_civil = resultSet.getString(9);
             String cidade = resultSet.getString(10);
             String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorId(Integer.parseInt(tfFiltro.getText()));
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                 String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorRua(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorRua(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarCep(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorCep(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNumeroResidencia(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorNumeroResidencia(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorNome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
           String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorSobrenome(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorSobrenome(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
          String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorGenero(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorGenero(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
     String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorTelefone(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorTelefone(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
            String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEmail(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorEmail(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
               String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorEstadoCivil(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tablePessoa.getModel();
            
            tablePessoa.setModel(defaultTableModel);

            DaoPessoa daoPessoa = new DaoPessoa();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoPessoa.listarPorEstadoCivil(tfFiltro.getText());
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String nome = resultSet.getString(2);
                String sobrenome = resultSet.getString(3);
                String rua = resultSet.getString(4);
                String numRes = resultSet.getString(5);
                String genero = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String email = resultSet.getString(8);
                String estado_civil = resultSet.getString(9);
                String cidade = resultSet.getString(10);
                String cep = resultSet.getString(11);
                
                defaultTableModel.addRow(new Object[]{id, nome, sobrenome, rua, numRes, genero, telefone, email, estado_civil, cidade, cep});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePessoa = new javax.swing.JTable();
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Cidade", "Rua", "cep", "numero residencia", "nome", "sobrenome", "genero", "cep", "email", "estado civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePessoa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar)
                .addContainerGap(656, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
          switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
             switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
                listarTodos();
                break;
            case 1:
                listarPorId();
                break;
            case 2:
                listarPorRua();
                break;
            case 3:
                listarCep();
                break;
            case 4:
                listarPorNumeroResidencia();
                break;
            case 5:
                listarPorNome();
                break;
            case 6:
                listarPorSobrenome();
                break;
            case 7:
                listarPorGenero();
                break;
            case 8:
                listarPorTelefone();
                break;
            case 9:
                listarPorEmail();
                break;
            case 10:
                listarPorEstadoCivil();
                break;
             }}
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tablePessoa;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
