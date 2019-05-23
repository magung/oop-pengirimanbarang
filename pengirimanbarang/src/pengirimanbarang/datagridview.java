/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanbarang;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class datagridview extends javax.swing.JFrame {

    /**
     * Creates new form datagridview
     */
    
    String db ="batik";
    int posisi = 0;
    public datagridview() {
        initComponents();
        
        
        
        load_table();
         clear_text();
        set_text(posisi);
        //set kolom
        /*Object[] columns = {
            "No. Kirim","Nama Pembeli","Tanggal Kirim",
            "Kode Batik","Motif Batik","Jumlah Kodi","Total Harga",
            "Biaya Kirim","Presentase","Biaya Administrasi","Total Biaya"
        };
        try {
            int no = 0;
            String sql = "select * from batik"; // mengambil data yang akan digunakan ,jika kammu punya data yang kamu punya banyak maka tmbhkan kata limit stelah kata mhs, maka yg tebaca dri 0-100 atau lbih
            java.sql.Connection conn = konek.connect(db);
            java.sql.ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) { // unruk menelusuri data dri awal sampai akhir 
                String[] dataField = {
                    Integer.toString(++no), 
                    rs.getString("no_kirim"),
                    rs.getString("nama_pembeli"),
                    rs.getString("tanggal_kirim"),
                    rs.getString("kode_batik"),
                    rs.getString("motif_batik"),
                    rs.getString("jumlah_kodi"),
                    rs.getString("total_harga"),
                    rs.getString("biaya_kirim"),
                    rs.getString("prosentase_adm"),
                    rs.getString("biaya_adm"),
                    rs.getString("total_biaya")
                    
                };         
                model.addRow(dataField);
                
                    model.setColumnIdentifiers(columns);
                    tabel_output.setModel(model);
                    tabel_output.setRowSelectionInterval(0, 0);
            }
        }catch (Exception e) {}*/
        

    }
    private void load_table() {
        /*Object[] columns = {
            "No. Kirim","Nama Pembeli","Tanggal Kirim",
            "Kode Batik","Motif Batik","Jumlah Kodi","Total Harga",
            "Biaya Kirim","Presentase","Biaya Administrasi","Total Biaya"
        };*/
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Kirim");
        model.addColumn("Nama Pembeli");
        model.addColumn("Tgl Kirim");
        model.addColumn("Kode Batik");
        model.addColumn("Motif");
        model.addColumn("Jmlh Kodi");
        model.addColumn("Harga");
        model.addColumn("Ongkir");
        model.addColumn("Prsn Adm (%)");
        model.addColumn("Biaya Adm");
        model.addColumn("Total Biaya");
        
        
        
    try {
           
            String sql = "select * from batik"; // mengambil data yang akan digunakan ,jika kammu punya data yang kamu punya banyak maka tmbhkan kata limit stelah kata mhs, maka yg tebaca dri 0-100 atau lbih
            java.sql.Connection conn = konek.connect(db);
            java.sql.ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) { // unruk menelusuri data dri awal sampai akhir 
                String[] dataField = {
                   
                    rs.getString("no_kirim"),
                    rs.getString("nama_pembeli"),
                    rs.getString("tanggal_kirim"),
                    rs.getString("kode_batik"),
                    rs.getString("motif_batik"),
                    rs.getString("jumlah_kodi"),
                    rs.getString("total_harga"),
                    rs.getString("biaya_kirim"),
                    rs.getString("prosentase_adm"),
                    rs.getString("biaya_adm"),
                    rs.getString("total_biaya")
                         
                
                    
                };         
                model.addRow(dataField);
                  
                  
            }  
            //model.setColumnIdentifiers(columns);
                
                
               tabel_output.setModel(model);
               tabel_output.setRowSelectionInterval(0, 0);
        }catch (Exception e) {System.out.println("gagal"+e);}
    }
    private void clear_text() {
        txtnokirim.setText(null);
        txtnama.setText(null);
        jFormattedTextField1.setText(null);
        cbkodebatik.setSelectedItem("");
       txtmotif.setText(null);
        jml_kodi.setText(null);
        txttotalharga.setText(null);
        txtbiayakirim.setText(null);
        prosentase.setSelectedIndex(0);
        biaya_adm.setText(null);
        total_biaya.setText(null);
    }
