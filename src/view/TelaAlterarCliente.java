/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import modelDominio.Cliente;
import security.Criptografia;

public class TelaAlterarCliente extends javax.swing.JDialog {

    private int id;
    private LocalDate dataCadastro;

    public TelaAlterarCliente() {
        initComponents();
    }

    public void setCliente(Cliente cliente) {
        this.id = cliente.getIdUsuario();
        this.dataCadastro = cliente.getDataCadastro();
        jTextFieldNomeCadastroClientes.setText(cliente.getNome());
        jFormattedTextFieldCpfCadastroClientes.setText(cliente.getCpf());
        jFormattedTextFieldTelefoneCadastroClientes.setText(cliente.getTelefone());
        jFormattedTextFieldDataNascimentoCadastroClientes.setText(cliente.getDataDeNascimento());
        jTextFieldLoginCadastroClientes.setText(cliente.getLogin());
        jTextFieldSenhaCadastroClientes.setText(cliente.getSenha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMeioCadastroClientes = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNomeCadastroClientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldCpfCadastroClientes = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldTelefoneCadastroClientes = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimentoCadastroClientes = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLoginCadastroClientes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSenhaCadastroClientes = new javax.swing.JTextField();
        jButtonAlterarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Cadastro de Cliente");
        setResizable(false);

        jLabelNome.setText("Nome");

        jLabel6.setText("Cpf");

        try {
            jFormattedTextFieldCpfCadastroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfCadastroClientes.setEnabled(false);

        jLabel7.setText("Telefone");

        try {
            jFormattedTextFieldTelefoneCadastroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Data de Nascimento");

        jFormattedTextFieldDataNascimentoCadastroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel9.setText("Login");

        jTextFieldLoginCadastroClientes.setEnabled(false);

        jLabel10.setText("Senha");

        jButtonAlterarCliente.setBackground(new java.awt.Color(34, 51, 59));
        jButtonAlterarCliente.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jButtonAlterarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterarCliente.setText("Alterar");
        jButtonAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMeioCadastroClientesLayout = new javax.swing.GroupLayout(jPanelMeioCadastroClientes);
        jPanelMeioCadastroClientes.setLayout(jPanelMeioCadastroClientesLayout);
        jPanelMeioCadastroClientesLayout.setHorizontalGroup(
            jPanelMeioCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioCadastroClientesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanelMeioCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNomeCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldCpfCadastroClientes)
                    .addComponent(jFormattedTextFieldTelefoneCadastroClientes)
                    .addComponent(jFormattedTextFieldDataNascimentoCadastroClientes)
                    .addComponent(jTextFieldLoginCadastroClientes)
                    .addComponent(jTextFieldSenhaCadastroClientes)
                    .addComponent(jButtonAlterarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanelMeioCadastroClientesLayout.setVerticalGroup(
            jPanelMeioCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioCadastroClientesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCpfCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldTelefoneCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDataNascimentoCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLoginCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSenhaCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButtonAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jPanelMeioCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelMeioCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarClienteActionPerformed
        if (!jTextFieldNomeCadastroClientes.getText().equals("")) {
            if (!jFormattedTextFieldCpfCadastroClientes.getText().equals("   .   .   -  ")) {
                if (!jFormattedTextFieldTelefoneCadastroClientes.getText().equals("(  )      -    ")) {
                    if (!jFormattedTextFieldDataNascimentoCadastroClientes.getText().equals("")) {
                        if (!jTextFieldLoginCadastroClientes.getText().equals("")) {
                            if (!jTextFieldSenhaCadastroClientes.getText().equals("")) {
                                // obtendo os dados dos campos informados
                                String nome = jTextFieldNomeCadastroClientes.getText();
                                String cpf = jFormattedTextFieldCpfCadastroClientes.getText();
                                String telefone = jFormattedTextFieldTelefoneCadastroClientes.getText();
                                String login = jTextFieldLoginCadastroClientes.getText();
                                String senha = jTextFieldSenhaCadastroClientes.getText();
                                String dataNascimento = jFormattedTextFieldDataNascimentoCadastroClientes.getText();

                                // criptografando a senha informada
                                String senhaCriptografada = Criptografia.criptografarSenha(senha);

                                // criando o cliente com os dados informados
                                Cliente cliente = new Cliente(id, nome, cpf, telefone, dataCadastro, login, senhaCriptografada, dataNascimento);
                                boolean resultado = false;

                                // alterando o cliente e pegando o resultado
                                resultado = Principal.ccont.clienteAlterar(cliente);

                                // testando o resultado
                                if (resultado) {
                                    JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso!", "Banco", 1);
                                    dispose();
                                } else {
                                    JOptionPane.showMessageDialog(this, "Ocorreu um erro ao alterar o cliente.", "Banco", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Preencha o campo senha.");
                                jTextFieldSenhaCadastroClientes.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Preencha o campo login.");
                            jTextFieldLoginCadastroClientes.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Preencha o campo data de nascimento.");
                        jFormattedTextFieldDataNascimentoCadastroClientes.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Preencha o campo telefone.");
                    jFormattedTextFieldTelefoneCadastroClientes.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preencha o campo cpf.");
                jFormattedTextFieldCpfCadastroClientes.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha o campo nome.");
            jTextFieldNomeCadastroClientes.requestFocus();
        }
    }//GEN-LAST:event_jButtonAlterarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfCadastroClientes;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimentoCadastroClientes;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneCadastroClientes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelMeioCadastroClientes;
    private javax.swing.JTextField jTextFieldLoginCadastroClientes;
    private javax.swing.JTextField jTextFieldNomeCadastroClientes;
    private javax.swing.JTextField jTextFieldSenhaCadastroClientes;
    // End of variables declaration//GEN-END:variables
}
