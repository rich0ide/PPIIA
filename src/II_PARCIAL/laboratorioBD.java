
package II_PARCIAL;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class laboratorioBD extends javax.swing.JFrame {
    
    Conexion conx = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    
    public laboratorioBD() {
        initComponents();
        setLocationRelativeTo(null);
        consultar("");
        setIconImage(new ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/cupcake.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cod_in = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nom_in = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cant_in = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fech_in = new javax.swing.JTextField();
        prec_in = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_b = new javax.swing.JButton();
        upd_b = new javax.swing.JButton();
        ref_b = new javax.swing.JButton();
        rep_b = new javax.swing.JButton();
        new_b = new javax.swing.JButton();
        fac_b = new javax.swing.JButton();
        in_b = new javax.swing.JButton();
        out_b = new javax.swing.JButton();
        man_b = new javax.swing.JButton();
        del_b = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bus_in = new javax.swing.JTextField();
        in_b1 = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad:");

        jTextField5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 247, 255));

        jPanel3.setBackground(new java.awt.Color(255, 247, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));
        jPanel3.setToolTipText("Base de Datos");
        jPanel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        Tabla.setBackground(new java.awt.Color(252, 248, 255));
        Tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio Unitario", "Cantidad", "Fecha de Vencimiento"
            }
        ));
        Tabla.setGridColor(new java.awt.Color(213, 125, 213));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 247, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Producto"));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.setToolTipText("Datos");
        jPanel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Código:");

        cod_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre:");

        nom_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Precio Unitario:");

        cant_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cantidad:");

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha de Vencimiento:");

        fech_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        prec_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cant_in, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(nom_in, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod_in, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fech_in)
                    .addComponent(prec_in))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cod_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nom_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prec_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant_in))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fech_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/logo-pasteleria-rocio.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 247, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        add_b.setBackground(new java.awt.Color(253, 248, 255));
        add_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        add_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/add_icon.png"))); // NOI18N
        add_b.setText(" AGREGAR");
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });

        upd_b.setBackground(new java.awt.Color(253, 248, 255));
        upd_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        upd_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/edit_icon.png"))); // NOI18N
        upd_b.setText("MODIFICAR");
        upd_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_bActionPerformed(evt);
            }
        });

        ref_b.setBackground(new java.awt.Color(253, 248, 255));
        ref_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ref_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/refresh_icon.png"))); // NOI18N
        ref_b.setText(" REFRESCAR");
        ref_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_bActionPerformed(evt);
            }
        });

        rep_b.setBackground(new java.awt.Color(253, 248, 255));
        rep_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rep_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/report_icon.png"))); // NOI18N
        rep_b.setText(" REPORTE");
        rep_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_bActionPerformed(evt);
            }
        });

        new_b.setBackground(new java.awt.Color(253, 248, 255));
        new_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        new_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/clear_icon.png"))); // NOI18N
        new_b.setText(" LIMPIAR");
        new_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_bActionPerformed(evt);
            }
        });

        fac_b.setBackground(new java.awt.Color(253, 248, 255));
        fac_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fac_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/bill_icon.png"))); // NOI18N
        fac_b.setText(" FACTURACIÓN");
        fac_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_bActionPerformed(evt);
            }
        });

        in_b.setBackground(new java.awt.Color(253, 248, 255));
        in_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        in_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/in_icon.png"))); // NOI18N
        in_b.setText(" INGRESO PROD.");
        in_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_bActionPerformed(evt);
            }
        });

        out_b.setBackground(new java.awt.Color(253, 248, 255));
        out_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        out_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/out_icon.png"))); // NOI18N
        out_b.setText(" EGRESO PROD.");
        out_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_bActionPerformed(evt);
            }
        });

        man_b.setBackground(new java.awt.Color(253, 248, 255));
        man_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        man_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/info_icon.png"))); // NOI18N
        man_b.setText(" MANUAL");
        man_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                man_bActionPerformed(evt);
            }
        });

        del_b.setBackground(new java.awt.Color(253, 248, 255));
        del_b.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        del_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/delete_icon.png"))); // NOI18N
        del_b.setText(" ELIMINAR");
        del_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ref_b, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(man_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upd_b, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(new_b, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(del_b, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rep_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fac_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(in_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(out_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add_b)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(new_b, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rep_b))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ref_b)
                            .addComponent(man_b)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(in_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(out_b)
                            .addComponent(upd_b))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fac_b)
                            .addComponent(del_b))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 247, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
        jPanel5.setToolTipText("");
        jPanel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        bus_in.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bus_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus_inActionPerformed(evt);
            }
        });
        bus_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bus_inKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bus_in)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bus_in, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        in_b1.setBackground(new java.awt.Color(253, 248, 255));
        in_b1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        in_b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/II_PARCIAL/imagenes/close_icon.png"))); // NOI18N
        in_b1.setText("CERRAR SESIÓN");
        in_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(in_b1)
                .addGap(0, 766, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(in_b1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
        agregar();
    }//GEN-LAST:event_add_bActionPerformed

    private void upd_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_bActionPerformed
        modificar();
    }//GEN-LAST:event_upd_bActionPerformed

    private void del_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_bActionPerformed
        eliminar();
    }//GEN-LAST:event_del_bActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila");
        }else{
            String cod = (String) Tabla.getValueAt(fila,0) .toString();
            String nom = (String) Tabla.getValueAt(fila,1) .toString();
            String prec = (String) Tabla.getValueAt(fila,2) .toString();
            String cant = (String) Tabla.getValueAt(fila,3) .toString();
            String fech = (String) Tabla.getValueAt(fila,4) .toString();
            cod_in.setText(cod);
            nom_in.setText(nom);
            prec_in.setText(prec);
            cant_in.setText(cant);
            fech_in.setText(fech);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void ref_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_bActionPerformed
        refrescar();
    }//GEN-LAST:event_ref_bActionPerformed

    private void rep_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_bActionPerformed
        reporte();
    }//GEN-LAST:event_rep_bActionPerformed

    private void bus_inKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bus_inKeyReleased
        refrescar();
    }//GEN-LAST:event_bus_inKeyReleased

    private void new_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_bActionPerformed
        limpiar();
        bus_in.setText("");
        refrescar();
    }//GEN-LAST:event_new_bActionPerformed

    private void bus_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bus_inActionPerformed

    private void fac_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_bActionPerformed
        factura newframe = new factura();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fac_bActionPerformed

    private void in_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_bActionPerformed
        ingreso();
    }//GEN-LAST:event_in_bActionPerformed

    private void out_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_bActionPerformed
        egreso();
    }//GEN-LAST:event_out_bActionPerformed

    private void man_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_man_bActionPerformed
        abrirManual();
    }//GEN-LAST:event_man_bActionPerformed

    private void in_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_b1ActionPerformed
        login newframe = new login();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_in_b1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(laboratorioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laboratorioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laboratorioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laboratorioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laboratorioBD().setVisible(true);
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
            Object[] producto = new Object[5];
            modelo = (DefaultTableModel) Tabla.getModel();
            while(rs.next()){
                producto[0] = rs.getString("codigoProducto");
                producto[1] = rs.getString("nombreProducto");
                producto[2] = rs.getFloat("precioUnitario");
                producto[3] = rs.getInt("cantidadProducto");
                producto[4] = rs.getDate("fechaVencimiento");
                modelo.addRow(producto);
            }
            Tabla.setModel(modelo);
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
    
    void agregar(){
        String cod = cod_in.getText();
        String nom = nom_in.getText();
        String prec = prec_in.getText();
        String cant = cant_in.getText();
        String fech = fech_in.getText();
        if("".equals(cod) || "".equals(nom) || "".equals(prec) || "".equals(cant) || "".equals(fech)){
            JOptionPane.showMessageDialog(null, "Faltan datos para el registro del producto");
        }else{
        try{
            String sql = "INSERT INTO `producto` (`codigoProducto`, `nombreProducto`, `precioUnitario`, `cantidadProducto`, `fechaVencimiento`) VALUES ('"+cod+"', '"+nom+"', '"+prec+"', '"+cant+"', '"+fech+"');";
            conet = conx.gertConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto registrado exitosamente!");
            limpiarTabla();
        }catch(Exception e){
        }
        consultar(bus_in.getText());
        limpiar();
    }
    }
    void modificar(){
        String cod = cod_in.getText();
        String nom = nom_in.getText();
        String prec = prec_in.getText();
        String cant = cant_in.getText();
        String fech = fech_in.getText();
        if("".equals(cod) || "".equals(nom) || "".equals(prec) || "".equals(cant) || "".equals(fech)){
            JOptionPane.showMessageDialog(null, "Faltan datos para la actualización del producto");
        }else{
        try{
            String sql = "UPDATE `producto` SET `nombreProducto` = '"+nom+"', `precioUnitario` = '"+prec+"', `cantidadProducto` = '"+cant+"', `fechaVencimiento` = '"+fech+"' WHERE `producto`.`codigoProducto` = '"+cod+"';";
            conet = conx.gertConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto modificado exitosamente!");
            limpiarTabla();
        }catch(Exception e){
        }
        consultar(bus_in.getText());
    }
    }
    void eliminar(){
        String cod = cod_in.getText();
        if("".equals(cod)){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado producto");
        }else{
        try{
            String sql = "DELETE FROM producto WHERE codigoProducto ='"+cod+"';";
            conet = conx.gertConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente!");
            limpiarTabla();
        }catch(Exception e){
        }
        consultar(bus_in.getText());
        limpiar();
    }
    }
    void limpiarTabla(){
        for(int i = 0; i <= Tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    void reporte(){
        try{
            JasperReport reporte = null;
            String path = "D:\\Java\\PPIIA\\src\\reportes\\reporteProductos.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conet);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        }catch(JRException ex){
            System.out.print("ERROR EN REPORTE");
        }
    }
    
    void ingreso(){
    String cod = cod_in.getText();
    if("".equals(cod)){
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto");
    }else{
        try{
            // Obtener la cantidad actual del producto
            String sql = "SELECT `cantidadProducto` FROM `producto` WHERE `codigoProducto` = '"+cod+"';";
            conet = conx.gertConnection();
            st = conet.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                int cantActual = rs.getInt("cantidadProducto");
                // Pedir al usuario que ingrese la cantidad a agregar
                String cantNuevaStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad a agregar:");
                int cantNueva = Integer.parseInt(cantNuevaStr);
                // Calcular la nueva cantidad
                int cantTotal = cantActual + cantNueva;
                // Actualizar la cantidad del producto en la base de datos
                sql = "UPDATE `producto` SET `cantidadProducto` = '"+cantTotal+"' WHERE `codigoProducto` = '"+cod+"';";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Producto ingresado exitosamente!");
            }else{
                JOptionPane.showMessageDialog(null, "El producto no existe");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al ingresar el producto");
        }
        limpiar();
        refrescar();
    }
}

    void egreso(){
    String cod = cod_in.getText();
    if("".equals(cod)){
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun producto");
    }else{
        try{
            // Obtener la cantidad actual del producto
            String sql = "SELECT `cantidadProducto` FROM `producto` WHERE `codigoProducto` = '"+cod+"';";
            conet = conx.gertConnection();
            st = conet.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                int cantActual = rs.getInt("cantidadProducto");
                // Pedir al usuario que ingrese la cantidad a extraer
                String cantEgresoStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad a extraer:");
                int cantEgreso = Integer.parseInt(cantEgresoStr);
                // Verificar si la cantidad a extraer es válida
                if(cantEgreso > cantActual){
                    JOptionPane.showMessageDialog(null, "La cantidad a extraer es mayor que la cantidad existente. Inténtalo de nuevo.");
                }else{
                    // Calcular la nueva cantidad
                    int cantTotal = cantActual - cantEgreso;
                    // Actualizar la cantidad del producto en la base de datos
                    sql = "UPDATE `producto` SET `cantidadProducto` = '"+cantTotal+"' WHERE `codigoProducto` = '"+cod+"';";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Producto extraído exitosamente!");
                    limpiar();
                    refrescar();
                }
            }else{
                JOptionPane.showMessageDialog(null, "El producto no existe");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al extraer el producto");
        }
        limpiar();
        refrescar();
    }
}

    void abrirManual(){
    try {
        File pdfFile = new File("D:\\Java\\PPIIA\\src\\II_PARCIAL\\manual\\manual_crud.pdf");
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
    
    void limpiar(){
        cod_in.setText("");
        nom_in.setText("");
        prec_in.setText("");
        cant_in.setText("");
        fech_in.setText("");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton add_b;
    private javax.swing.JTextField bus_in;
    private javax.swing.JTextField cant_in;
    private javax.swing.JTextField cod_in;
    private javax.swing.JButton del_b;
    private javax.swing.JButton fac_b;
    private javax.swing.JTextField fech_in;
    private javax.swing.JButton in_b;
    private javax.swing.JButton in_b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton man_b;
    private javax.swing.JButton new_b;
    private javax.swing.JTextField nom_in;
    private javax.swing.JButton out_b;
    private javax.swing.JTextField prec_in;
    private javax.swing.JButton ref_b;
    private javax.swing.JButton rep_b;
    private javax.swing.JButton upd_b;
    // End of variables declaration//GEN-END:variables


}
