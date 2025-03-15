/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.Cliente;
import DAO.connectDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
    }
    
    String operacaoAtivaGlobal = "Nenhum";
    public Clientes(String operacaoAtiva){
        initComponents();
        
        operacaoAtivaGlobal = operacaoAtiva;
        
        String operacao = "Incluir";
        
        if(operacaoAtiva.equals(operacao)){
            jLabel1.setVisible(true);
            NomeCliente.setVisible(true);
            jLabel2.setVisible(true);
            EndCliente.setVisible(true);
            jLabel3.setVisible(true);
            NumCliente.setVisible(true);
            ButtonCadastrar.setVisible(true);
            ButtonDetalhes.setVisible(true);
            jLabel4.setVisible(true);
            IDCliente.setVisible(true);
            CompCliente.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            BairroCliente.setVisible(true);
            jLabel7.setVisible(true);
            CEPCliente.setVisible(true);
            jLabel8.setVisible(true);
            CidadeCliente.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            CPFCliente.setVisible(true);
            CNPJCliente.setVisible(true);
            jLabel12.setVisible(true);
            Limpar.setVisible(true);
            Status.setVisible(true);
            UFCliente.setVisible(true);
            Data_nascimentoCliente.setVisible(true);
            jLabel13.setVisible(true);
            TelefoneCliente.setVisible(true);
        }
        
        operacao = "Alterar";
        
        if(operacaoAtiva.equals(operacao)){
            jLabel1.setVisible(true);
            NomeCliente.setVisible(false);
            jLabel2.setVisible(false);
            EndCliente.setVisible(false);
            jLabel3.setVisible(false);
            NumCliente.setVisible(false);
            ButtonCadastrar.setVisible(true);
            ButtonDetalhes.setVisible(false);
            jLabel4.setVisible(false);
            IDCliente.setVisible(true);
            CompCliente.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            BairroCliente.setVisible(false);
            jLabel7.setVisible(false);
            CEPCliente.setVisible(false);
            jLabel8.setVisible(false);
            CidadeCliente.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            CPFCliente.setVisible(false);
            CNPJCliente.setVisible(false);
            jLabel12.setVisible(false);
            Limpar.setVisible(false);
            Status.setVisible(false);
            UFCliente.setVisible(false);
            Data_nascimentoCliente.setVisible(false);
            jLabel13.setVisible(false);
            TelefoneCliente.setVisible(false);
            
            ButtonCadastrar.setText("Pesquisar");
        }       
        
        operacao = "Excluir";
        
        if(operacaoAtiva.equals(operacao)){
            jLabel1.setVisible(true);
            NomeCliente.setVisible(false);
            jLabel2.setVisible(false);
            EndCliente.setVisible(false);
            jLabel3.setVisible(false);
            NumCliente.setVisible(false);
            ButtonCadastrar.setVisible(false);
            ButtonDetalhes.setVisible(false);
            jLabel4.setVisible(false);
            IDCliente.setVisible(true);
            CompCliente.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            BairroCliente.setVisible(false);
            jLabel7.setVisible(false);
            CEPCliente.setVisible(false);
            jLabel8.setVisible(false);
            CidadeCliente.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            CPFCliente.setVisible(false);
            CNPJCliente.setVisible(false);
            jLabel12.setVisible(false);
            Limpar.setVisible(false);
            Status.setVisible(false);
            UFCliente.setVisible(false);
            Data_nascimentoCliente.setVisible(false);
            jLabel13.setVisible(false);
            TelefoneCliente.setVisible(false);
            
            ButtonCadastrar.setText("Excluir");
        }
    }
    
    Cliente cliente_tela = new Cliente();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EndCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NumCliente = new javax.swing.JTextField();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonDetalhes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        IDCliente = new javax.swing.JTextField();
        CompCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BairroCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CEPCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CidadeCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CPFCliente = new javax.swing.JTextField();
        CNPJCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Limpar = new javax.swing.JButton();
        Status = new javax.swing.JCheckBox();
        UFCliente = new javax.swing.JComboBox<>();
        Data_nascimentoCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TelefoneCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        NomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço:");

        EndCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Número:");

        NumCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumClienteActionPerformed(evt);
            }
        });

        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonDetalhes.setText("Detalhes");
        ButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDetalhesActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome");

        IDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDClienteActionPerformed(evt);
            }
        });

        CompCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Complemento:");

        jLabel6.setText("Bairro:");

        BairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("CEP");

        CEPCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEPClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Cidade");

        CidadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("UF");

        jLabel10.setText("Data Nasc.");

        jLabel11.setText("CPF");

        CPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFClienteActionPerformed(evt);
            }
        });

        CNPJCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPJClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("CNPJ");

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Status.setText("Status");
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        UFCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        UFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UFClienteActionPerformed(evt);
            }
        });

        Data_nascimentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_nascimentoClienteActionPerformed(evt);
            }
        });

        jLabel13.setText("Telefone");

        TelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CompCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EndCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Data_nascimentoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDetalhes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Limpar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CPFCliente))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CEPCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(CNPJCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CidadeCliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TelefoneCliente)))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Data_nascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EndCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CompCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CEPCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(TelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(UFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(CPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(CNPJCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrar)
                    .addComponent(ButtonDetalhes)
                    .addComponent(Limpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeClienteActionPerformed

    private void EndClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndClienteActionPerformed

    private void NumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumClienteActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        System.out.println(operacaoAtivaGlobal);
        String operacao = "Incluir";
        if(operacaoAtivaGlobal.equals(operacao)){
            try{
                cliente_tela.setID_cliente(IDCliente.getText());
                cliente_tela.setNome(NomeCliente.getText());
                cliente_tela.setEndereco(EndCliente.getText());
                cliente_tela.setNumero(NumCliente.getText());
                cliente_tela.setComplemento(CompCliente.getText());
                cliente_tela.setBairro(BairroCliente.getText());
                cliente_tela.setCEP(CEPCliente.getText());
                cliente_tela.setCidade(CidadeCliente.getText());
                cliente_tela.setUF(UFCliente.getSelectedItem().toString());
                cliente_tela.setData_nascimento(Data_nascimentoCliente.getText());
                cliente_tela.setCPF(CPFCliente.getText());
                cliente_tela.setCNPJ(CNPJCliente.getText());
                cliente_tela.setStatus(Status.isSelected());
                cliente_tela.setTelefone(TelefoneCliente.getText());

                connectDAO DaoCliente = new connectDAO();
                DaoCliente.connectDB();
                DaoCliente.insereRegistroJFBD("CLIENTES", cliente_tela.dadosSQLValues());
            }catch(Exception erro){
                JOptionPane.showMessageDialog(this, erro.getMessage());
                return;
            }

            JOptionPane.showMessageDialog(this, "Cliente Cadastrada");
            this.setVisible(false);
            this.dispose();
        }
        
        operacao = "Alteração";
        if (operacaoAtivaGlobal.equals(operacao)){
            
            try{
                cliente_tela.setID_cliente(IDCliente.getText());
                cliente_tela.setNome(NomeCliente.getText());
                cliente_tela.setEndereco(EndCliente.getText());
                cliente_tela.setNumero(NumCliente.getText());
                cliente_tela.setComplemento(CompCliente.getText());
                cliente_tela.setBairro(BairroCliente.getText());
                cliente_tela.setCEP(CEPCliente.getText());
                cliente_tela.setCidade(CidadeCliente.getText());
                cliente_tela.setUF(UFCliente.getSelectedItem().toString());
                cliente_tela.setData_nascimento(Data_nascimentoCliente.getText());
                cliente_tela.setCPF(CPFCliente.getText());
                cliente_tela.setCNPJ(CNPJCliente.getText());
                cliente_tela.setStatus(Status.isSelected());
                cliente_tela.setTelefone(TelefoneCliente.getText());

                connectDAO DaoCliente = new connectDAO();
                DaoCliente.connectDB();
                DaoCliente.alteraRegistroJFBD("CLIENTES", cliente_tela.alterarDadosSQLValues(),"ID_CLI='"+cliente_tela.getID_cliente()+"'");
            }catch(Exception erro){
                JOptionPane.showMessageDialog(this, erro.getMessage());
                return;
            }

            JOptionPane.showMessageDialog(this, "Cliente Cadastrada");
            this.setVisible(false);
            this.dispose();
        }
        
        operacao = "Alterar";
        if (operacaoAtivaGlobal.equals(operacao)){
            System.out.println("pesquisar para alterar");
            connectDAO DaoCliente = new connectDAO();
            
            cliente_tela = DaoCliente.pesquisaClienteJFBD(
                    this.cliente_tela.getTabela(),
                    this.cliente_tela.pesquisaSQLValues(),
                    "ID_CLI='"+this.IDCliente.getText()+"'"
            );
            
            System.out.println("retornou, não deu erro silencioso");
            
            this.IDCliente.setText(cliente_tela.getID_cliente());
            this.NomeCliente.setText(cliente_tela.getNome());
            this.EndCliente.setText(cliente_tela.getEndereco());
            this.NumCliente.setText(cliente_tela.getNumero());
            this.CompCliente.setText(cliente_tela.getComplemento());
            this.BairroCliente.setText(cliente_tela.getBairro());
            this.CEPCliente.setText(cliente_tela.getCEP());
            this.CidadeCliente.setText(cliente_tela.getCidade());
            this.UFCliente.setSelectedItem(cliente_tela.getUF());
            this.Data_nascimentoCliente.setText(cliente_tela.getData_nascimento());
            this.CPFCliente.setText(cliente_tela.getCPF());
            this.CNPJCliente.setText(cliente_tela.getCNPJ());
            this.TelefoneCliente.setText(cliente_tela.getTelefone());

            jLabel1.setVisible(false); //Label IDCliente
            NomeCliente.setVisible(true);
            jLabel2.setVisible(true);
            EndCliente.setVisible(true);
            jLabel3.setVisible(true);
            NumCliente.setVisible(true);
            ButtonCadastrar.setVisible(true);
            ButtonDetalhes.setVisible(true);
            jLabel4.setVisible(true);
            IDCliente.setVisible(false); //Field IDCliente
            CompCliente.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            BairroCliente.setVisible(true);
            jLabel7.setVisible(true);
            CEPCliente.setVisible(true);
            jLabel8.setVisible(true);
            CidadeCliente.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            CPFCliente.setVisible(true);
            CNPJCliente.setVisible(true);
            jLabel12.setVisible(true);
            Limpar.setVisible(true);
            Status.setVisible(true);
            UFCliente.setVisible(true);
            Data_nascimentoCliente.setVisible(true);
            jLabel13.setVisible(true);
            TelefoneCliente.setVisible(true);

            ButtonCadastrar.setText("Alterar");
            operacaoAtivaGlobal = "Alteração";
        }         
                
                // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void IDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDClienteActionPerformed

    private void CompClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompClienteActionPerformed

    private void BairroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroClienteActionPerformed

    private void CEPClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEPClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEPClienteActionPerformed

    private void CidadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeClienteActionPerformed

    private void CPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFClienteActionPerformed

    private void CNPJClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPJClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNPJClienteActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        IDCliente.setText(" ");
        NomeCliente.setText(" ");
        EndCliente.setText(" ");
        NumCliente.setText(" ");
        CompCliente.setText(" ");
        BairroCliente.setText(" ");
        CEPCliente.setText(" ");
        CidadeCliente.setText(" ");
        UFCliente.setSelectedIndex(0);
        CPFCliente.setText(" ");
        CNPJCliente.setText(" ");
        Data_nascimentoCliente.setText(" ");
        TelefoneCliente.setText(" ");
        this.Status.setSelected(false);
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_LimparActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void ButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDetalhesActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ButtonDetalhesActionPerformed

    private void UFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UFClienteActionPerformed

    private void Data_nascimentoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_nascimentoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Data_nascimentoClienteActionPerformed

    private void TelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroCliente;
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonDetalhes;
    private javax.swing.JTextField CEPCliente;
    private javax.swing.JTextField CNPJCliente;
    private javax.swing.JTextField CPFCliente;
    private javax.swing.JTextField CidadeCliente;
    private javax.swing.JTextField CompCliente;
    private javax.swing.JTextField Data_nascimentoCliente;
    private javax.swing.JTextField EndCliente;
    private javax.swing.JTextField IDCliente;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField NumCliente;
    private javax.swing.JCheckBox Status;
    private javax.swing.JTextField TelefoneCliente;
    private javax.swing.JComboBox<String> UFCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
