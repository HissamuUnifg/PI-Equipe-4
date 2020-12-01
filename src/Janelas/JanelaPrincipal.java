package Janelas;


import Janelas.AgendarVacinacao;
import Janelas.AgendarBanhoTosa;
import Janelas.CadastrarAnimal;
import Janelas.AgendarConsulta;
import Janelas.CadastrarCliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rubens
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotaoVenda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastrar = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        CadAnimal = new javax.swing.JMenuItem();
        AgendarServico = new javax.swing.JMenu();
        AgendarBanhoTosa = new javax.swing.JMenuItem();
        AgendarVacinacao = new javax.swing.JMenuItem();
        AgendarConsulta = new javax.swing.JMenuItem();
        MenuEstoque = new javax.swing.JMenu();
        GerenciarEstoque = new javax.swing.JMenuItem();
        Entrada = new javax.swing.JMenuItem();
        MenuEstoque1 = new javax.swing.JMenu();
        mudarCliente = new javax.swing.JMenuItem();
        apagarCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Banho e Tosa", "09/03/21", "Maria", "Rex"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Serviço", "Data", "Cliente", "Pet"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Agenda");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CORA.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PETS.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Pet Shop");

        BotaoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ef Venda OK.png"))); // NOI18N
        BotaoVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVendaActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar  ");
        Cadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        CadCliente.setText("Cadastrar Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        Cadastrar.add(CadCliente);

        CadAnimal.setText("Cadastrar Animal");
        CadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadAnimalActionPerformed(evt);
            }
        });
        Cadastrar.add(CadAnimal);

        jMenuBar1.add(Cadastrar);

        AgendarServico.setText("Agendar Serviço  ");
        AgendarServico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        AgendarBanhoTosa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AgendarBanhoTosa.setText("Banho e Tosa");
        AgendarBanhoTosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarBanhoTosaActionPerformed(evt);
            }
        });
        AgendarServico.add(AgendarBanhoTosa);

        AgendarVacinacao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AgendarVacinacao.setText("Vacinação");
        AgendarVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarVacinacaoActionPerformed(evt);
            }
        });
        AgendarServico.add(AgendarVacinacao);

        AgendarConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AgendarConsulta.setText("Consulta");
        AgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarConsultaActionPerformed(evt);
            }
        });
        AgendarServico.add(AgendarConsulta);

        jMenuBar1.add(AgendarServico);

        MenuEstoque.setText("Estoque");
        MenuEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        GerenciarEstoque.setText("Gerenciar Estoque");
        GerenciarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarEstoqueActionPerformed(evt);
            }
        });
        MenuEstoque.add(GerenciarEstoque);

        Entrada.setText("Efetuar Entrada");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });
        MenuEstoque.add(Entrada);

        jMenuBar1.add(MenuEstoque);

        MenuEstoque1.setText("Cliente");
        MenuEstoque1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        mudarCliente.setText("Mudar dados do cliente");
        mudarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mudarClienteActionPerformed(evt);
            }
        });
        MenuEstoque1.add(mudarCliente);

        apagarCliente.setText("Apagar cliente cadastrado");
        apagarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarClienteActionPerformed(evt);
            }
        });
        MenuEstoque1.add(apagarCliente);

        jMenuBar1.add(MenuEstoque1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void AgendarBanhoTosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarBanhoTosaActionPerformed
        AgendarBanhoTosa  AgenBanho = new AgendarBanhoTosa();
        AgenBanho.setVisible(true);
    }//GEN-LAST:event_AgendarBanhoTosaActionPerformed

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        CadastrarCliente cadCli = new CadastrarCliente();
        cadCli.setVisible(true);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void CadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadAnimalActionPerformed
        CadastrarAnimal cadAni = new CadastrarAnimal();
        cadAni.setVisible(true);
    }//GEN-LAST:event_CadAnimalActionPerformed

    private void AgendarVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarVacinacaoActionPerformed
     AgendarVacinacao AgenVac = new AgendarVacinacao();
      AgenVac.setVisible(true); 
      
    }//GEN-LAST:event_AgendarVacinacaoActionPerformed

    private void AgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarConsultaActionPerformed
        AgendarConsulta AgenCons = new AgendarConsulta();
     AgenCons.setVisible(true);
    }//GEN-LAST:event_AgendarConsultaActionPerformed

    private void BotaoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVendaActionPerformed
        JanelaVenda janVenda = new JanelaVenda();
        janVenda.setVisible(true);
    }//GEN-LAST:event_BotaoVendaActionPerformed

    private void GerenciarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarEstoqueActionPerformed
        JanelaEstoque janEstoque = new JanelaEstoque();
        janEstoque.setVisible(true);
    }//GEN-LAST:event_GerenciarEstoqueActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        JanelaEntrada janEntrada = new JanelaEntrada();
        janEntrada.setVisible(true);
    }//GEN-LAST:event_EntradaActionPerformed

    private void apagarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarClienteActionPerformed
        ApagarCliente apagarCli = new ApagarCliente();
        apagarCli.setVisible(true);
    }//GEN-LAST:event_apagarClienteActionPerformed

    private void mudarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mudarClienteActionPerformed
        EditarCliente editar = new EditarCliente();
        editar.setVisible(true);
    }//GEN-LAST:event_mudarClienteActionPerformed
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgendarBanhoTosa;
    private javax.swing.JMenuItem AgendarConsulta;
    private javax.swing.JMenu AgendarServico;
    private javax.swing.JMenuItem AgendarVacinacao;
    private javax.swing.JButton BotaoVenda;
    private javax.swing.JMenuItem CadAnimal;
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenu Cadastrar;
    private javax.swing.JMenuItem Entrada;
    private javax.swing.JMenuItem GerenciarEstoque;
    private javax.swing.JMenu MenuEstoque;
    private javax.swing.JMenu MenuEstoque1;
    private javax.swing.JMenuItem apagarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mudarCliente;
    // End of variables declaration//GEN-END:variables
}
