/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Paciente;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormularioDeDatos = new javax.swing.JLabel();
        lblInformacionPaciente = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblIdentificacion = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblEnfermedad = new javax.swing.JLabel();
        btnVerificarEdad = new javax.swing.JButton();
        lblVerificarEdad = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        txtCedulaPaciente = new javax.swing.JTextField();
        txtEdadPaciente = new javax.swing.JTextField();
        cmbEnfermedadPaciente = new javax.swing.JComboBox<>();
        lblPesoPaciente = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtPesoPaciente = new javax.swing.JTextField();
        txtEstaturaPaciente = new javax.swing.JTextField();
        btnEstadoPaciente = new javax.swing.JButton();
        lblVerificarEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFormularioDeDatos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblFormularioDeDatos.setForeground(new java.awt.Color(255, 0, 0));
        lblFormularioDeDatos.setText("Formulario De Datos");
        lblFormularioDeDatos.setToolTipText("");

        lblInformacionPaciente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblInformacionPaciente.setText("Informacion Paciente");

        lblNombrePaciente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNombrePaciente.setText("Nombre del paciente:");

        lblIdentificacion.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblIdentificacion.setText("Identificacion:");

        lblEdad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblEdad.setText("Edad:");

        lblEnfermedad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblEnfermedad.setText("Enfermedad");

        btnVerificarEdad.setText("Verifica Tipo paciente ");
        btnVerificarEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarEdadActionPerformed(evt);
            }
        });

        txtNombrePaciente.setText("Juan");

        txtCedulaPaciente.setText("614201013");

        txtEdadPaciente.setText("18");

        cmbEnfermedadPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gripa leve", "Enfermedad viral", "Alergia", "Anemia", "Diarrea" }));

        lblPesoPaciente.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblPesoPaciente.setText("Peso:");

        lblAltura.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblAltura.setText("Altura:");

        txtPesoPaciente.setText("57");

        txtEstaturaPaciente.setText("1.60");

        btnEstadoPaciente.setText("Verifica el estado del paciente ");
        btnEstadoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFormularioDeDatos)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerificarEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVerificarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEdad)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdentificacion)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnfermedad)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEnfermedadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInformacionPaciente)
                            .addComponent(lblNombrePaciente))
                        .addGap(18, 18, 18)
                        .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesoPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstaturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEstadoPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVerificarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblFormularioDeDatos)
                .addGap(18, 18, 18)
                .addComponent(lblInformacionPaciente)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePaciente)
                    .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesoPaciente)
                    .addComponent(txtPesoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtEstaturaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdentificacion)
                    .addComponent(txtCedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(txtEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnfermedad)
                    .addComponent(cmbEnfermedadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerificarEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEstadoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVerificarEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVerificarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Paciente objetoPaciente;


    private void btnVerificarEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarEdadActionPerformed
        this.objetoPaciente = new Paciente();
        this.objetoPaciente.setNombre(this.txtNombrePaciente.getText());
        this.objetoPaciente.setPeso(Integer.parseInt(this.txtPesoPaciente.getText()));
        this.objetoPaciente.setEstatura((Float.parseFloat(this.txtEstaturaPaciente.getText())));
        this.objetoPaciente.setCc(Long.parseLong(this.txtCedulaPaciente.getText()));
        this.objetoPaciente.setEdad(Integer.parseInt(this.txtEdadPaciente.getText()));
        this.objetoPaciente.setEnfermedadPpal(this.cmbEnfermedadPaciente.getSelectedItem().toString());
        this.lblVerificarEdad.setText(this.objetoPaciente.verificarTipoPersonaEdad());//
    }//GEN-LAST:event_btnVerificarEdadActionPerformed

    private void btnEstadoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoPacienteActionPerformed
        this.objetoPaciente = new Paciente();
        this.objetoPaciente.setNombre(this.txtNombrePaciente.getText());
        this.objetoPaciente.setPeso(Integer.parseInt(this.txtPesoPaciente.getText()));
        this.objetoPaciente.setEstatura((Float.parseFloat(this.txtEstaturaPaciente.getText())));
        this.objetoPaciente.setCc(Long.parseLong(this.txtCedulaPaciente.getText()));
        this.objetoPaciente.setEdad(Integer.parseInt(this.txtEdadPaciente.getText()));
        this.objetoPaciente.setEnfermedadPpal(this.cmbEnfermedadPaciente.getSelectedItem().toString());
        this.lblVerificarEstado.setText(this.objetoPaciente.verificarEstadoPaciente());
    }//GEN-LAST:event_btnEstadoPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadoPaciente;
    private javax.swing.JButton btnVerificarEdad;
    private javax.swing.JComboBox<String> cmbEnfermedadPaciente;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEnfermedad;
    private javax.swing.JLabel lblFormularioDeDatos;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblInformacionPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblPesoPaciente;
    private javax.swing.JLabel lblVerificarEdad;
    private javax.swing.JLabel lblVerificarEstado;
    private javax.swing.JTextField txtCedulaPaciente;
    private javax.swing.JTextField txtEdadPaciente;
    private javax.swing.JTextField txtEstaturaPaciente;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextField txtPesoPaciente;
    // End of variables declaration//GEN-END:variables

}

/*package diangosticomedicoimc;

import Vista.Vista;

public class DiangosticoMedicoIMC {

  
    public static void main(String[] args) {
  Vista vista = new Vista();
  vista.setVisible(true);
    }
    
}*/
