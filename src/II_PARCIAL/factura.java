package II_PARCIAL;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class factura extends javax.swing.JFrame {

    Conexion conx = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    DefaultTableModel modeloFactura;
    Statement st;
    ResultSet rs;
    
    public factura() {
        initComponents();
        setLocationRelativeTo(null);
        consultar("");
        actualizarFecha();
        setIconImage(new ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/cupcake.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nom_in = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nit_in = new javax.swing.JTextField();
        fecha_out = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_busqueda = new javax.swing.JTable();
        delete_b = new javax.swing.JButton();
        add_b = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_factura = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        bus_in = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        print_b = new javax.swing.JButton();
        total_out = new javax.swing.JLabel();
        back_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 247, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        nom_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("NIT:");

        nit_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        fecha_out.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fecha_out.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fecha_out.setText("DD/MM/YYYY");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Productos");

        tabla_busqueda.setBackground(new java.awt.Color(252, 249, 255));
        tabla_busqueda.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla_busqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad E.", "Precio U."
            }
        ));
        tabla_busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_busquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_busqueda);

        delete_b.setBackground(new java.awt.Color(253, 249, 255));
        delete_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        delete_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/quit_icon.png"))); // NOI18N
        delete_b.setText(" QUITAR");
        delete_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bActionPerformed(evt);
            }
        });

        add_b.setBackground(new java.awt.Color(253, 249, 255));
        add_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        add_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/plus_icon.png"))); // NOI18N
        add_b.setText(" AGREGAR");
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });

        tabla_factura.setBackground(new java.awt.Color(252, 249, 255));
        tabla_factura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tabla_factura);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Busqueda");

        bus_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bus_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bus_inKeyReleased(evt);
            }
        });

        print_b.setBackground(new java.awt.Color(255, 255, 255));
        print_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        print_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/print_icon.png"))); // NOI18N
        print_b.setText(" IMPRIMIR");
        print_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_bActionPerformed(evt);
            }
        });

        total_out.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        total_out.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_out.setText("Total: Q0.00");

        back_b.setBackground(new java.awt.Color(253, 249, 255));
        back_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/back_icon.png"))); // NOI18N
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(total_out, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bus_in, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(print_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nom_in, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                            .addComponent(nit_in)))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha_out, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_b)
                    .addComponent(fecha_out, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nom_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nit_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete_b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(print_b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(total_out)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bus_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bus_inKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_inKeyReleased
       refrescar();
    }//GEN-LAST:event_bus_inKeyReleased

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
        agregar();
        actualizarTotal();
    }//GEN-LAST:event_add_bActionPerformed

    private void tabla_busquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_busquedaMouseClicked
        
    }//GEN-LAST:event_tabla_busquedaMouseClicked

    private void delete_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bActionPerformed
        quitar();
        actualizarTotal();
    }//GEN-LAST:event_delete_bActionPerformed

    private void print_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_bActionPerformed
        validarYGenerarFactura();
        total_out.setText("Total: Q0.00");
    }//GEN-LAST:event_print_bActionPerformed

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
        laboratorioBD newframe = new laboratorioBD();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_bActionPerformed

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
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura().setVisible(true);
            }
        });
    }
    
    void consultar(String busqueda){
        String sql = "";
        if(busqueda.equals("")){
            sql = "SELECT * FROM producto";
        }else{
            sql = "SELECT * FROM producto WHERE codigoProducto LIKE '%"+busqueda+"%' OR nombreProducto LIKE '%"+busqueda+"%';";
        }
        try{
            conet = conx.gertConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] producto = new Object[4];
            modelo = (DefaultTableModel) tabla_busqueda.getModel();
            while(rs.next()){
                producto[0] = rs.getString("codigoProducto");
                producto[1] = rs.getString("nombreProducto");
                producto[2] = rs.getInt("cantidadProducto");
                producto[3] = rs.getFloat("precioUnitario");
                modelo.addRow(producto);
            }
            tabla_busqueda.setModel(modelo);
        }catch(Exception e){
        }
    }

    void refrescar(){
        try{
            String sql = "select * from producto";
            conet = conx.gertConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            limpiarTabla();
        }catch(Exception e){
        }
        consultar(bus_in.getText());
    }
    
    void limpiarTabla(){
        for(int i = 0; i <= tabla_busqueda.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    void limpiar(){
        nom_in.setText("");
        nit_in.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tabla_factura.getModel();
        modelo.setRowCount(0);
        actualizarFecha();
    }
    
    void agregar() {
    int fila = tabla_busqueda.getSelectedRow();
    if(fila == -1){
        JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila");
    }else{
        String cod = (String) tabla_busqueda.getValueAt(fila,0) .toString();
        String nom = (String) tabla_busqueda.getValueAt(fila,1) .toString();
        int cant = (int) tabla_busqueda.getValueAt(fila,2);
        float prec = (float) tabla_busqueda.getValueAt(fila,3);

        for (int i = 0; i < tabla_factura.getRowCount(); i++) {
            if (tabla_factura.getValueAt(i, 0).equals(cod)) {
                JOptionPane.showMessageDialog(null, "El producto ya está en la factura");
                return;
            }
        }

        String cantidadCompradaStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea comprar del producto " + nom);
        int cantidadComprada = Integer.parseInt(cantidadCompradaStr);
        if (cantidadComprada <= cant) {
            float subtotal = cantidadComprada * prec;
            Object[] productoFactura = new Object[5];
            modeloFactura = (DefaultTableModel) tabla_factura.getModel();
            productoFactura[0] = cod;
            productoFactura[1] = nom;
            productoFactura[2] = cantidadComprada;
            productoFactura[3] = prec;
            productoFactura[4] = subtotal;
            modeloFactura.addRow(productoFactura);
            tabla_factura.setModel(modeloFactura);
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock del producto " + nom);
        }
    }
}

    void quitar() {
    int fila = tabla_factura.getSelectedRow();
    if(fila == -1){
        JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila");
    }else{
        modeloFactura.removeRow(fila);
        JOptionPane.showMessageDialog(null, "Producto quitado de la factura");
    }
    }

    void actualizarTotal() {
    float total = 0;
    for (int i = 0; i < tabla_factura.getRowCount(); i++) {
        float subtotal = (Float) tabla_factura.getValueAt(i, 4);
        total += subtotal;
    }
    total_out.setText("Total: Q" + total);
}
    
    void actualizarFecha() {
    Date fechaActual = new Date();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    String fechaFormateada = formatoFecha.format(fechaActual);
    fecha_out.setText(fechaFormateada);
}


void generarFactura() {
    try {
        Document documento = new Document();
        PdfWriter.getInstance(documento, new FileOutputStream("C:\\Users\\ricar\\Desktop\\factura.pdf"));
        documento.open();
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fechaActual);
        documento.add(new Paragraph(fechaFormateada));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("Nombre: " + nom_in.getText()));
        documento.add(new Paragraph("NIT: " + nit_in.getText()));
        documento.add(new Paragraph(" "));
        PdfPTable tabla = new PdfPTable(5); // 5 columnas
        tabla.addCell("Código del producto");
        tabla.addCell("Nombre del producto");
        tabla.addCell("Cantidad");
        tabla.addCell("Precio unitario");
        tabla.addCell("Subtotal");
        for (int i = 0; i < tabla_factura.getRowCount(); i++) {
            tabla.addCell(tabla_factura.getValueAt(i, 0).toString());
            tabla.addCell(tabla_factura.getValueAt(i, 1).toString());
            tabla.addCell(tabla_factura.getValueAt(i, 2).toString());
            tabla.addCell(tabla_factura.getValueAt(i, 3).toString());
            tabla.addCell(tabla_factura.getValueAt(i, 4).toString());
        }
        documento.add(tabla);
        documento.add(new Paragraph(total_out.getText()));
        documento.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

void validarYGenerarFactura() {
    //VALIDACIONES
    if (nom_in.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay nombre ingresado");
        return;
    }
    if (tabla_factura.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "No hay productos ingresados");
        return;
    }
    if(nit_in.getText().isEmpty()){
        nit_in.setText("CF");
    }
    //GENERA LA FACTURA
    generarFactura();
    //ACTUALIZA LA BASE DE DATOS
    for (int i = 0; i < tabla_factura.getRowCount(); i++) {
        String cod = tabla_factura.getValueAt(i, 0).toString();
        int cantExist = obtenerCantidad(cod);
        int cantFact = Integer.parseInt(tabla_factura.getValueAt(i, 2).toString());
        int newCant = cantExist - cantFact;
        String sql = "UPDATE `producto` SET `cantidadProducto` = '"+newCant+"' WHERE `codigoProducto` = '"+cod+"';";
        try{
            conet = conx.gertConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    refrescar();
    limpiar();
    //ABRE LA FACTURA
    try {
        File pdfFile = new File("C:\\Users\\ricar\\Desktop\\factura.pdf");
        if (pdfFile.exists()) {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(null, "El escritorio no es compatible");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
    }
}


int obtenerCantidad(String cod) {
    int cantidadProductoExistencia = 0;
    String sql = "SELECT `cantidadProducto` FROM `producto` WHERE `codigoProducto` = '"+cod+"';";
    try {
        conet = conx.gertConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()) {
            cantidadProductoExistencia = rs.getInt(1);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cantidadProductoExistencia;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_b;
    private javax.swing.JButton back_b;
    private javax.swing.JTextField bus_in;
    private javax.swing.JButton delete_b;
    private javax.swing.JLabel fecha_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nit_in;
    private javax.swing.JTextField nom_in;
    private javax.swing.JButton print_b;
    private javax.swing.JTable tabla_busqueda;
    private javax.swing.JTable tabla_factura;
    private javax.swing.JLabel total_out;
    // End of variables declaration//GEN-END:variables
}
