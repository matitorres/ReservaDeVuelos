/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import clases.Cliente;
import clasesData.ClienteData;
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





/**
 *
 * @author pedro
 */
public class VistaCliente extends javax.swing.JFrame {
    
     private static  VistaCliente ventana = new VistaCliente();
   
    
     private TableRowSorter filtro;
     private ClienteData gestorCliente = new ClienteData();
     private List<Cliente> listaClientes = gestorCliente.getClientes();
     
    public VistaCliente() {
     
        initComponents();
        soloLetras(cajaNombreCliente);
        soloLetras(cajaApellidoCliente);
        soloNumeros(cajaDniCliente);
        soloNumeros(cajaBuscarCliente);
        soloNumeros(cajaPasaporteCliente);
        soloNumeros(cajaTarjetaCliente);
        // pasar_valores_porPasaporte(listaClientes);
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
        cajaBuscarCliente = new javax.swing.JTextField();
        botonBuscarCliente = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        panelDatosCliente.setBackground(new java.awt.Color(51, 102, 0));
        panelDatosCliente.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("NOMBRE");

        jLabel2.setText("APELLIDO");

        jLabel4.setText("DNI");

        jLabel5.setText("N° PASAPORTE");

        jLabel6.setText("N° TARJETA");

        botonAgregarCliente.setBackground(new java.awt.Color(51, 153, 0));
        botonAgregarCliente.setText("AGREGAR");
        botonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarClienteActionPerformed(evt);
            }
        });

        botonModificarCliente.setBackground(new java.awt.Color(51, 153, 0));
        botonModificarCliente.setText("MODIFICAR");
        botonModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarClienteActionPerformed(evt);
            }
        });

        botonEliminarCliente.setBackground(new java.awt.Color(51, 153, 0));
        botonEliminarCliente.setText("ELIMINAR");
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        botonVaciarCliente.setBackground(new java.awt.Color(102, 153, 0));
        botonVaciarCliente.setText("VACIAR CAMPOS");
        botonVaciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("EMAIL");

        cajaBuscarCliente.setText("Buscar por dni...");
        cajaBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaBuscarClienteMouseClicked(evt);
            }
        });
        cajaBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarClienteActionPerformed(evt);
            }
        });
        cajaBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaBuscarClienteKeyTyped(evt);
            }
        });

        botonBuscarCliente.setBackground(new java.awt.Color(102, 153, 0));
        botonBuscarCliente.setText("BUSCAR");
        botonBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDatosClienteLayout = new javax.swing.GroupLayout(panelDatosCliente);
        panelDatosCliente.setLayout(panelDatosClienteLayout);
        panelDatosClienteLayout.setHorizontalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosClienteLayout.createSequentialGroup()
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                .addComponent(botonVaciarCliente)
                                .addGap(83, 83, 83)
                                .addComponent(botonAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(botonEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDatosClienteLayout.createSequentialGroup()
                                    .addComponent(cajaBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))))
                        .addGap(36, 36, 36)
                        .addComponent(botonModificarCliente)
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaPasaporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTarjetaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))))
        );
        panelDatosClienteLayout.setVerticalGroup(
            panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarCliente))
                .addGap(40, 40, 40)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPasaporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaTarjetaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addGroup(panelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVaciarCliente)
                    .addComponent(botonAgregarCliente)
                    .addComponent(botonEliminarCliente)
                    .addComponent(botonModificarCliente))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        botonSalir.setBackground(new java.awt.Color(102, 153, 0));
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 204, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonSalir)
                .addGap(32, 32, 32))
        );

        jTabbedPane2.addTab("", jPanel2);

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

  public static void visibilidad(boolean estado){
      ventana.setVisible(estado);
  }  
 /* public void pasar_valores_porPasaporte(List<Cliente> lista){
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

        
    }*/
    private void cajaBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaBuscarClienteKeyTyped
  
    }//GEN-LAST:event_cajaBuscarClienteKeyTyped

    private void cajaBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarClienteActionPerformed

    }//GEN-LAST:event_cajaBuscarClienteActionPerformed

    private void cajaBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaBuscarClienteMouseClicked
        cajaBuscarCliente.setText(null);
    }//GEN-LAST:event_cajaBuscarClienteMouseClicked

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
   

     
        
     if(!cajasVaciasCliente()){

       if (0 == JOptionPane.showConfirmDialog(this,"¿Esta seguro de hacer esta modificacion?")) {   

          
                   int exito =0;
                    Cliente nuevo = new Cliente(1, cajaNombreCliente.getText(), cajaApellidoCliente.getText(),Integer.parseInt(cajaDniCliente.getText()), cajaEmailCliente.getText(), Integer.parseInt(cajaPasaporteCliente.getText()), Integer.parseInt(cajaTarjetaCliente.getText()));
     
        
     
       
  
           try {
               exito = gestorCliente.modificarCliente(nuevo);
                   if(exito>0){
                JOptionPane.showMessageDialog(null,"Se ha hecho la modificacion");
               }
              else{
                   JOptionPane.showMessageDialog(null,"Error al hacer el update");
              }
           } catch (SQLException ex) {
               Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
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

    private void botonBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarClienteMouseClicked
     
    if(!cajaBuscarCliente.getText().equals(""))  {
        int dni = Integer.parseInt(cajaBuscarCliente.getText());
        Cliente cli = new Cliente();
        cli = gestorCliente.getCliente(dni);
        if(cli.getDni() != 0){
        
          cajaDniCliente.setText(""+cli.getDni());
          cajaNombreCliente.setText(cli.getNombre());
          cajaApellidoCliente.setText(cli.getApellido());
          cajaPasaporteCliente.setText(""+cli.getPasaporte());
          cajaTarjetaCliente.setText(""+cli.getTarjeta());
          cajaEmailCliente.setText(cli.getMail());
        }
        else{
            JOptionPane.showMessageDialog(null,"El cliente no esta registrado");
        }
        
        
    }  
    else{
        JOptionPane.showMessageDialog(null,"Ingrese un dni");
    }
    }//GEN-LAST:event_botonBuscarClienteMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        ventana.setVisible(false);
        VistaAdmin.visibilidad(true);
    }//GEN-LAST:event_botonSalirActionPerformed

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
    

    
        private boolean cajasVaciasCliente(){
        boolean hayvacias = false;
        
        if(cajaEmailCliente.getText().equals("")||cajaNombreCliente.getText().equals("") || cajaApellidoCliente.getText().equals("") || cajaDniCliente.getText().equals("") || cajaPasaporteCliente.getText().equals("") || cajaTarjetaCliente.getText().equals("")){
              hayvacias=true;
        }
        
     
        return hayvacias;
    }    
        
        public void filtro(){
        filtro.setRowFilter(RowFilter.regexFilter(cajaBuscarCliente.getText(), 2,3,4));
    } 
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCliente;
    private javax.swing.JButton botonBuscarCliente;
    private javax.swing.JButton botonEliminarCliente;
    private javax.swing.JButton botonModificarCliente;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVaciarCliente;
    private javax.swing.JTextField cajaApellidoCliente;
    private javax.swing.JTextField cajaBuscarCliente;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel panelDatosCliente;
    // End of variables declaration//GEN-END:variables
}
