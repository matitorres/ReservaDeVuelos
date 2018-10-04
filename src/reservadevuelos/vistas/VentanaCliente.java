/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.vistas;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import reservadevuelos.modelo.ClienteData;
import reservadevuelos.modelo.Cliente;




/**
 *
 * @author pedro
 */
public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCliente
     */
    
    private TableRowSorter filtro;
    private ClienteData gestorCliente = new ClienteData();
    private List<Cliente> listaClientes = gestorCliente.getClientes();
    public VentanaCliente() {
     
        initComponents();
        soloLetras(cajaNombreCliente);
        soloLetras(cajaApellidoCliente);
        soloNumeros(cajaDniCliente);
        soloNumeros(cajaPasaporteCliente);
        soloNumeros(cajaTarjetaCliente);
        pasar_valores_porPasaporte(listaClientes);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panelDatosCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaNombreCliente = new javax.swing.JTextField();
        cajaApellidoCliente = new javax.swing.JTextField();
        cajaDniCliente = new javax.swing.JTextField();
        cajaPasaporteCliente = new javax.swing.JTextField();
        cajaTarjetaCliente = new javax.swing.JTextField();
        botonAgregarCliente = new javax.swing.JButton();
        botonModificarCliente = new javax.swing.JButton();
        botonEliminarCliente = new javax.swing.JButton();
        botonVaciarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cajaEmailCliente = new javax.swing.JTextField();
        panelListadoClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        cajaBuscarClientes = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE");

        jLabel2.setText("APELLIDO");

        jLabel4.setText("DNI");

        jLabel5.setText("N° PASAPORTE");

        jLabel6.setText("N° TARJETA");

        botonAgregarCliente.setText("AGREGAR");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        botonModificarCliente.setText("MODIFICAR");
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });

        botonEliminarCliente.setText("ELIMINAR");
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        botonVaciarCliente.setText("VACIAR CAMPOS");
        botonVaciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("EMAIL");

        javax.swing.GroupLayout panelDatosClienteLayout = new javax.swing.GroupLayout(panelDatosCliente);
        panelDatosCliente.setLayout(panelDatosClienteLayout);
        panelDatosClienteLayout.setHorizontalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addComponent(botonVaciarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                        .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificarCliente)
                        .addGap(19, 19, 19))
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(68, 68, 68)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(cajaApellidoCliente)
                            .addComponent(cajaDniCliente)
                            .addComponent(cajaPasaporteCliente)
                            .addComponent(cajaTarjetaCliente)
                            .addComponent(cajaEmailCliente))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelDatosClienteLayout.setVerticalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaPasaporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaTarjetaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVaciarCliente)
                    .addComponent(botonAgregarCliente)
                    .addComponent(botonEliminarCliente)
                    .addComponent(botonModificarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        cajaBuscarClientes.setText("Buscar por dni...");
        cajaBuscarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaBuscarClientesMouseClicked(evt);
            }
        });
        cajaBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarClientesActionPerformed(evt);
            }
        });
        cajaBuscarClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaBuscarClientesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelListadoClientesLayout = new javax.swing.GroupLayout(panelListadoClientes);
        panelListadoClientes.setLayout(panelListadoClientesLayout);
        panelListadoClientesLayout.setHorizontalGroup(
            panelListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelListadoClientesLayout.createSequentialGroup()
                        .addComponent(cajaBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 569, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelListadoClientesLayout.setVerticalGroup(
            panelListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoClientesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cajaBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(panelListadoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListadoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CLIENTES", jPanel2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void pasar_valores_porPasaporte(List<Cliente> lista){
      int i;
      //llamamos a los metodos para conectar ala BASE DE DATOS
      
        Collections.sort(lista);
        String[] columnas = {"ID","Nro Pasaporte", "Nombre", "Apellido", "DNI","Email", "nro Tarjeta"};
        
        DefaultTableModel dtm = new DefaultTableModel(null,columnas);
        
            Iterator iter = lista.iterator();
            Cliente c;
       while(iter.hasNext()){
           c = (Cliente)iter.next();
      
         String[] filas = {""+c.getId(), ""+c.getPasaporte(),c.getNombre(), c.getApellido(), ""+c.getDni(), c.getMail(),""+c.getTarjeta()};
          dtm.addRow(filas);
     
       }
 
        tablaClientes.setModel(dtm);

        
    }
    
    private void cajaBuscarClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarClientesKeyTyped
        cajaBuscarClientes.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e){
                String cadena = (cajaBuscarClientes.getText());
                cajaBuscarClientes.setText(cadena);
                repaint();
                filtro();
            }
        });
        filtro = new TableRowSorter (tablaClientes.getModel());
        tablaClientes.setRowSorter(filtro);
    }//GEN-LAST:event_cajaBuscarClientesKeyTyped

    private void cajaBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarClientesActionPerformed

    }//GEN-LAST:event_cajaBuscarClientesActionPerformed

    private void cajaBuscarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaBuscarClientesMouseClicked
        cajaBuscarClientes.setText(null);
    }//GEN-LAST:event_cajaBuscarClientesMouseClicked

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        llenarCamposCliente();// TODO add your handling code here:
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void botonVaciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarClienteActionPerformed
        vaciarCajasCliente();
    }//GEN-LAST:event_botonVaciarClienteActionPerformed

    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
        if(!cajaDniCliente.getText().equals("")){
            // SI SE HA INGRESADO UN DNI
            int  dni_in = Integer.parseInt(cajaDniCliente.getText());
            if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de eliminar este cliente?")) {
                //EXISTE EN LA BASE DE DATOS?

                int exito;
                try {
                    exito = gestorCliente.bajaCliente(dni_in);
                  
                    JOptionPane.showMessageDialog(null,"Se ha eliminado al cliente exitosamente");
                
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null,"Erro al eliminar el db de la db");
                
                }
                
               
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Ingrese dni del cliente");
        }
    }//GEN-LAST:event_botonEliminarClienteActionPerformed

    private void botonModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarClienteActionPerformed
   
        
        int fila = tablaClientes.getSelectedRow();
        String id_aux = tablaClientes.getValueAt(fila, 0).toString();
        int id= Integer.parseInt(id_aux);
        
     if(!cajasVaciasCliente()){

       if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de hacer esta modificacion?")) {   

        Cliente cli = new Cliente(id,cajaNombreCliente.getText(), cajaApellidoCliente.getText(), Integer.parseInt(cajaDniCliente.getText()), cajaEmailCliente.getText(), Integer.parseInt(cajaPasaporteCliente.getText()), Integer.parseInt(cajaTarjetaCliente.getText()));
        int exito;
           try {
               exito = gestorCliente.modificarCliente(cli);
                       if(exito >0){
                         JOptionPane.showMessageDialog(null,"Operacion exitosa!");
                        }
           } catch (SQLException ex) {

               JOptionPane.showMessageDialog(null,"No existe tal cliente, o problemas en la conexion!");
        
           }
       

       
       }
     }
       else{
           JOptionPane.showMessageDialog(null,"Llene los campos vacios");
       }
       
    }//GEN-LAST:event_botonModificarClienteActionPerformed

    private void botonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarClienteActionPerformed
        //CARGO LOS DATOS
        //COMO TODAS LAS CAJAS SON STRINGS, ENTONCES AQUELLOS DATOS ENTEROS DEL CLIENTE LOS TRANFORMO DE STRING A ENTERO CON:
        //Integer.parseInt(String s)
        if(!cajasVaciasCliente()){

            if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de hacer este registro?")) {

                Cliente nuevo = new Cliente(1, cajaNombreCliente.getText(), cajaApellidoCliente.getText(),Integer.parseInt(cajaDniCliente.getText()), cajaEmailCliente.getText(), Integer.parseInt(cajaPasaporteCliente.getText()), Integer.parseInt(cajaTarjetaCliente.getText()));
                //LO AGREGO A LA BASE DE DATOS
                //CONSULTO SI YA EXISTE O NO CLIENTE CON ESE DNI

                if(!gestorCliente.existe(nuevo.getDni())){ // osea es un dni valido

                    // SI NO EXISTE HACEMOS LA ALTA
                    int exito;
                    try {
                        exito = gestorCliente.altaCliente(nuevo);
                          
                        listaClientes.add(nuevo);
                       // pasar_valores_porPasaporte(listaClientes);
                        JOptionPane.showMessageDialog(null,"Registro exitoso!");
                       
                    
                    } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,"Error al agregar nuevo cliente a la db!");
                    }
                 

                }
                else{
                    // SI existe AVISAMOS
                    JOptionPane.showMessageDialog(null,"Ya existe un cliente con ese dni, verifique los campos.");
                }

            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Error. debe Llenar todos los campos");
        }
    }//GEN-LAST:event_botonAgregarClienteActionPerformed

        public void soloLetras(JTextField texto){
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evento){
                char c=evento.getKeyChar();
                if (Character.isDigit(c)){
                    getToolkit().beep();
                    evento.consume();}
            }
        });
    }
    public void soloNumeros(JTextField texto){
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evento){
                char c=evento.getKeyChar();
                if (!Character.isDigit(c)){
                    getToolkit().beep();
                    evento.consume();}
            }
        });
    }
    
     public void vaciarCajasCliente(){ 
     cajaDniCliente.setText("");cajaTarjetaCliente.setText("");cajaPasaporteCliente.setText("");
     cajaNombreCliente.setText("");cajaApellidoCliente.setText("");cajaEmailCliente.setText("");
    }
    
     public void llenarCamposCliente(){
          int fila = tablaClientes.getSelectedRow();
          String id_aux = tablaClientes.getValueAt(fila, 0).toString();
          int id= Integer.parseInt(id_aux);
        
          Cliente cli = gestorCliente.getCliente(id);
          cajaDniCliente.setText(""+cli.getDni());
          cajaNombreCliente.setText(cli.getNombre());
          cajaApellidoCliente.setText(cli.getApellido());
          cajaPasaporteCliente.setText(""+cli.getPasaporte());
          cajaTarjetaCliente.setText(""+cli.getTarjeta());
          cajaEmailCliente.setText(cli.getMail());
    }
    
        private boolean cajasVaciasCliente(){
        boolean hayvacias = false;
        
        if(cajaEmailCliente.getText().equals("")||cajaNombreCliente.getText().equals("") || cajaApellidoCliente.getText().equals("") || cajaDniCliente.getText().equals("") || cajaPasaporteCliente.getText().equals("") || cajaTarjetaCliente.getText().equals("")){
              hayvacias=true;
        }
        
     
        return hayvacias;
        }
        
        public void filtro(){
        filtro.setRowFilter(RowFilter.regexFilter(cajaBuscarClientes.getText(), 2,3,4));
    } 
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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
                    new VentanaCliente().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonEliminarCliente;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonVaciarCliente;
    private javax.swing.JTextField cajaApellidoCliente;
    private javax.swing.JTextField cajaBuscarClientes;
    private javax.swing.JTextField cajaDniCliente;
    private javax.swing.JTextField cajaEmailCliente;
    private javax.swing.JTextField cajaNombreCliente;
    private javax.swing.JTextField cajaPasaporteCliente;
    private javax.swing.JTextField cajaTarjetaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panelDatosCliente;
    private javax.swing.JPanel panelListadoClientes;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
