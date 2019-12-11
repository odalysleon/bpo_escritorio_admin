/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.ComponenteFormulario;
import modelo.ModelCombo;
import org.openswing.swing.client.DateControl;
import util.Utiles;

/**
 *
 * @author TECH ID SOLUTIONS
 */
public class FormaAnejoTasacion extends javax.swing.JDialog {

    private Vector modelTipoAnejo;
    final private FormaProcesarFinca fp;
    private int indiceAnejoSeleccionada;
    
    /**
     * Creates new form FormaCargas
     * @param parent
     * @param modal
     */
    public FormaAnejoTasacion(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.fp = (FormaProcesarFinca)parent;
    }
    
     private void llenarCombo(String TipoCombo){
        switch(TipoCombo){
            case "Tipo anejo":modelTipoAnejo = new Vector();
                                modelTipoAnejo.addElement( new ModelCombo("PlazaGaraje", "PlazaGaraje" ) );
                                modelTipoAnejo.addElement( new ModelCombo("CuartoTrastero", "CuartoTrastero" ) );
                                modelTipoAnejo.addElement( new ModelCombo("OtrosInmuebles", "OtrosInmuebles" ) );
                                eTipoAnejo.setModel(new DefaultComboBoxModel(modelTipoAnejo));
                                break;
        }
     }
     
