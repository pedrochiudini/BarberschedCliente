/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicButtonUI;
import modelDominio.Cliente;
import security.Criptografia;
import view.tablemodel.ClienteTableModel;

public class TelaInicial extends javax.swing.JFrame {

    // tableModel dos Clientes
    private ClienteTableModel clienteModel;

    public TelaInicial() {
        initComponents();

        // Abrir tela maximizada
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Desabilitando janelas internas
        jInternalFrameCadastroClientes.setVisible(false);

        // Desabilitando o botão Fechar janelas
        jButtonFecharJanelas.setEnabled(false);

        // Remover bordas/marcações do botão na tela
        jButtonAgendar.setBorderPainted(false);
        jButtonCadastrarCliente.setBorderPainted(false);
        jButtonFecharJanelas.setBorderPainted(false);
        removerBordasDosBotoes(jButtonMenu);
        removerBordasDosBotoes(jButtonCadastrarCliente);
        removerBordasDosBotoes(jButtonAgendar);
        removerBordasDosBotoes(jButtonFecharJanelas);
        removerBordasDosBotoes(jButtonCadastrarClientes);
        removerBordasDosBotoes(jButtonExcluirClientes);

        // Adicionando um hover ao botão
        adicionarHoverBotao(jButtonMenu);

        // Adicionando um hover ao botão de icone
        adicionarHoverBotaoIcone(jButtonAgendar);
        adicionarHoverBotaoIcone(jButtonCadastrarCliente);

        // Adicionando tooltip no botão
        UIManager.put("ToolTip.background", new ColorUIResource(Color.WHITE));
        jButtonCadastrarCliente.setToolTipText("Cadastrar Cliente");
        jButtonAgendar.setToolTipText("Agendar");
        jButtonFecharJanelas.setToolTipText("Fechar Janelas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastrarBarbeiro = new javax.swing.JMenuItem();
        jMenuItemCadastrarCliente = new javax.swing.JMenuItem();
        jMenuItemCadastrarServico = new javax.swing.JMenuItem();
        jMenuServicos = new javax.swing.JMenu();
        jMenuItemAgendar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemQuadroDeHorarios = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemRelatórioAgendamento = new javax.swing.JMenuItem();
        jMenuItemRelatórioCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemRelatorioServico = new javax.swing.JMenuItem();
        jPanelDireito = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelContagemAgendamentos = new javax.swing.JLabel();
        jLabelContagemCancelamentos = new javax.swing.JLabel();
        jLabelContagemConcluidos = new javax.swing.JLabel();
        jPanelCentro = new javax.swing.JPanel();
        jDesktopPaneCentro = new javax.swing.JDesktopPane();
        jInternalFrameCadastrosServicos = new javax.swing.JInternalFrame();
        jPanelCentralCadastroServicos = new javax.swing.JPanel();
        jPanelTabelaServicos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableServicos = new javax.swing.JTable();
        jPanelMeioCadastroServicos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNomeCadastroServicos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jFormattedTextFieldValorCadastroServicos = new javax.swing.JFormattedTextField();
        jButtonCadastrarServicos = new javax.swing.JButton();
        jButtonExcluirServico = new javax.swing.JButton();
        jPanelTopCadastroClientes1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jInternalFrameCadastroClientes = new javax.swing.JInternalFrame();
        jPanelTopCadastroClientes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanelCentralCadastroClientes = new javax.swing.JPanel();
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
        jButtonCadastrarClientes = new javax.swing.JButton();
        jButtonExcluirClientes = new javax.swing.JButton();
        jPanelTabelaCadastroClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jPanelTopoMenu = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonAgendar = new javax.swing.JButton();
        jButtonCadastrarCliente = new javax.swing.JButton();
        jButtonFecharJanelas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();

        jPopupMenu.setAlignmentY(0.7F);
        jPopupMenu.setPopupSize(new java.awt.Dimension(180, 80));

        jMenuCadastros.setText("Cadastros");
        jMenuCadastros.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItemCadastrarBarbeiro.setText("Cadastrar Barbeiro");
        jMenuItemCadastrarBarbeiro.setMargin(new java.awt.Insets(3, 20, 3, 6));
        jMenuItemCadastrarBarbeiro.setPreferredSize(new java.awt.Dimension(170, 25));
        jMenuCadastros.add(jMenuItemCadastrarBarbeiro);

        jMenuItemCadastrarCliente.setText("Cadastrar Cliente");
        jMenuItemCadastrarCliente.setPreferredSize(new java.awt.Dimension(138, 25));
        jMenuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarCliente);

        jMenuItemCadastrarServico.setText("Cadastrar Serviço");
        jMenuItemCadastrarServico.setPreferredSize(new java.awt.Dimension(139, 25));
        jMenuItemCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarServicoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastrarServico);

