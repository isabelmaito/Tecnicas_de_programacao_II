package Conta;

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
    private String Login;
    private String Senha;
    private String ID_cliente;

    public Usuario() {
    }
    
    
    public Usuario(String Login, String Senha, String ID_cliente) {
        if (!ValidaUsuario(Login, Senha, ID_cliente)){
            System.out.println("Erro");
        }
        this.Login = Login;
        this.Senha = Senha;
        this.ID_cliente = ID_cliente;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) throws Exception{
        if(ValidaLogin(Login)){
            this.Login = Login;
    }else{
            JOptionPane.showMessageDialog(null, "Login não pode ser vazio.");
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
    
    private boolean ValidaLogin(String Login){
        return Login != null &&
               !Login.isBlank() &&
               !Login.isEmpty();
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
    
    private boolean ValidaUsuario(String Login, String Senha, String ID_cliente){
        return ValidaLogin(Login) &&
               ValidaSenha(Senha) &&
               ValidaIDCliente(ID_cliente);
    }
}