     private void seleccionarElementoCombo(Vector modelo, JComboBox combo, String valor){
        ModelCombo modeloCombo;
        int test = 9;
        for(int i=0; i<modelo.size(); i++){
            modeloCombo = (ModelCombo)modelo.elementAt(i);
            if (modeloCombo.getClave().equals(valor)){
                combo.setSelectedIndex(i);
                break;
            }
        }
    }
     private void llenarFormulario(){
        //Combo
        seleccionarElementoCombo(modelTipoAnejo, eTipoAnejo, fp.getListaAnejos().get(indiceAnejoSeleccionada).get(0).getValor());
        
        //Textos
        eSupConstruida.setText(fp.getListaAnejos().get(indiceAnejoSeleccionada).get(1).getValor());
        eSupUtil.setText(fp.getListaAnejos().get(indiceAnejoSeleccionada).get(2).getValor());
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        eTipoAnejo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        eSupConstruida = new javax.swing.JFormattedTextField();
        eAdicionar = new javax.swing.JButton();
        eModificar = new javax.swing.JButton();
        eEliminar = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        eSupUtil = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        eValoracion = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cargas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("Tipo de anejo:");

        eTipoAnejo.setFocusCycleRoot(true);
        eTipoAnejo.setName("ANEJO_TIPO"); // NOI18N
        eTipoAnejo.setNextFocusableComponent(eSupConstruida);
        eTipoAnejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eTipoAnejoActionPerformed(evt);
            }
        });

        jLabel6.setText("Sup. construida:");

        eSupConstruida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############.##"))));
        eSupConstruida.setName("ANEJO_SUPERF_CONSTRUIDA."); // NOI18N
        eSupConstruida.setNextFocusableComponent(eSupUtil);
        eSupConstruida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eSupConstruidaKeyTyped(evt);
            }
        });

        eAdicionar.setText("Añadir");
        eAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eAdicionarMousePressed(evt);
            }
        });

        eModificar.setText("Modificar");
        eModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eModificarMousePressed(evt);
            }
        });

        eEliminar.setText("Eliminar");
        eEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eEliminarMousePressed(evt);
            }
        });
        eEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eEliminarActionPerformed(evt);
            }
        });

        jLabel39.setText("Sup. úti:");

        eSupUtil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############.##"))));
        eSupUtil.setName("ANEJO_SUPERF_UTIL."); // NOI18N
        eSupUtil.setNextFocusableComponent(eValoracion);
        eSupUtil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eSupUtilKeyTyped(evt);
            }
        });

        jLabel40.setText("Valoración:");

        eValoracion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############.##"))));
        eValoracion.setName("ANEJO_VALORACION."); // NOI18N
        eValoracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eValoracionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eValoracion))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eAdicionar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel39))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eTipoAnejo, 0, 166, Short.MAX_VALUE)
                                    .addComponent(eSupConstruida, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eSupUtil, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eTipoAnejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eSupConstruida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eSupUtil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eAdicionar)
                    .addComponent(eModificar)
                    .addComponent(eEliminar))
                .addContainerGap(980, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eEliminarActionPerformed

    private void eAdicionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eAdicionarMousePressed
        JComponent comp = Utiles.ValidaControles(jPanel1);
        if (comp == null){  
            JComponent compTemp = (JComponent)eTipoAnejo;
            String atributo;
            ArrayList<ComponenteFormulario> listaComponentesXML = new ArrayList<>();
            while (compTemp != null){
                atributo = compTemp.getName();
                if (atributo.endsWith("."))
                    atributo = atributo.substring(0, atributo.length() - 1);
                if (compTemp instanceof JTextField){
                    listaComponentesXML.add(new ComponenteFormulario(atributo, ((JTextField)compTemp).getText()));
                } else if (compTemp instanceof JComboBox) {
                        listaComponentesXML.add(new ComponenteFormulario(atributo, ((ModelCombo)((JComboBox)compTemp).getSelectedItem()).getClave()));
                } else if (compTemp instanceof JFormattedTextField) {
                         listaComponentesXML.add(new ComponenteFormulario(atributo, ((JFormattedTextField)compTemp).getText()));
                } else if (compTemp instanceof DateControl) {
                    if (((DateControl)compTemp).getDate() != null)
                        listaComponentesXML.add(new ComponenteFormulario(atributo,  Utiles.convertirFechaYYYYMMDD( ((DateControl)compTemp).getDate())));
                    else listaComponentesXML.add(new ComponenteFormulario(atributo,  ""));
                } else if (compTemp instanceof JTextArea){
                    listaComponentesXML.add(new ComponenteFormulario(atributo, ((JTextArea)compTemp).getText()));
                } 
                compTemp = (JComponent)compTemp.getNextFocusableComponent();
            }
            fp.getListaAnejos().add(listaComponentesXML);
            Utiles.llenarTabla(jTable1,fp.getListaAnejos(), "Anejos");
            eSupConstruida.setText("");
            eSupUtil.setText("");
            JOptionPane.showMessageDialog(null, Utiles.msgOperacionRealizada);
        }else {
            JOptionPane.showMessageDialog(null, Utiles.msgDebeIntroducir + comp.getName());
            comp.requestFocus();
        }
    }//GEN-LAST:event_eAdicionarMousePressed

    private void eEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eEliminarMousePressed
        int indiceSeleccionado = jTable1.getSelectedRow();
        if (indiceSeleccionado != -1){
            DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
            tabla.removeRow(indiceSeleccionado);
            jTable1.setModel(tabla);
            fp.getListaAnejos().remove(indiceSeleccionado);
        } else
             JOptionPane.showMessageDialog(null, Utiles.msgSeleccioneCargaEliminar);
    }//GEN-LAST:event_eEliminarMousePressed

    private void eModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eModificarMousePressed
        int indiceSeleccionado = jTable1.getSelectedRow();
        if (indiceSeleccionado != -1){
            JComponent compTemp = (JComponent)eTipoAnejo;
            String atributo;
            ArrayList<ComponenteFormulario> listaComponentesXML = new ArrayList<>();
            while (compTemp != null){
                atributo = compTemp.getName();
                if (atributo.endsWith("."))
                    atributo = atributo.substring(0, atributo.length() - 1);
                if (compTemp instanceof JTextField){
                    listaComponentesXML.add(new ComponenteFormulario(atributo, ((JTextField)compTemp).getText()));
                } else if (compTemp instanceof JComboBox) {
                        listaComponentesXML.add(new ComponenteFormulario(atributo, ((ModelCombo)((JComboBox)compTemp).getSelectedItem()).getClave()));
                } else if (compTemp instanceof JFormattedTextField) {
                         listaComponentesXML.add(new ComponenteFormulario(atributo, ((JFormattedTextField)compTemp).getText()));
                } else if (compTemp instanceof DateControl) {
                    if (((DateControl)compTemp).getDate() != null)
                        listaComponentesXML.add(new ComponenteFormulario(atributo,  Utiles.convertirFechaYYYYMMDD( ((DateControl)compTemp).getDate())));
                    else listaComponentesXML.add(new ComponenteFormulario(atributo,  ""));
                } 
                compTemp = (JComponent)compTemp.getNextFocusableComponent();
            }
            fp.getListaAnejos().set(indiceSeleccionado, listaComponentesXML);
            llenarFormulario();
            Utiles.llenarTabla(jTable1,fp.getListaAnejos(), "Anejos");
            JOptionPane.showMessageDialog(null, Utiles.msgOperacionRealizada);
        } else
             JOptionPane.showMessageDialog(null, Utiles.msgSeleccioneCargaModificar);
        
    }//GEN-LAST:event_eModificarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTable1.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
           indiceAnejoSeleccionada = jTable1.getSelectedRow();
           llenarFormulario();
        }
        });
        Utiles.llenarTabla(jTable1,fp.getListaAnejos(), "Anejos");
        llenarCombo("Tipo anejo");
    }//GEN-LAST:event_formWindowOpened

    private void eTipoAnejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eTipoAnejoActionPerformed
        /*
        switch (eTipoAnejo.getSelectedIndex()){
            case 0: eSupConstruida.setEnabled(true);
                    eSupUtil.setEnabled(true);
                    eSupConstruida1.setEnabled(false);
                    eSupUtil1.setEnabled(false);
                    
                    eTipoAnejo.setNextFocusableComponent(eSupConstruida);
                    eSupConstruida.setNextFocusableComponent(eSupUtil);
                    eSupUtil.setNextFocusableComponent(eValoracion);
                    
                    eSupConstruida.setName("ANEJO_SUPERF_CONSTRUIDA.");
                    eSupUtil.setName("ANEJO_SUPERF_UTIL.");
                    break;
            case 1: eSupConstruida.setEnabled(false);
                    eSupUtil.setEnabled(false);
                    eSupConstruida1.setEnabled(true);
                    eSupUtil1.setEnabled(true);
                    
                    eTipoAnejo.setNextFocusableComponent(eSupConstruida1);
                    eSupConstruida1.setNextFocusableComponent(eSupUtil1);
                    eSupUtil1.setNextFocusableComponent(eValoracion);
                    
                    eSupConstruida1.setName("ANEJO_SUPERF_CONSTRUIDA.");
                    eSupUtil1.setName("ANEJO_SUPERF_UTIL.");
                    break;
            
            case 2: eSupConstruida.setEnabled(true);
                    eSupUtil.setEnabled(true);
                    eSupConstruida1.setEnabled(true);
                    eSupUtil1.setEnabled(true);
                    
                    eTipoAnejo.setNextFocusableComponent(eSupConstruida);
                    eSupConstruida.setNextFocusableComponent(eSupUtil);
                    eSupUtil.setNextFocusableComponent(eSupConstruida1);
                    eSupConstruida1.setNextFocusableComponent(eSupUtil1);
                    eSupUtil1.setNextFocusableComponent(eValoracion);
                    
                    eSupConstruida.setName("ANEJO_SUPERF_CONSTRUIDA_GARAJE.");
                    eSupUtil.setName("ANEJO_SUPERF_UTIL_GARAJE.");
                    eSupConstruida1.setName("ANEJO_SUPERF_CONSTRUIDA_TRASTERO.");
                    eSupUtil1.setName("ANEJO_SUPERF_UTIL_TRASTERO.");
                    break;
                    
                    
                    
            case 2:eSupConstruida.setEnabled(true);
                    eSupUtil.setEnabled(true);
                    eSupConstruida1.setEnabled(false);
                    eSupUtil1.setEnabled(false);
                    
                    eTipoAnejo.setNextFocusableComponent(eSupConstruida);
                    eSupConstruida.setNextFocusableComponent(eSupUtil);
                    eSupUtil.setNextFocusableComponent(eValoracion);
                    eSupConstruida.setName("ANEJO_SUPERF_CONSTRUIDA.");
                    eSupUtil.setName("ANEJO_SUPERF_UTIL.");
        }
        */
    }//GEN-LAST:event_eTipoAnejoActionPerformed

    private void eSupConstruidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eSupConstruidaKeyTyped
        Utiles.validarNumeroReal(evt, eSupConstruida, 9, 2);
    }//GEN-LAST:event_eSupConstruidaKeyTyped

    private void eSupUtilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eSupUtilKeyTyped
        Utiles.validarNumeroReal(evt, eSupUtil, 9, 2);
    }//GEN-LAST:event_eSupUtilKeyTyped

    private void eValoracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eValoracionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_eValoracionKeyTyped

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
            java.util.logging.Logger.getLogger(FormaAnejoTasacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaAnejoTasacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaAnejoTasacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaAnejoTasacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormaAnejoTasacion dialog = new FormaAnejoTasacion(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eAdicionar;
    private javax.swing.JButton eEliminar;
    private javax.swing.JButton eModificar;
    private javax.swing.JFormattedTextField eSupConstruida;
    private javax.swing.JFormattedTextField eSupUtil;
    private javax.swing.JComboBox<String> eTipoAnejo;
    private javax.swing.JFormattedTextField eValoracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
