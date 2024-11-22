/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicButtonUI;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Remover bordas/marcações do botão na tela
        jButtonAgendar.setBorderPainted(false);
        jButtonCadastrarCliente.setBorderPainted(false);
        removerBordasDosBotoes(jButtonMenu);
        removerBordasDosBotoes(jButtonCadastrarCliente);
        removerBordasDosBotoes(jButtonAgendar);
        // Adicionando um hover ao botão
        adicionarHoverBotao(jButtonMenu);
        // Adicionando um hover ao botão de icone
        adicionarHoverBotaoIcone(jButtonAgendar);
        adicionarHoverBotaoIcone(jButtonCadastrarCliente);
        // Adicionando tooltip no botão
        UIManager.put("ToolTip.background", new ColorUIResource(Color.WHITE));
        jButtonCadastrarCliente.setToolTipText("Cadastrar Cliente");
        jButtonAgendar.setToolTipText("Agendar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelContagemAgendamentos = new javax.swing.JLabel();
        jLabelContagemCancelamentos = new javax.swing.JLabel();
        jLabelContagemConcluidos = new javax.swing.JLabel();
        jPanelCentro = new javax.swing.JPanel();
        jPanelTopoMenu = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonAgendar = new javax.swing.JButton();
        jButtonCadastrarCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jPopupMenu.setAlignmentY(0.7F);
        jPopupMenu.setPopupSize(new java.awt.Dimension(160, 90));

        jMenuCadastros.setText("Cadastros");
        jMenuCadastros.setPreferredSize(new java.awt.Dimension(200, 30));

        jMenuItemCadastrarBarbeiro.setText("Cadastrar Barbeiro");
        jMenuItemCadastrarBarbeiro.setMargin(new java.awt.Insets(3, 20, 3, 6));
        jMenuItemCadastrarBarbeiro.setPreferredSize(new java.awt.Dimension(170, 25));
        jMenuCadastros.add(jMenuItemCadastrarBarbeiro);

        jMenuItemCadastrarCliente.setText("Cadastrar Cliente");
        jMenuItemCadastrarCliente.setPreferredSize(new java.awt.Dimension(138, 25));
        jMenuCadastros.add(jMenuItemCadastrarCliente);

        jMenuItemCadastrarServico.setText("Cadastrar Serviço");
        jMenuItemCadastrarServico.setPreferredSize(new java.awt.Dimension(139, 25));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Barbersched_Logo.png"))); // NOI18N

        jLabel2.setText("AGENDAMENTOS:");

        jLabel3.setText("CANCELAMENTOS:");

        jLabel4.setText("CONCLUÍDOS:");

        jLabelContagemAgendamentos.setText("0");

        jLabelContagemCancelamentos.setText("0");

        jLabelContagemConcluidos.setText("0");

        javax.swing.GroupLayout jPanelDireitoLayout = new javax.swing.GroupLayout(jPanelDireito);
        jPanelDireito.setLayout(jPanelDireitoLayout);
        jPanelDireitoLayout.setHorizontalGroup(
            jPanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireitoLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDireitoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelContagemConcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireitoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelContagemCancelamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireitoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelContagemAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanelDireitoLayout.setVerticalGroup(
            jPanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireitoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jPanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelContagemAgendamentos))
                .addGap(18, 18, 18)
                .addGroup(jPanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelContagemCancelamentos))
                .addGap(18, 18, 18)
                .addGroup(jPanelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelContagemConcluidos))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanelCentro.setBackground(new java.awt.Color(34, 51, 59));
        jPanelCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelCentroLayout = new javax.swing.GroupLayout(jPanelCentro);
        jPanelCentro.setLayout(jPanelCentroLayout);
        jPanelCentroLayout.setHorizontalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelCentroLayout.setVerticalGroup(
            jPanelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(715, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelContagemAgendamentos;
    private javax.swing.JLabel jLabelContagemCancelamentos;
    private javax.swing.JLabel jLabelContagemConcluidos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAgendar;
    private javax.swing.JMenuItem jMenuItemCadastrarBarbeiro;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarServico;
    private javax.swing.JMenuItem jMenuItemQuadroDeHorarios;
    private javax.swing.JMenuItem jMenuItemRelatorioServico;
    private javax.swing.JMenuItem jMenuItemRelatórioAgendamento;
    private javax.swing.JMenuItem jMenuItemRelatórioCliente;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuServicos;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelDireito;
    private javax.swing.JPanel jPanelTopoMenu;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
