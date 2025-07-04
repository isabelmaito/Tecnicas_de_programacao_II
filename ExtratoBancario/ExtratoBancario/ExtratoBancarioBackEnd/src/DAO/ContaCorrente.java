package DAO;

import java.util.List;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class ContaCorrente implements BaseDAO  {
    private String tabela = "contacorrente";
    private String Num_conta;
    private String Num_agencia;
    private String ID_cliente;
    private Float Saldo;

    public ContaCorrente() {
    }

      
    public ContaCorrente(String Num_conta, String Num_agencia, String ID_cliente, Float Saldo) {
        if (!ValidaContaCorrente(Num_conta, Num_agencia, ID_cliente, Saldo)){
            System.out.println("Erro");
        }        
        this.Num_conta = Num_conta;
        this.Num_agencia = Num_agencia;
        this.ID_cliente = ID_cliente;
        this.Saldo = Saldo;
    }

    public String getNum_conta() {
        return Num_conta;
    }

    public void setNum_conta(String Num_conta) throws Exception{
        if(ValidaNumConta(Num_conta)){
           this.Num_conta = Num_conta;
    }else{
           JOptionPane.showMessageDialog(null, "Conta não pode ser vazio.");
           throw new Exception("Dados invalidos");
        }
    }
    
    public String getNum_agencia() {
        return Num_agencia;
    }

    public void setNum_agencia(String Num_agencia) throws Exception{
        if(ValidaNum_agencia(Num_agencia)){
           this.Num_agencia = Num_agencia;
    }else{
            JOptionPane.showMessageDialog(null, "Agencia precisa ter 5 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) throws Exception{
        if(ValidaIDCliente(ID_cliente)){
          this.ID_cliente = ID_cliente;
    }else{
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public Float getSaldo() {
        return Saldo;
    }

    public void setSaldo(Float Saldo) throws Exception{
        if(ValidaSaldo(Saldo)){
          this.Saldo = Saldo;
    }else{
            JOptionPane.showMessageDialog(null, "Saldo não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    private boolean ValidaNumConta(String Num_conta){
        return Num_conta != null &&
               !Num_conta.isBlank() &&
               !Num_conta.isEmpty();
    }
    
    private boolean ValidaNum_agencia(String Num_agencia){
        return Num_agencia != null &&
               !Num_agencia.isBlank() &&
               !Num_agencia.isEmpty() &&
               Num_agencia.length() == 5;
    }
    
    private boolean ValidaIDCliente(String ID_cliente){
        return ID_cliente != null &&
               !ID_cliente.isBlank() &&
               !ID_cliente.isEmpty();
    }
    
    private boolean ValidaSaldo(Float Saldo){
        return Saldo == null;
    }
    
    private boolean ValidaContaCorrente(String Num_conta, String Num_agencia, String ID_cliente, Float Saldo){
        return ValidaNumConta(Num_conta) &&
               ValidaNum_agencia(Num_agencia) &&
               ValidaIDCliente(ID_cliente) &&
               ValidaSaldo (Saldo);
    }
    
    
    @Override
    public String getTabela(){
        return this.tabela;
    }
    
    public String dadosSQLValues(){
        String dadosContas;
        dadosContas = "'"
                + this.getNum_agencia() + "','"                
                + this.getNum_conta() + "','"                
                + this.getID_cliente() + "','"
                + this.getSaldo() + "'";
        
        return dadosContas;
    }
    
    public String alterarDadosSQLValues() {
        String dadosContas;
        dadosContas = "NUM_AGE='"
                + this.getNum_agencia() + "',NUM_CC='"
                + this.getNum_conta() + "',ID_CLI='"
                + this.getID_cliente() + "',SALDO='"
                + this.getSaldo() + "'";
            
        return dadosContas;
    }
    
    public void importaSQLValues (List<String> dadosSQL) {
        try {
            this.setID_cliente(dadosSQL.get(0));
            this.setNum_agencia(dadosSQL.get(1));
            this.setNum_conta(dadosSQL.get(2));
            this.setSaldo(Float.valueOf(dadosSQL.get(3)));
            
        } catch (Exception ex) {
            
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    
    public String pesquisaSQLValues() {
        return "NUM_AGE, NUM_CC, ID_CLI, SALDO";
    }
    

}

