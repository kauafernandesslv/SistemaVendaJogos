/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao.produto;
import com.mycompany.dao.DaoCategoria;
import com.mycompany.dao.DaoEstado;
import com.mycompany.dao.DaoMarca;
import com.mycompany.dao.DaoPais;
import com.mycompany.dao.DaoProduto;
import com.mycompany.ferramentas.DadosTemporarios;
import com.mycompany.modelo.ModEstado;
import com.mycompany.modelo.ModProduto;
import com.mycompany.visao.estado.CadEstado;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kaua.1880
 */
public class ListProduto extends javax.swing.JFrame {

    /**
     * Creates new form ListProduto
     */
    public ListProduto() {
        initComponents();
          setLocationRelativeTo(null);
        
        listarTodos();
    }
 public void listarTodos(){
        try{
            //Pega o model da tabela definido no design
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarTodos();
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            
        }
    }
    
    public void listarPorCategoria(String pCategoria){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorCategoria(pCategoria);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorMarca(String pMarca){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorMarca(pMarca);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorId(int pId){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorId(pId);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorNome(String pNome){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorNome(pNome);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorDescricao(String pDescricao){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorDescricao(pDescricao);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoMaiorQue(Double pPreco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorPrecoMaiorQue(pPreco);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoMenorQue(Double pPreco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorPrecoMenorQue(pPreco);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void listarPorPrecoIgualA(Double pPreco){
        try{
            //Define o model da tabela.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tableProduto.getModel();
            
            tableProduto.setModel(defaultTableModel);

            DaoProduto daoProduto = new DaoProduto();

            //Atribui o resultset retornado a uma variável para ser usada.
            ResultSet resultSet = daoProduto.listarPorPrecoIgualA(pPreco);
            
            defaultTableModel.setRowCount(0);
            while (resultSet.next()){
                String id = resultSet.getString(1);
                String categoria = resultSet.getString(2);
                String marca = resultSet.getString(3);
                String nome =  resultSet.getString(4);
                String descricao =  resultSet.getString(5);
                String preco = resultSet.getString(6);
                
                defaultTableModel.addRow(new Object[]{id, categoria, marca, nome, descricao, preco});
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
        jcbTipoFiltro = new javax.swing.JComboBox<>();
        tfFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "CATEGORIA", "MARCA", "NOME", "DESCRIÇÃO", "PREÇO IGUAL A", "PREÇO MAIOR QUE", "PREÇO MENOR QUE" }));

        tfFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFiltroActionPerformed(evt);
            }
        });

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CATEGORIA", "MARCA", "NOME", "DESCRIÇÃO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);
        if (tableProduto.getColumnModel().getColumnCount() > 0) {
            tableProduto.getColumnModel().getColumn(4).setResizable(false);
            tableProduto.getColumnModel().getColumn(5).setResizable(false);
        }

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFiltro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap())
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

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked
        try{
            if (evt.getClickCount() == 2){
                ModProduto modProduto = new ModProduto();

                modProduto.setId(Integer.parseInt(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 0))));
                modProduto.setNome(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 3)));
                modProduto.setDescricao(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 4)));
                modProduto.setPreco(Double.parseDouble(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 5))));

                //
                DaoCategoria daoCategoria = new DaoCategoria();
                ResultSet resultSet = daoCategoria.listarPorNome(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 1)));

                int idCat = -1;
                resultSet.next();
                idCat = resultSet.getInt("ID");

                modProduto.setIdCategoria(idCat);
                //

                //
                DaoMarca daoMarca = new DaoMarca();
                resultSet = daoMarca.listarPorNome(String.valueOf(tableProduto.getValueAt(tableProduto.getSelectedRow(), 2)));

                int idMar = -1;
                resultSet.next();
                idMar = resultSet.getInt("ID");

                modProduto.setIdMarca(idMar);
                //

                DadosTemporarios.tempObject = (ModProduto) modProduto;

                CadProduto cadProduto = new CadProduto();
                cadProduto.setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tableProdutoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        switch (jcbTipoFiltro.getSelectedIndex()){
            case 0:
            listarTodos();
            break;
            case 1:
            listarPorId(Integer.parseInt(tfFiltro.getText()));
            break;
            case 2:
            listarPorCategoria(tfFiltro.getText());
            break;
            case 3:
            listarPorMarca(tfFiltro.getText());
            break;
            case 4:
            listarPorNome(tfFiltro.getText());
            break;
            case 5:
            listarPorDescricao(tfFiltro.getText());
            break;
            case 6:
            listarPorPrecoIgualA(Double.parseDouble(tfFiltro.getText()));
            break;
            case 7:
            listarPorPrecoMaiorQue(Double.parseDouble(tfFiltro.getText()));
            break;
            case 8:
            listarPorPrecoMenorQue(Double.parseDouble(tfFiltro.getText()));
            break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFiltro;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