        jPopupMenu.add(jMenuCadastros);

        jMenuServicos.setText("Serviços");
        jMenuServicos.setMargin(new java.awt.Insets(3, 6, 3, 10));
        jMenuServicos.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItemAgendar.setText("Novo Agendamento");
        jMenuItemAgendar.setPreferredSize(new java.awt.Dimension(150, 25));
        jMenuServicos.add(jMenuItemAgendar);
        jMenuServicos.add(jSeparator3);

        jMenuItemQuadroDeHorarios.setText("Quadro de Horários");
        jMenuItemQuadroDeHorarios.setPreferredSize(new java.awt.Dimension(152, 25));
        jMenuServicos.add(jMenuItemQuadroDeHorarios);

        jPopupMenu.add(jMenuServicos);

        jMenuRelatorios.setText("Relatórios");
        jMenuRelatorios.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItemRelatórioAgendamento.setText("Relatório Agendamentos");
        jMenuItemRelatórioAgendamento.setPreferredSize(new java.awt.Dimension(180, 25));
        jMenuRelatorios.add(jMenuItemRelatórioAgendamento);

        jMenuItemRelatórioCliente.setText("Relatório Clientes");
        jMenuItemRelatórioCliente.setPreferredSize(new java.awt.Dimension(140, 25));
        jMenuRelatorios.add(jMenuItemRelatórioCliente);
        jMenuRelatorios.add(jSeparator4);

        jMenuItemRelatorioServico.setText("Relatório Serviços");
        jMenuItemRelatorioServico.setPreferredSize(new java.awt.Dimension(141, 25));
        jMenuRelatorios.add(jMenuItemRelatorioServico);

        jPopupMenu.add(jMenuRelatorios);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barbersched Software");
        setMinimumSize(new java.awt.Dimension(1200, 670));
        setSize(new java.awt.Dimension(1366, 768));

