package DAO;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class Usuario {
    private String tabela = "usuarios";
    private String ID_cliente; 
    private String Senha;
    private String Num_agencia;
    private String Num_conta;


    public Usuario() {
    }
    
    
    public Usuario(String Senha, String ID_cliente, String Num_agencia, String Num_conta) {
        if (!ValidaUsuario(Senha, ID_cliente, Num_agencia, Num_conta)){
            System.out.println("Erro");
        }
        this.Num_agencia = Num_agencia;
        this.Num_conta = Num_conta;
        this.Senha = Senha;
        this.ID_cliente = ID_cliente;
    }

    public String getNum_conta() {
        return Num_conta;
    }

    public void setNum_conta(String Num_conta) throws Exception{
        if(ValidaNum_conta(Num_conta)){
            this.Num_conta = Num_conta;
    }else{
            JOptionPane.showMessageDialog(null, "Numero da Conta não pode ser vazio.");
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
            JOptionPane.showMessageDialog(null, "Numero da Agencia não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
}

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) throws Exception{
        if(ValidaSenha(Senha)){
            this.Senha = Senha;
    }else{
            JOptionPane.showMessageDialog(null, "Senha não pode ser vazio.");
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
    
    private boolean ValidaNum_conta(String Num_conta){
        return Num_conta != null &&
               !Num_conta.isBlank() &&
               !Num_conta.isEmpty();
    }
    
    private boolean ValidaNum_agencia(String Num_agencia){
        return Num_agencia != null &&
               !Num_agencia.isBlank() &&
               !Num_agencia.isEmpty();
    }
    
    private boolean ValidaSenha(String Senha){
        return Senha != null &&
               !Senha.isBlank() &&
               !Senha.isEmpty();
    }
    
    private boolean ValidaIDCliente(String ID_cliente){
        return ID_cliente != null &&
               !ID_cliente.isBlank() &&
               !ID_cliente.isEmpty();
    }
    
    private boolean ValidaUsuario(String Senha, String ID_cliente, String Num_agencia, String Num_conta){
        return ValidaNum_conta(Num_conta) &&
               ValidaNum_agencia(Num_agencia) &&
               ValidaSenha(Senha) &&
               ValidaIDCliente(ID_cliente);
    }
    
        public String dadosSQLValues(){
        String dadosUsuarios;
        dadosUsuarios = "'"
                + this.getID_cliente() + "','"
                + this.getSenha() + "','"           
                + this.getNum_agencia() + "','"
                + this.getNum_conta() + "'";
        
        return dadosUsuarios;
    }
}
