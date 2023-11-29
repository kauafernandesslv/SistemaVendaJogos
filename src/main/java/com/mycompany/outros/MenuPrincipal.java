/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.outros;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import com.mycompany.ferramentas.Formularios;
import com.mycompany.visao.categoria.CadCategoriaJogos;
import com.mycompany.visao.categoria.ListCategoriaJogos;
import com.mycompany.visao.cidade.CadCidade;
import com.mycompany.visao.cidade.ListCidade;
import com.mycompany.visao.cliente.MenuPrincipalFrontEnd;
import com.mycompany.visao.cliente.TelaLogin;
import com.mycompany.visao.endereco.CadEndereco;
import com.mycompany.visao.endereco.ListEndereco;
import com.mycompany.visao.estado.CadEstado;
import com.mycompany.visao.estado.ListEstado;
import com.mycompany.visao.estado_civil.CadEstado_civil;
import com.mycompany.visao.estado_civil.ListEstado_civil;
import com.mycompany.visao.marca.CadMarca;
import com.mycompany.visao.marca.ListMarca;
import com.mycompany.visao.pais.CadPais;
import com.mycompany.visao.pais.ListPais;
import com.mycompany.visao.pessoa.CadPessoa;
import com.mycompany.visao.pessoa.ListPessoa;
import com.mycompany.visao.produto.CadProduto;
import com.mycompany.visao.produto.ListProduto;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;