        jPanelDireito.setBackground(new java.awt.Color(229, 234, 236));
        jPanelDireito.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Barbersched_Logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = -173;
        gridBagConstraints.insets = new java.awt.Insets(302, 64, 0, 57);
        jPanelDireito.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 64, 60, 57);
        jPanelDireito.add(jSeparator2, gridBagConstraints);

        jLabel2.setText("AGENDAMENTOS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 64, 0, 0);
        jPanelDireito.add(jLabel2, gridBagConstraints);

        jLabel3.setText("CANCELAMENTOS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 64, 0, 0);
        jPanelDireito.add(jLabel3, gridBagConstraints);

        jLabel4.setText("CONCLUÍDOS:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 64, 0, 0);
        jPanelDireito.add(jLabel4, gridBagConstraints);

        jLabelContagemAgendamentos.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(100, 69, 0, 57);
        jPanelDireito.add(jLabelContagemAgendamentos, gridBagConstraints);

        jLabelContagemCancelamentos.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 69, 0, 57);
        jPanelDireito.add(jLabelContagemCancelamentos, gridBagConstraints);

        jLabelContagemConcluidos.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 69, 0, 57);
        jPanelDireito.add(jLabelContagemConcluidos, gridBagConstraints);

        jPanelCentro.setBackground(new java.awt.Color(34, 51, 59));
        jPanelCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPaneCentro.setBackground(new java.awt.Color(34, 51, 59));

        jInternalFrameCadastrosServicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrameCadastrosServicos.setMaximizable(true);
        jInternalFrameCadastrosServicos.setTitle("Cadastro de Serviços");
        jInternalFrameCadastrosServicos.setPreferredSize(new java.awt.Dimension(1020, 728));
        jInternalFrameCadastrosServicos.setVisible(true);

        jTableServicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableServicos);

        javax.swing.GroupLayout jPanelTabelaServicosLayout = new javax.swing.GroupLayout(jPanelTabelaServicos);
        jPanelTabelaServicos.setLayout(jPanelTabelaServicosLayout);
        jPanelTabelaServicosLayout.setHorizontalGroup(
            jPanelTabelaServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaServicosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanelTabelaServicosLayout.setVerticalGroup(
            jPanelTabelaServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanelCentralCadastroServicosLayout = new javax.swing.GroupLayout(jPanelCentralCadastroServicos);
        jPanelCentralCadastroServicos.setLayout(jPanelCentralCadastroServicosLayout);
        jPanelCentralCadastroServicosLayout.setHorizontalGroup(
            jPanelCentralCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralCadastroServicosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelTabelaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanelCentralCadastroServicosLayout.setVerticalGroup(
            jPanelCentralCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTabelaServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setText("Nome");

        jTextFieldNomeCadastroServicos.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabel13.setText("Valor");

        jFormattedTextFieldValorCadastroServicos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldValorCadastroServicos.setPreferredSize(new java.awt.Dimension(100, 22));

        jButtonCadastrarServicos.setBackground(new java.awt.Color(34, 51, 59));
        jButtonCadastrarServicos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarServicos.setText("Cadastrar");
        jButtonCadastrarServicos.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonCadastrarServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarServicosActionPerformed(evt);
            }
        });

        jButtonExcluirServico.setBackground(new java.awt.Color(34, 51, 59));
        jButtonExcluirServico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirServico.setText("Excluir");
        jButtonExcluirServico.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanelMeioCadastroServicosLayout = new javax.swing.GroupLayout(jPanelMeioCadastroServicos);
        jPanelMeioCadastroServicos.setLayout(jPanelMeioCadastroServicosLayout);
        jPanelMeioCadastroServicosLayout.setHorizontalGroup(
            jPanelMeioCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioCadastroServicosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMeioCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldNomeCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextFieldValorCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMeioCadastroServicosLayout.createSequentialGroup()
                        .addComponent(jButtonCadastrarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluirServico, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanelMeioCadastroServicosLayout.setVerticalGroup(
            jPanelMeioCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioCadastroServicosLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldValorCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanelMeioCadastroServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(272, 272, 272))
        );

        jPanelTopCadastroClientes1.setBackground(new java.awt.Color(34, 51, 59));
        jPanelTopCadastroClientes1.setLayout(new java.awt.GridBagLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Barbersched_Logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 6, 11, 809);
        jPanelTopCadastroClientes1.add(jLabel14, gridBagConstraints);

        javax.swing.GroupLayout jInternalFrameCadastrosServicosLayout = new javax.swing.GroupLayout(jInternalFrameCadastrosServicos.getContentPane());
        jInternalFrameCadastrosServicos.getContentPane().setLayout(jInternalFrameCadastrosServicosLayout);
        jInternalFrameCadastrosServicosLayout.setHorizontalGroup(
            jInternalFrameCadastrosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastrosServicosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jInternalFrameCadastrosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrameCadastrosServicosLayout.createSequentialGroup()
                        .addComponent(jPanelTopCadastroClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))
                    .addGroup(jInternalFrameCadastrosServicosLayout.createSequentialGroup()
                        .addComponent(jPanelMeioCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelCentralCadastroServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jInternalFrameCadastrosServicosLayout.setVerticalGroup(
            jInternalFrameCadastrosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastrosServicosLayout.createSequentialGroup()
                .addComponent(jPanelTopCadastroClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jInternalFrameCadastrosServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentralCadastroServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMeioCadastroServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jInternalFrameCadastroClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrameCadastroClientes.setMaximizable(true);
        jInternalFrameCadastroClientes.setTitle("Cadastro de Clientes");
        jInternalFrameCadastroClientes.setVisible(true);

        jPanelTopCadastroClientes.setBackground(new java.awt.Color(34, 51, 59));
        jPanelTopCadastroClientes.setLayout(new java.awt.GridBagLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Barbersched_Logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = -250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 6, 11, 809);
        jPanelTopCadastroClientes.add(jLabel5, gridBagConstraints);

        jLabelNome.setText("Nome");

        jLabel6.setText("Cpf");

        try {
            jFormattedTextFieldCpfCadastroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Telefone");

        try {
            jFormattedTextFieldTelefoneCadastroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Data de Nascimento");

        jFormattedTextFieldDataNascimentoCadastroClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel9.setText("Login");

        jLabel10.setText("Senha");

        jButtonCadastrarClientes.setBackground(new java.awt.Color(34, 51, 59));
        jButtonCadastrarClientes.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jButtonCadastrarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarClientes.setText("Cadastrar");
        jButtonCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarClientesActionPerformed(evt);
            }
        });

        jButtonExcluirClientes.setBackground(new java.awt.Color(34, 51, 59));
        jButtonExcluirClientes.setFont(new java.awt.Font("Inter Medium", 0, 12)); // NOI18N
        jButtonExcluirClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirClientes.setText("Excluir");
        jButtonExcluirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMeioCadastroClientesLayout = new javax.swing.GroupLayout(jPanelMeioCadastroClientes);
        jPanelMeioCadastroClientes.setLayout(jPanelMeioCadastroClientesLayout);
        jPanelMeioCadastroClientesLayout.setHorizontalGroup(
            jPanelMeioCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioCadastroClientesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanelMeioCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioCadastroClientesLayout.createSequentialGroup()
                        .addComponent(jButtonCadastrarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNomeCadastroClientes)
                    .addComponent(jFormattedTextFieldCpfCadastroClientes)
                    .addComponent(jFormattedTextFieldTelefoneCadastroClientes)
                    .addComponent(jFormattedTextFieldDataNascimentoCadastroClientes)
                    .addComponent(jTextFieldLoginCadastroClientes)
                    .addComponent(jTextFieldSenhaCadastroClientes))
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
                .addGap(46, 46, 46)
                .addGroup(jPanelMeioCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanelTabelaCadastroClientesLayout = new javax.swing.GroupLayout(jPanelTabelaCadastroClientes);
        jPanelTabelaCadastroClientes.setLayout(jPanelTabelaCadastroClientesLayout);
        jPanelTabelaCadastroClientesLayout.setHorizontalGroup(
            jPanelTabelaCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelTabelaCadastroClientesLayout.setVerticalGroup(
            jPanelTabelaCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanelCentralCadastroClientesLayout = new javax.swing.GroupLayout(jPanelCentralCadastroClientes);
        jPanelCentralCadastroClientes.setLayout(jPanelCentralCadastroClientesLayout);
        jPanelCentralCadastroClientesLayout.setHorizontalGroup(
            jPanelCentralCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralCadastroClientesLayout.createSequentialGroup()
                .addComponent(jPanelMeioCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelTabelaCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCentralCadastroClientesLayout.setVerticalGroup(
            jPanelCentralCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralCadastroClientesLayout.createSequentialGroup()
                .addComponent(jPanelMeioCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanelTabelaCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrameCadastroClientesLayout = new javax.swing.GroupLayout(jInternalFrameCadastroClientes.getContentPane());
        jInternalFrameCadastroClientes.getContentPane().setLayout(jInternalFrameCadastroClientesLayout);
        jInternalFrameCadastroClientesLayout.setHorizontalGroup(
            jInternalFrameCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTopCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCentralCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrameCadastroClientesLayout.setVerticalGroup(
            jInternalFrameCadastroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastroClientesLayout.createSequentialGroup()
                .addComponent(jPanelTopCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelCentralCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPaneCentro.setLayer(jInternalFrameCadastrosServicos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneCentro.setLayer(jInternalFrameCadastroClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneCentroLayout = new javax.swing.GroupLayout(jDesktopPaneCentro);
        jDesktopPaneCentro.setLayout(jDesktopPaneCentroLayout);
        jDesktopPaneCentroLayout.setHorizontalGroup(
            jDesktopPaneCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameCadastroClientes)
            .addGroup(jDesktopPaneCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jInternalFrameCadastrosServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPaneCentroLayout.setVerticalGroup(
            jDesktopPaneCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameCadastroClientes)
            .addGroup(jDesktopPaneCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jInternalFrameCadastrosServicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCentroLayout = new javax.swing.GroupLayout(jPanelCentro);
        jPanelCentro.setLayout(jPanelCentroLayout);
        jPanelCentroLayout.setHorizontalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneCentro)
        );
        jPanelCentroLayout.setVerticalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneCentro)
        );

        jPanelTopoMenu.setBackground(new java.awt.Color(31, 54, 59));

        jButtonMenu.setBackground(new java.awt.Color(34, 51, 59));
        jButtonMenu.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setText("MENU");
        jButtonMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.setPreferredSize(new java.awt.Dimension(100, 23));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopoMenuLayout = new javax.swing.GroupLayout(jPanelTopoMenu);
        jPanelTopoMenu.setLayout(jPanelTopoMenuLayout);
        jPanelTopoMenuLayout.setHorizontalGroup(
            jPanelTopoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoMenuLayout.createSequentialGroup()
                .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopoMenuLayout.setVerticalGroup(
            jPanelTopoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelBotoes.setPreferredSize(new java.awt.Dimension(100, 48));

        jButtonAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/IconeAgendar.png"))); // NOI18N
        jButtonAgendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });

        jButtonCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/IconeCadastrar.png"))); // NOI18N
        jButtonCadastrarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarClienteActionPerformed(evt);
            }
        });

        jButtonFecharJanelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/IconeFecharJanela.png"))); // NOI18N
        jButtonFecharJanelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFecharJanelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharJanelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFecharJanelas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(661, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFecharJanelas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuArquivo.setText("Arquivo");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jPanelDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelTopoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTopoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDireito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("Barbesched Software 1.0");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        jPopupMenu.show(this, 9, 95);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jButtonCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarClienteActionPerformed
        abrirJanelaInterna(jInternalFrameCadastroClientes);
        atualizaTabelaCadastroClientes();
        if (jButtonFecharJanelas.isEnabled() == false) {
            jButtonFecharJanelas.setEnabled(true);
            adicionarHoverBotaoIcone(jButtonFecharJanelas);
        }
    }//GEN-LAST:event_jButtonCadastrarClienteActionPerformed

    private void jMenuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarClienteActionPerformed
        abrirJanelaInterna(jInternalFrameCadastroClientes);
        atualizaTabelaCadastroClientes();
        if (jButtonFecharJanelas.isEnabled() == false) {
            jButtonFecharJanelas.setEnabled(true);
            adicionarHoverBotaoIcone(jButtonFecharJanelas);
        }
    }//GEN-LAST:event_jMenuItemCadastrarClienteActionPerformed

    private void jButtonFecharJanelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharJanelasActionPerformed
        jInternalFrameCadastroClientes.setVisible(false);
        jInternalFrameCadastrosServicos.setVisible(false);
        jButtonFecharJanelas.setEnabled(false);
        removerHoverBotaoIcone(jButtonFecharJanelas);
    }//GEN-LAST:event_jButtonFecharJanelasActionPerformed

    private void jButtonCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarClientesActionPerformed
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
                                LocalDate dataCadastro = LocalDate.now();
                                String login = jTextFieldLoginCadastroClientes.getText();
                                String senha = jTextFieldSenhaCadastroClientes.getText();
                                String dataNascimento = jFormattedTextFieldDataNascimentoCadastroClientes.getText();

                                // verificando cpf e login no banco
                                if (!Principal.ccont.verificarCpfCadastradoCliente(cpf)) {
                                    if (!Principal.ccont.verificarLoginCadastradoCliente(login)) {
                                        // criptografando a senha informada
                                        String senhaCriptografada = Criptografia.criptografarSenha(senha);

                                        // criando o cliente com os dados informados
                                        Cliente cliente = new Cliente(nome, cpf, telefone, dataCadastro, login, senhaCriptografada, dataNascimento);
                                        boolean resultado = false;

                                        // inserindo o cliente e pegando o resultado
                                        resultado = Principal.ccont.clienteInserir(cliente);

                                        // testando o resultado
                                        if (resultado) {
                                            JOptionPane.showMessageDialog(this, "Cliente inserido com sucesso!", "Banco", 1);
                                            atualizaTabelaCadastroClientes();
                                        } else {
                                            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao inserir.", "Banco", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "O login já está cadastrado no banco.", "Banco", JOptionPane.ERROR_MESSAGE);
                                        jTextFieldNomeCadastroClientes.requestFocus();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Cpf já cadastrado no banco.", "Banco", JOptionPane.ERROR_MESSAGE);
                                    jFormattedTextFieldCpfCadastroClientes.requestFocus();
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
    }//GEN-LAST:event_jButtonCadastrarClientesActionPerformed

    private void jButtonExcluirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirClientesActionPerformed
        // verificando se o usuário selecionou um cliente
        if (jTableClientes.getSelectedRow() != -1) {
            int result = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja excluir?",
                    "",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                Cliente cliente = clienteModel.getCliente(jTableClientes.getSelectedRow());
                if (Principal.ccont.clienteExcluir(cliente)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!", "Banco", 1);
                    atualizaTabelaCadastroClientes();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível excluir!", "Banco", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonExcluirClientesActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        if (evt.getClickCount() == 2){
            // pegando o cliente selecionado na tabela
            Cliente cliente = clienteModel.getCliente(jTableClientes.getSelectedRow());
            // instanciando a tela de alterar o cliente
            TelaAlterarCliente telaAlterarCliente = new TelaAlterarCliente();
            // configurando para abrir a tela somente 1 unica vez
            telaAlterarCliente.setModal(true);
            // passando a marca para dentro da tela de cadastro
            telaAlterarCliente.setCliente(cliente);
            telaAlterarCliente.setVisible(true);
            atualizaTabelaCadastroClientes();
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonCadastrarServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarServicosActionPerformed

    private void jMenuItemCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarServicoActionPerformed
        abrirJanelaInterna(jInternalFrameCadastrosServicos);
        atualizaTabelaCadastroClientes();
        if (jButtonFecharJanelas.isEnabled() == false) {
            jButtonFecharJanelas.setEnabled(true);
            adicionarHoverBotaoIcone(jButtonFecharJanelas);
        }
    }//GEN-LAST:event_jMenuItemCadastrarServicoActionPerformed

    //método que atualiza a Tabela de Clientes
    private void atualizaTabelaCadastroClientes() {
        //buscar a listagem de Clientes 
        ArrayList<Cliente> listaClientes = Principal.ccont.getClienteLista();
        // Criar o tablemodel
        clienteModel = new ClienteTableModel(listaClientes);
        //setar o table model na Jtable
        jTableClientes.setModel(clienteModel);
    }

    // Método para remover as bordas de todos os botões em um Container
    private void removerBordasDosBotoes(JButton botao) {
        // Remover borda do botão
        botao.setUI(new BasicButtonUI());
        botao.setOpaque(true);
    }

    // Método para adicionar um hover nos botões
    private void adicionarHoverBotao(JButton botao) {
        // Adicionar MouseListener para hover
        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Color cor = new Color(0.1372f, 0.2352f, 0.2352f); // RGB normalizado
                botao.setBackground(cor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Color cor = new Color(0.1333f, 0.2000f, 0.2314f); // RGB normalizado
                botao.setBackground(cor);
            }
        });
    }

    private void adicionarHoverBotaoIcone(JButton botao) {
        // Adicionar MouseListener para hover
        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botao.setBorderPainted(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botao.setBorderPainted(false);
            }
        });
    }

    private void removerHoverBotaoIcone(JButton botao) {
        for (MouseListener listener : botao.getMouseListeners()) {
            if (listener instanceof MouseAdapter) {
                botao.removeMouseListener(listener);
                botao.setBorderPainted(false);
            }
        }
    }

    private void abrirJanelaInterna(JInternalFrame internalFrame) {
        // Centraliza a janela interna no DesktopPane
        Dimension desktopSize = jDesktopPaneCentro.getSize();
        Dimension frameSize = internalFrame.getSize();
        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;
        internalFrame.setLocation(x, y);

        // Abrindo a janela interna
        internalFrame.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JButton jButtonCadastrarCliente;
    private javax.swing.JButton jButtonCadastrarClientes;
    private javax.swing.JButton jButtonCadastrarServicos;
    private javax.swing.JButton jButtonExcluirClientes;
    private javax.swing.JButton jButtonExcluirServico;
    private javax.swing.JButton jButtonFecharJanelas;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JDesktopPane jDesktopPaneCentro;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfCadastroClientes;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimentoCadastroClientes;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneCadastroClientes;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorCadastroServicos;
    private javax.swing.JInternalFrame jInternalFrameCadastroClientes;
    private javax.swing.JInternalFrame jInternalFrameCadastrosServicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelContagemAgendamentos;
    private javax.swing.JLabel jLabelContagemCancelamentos;
    private javax.swing.JLabel jLabelContagemConcluidos;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItemAgendar;
    private javax.swing.JMenuItem jMenuItemCadastrarBarbeiro;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarServico;
    private javax.swing.JMenuItem jMenuItemQuadroDeHorarios;
    private javax.swing.JMenuItem jMenuItemRelatorioServico;
    private javax.swing.JMenuItem jMenuItemRelatórioAgendamento;
    private javax.swing.JMenuItem jMenuItemRelatórioCliente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuServicos;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCentralCadastroClientes;
    private javax.swing.JPanel jPanelCentralCadastroServicos;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelDireito;
    private javax.swing.JPanel jPanelMeioCadastroClientes;
    private javax.swing.JPanel jPanelMeioCadastroServicos;
    private javax.swing.JPanel jPanelTabelaCadastroClientes;
    private javax.swing.JPanel jPanelTabelaServicos;
    private javax.swing.JPanel jPanelTopCadastroClientes;
    private javax.swing.JPanel jPanelTopCadastroClientes1;
    private javax.swing.JPanel jPanelTopoMenu;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableServicos;
    private javax.swing.JTextField jTextFieldLoginCadastroClientes;
    private javax.swing.JTextField jTextFieldNomeCadastroClientes;
    private javax.swing.JTextField jTextFieldNomeCadastroServicos;
    private javax.swing.JTextField jTextFieldSenhaCadastroClientes;
    // End of variables declaration//GEN-END:variables
}
