/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author Cetecom
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnbMenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniAgregar = new javax.swing.JMenuItem();
        mniEditar = new javax.swing.JMenuItem();
        mniEliminar = new javax.swing.JMenuItem();
        mniBuscar = new javax.swing.JMenuItem();
        mniListar = new javax.swing.JMenuItem();
        mnbSalir = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Gestión productos");

        mniAgregar.setText("Agregar");
        mniAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(mniAgregar);

        mniEditar.setText("Editar");
        mniEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditarActionPerformed(evt);
            }
        });
        jMenu1.add(mniEditar);

        mniEliminar.setText("Eliminar");
        mniEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(mniEliminar);

        mniBuscar.setText("Buscar");
        mniBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(mniBuscar);

        mniListar.setText("Listar");
        mniListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarActionPerformed(evt);
            }
        });
        jMenu1.add(mniListar);

        mnbMenuPrincipal.add(jMenu1);

        mnbSalir.setText("Salir");

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnbSalir.add(mniSalir);

        mnbMenuPrincipal.add(mnbSalir);

        setJMenuBar(mnbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarActionPerformed
        AgregarProducto a = new AgregarProducto();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniAgregarActionPerformed

    private void mniEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditarActionPerformed
        // TODO add your handling code here:
        EditarProducto e = new EditarProducto();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniEditarActionPerformed

    private void mniEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminarActionPerformed
        EliminarProducto e = new EliminarProducto();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniEliminarActionPerformed

    private void mniBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniBuscarActionPerformed

    private void mniListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarActionPerformed
        ListarProductos l = new ListarProductos();
        l.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_mniListarActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
          System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar mnbMenuPrincipal;
    private javax.swing.JMenu mnbSalir;
    private javax.swing.JMenuItem mniAgregar;
    private javax.swing.JMenuItem mniBuscar;
    private javax.swing.JMenuItem mniEditar;
    private javax.swing.JMenuItem mniEliminar;
    private javax.swing.JMenuItem mniListar;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables
}