private void set_text(int rows){
    //txtnama.setText(tabel_output.getValueAt(row, 1).toString());
    
    
    txtnokirim.setText(tabel_output.getModel().getValueAt(rows,0).toString());
        txtnama.setText(tabel_output.getValueAt(rows,1).toString());
        jFormattedTextField1.setText(tabel_output.getValueAt(rows,2).toString());
        cbkodebatik.setSelectedItem(tabel_output.getValueAt(rows,3).toString());
       txtmotif.setText(tabel_output.getValueAt(rows,4).toString());
        jml_kodi.setText(tabel_output.getValueAt(rows,5).toString());
        txttotalharga.setText(tabel_output.getValueAt(rows,6).toString());
        txtbiayakirim.setText(tabel_output.getValueAt(rows,7).toString());
        //int aa;
        //aa = Integer.parseInt(jLabel18.setText(tabel_output.getValueAt(rows,8).toString()));
        //prosentase.setSelectedIndex(aa);
        prosentase.setSelectedItem(tabel_output.getValueAt(rows, 8).toString());
        
        
        biaya_adm.setText(tabel_output.getValueAt(rows,9).toString());
        total_biaya.setText(tabel_output.getValueAt(rows,10).toString());/*
         txtnokirim.setText(tabel_output.getValueAt(0, 0).toString());
        txtnama.setText(tabel_output.getValueAt(0, 1).toString());
        jFormattedTextField1.setText(tabel_output.getValueAt(0, 2).toString());
        cbkodebatik.setSelectedItem(tabel_output.getValueAt(0, 3).toString());
       txtmotif.setText(tabel_output.getValueAt(0, 4).toString());
        jml_kodi.setText(tabel_output.getValueAt(0, 5).toString());
        txttotalharga.setText(tabel_output.getValueAt(0, 6).toString());
        txtbiayakirim.setText(tabel_output.getValueAt(0, 7).toString());
        prosentase.setSelectedItem(tabel_output.getValueAt(0, 8).toString());
        biaya_adm.setText(tabel_output.getValueAt(0, 9).toString());
        total_biaya.setText(tabel_output.getValueAt(0, 10).toString());*/
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jSpinner1 = new javax.swing.JSpinner();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        panelutama = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnokirim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_output = new javax.swing.JTable();
        logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtmotif = new javax.swing.JTextField();
        txthargakode = new javax.swing.JTextField();
        txttarif1 = new javax.swing.JTextField();
        txttarif2 = new javax.swing.JTextField();
        txttarif3 = new javax.swing.JTextField();
        cbkodebatik = new javax.swing.JComboBox();
        btnhitung = new javax.swing.JButton();
        btnisi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txttotalharga = new javax.swing.JTextField();
        txtbiayakirim = new javax.swing.JTextField();
        biaya_adm = new javax.swing.JTextField();
        jml_kodi = new javax.swing.JTextField();
        adm_ya = new javax.swing.JRadioButton();
        adm_tidak = new javax.swing.JRadioButton();
        total_biaya = new javax.swing.JTextField();
        prosentase = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnhapus = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 0, 0));

        panelutama.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA PEMBELI");

        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TANGGAL KIRIM");

        txtnokirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnokirimActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        tabel_output.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_output.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_outputMouseClicked(evt);
            }
        });
        tabel_output.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabel_outputKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_output);

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("JENIS BATIK");

        jLabel5.setText("KODE BATIK");

        jLabel6.setText("MOTIF BATIK");

        jLabel7.setText("HARGA PER KODE");

        jLabel8.setText("TARIF 1 (1 - 5)");

        jLabel9.setText("TARIF 2 (6 -15)");

        jLabel10.setText("TARIF 3 (>15)");

        txtmotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmotifActionPerformed(evt);
            }
        });

        cbkodebatik.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "BTK 01", "BTK 02", "BTK 03", "BTK 04" }));
        cbkodebatik.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel18, org.jdesktop.beansbinding.ObjectProperty.create(), cbkodebatik, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cbkodebatik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkodebatikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txthargakode, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttarif1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttarif2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttarif3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmotif, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbkodebatik, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbkodebatik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmotif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txthargakode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttarif1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttarif2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttarif3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnhitung.setText("HITUNG");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        btnisi.setText("ISI LAGI");
        btnisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnisiActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("RINCIAN BIAYA");

        jLabel12.setText("JUMLAH KODI");

        jLabel13.setText("TOTAL HARGA");

        jLabel14.setText("BIAYA KIRIM");

        jLabel15.setText("PROSENTASE ADM");

        jLabel16.setText("BIAYA ADMINISTRASI");

        jLabel17.setText("TOTAL BIAYA");

        jml_kodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml_kodiActionPerformed(evt);
            }
        });
        jml_kodi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jml_kodiKeyReleased(evt);
            }
        });

        adm_ya.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(adm_ya);
        adm_ya.setText("YA");
        adm_ya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_yaActionPerformed(evt);
            }
        });

        adm_tidak.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(adm_tidak);
        adm_tidak.setText("TIDAK");
        adm_tidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_tidakActionPerformed(evt);
            }
        });

        prosentase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "5", "10", "15" }));
        prosentase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosentaseActionPerformed(evt);
            }
        });

        jLabel18.setText("%");

        jLabel19.setText("%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(biaya_adm, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbiayakirim, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jml_kodi, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adm_ya)
                                    .addComponent(adm_tidak))
                                .addGap(18, 18, 18)
                                .addComponent(prosentase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addGap(51, 51, 51)
                        .addComponent(total_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtbiayakirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jml_kodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(adm_ya)
                    .addComponent(prosentase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adm_tidak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(biaya_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(25, 25, 25))
        );

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NO. KIRIM");

        btnhapus.setText("DELETE");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelutamaLayout = new javax.swing.GroupLayout(panelutama);
        panelutama.setLayout(panelutamaLayout);
        panelutamaLayout.setHorizontalGroup(
            panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelutamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnokirim, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addComponent(btnhitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnisi))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(close))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelutamaLayout.setVerticalGroup(
            panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelutamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelutamaLayout.createSequentialGroup()
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnokirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addGroup(panelutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnhitung)
                            .addComponent(btnisi)
                            .addComponent(btnsimpan)
                            .addComponent(btnedit)
                            .addComponent(btnhapus)
                            .addComponent(close)
                            .addComponent(logout))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelutama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
       
       if(cbkodebatik.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum Memilih Kode Batik");
            return;
        }
       
       if(jml_kodi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum Memasukkah Jumlah Kodi");
            return;
        }
       int pesen = prosentase.getSelectedIndex();
        int t_harga = Integer.parseInt(txttotalharga.getText().toString());
        int admin = pesen * t_harga / 100;
        int totals = t_harga + admin + Integer.parseInt(txtbiayakirim.getText().toString());
        
        biaya_adm.setText(Integer.toString(admin));
        total_biaya.setText(Integer.toString(totals));
       
       
       
    }//GEN-LAST:event_btnhitungActionPerformed

    private void cbkodebatikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkodebatikActionPerformed
       String motif=null;
       String harga=null;
       String t1=null;
       String t2=null;
       String t3=null;
       String t4=null;
       String v = cbkodebatik.getSelectedItem().toString();
       
       if(v.equals("BTK 01")){
           motif = "Kawung";
           harga = "400000";
           t1 = "15000";
           t2 = "7500";
           t3 = "5000";
       }else if(v.equals("BTK 02")){
           motif = "Parang";
           harga = "450000";
           t1 = "20000";
           t2 = "10000";
           t3 = "7500";
       }else if(v.equals("BTK 03")){
           motif = "Trintum";
           harga = "500000";
           t1 = "23000";
           t2 = "12000";
           t3 = "8000";
       }else if(v.equals("BTK 04")){
           motif = "Sido Mukti";
           harga = "550000";
           t1 = "17500";
           t2 = "8000";
           t3 = "6000";
       }
       txtmotif.setText(motif);
       txthargakode.setText(harga);
       txttarif1.setText(t1);
       txttarif2.setText(t2);
       txttarif3.setText(t3);
       
        /*String jumlahkodi = txtjumlahkodi.getText().toString();
       int totals;
       int jmlkode = 0;
        if(jumlahkodi.equals(""))jmlkode = 0;else jmlkode = Integer.parseInt(jumlahkodi);
        totals = Integer.parseInt(txthargakode.getText().toString()) * jmlkode;
        String hgt = Integer.toString(totals);
        txttotalharga.setText(hgt);
        
      int jmlkode = Integer.parseInt(txtjumlahkodi.getText().toString());
       totals = Integer.parseInt(txthargakode.getText().toString())* jmlkode;
       String hgt= Integer.toString(totals);
       txttotalharga.setText(hgt);
       
       int trf01 = Integer.parseInt(txttarif1.getText().toString());
        int trf02 = Integer.parseInt(txttarif2.getText().toString());
        int trf03 = Integer.parseInt(txttarif3.getText().toString());
        
        int bykirim = 0;
        if(jmlkode>=1&&jmlkode<=5)bykirim = jmlkode * trf01;
        if(jmlkode>=6&&jmlkode<=15)bykirim = jmlkode * trf02;
        if(jmlkode>15)bykirim = jmlkode * trf03;
        
        txtbiayakirim.setText(Integer.toString(bykirim));*/
       
    }//GEN-LAST:event_cbkodebatikActionPerformed

    private void txtmotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmotifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmotifActionPerformed

    private void jml_kodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml_kodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jml_kodiActionPerformed

    private void jml_kodiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jml_kodiKeyReleased
        // TODO add your handling code here:
         String jumlahkodi = jml_kodi.getText().toString();
        int totals;
        int jmlkode = 0;
        if(jumlahkodi.equals("")){jmlkode = 0;
        biaya_adm.setText("");
        total_biaya.setText("");
        }else jmlkode = Integer.parseInt(jumlahkodi);
        totals = Integer.parseInt(txthargakode.getText().toString()) * jmlkode;
        String hgt = Integer.toString(totals);
        
        txttotalharga.setText(hgt);
        
        int trf01 = Integer.parseInt(txttarif1.getText().toString());
        int trf02 = Integer.parseInt(txttarif2.getText().toString());
        int trf03 = Integer.parseInt(txttarif3.getText().toString());
        
        int bykirim = 0;
        if(jmlkode>=1&&jmlkode<=5)bykirim = jmlkode * trf01;
        if(jmlkode>=6&&jmlkode<=15)bykirim = jmlkode * trf02;
        if(jmlkode>15)bykirim = jmlkode * trf03;
        
        txtbiayakirim.setText(Integer.toString(bykirim));
    }//GEN-LAST:event_jml_kodiKeyReleased

    private void prosentaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosentaseActionPerformed
        // TODO add your handling code here:
        if(prosentase.getSelectedIndex()==0)adm_tidak.setSelected(true);
        else adm_ya.setSelected(true);
        jLabel18.setText(prosentase.getSelectedItem().toString());
    }//GEN-LAST:event_prosentaseActionPerformed

    private void adm_yaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_yaActionPerformed
        // TODO add your handling code here:
        prosentase.setSelectedIndex(1);
    }//GEN-LAST:event_adm_yaActionPerformed

    private void adm_tidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_tidakActionPerformed
        // TODO add your handling code here:
         prosentase.setSelectedIndex(0);
    }//GEN-LAST:event_adm_tidakActionPerformed

    private void btnisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnisiActionPerformed
        // TODO add your handling code here:
      clear_text();
      posisi = -1;
    }//GEN-LAST:event_btnisiActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
       
        int selectedOption = JOptionPane.showConfirmDialog(null,
        "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        /*Object[] row = new Object[11];
        
        row[0] = txtnokirim.getText().toString();
        row[1] = txtnama.getText().toString();
        row[2] = jFormattedTextField1.getText().toString();
        row[3] = cbkodebatik.getSelectedItem().toString();
        row[4] = txtmotif.getText().toString();
        row[5] = jml_kodi.getText().toString();
        row[6] = txttotalharga.getText().toString();
        row[7] = txtbiayakirim.getText().toString();
        row[8] = prosentase.getSelectedItem().toString();
        row[9] = biaya_adm.getText().toString();
        row[10] = total_biaya.getText().toString();
        
        model.addRow(row);*/
         try {
            String sql = "";
            //if (posisi==-1){
                
    sql ="INSERT INTO batik SET "
    + "no_kirim = '"+txtnokirim.getText().toString()+"', "+
       "nama_pembeli = '"+txtnama.getText().toString()+"', "+
       "tanggal_kirim= '"+jFormattedTextField1.getText().toString()+"', "+
       "kode_batik= '"+cbkodebatik.getSelectedItem().toString()+"', "+
       "motif_batik= '"+txtmotif.getText().toString()+"', "+
       "jumlah_kodi= '"+jml_kodi.getText().toString()+"', "+
       "total_harga= '"+txttotalharga.getText().toString()+"', "+
       "biaya_kirim= '"+txtbiayakirim.getText().toString()+"',"+
       "prosentase_adm= '"+prosentase.getSelectedItem().toString()+"',"+
       "biaya_adm= '"+biaya_adm.getText().toString()+"', "+
       "total_biaya= '"+total_biaya.getText().toString()+"'";
         //   }
          /*  else{
             sql ="UPDATE batik SET " +
                 "nama_pembeli = '"+txtnama.getText()+"', "+
                 "tanggal_kirim= '"+jFormattedTextField1.getText()+"', "+
                 "kode_batik= '"+cbkodebatik.getSelectedItem()+"', "+
                 "motif_batik= '"+txtmotif.getText()+"', "+
                 "jumlah_kodi= '"+jml_kodi.getText()+"', "+
                 "total_harga= '"+txttotalharga.getText()+"', "+
                 "biaya_kirim= '"+txtbiayakirim.getText()+"',"+
                 "prosentase_adm= ',"+prosentase.getSelectedItem()+"',"+
                  "biaya_adm= '"+biaya_adm.getText()+"', "+
                 "total_biaya)= '"+total_biaya.getText()+"', "+
                    "WHERE no_kirim = '" + txtnokirim.getText() + "'";
            }*/
            java.sql.Connection conn=konek.connect(db);
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di simpan");
        } 
        catch (Exception e) {JOptionPane.showMessageDialog(null, "Data sudah ada ");}
        
        load_table();
        clear_text();
      //  if (posisi == -1)posisi = 0;
        set_text (posisi);
                                            

                                              
       
        
        
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tabel_outputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabel_outputKeyReleased
        // TODO add your handling code here:
        
        posisi = tabel_output.getSelectedRow();
        set_text (posisi);
    }//GEN-LAST:event_tabel_outputKeyReleased

    private void tabel_outputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_outputMouseClicked
        // TODO add your handling code here:
        posisi=(tabel_output.rowAtPoint(evt.getPoint()));
        set_text(posisi);
    }//GEN-LAST:event_tabel_outputMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "";
            //if (posisi== -1){
                
        sql ="UPDATE batik SET " 
                  + "no_kirim = '"+txtnokirim.getText().toString()+"', "+
       "nama_pembeli = '"+txtnama.getText().toString()+"', "+
       "tanggal_kirim= '"+jFormattedTextField1.getText().toString()+"', "+
       "kode_batik= '"+cbkodebatik.getSelectedItem().toString()+"', "+
       "motif_batik= '"+txtmotif.getText().toString()+"', "+
       "jumlah_kodi= '"+jml_kodi.getText().toString()+"', "+
       "total_harga= '"+txttotalharga.getText().toString()+"', "+
       "biaya_kirim= '"+txtbiayakirim.getText().toString()+"',"+
       "prosentase_adm= '"+prosentase.getSelectedItem().toString()+"',"+
       "biaya_adm= '"+biaya_adm.getText().toString()+"', "+
       "total_biaya= '"+total_biaya.getText().toString()+"'"+
                    "WHERE no_kirim = '" + txtnokirim.getText() + "'";
           /* }/*else{sql ="INSERT INTO batik SET "
    + "no_kirim = '"+txtnokirim.getText().toString()+"', "+
       "nama_pembeli = '"+txtnama.getText().toString()+"', "+
       "tanggal_kirim= '"+jFormattedTextField1.getText().toString()+"', "+
       "kode_batik= '"+cbkodebatik.getSelectedItem().toString()+"', "+
       "motif_batik= '"+txtmotif.getText().toString()+"', "+
       "jumlah_kodi= '"+jml_kodi.getText().toString()+"', "+
       "total_harga= '"+txttotalharga.getText().toString()+"', "+
       "biaya_kirim= '"+txtbiayakirim.getText().toString()+"',"+
       "prosentase_adm= '"+prosentase.getSelectedItem().toString()+"',"+
       "biaya_adm= '"+biaya_adm.getText().toString()+"', "+
       "total_biaya= '"+total_biaya.getText().toString()+"'";}*/
            
            java.sql.Connection conn=konek.connect(db);
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } 
        catch (Exception e) {JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());}
        
        load_table();
        clear_text();
        //if (posisi == -1)posisi = 0;
        set_text (posisi);
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
        "Apakah anda yakin akan menghapus data ini?", "Hapus Data", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
        try {
            String sql ="delete from batik where no_kirim='" + txtnokirim.getText() + "'";

            java.sql.Connection conn=konek.connect(db);
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        }
        catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());}
        
        load_table();
        clear_text();
        }
        
        
        
    }//GEN-LAST:event_btnhapusActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
        "Apakah anda akan Log Out?", "Log Out", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
        login lg=new login();
        lg.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_logoutActionPerformed

    private void txtnokirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnokirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnokirimActionPerformed

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
            java.util.logging.Logger.getLogger(datagridview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datagridview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datagridview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datagridview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datagridview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adm_tidak;
    private javax.swing.JRadioButton adm_ya;
    private javax.swing.JTextField biaya_adm;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnisi;
    private javax.swing.JButton btnsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbkodebatik;
    private javax.swing.JButton close;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jml_kodi;
    private javax.swing.JButton logout;
    private javax.swing.JPanel panelutama;
    private javax.swing.JComboBox prosentase;
    private javax.swing.JTable tabel_output;
    private javax.swing.JTextField total_biaya;
    private javax.swing.JTextField txtbiayakirim;
    private javax.swing.JTextField txthargakode;
    private javax.swing.JTextField txtmotif;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnokirim;
    private javax.swing.JTextField txttarif1;
    private javax.swing.JTextField txttarif2;
    private javax.swing.JTextField txttarif3;
    private javax.swing.JTextField txttotalharga;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

  
}
