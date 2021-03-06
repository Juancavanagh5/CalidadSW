package secundario;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import principal.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
@SuppressWarnings("serial")
public class VerMisTurnos extends javax.swing.JFrame {

    private Doctor d;
    private PersonalAdm usuario;
    
    public VerMisTurnos(){}
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public VerMisTurnos(PersonalAdm u) {
        this.usuario = u;
        this.d=usuario.getDoctorSel();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icon.png")).getImage());
        DefaultListModel c = new DefaultListModel();
        String a[] = new String [d.getTurnos().size()];
        for(int i=0; i<d.getTurnos().size(); i++)
        {
            a[i] ="Paciente "+d.getMisTurnos().get(i).getPaciente().getNombre()+" "+d.getMisTurnos().get(i).getPaciente().getApellido();
            a[i] +=" Fecha: "+d.getMisTurnos().get(i).getFecha()+" Hora: "+d.getMisTurnos().get(i).getHora()+" Detalle: "+d.getMisTurnos().get(i).getComentario();
            c.addElement(a[i]);
        }
        ListTurnos.setModel(c);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListTurnos = new javax.swing.JList<>();
        EndTurno = new javax.swing.JButton();
        VerP = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Instrucciones = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Ver Mis Turnos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 316, 58);

        ListTurnos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ListTurnos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ListTurnosPropertyChange(evt);
            }
        });
        ListTurnos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListTurnosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListTurnos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(67, 105, 627, 438);

        EndTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EndTurno.setText("Terminar Turno");
        EndTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(EndTurno);
        EndTurno.setBounds(757, 105, 205, 64);

        VerP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerP.setText("Ver Pacientes");
        VerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPActionPerformed(evt);
            }
        });
        getContentPane().add(VerP);
        VerP.setBounds(757, 175, 205, 64);

        Volver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver);
        Volver.setBounds(757, 479, 205, 64);

        Instrucciones.setColumns(20);
        Instrucciones.setRows(5);
        jScrollPane2.setViewportView(Instrucciones);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 570, 420, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Instrucciones");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 580, 90, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, 0, 1000, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPActionPerformed
        VerMisPacientes v = new VerMisPacientes(usuario);
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerPActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        PrincipalDoctor p = new PrincipalDoctor(usuario);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void ListTurnosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ListTurnosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ListTurnosPropertyChange

    private void ListTurnosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListTurnosValueChanged
        if(ListTurnos.getSelectedIndex()!=-1)
        {
            int seleccionado = 0;
        seleccionado = ListTurnos.getSelectedIndex();
        d.selTurno(seleccionado);
        }
    }//GEN-LAST:event_ListTurnosValueChanged

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void EndTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndTurnoActionPerformed
        if(ListTurnos.getSelectedIndex()!=-1)
        {
            int seleccionado = 0;
            seleccionado = ListTurnos.getSelectedIndex();
            d.selTurno(seleccionado);
            d.getTurnoSel().setComentario("Turno Finalizado. "+Instrucciones.getText());
            d.getPacienteSel().getHistorial().getConsultas().add(d.getTurnoSel());
            d.QuitarTurnoSel();
            DefaultListModel c = new DefaultListModel();
            String a[] = new String [d.getTurnos().size()];
            for(int i=0; i<d.getTurnos().size(); i++)
            {
                a[i] ="Paciente "+d.getMisTurnos().get(i).getPaciente().getNombre()+" "+d.getMisTurnos().get(i).getPaciente().getApellido();
                a[i] +=" Fecha: "+d.getMisTurnos().get(i).getFecha()+" Hora: "+d.getMisTurnos().get(i).getHora()+" Detalle: "+d.getMisTurnos().get(i).getComentario();
                c.addElement(a[i]);
            }
            ListTurnos.setModel(c);
        }
        else
        {
            CamposVacios c = new CamposVacios(usuario);
            c.setVisible(true);
        }
    }//GEN-LAST:event_EndTurnoActionPerformed

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
            java.util.logging.Logger.getLogger(VerMisTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerMisTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerMisTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMisTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerMisTurnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndTurno;
    private javax.swing.JTextArea Instrucciones;
    private javax.swing.JList<String> ListTurnos;
    private javax.swing.JButton VerP;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
