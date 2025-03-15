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
public class Agencia {
    private String tabela = "agencias";
    private String Num_Agencia;
    private String Nome;
    private String Endereco;
    private String Numero;
    private String Complemento;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String CEP;
    private String CNPJ;
    private String Gerente;

    public Agencia() {
    }
    
    

    public Agencia(String Num_Agencia, String Nome, String Endereco, String Numero, String Complemento, String Bairro, String Cidade, String UF, String CEP, String CNPJ, String Gerente) {
        if (!ValidaAgencia(Num_Agencia, Nome, Endereco, Numero, Complemento, Bairro, Cidade, UF, CEP, CNPJ, Gerente)){
            System.out.println("Erro");
        }
        this.Num_Agencia = Num_Agencia;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.CNPJ = CNPJ;
        this.Gerente = Gerente;
    }

    public String getNum_Agencia() {
        return Num_Agencia;
    }

    public void setNum_Agencia(String Num_Agencia) throws Exception{
        if(ValidaNumAgencia(Num_Agencia)){
          this.Num_Agencia = Num_Agencia;    
        }else{
            JOptionPane.showMessageDialog(null, "Numero Agencia precisa ter 5 digitos.");
            throw new Exception("Dados invalidos");
        }        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) throws Exception{
        if(ValidaNome(Nome)){
          this.Nome = Nome;
    }else{
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) throws Exception {
        if(ValidaEndereco(Endereco)){
           this.Endereco = Endereco;
    }else{
            JOptionPane.showMessageDialog(null, "Endereco não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) throws Exception {
        if(ValidaNumero(Numero)){
           this.Numero = Numero;
    }else{
            JOptionPane.showMessageDialog(null, "Numero não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
         
    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) throws Exception{
        if(ValidaComplemento(Complemento)){
           this.Complemento = Complemento;
    }else{
            JOptionPane.showMessageDialog(null, "Complemento não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) throws Exception {
       if(ValidaBairro(Bairro)){
         this.Bairro = Bairro;
    }else{
           JOptionPane.showMessageDialog(null, "Bairro não pode ser vazio.");
           throw new Exception("Dados invalidos");
       }
    }
    
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) throws Exception{
        if(ValidaCidade(Cidade)){
          this.Cidade = Cidade;
    }else{
            JOptionPane.showMessageDialog(null, "Cidade não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) throws Exception{
        if(ValidaUF(UF)){
          this.UF = UF;
    }else{
            JOptionPane.showMessageDialog(null, "UF não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) throws Exception{
        if(ValidaCEP(CEP)){
           this.CEP = CEP;
    }else{
            JOptionPane.showMessageDialog(null, "CEP precisa ter 8 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) throws Exception {
        if(ValidaCNPJ(CNPJ)){
           this.CNPJ = CNPJ;
    }else{
            JOptionPane.showMessageDialog(null, "CNPJ precisa ter 14 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String Gerente) throws Exception{
        if(ValidaGerente(Gerente)){
          this.Gerente = Gerente;
    }else{
            JOptionPane.showMessageDialog(null, "Gerente não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    private boolean ValidaNumAgencia(String Num_Agencia){
        return Num_Agencia != null &&
               !Num_Agencia.isBlank() &&
               !Num_Agencia.isEmpty() &&
               Num_Agencia.length() == 5;
    }
    
    private boolean ValidaNome(String Nome){
        return Nome != null &&
               !Nome.isBlank() &&
               !Nome.isEmpty();
    }
    
    private boolean ValidaEndereco(String Endereco){
        return Endereco != null &&
               !Endereco.isBlank() &&
               !Endereco.isEmpty();
    }
    
     private boolean ValidaNumero(String Numero){
        return Numero != null &&
               !Numero.isBlank() &&
               !Numero.isEmpty();
     }
    
    private boolean ValidaComplemento(String Complemento){
        return Complemento != null &&
               !Complemento.isBlank() &&
               !Complemento.isEmpty();
    }
    
    private boolean ValidaBairro(String Bairro){
        return Bairro != null &&
               !Bairro.isBlank() &&
               !Bairro.isEmpty();
    }
   
    private boolean ValidaCidade(String Cidade){
        return Cidade != null &&
               !Cidade.isBlank() &&
               !Cidade.isEmpty();
    }
    
    private boolean ValidaUF(String UF){
        return UF != null &&
               !UF.isBlank() &&
               !UF.isEmpty() &&
               UF.length() == 2;
    }
    
    private boolean ValidaCEP(String CEP){
        return CEP != null &&
               !CEP.isBlank() &&
               !CEP.isEmpty() &&
               CEP.length() == 8;
    }
    
    private boolean ValidaCNPJ(String CNPJ){
        return CNPJ != null &&
               !CNPJ.isBlank() &&
               !CNPJ.isEmpty() &&
               CNPJ.length() ==14;
    }
    
    private boolean ValidaGerente(String Gerente){
        return Gerente != null &&
               !Gerente.isBlank() &&
               !Gerente.isEmpty();
    }
    
    private boolean ValidaAgencia(String Num_Agencia, String Nome, String Endereco, String Numero, String Complemento, String Bairro, String Cidade, String UF, String CEP, String CNPJ, String Gerente){
        return ValidaNumAgencia(Num_Agencia) &&
               ValidaNome(Nome) &&
               ValidaEndereco(Endereco) &&
               ValidaNumero(Numero) &&
               ValidaComplemento(Complemento) &&
               ValidaBairro(Bairro) &&
               ValidaCidade(Cidade) &&
               ValidaUF(UF) &&
               ValidaCEP(CEP) &&
               ValidaCNPJ(CNPJ) &&
               ValidaGerente(Gerente);
    }
    
} 