/**
 *
 * @author kaua.1880
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    
   
        
        if (!BancoDeDadosMySql.conectar()){
            JOptionPane.showMessageDialog(null, "nao foi possivel se conectar ao banco de dados ");
            System.exit(0);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miCadrastroCategoria = new javax.swing.JMenuItem();
        miCadrastroPais = new javax.swing.JMenuItem();
        miCadastroEstado = new javax.swing.JMenuItem();
        miCadastroCidade = new javax.swing.JMenuItem();
        miCadastroEndereco = new javax.swing.JMenuItem();
        miCadastroPessoa = new javax.swing.JMenuItem();
        miCadastroEstado_civil = new javax.swing.JMenuItem();
        miCadastroMarca = new javax.swing.JMenuItem();
        miCadastroProduto = new javax.swing.JMenuItem();
        ListCategoria = new javax.swing.JMenu();
        miConsultaCategoria = new javax.swing.JMenuItem();
        miConsultaPais = new javax.swing.JMenuItem();
        miConsultaEstado = new javax.swing.JMenuItem();
        miConsultaCidade = new javax.swing.JMenuItem();
        miConsultaEndereco = new javax.swing.JMenuItem();
        miConsultaPessoa = new javax.swing.JMenuItem();
        miConsultaEstado_civil = new javax.swing.JMenuItem();
        miConsultaMarca = new javax.swing.JMenuItem();
        miConsultaProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miMenuPrincipal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 153));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("Cadastros");

        miCadrastroCategoria.setText("Categoria");
        miCadrastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadrastroCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(miCadrastroCategoria);

        miCadrastroPais.setText("Pais");
        miCadrastroPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadrastroPaisActionPerformed(evt);
            }
        });
        jMenu1.add(miCadrastroPais);

        miCadastroEstado.setText("estado");
        miCadastroEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroEstadoActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroEstado);

        miCadastroCidade.setText("cidade");
        miCadastroCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroCidade);

        miCadastroEndereco.setText("endereco");
        miCadastroEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroEnderecoActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroEndereco);

        miCadastroPessoa.setText("pessoa");
        miCadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroPessoaActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroPessoa);

        miCadastroEstado_civil.setText("estado_civil");
        miCadastroEstado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroEstado_civilActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroEstado_civil);

        miCadastroMarca.setText("Marca");
        miCadastroMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroMarca);

        miCadastroProduto.setText("Produto");
        miCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(miCadastroProduto);

        jMenuBar1.add(jMenu1);

        ListCategoria.setText("Consultas");

        miConsultaCategoria.setText("Categoria");
        miConsultaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaCategoriaActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaCategoria);

        miConsultaPais.setText("paises");
        miConsultaPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaPaisActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaPais);

        miConsultaEstado.setText("estado");
        miConsultaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaEstadoActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaEstado);

        miConsultaCidade.setText("cidade");
        miConsultaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaCidadeActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaCidade);

        miConsultaEndereco.setText("enderecos");
        miConsultaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaEnderecoActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaEndereco);

        miConsultaPessoa.setText("pessoas");
        miConsultaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaPessoaActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaPessoa);

        miConsultaEstado_civil.setText("estado civil ");
        miConsultaEstado_civil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaEstado_civilActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaEstado_civil);

        miConsultaMarca.setText("Marcas");
        miConsultaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaMarcaActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaMarca);

        miConsultaProduto.setText("Produtos");
        miConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaProdutoActionPerformed(evt);
            }
        });
        ListCategoria.add(miConsultaProduto);

        jMenuBar1.add(ListCategoria);

        jMenu2.setText("menu de compras");

        miMenuPrincipal.setText("menu");
        miMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMenuPrincipalActionPerformed(evt);
            }
        });
        jMenu2.add(miMenuPrincipal);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miConsultaEstado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaEstado_civilActionPerformed
        // TODO add your handling code here:
        if (Formularios.listEstado_civil == null)
        Formularios.listEstado_civil = new ListEstado_civil();

        Formularios.listEstado_civil.setVisible(true);
    }//GEN-LAST:event_miConsultaEstado_civilActionPerformed

    private void miConsultaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaPessoaActionPerformed
        // TODO add your handling code here:
        if (Formularios.listPessoa == null)
        Formularios.listPessoa = new ListPessoa();

        Formularios.listPessoa.setVisible(true);
    }//GEN-LAST:event_miConsultaPessoaActionPerformed

    private void miConsultaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaEnderecoActionPerformed
        // TODO add your handling code here:
        if (Formularios.listEndereco == null)
        Formularios.listEndereco = new ListEndereco();

        Formularios.listEndereco.setVisible(true);
    }//GEN-LAST:event_miConsultaEnderecoActionPerformed

    private void miConsultaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaCidadeActionPerformed
        // TODO add your handling code here:
        if (Formularios.listCidade == null)
        Formularios.listCidade = new ListCidade();

        Formularios.listCidade.setVisible(true);
    }//GEN-LAST:event_miConsultaCidadeActionPerformed

    private void miConsultaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaEstadoActionPerformed
        // TODO add your handling code here:
        if (Formularios.listEstado == null)
        Formularios.listEstado = new ListEstado();

        Formularios.listEstado.setVisible(true);
    }//GEN-LAST:event_miConsultaEstadoActionPerformed

    private void miConsultaPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaPaisActionPerformed
        // TODO add your handling code here:
        if (Formularios.listPais == null)
        Formularios.listPais = new ListPais();

        Formularios.listPais.setVisible(true);
    }//GEN-LAST:event_miConsultaPaisActionPerformed

    private void miConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaCategoriaActionPerformed
        if (Formularios.listCategoriaJogos == null)
        Formularios.listCategoriaJogos = new ListCategoriaJogos();

        Formularios.listCategoriaJogos.setVisible(true);

    }//GEN-LAST:event_miConsultaCategoriaActionPerformed

    private void miCadastroEstado_civilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroEstado_civilActionPerformed
        // TODO add your handling code here:
        if (Formularios.cadEstado_civil == null)
        Formularios.cadEstado_civil = new CadEstado_civil();

        Formularios.cadEstado_civil.setVisible(true);
    }//GEN-LAST:event_miCadastroEstado_civilActionPerformed

    private void miCadastroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroPessoaActionPerformed
        // TODO add your handling code here:
        if (Formularios.cadPessoa == null)
        Formularios.cadPessoa = new CadPessoa();

        Formularios.cadPessoa.setVisible(true);
    }//GEN-LAST:event_miCadastroPessoaActionPerformed

    private void miCadastroEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroEnderecoActionPerformed
        // TODO add your handling code here:
        if (Formularios.cadEndereco == null)
        Formularios.cadEndereco = new CadEndereco();

        Formularios.cadEndereco.setVisible(true);
    }//GEN-LAST:event_miCadastroEnderecoActionPerformed

    private void miCadastroCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroCidadeActionPerformed
        // TODO add your handling code here:
        if (Formularios.cadCidade == null)
        Formularios.cadCidade = new CadCidade();

        Formularios.cadCidade.setVisible(true);
    }//GEN-LAST:event_miCadastroCidadeActionPerformed

    private void miCadastroEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroEstadoActionPerformed
        // TODO add your handling code here:
        if (Formularios.cadEstado == null)
        Formularios.cadEstado = new CadEstado();

        Formularios.cadEstado.setVisible(true);
    }//GEN-LAST:event_miCadastroEstadoActionPerformed

    private void miCadrastroPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadrastroPaisActionPerformed
        // TODO add your handling code here:
        if (Formularios.cadPais == null)
        Formularios.cadPais = new CadPais();

        Formularios.cadPais.setVisible(true);
    }//GEN-LAST:event_miCadrastroPaisActionPerformed

    private void miCadrastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadrastroCategoriaActionPerformed
        if (Formularios.cadCategoriaJogos == null)
        Formularios.cadCategoriaJogos = new CadCategoriaJogos();

        Formularios.cadCategoriaJogos.setVisible(true);
    }//GEN-LAST:event_miCadrastroCategoriaActionPerformed

    private void miCadastroMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroMarcaActionPerformed
        // TODO add your handling code here:
     if (Formularios.cadMarca == null)
        Formularios.cadMarca = new CadMarca();

        Formularios.cadMarca.setVisible(true);
    }//GEN-LAST:event_miCadastroMarcaActionPerformed

    private void miCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroProdutoActionPerformed
        // TODO add your handling code here:
     if (Formularios.cadProduto == null)
        Formularios.cadProduto = new CadProduto();

        Formularios.cadProduto.setVisible(true);
    }//GEN-LAST:event_miCadastroProdutoActionPerformed

    private void miConsultaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaMarcaActionPerformed
        // TODO add your handling code here:
        if (Formularios.listMarca == null)
        Formularios.listMarca = new ListMarca();

        Formularios.listMarca.setVisible(true);
    }//GEN-LAST:event_miConsultaMarcaActionPerformed

    private void miConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaProdutoActionPerformed
        // TODO add your handling code here:
        if (Formularios.listProduto == null)
        Formularios.listProduto = new ListProduto();

        Formularios.listProduto.setVisible(true);
    }//GEN-LAST:event_miConsultaProdutoActionPerformed

    private void miMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMenuPrincipalActionPerformed
        // TODO add your handling code here:
            if (Formularios.menuPrincipalFrontEnd == null)
        Formularios.menuPrincipalFrontEnd = new MenuPrincipalFrontEnd();

        Formularios.menuPrincipalFrontEnd.setVisible(true);
    }//GEN-LAST:event_miMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ListCategoria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCadastroCidade;
    private javax.swing.JMenuItem miCadastroEndereco;
    private javax.swing.JMenuItem miCadastroEstado;
    private javax.swing.JMenuItem miCadastroEstado_civil;
    private javax.swing.JMenuItem miCadastroMarca;
    private javax.swing.JMenuItem miCadastroPessoa;
    private javax.swing.JMenuItem miCadastroProduto;
    private javax.swing.JMenuItem miCadrastroCategoria;
    private javax.swing.JMenuItem miCadrastroPais;
    private javax.swing.JMenuItem miConsultaCategoria;
    private javax.swing.JMenuItem miConsultaCidade;
    private javax.swing.JMenuItem miConsultaEndereco;
    private javax.swing.JMenuItem miConsultaEstado;
    private javax.swing.JMenuItem miConsultaEstado_civil;
    private javax.swing.JMenuItem miConsultaMarca;
    private javax.swing.JMenuItem miConsultaPais;
    private javax.swing.JMenuItem miConsultaPessoa;
    private javax.swing.JMenuItem miConsultaProduto;
    private javax.swing.JMenuItem miMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
