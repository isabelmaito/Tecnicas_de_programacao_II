package DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ExtratoMovimentacao implements BaseDAO  {
    private String tabela = "ExtratoMov";
    private String Num_conta;
    private String Num_agencia;
    private String Documento;
    private Date Data_mov;
    private String Credito_debito;
    private Integer ID_hist;
    private String ComplHist;
    private Integer Valor;
    private Integer Saldo;

    public ExtratoMovimentacao() {
    }
    
    public ExtratoMovimentacao(String Num_conta, String Num_agencia, String Documento, Date Data_mov, String Credito_debito, Integer ID_hist,String ComplHist, Integer Valor, Integer Saldo) {
        if (!ValidaExtratoMovimentacao(Num_conta, Num_agencia, Documento, Data_mov, Credito_debito, ID_hist, ComplHist, Valor, Saldo)){
            System.out.println("Erro");
        }
        this.Num_conta = Num_conta;
        this.Num_agencia = Num_agencia;
        this.Documento = Documento;
        this.Data_mov = Data_mov;
        this.Credito_debito = Credito_debito;
        this.ID_hist = ID_hist;
        this.ComplHist = ComplHist;
        this.Valor = Valor;
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
            JOptionPane.showMessageDialog(null, "Agencia não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) throws Exception{
        if(ValidaDocumento(Documento)){
           this.Documento = Documento;
    }else{
            JOptionPane.showMessageDialog(null, "Documento não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public Date getData_mov() {
        return Data_mov;
    }

    public void setData_mov(Date Data_mov) throws Exception{
        if(ValidaDataMov(Data_mov)){
           this.Data_mov = Data_mov;
    }else{
            JOptionPane.showMessageDialog(null, "Data precisa ter 8 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getCredito_debito() {
        return Credito_debito;
    }

    public void setCredito_debito(String Credito_debito) throws Exception{
        if(ValidaCredito_debito(Credito_debito)){
          this.Credito_debito = Credito_debito;
    }else{
            JOptionPane.showMessageDialog(null, "Credito não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public Integer getID_hist() {
        return ID_hist;
    }

    public void setID_hist(Integer ID_hist) throws Exception{
        if(ValidaIDHist(ID_hist)){
          this.ID_hist = ID_hist;
    }else{
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    } 
    
    public String getComplHist() {
        return ComplHist;
    }

    public void setComplHist(String ComplHist)  throws Exception{
        if (ValidaComplHist(ComplHist)) {
            this.ComplHist = ComplHist;
    }else{
            JOptionPane.showMessageDialog(null, "Complemento Histórico não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(Integer Valor) throws Exception{
        if (ValidaValor(Valor)) {
            this.Valor = Valor;
        }else{
            JOptionPane.showMessageDialog(null, "Valor não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(Integer Saldo) throws Exception{
        if (ValidaSaldo(Saldo)) {
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
               !Num_agencia.isEmpty();
    }

    private boolean ValidaDocumento(String Documento){
            return Documento != null &&
               !Documento.isBlank() &&
               !Documento.isEmpty();
    }
    
    private boolean ValidaDataMov(Date Data_mov){
            return Data_mov != null;
    }
    
    private boolean ValidaCredito_debito(String Credito_debito){
            return Credito_debito != null &&
               (Credito_debito.equalsIgnoreCase("C") || 
               Credito_debito.equalsIgnoreCase("D")); 
    }
    
  
    private boolean ValidaIDHist(Integer ID_hist){
            return ID_hist != null;
    }

    private boolean ValidaComplHist(String ComplHist){
            return ComplHist != null;
    }
    
    private boolean ValidaValor(Integer Valor) {
            return Valor >= 0;
    }
    
    private boolean ValidaSaldo(Integer Saldo) {
            return Saldo != null;
    }
    
    private boolean ValidaExtratoMovimentacao(String Num_conta, String Num_agencia, String Documento, Date Data_mov, String Credito_debito, Integer ID_hist, String ComplHist1, Integer Valor1, Integer Saldo1){
        return ValidaNumConta(Num_conta) &&
               ValidaNum_agencia(Num_agencia) &&
               ValidaDocumento(Documento) &&
               ValidaDataMov(Data_mov) &&
               ValidaCredito_debito(Credito_debito) &&
               ValidaIDHist(ID_hist) &&
               ValidaComplHist(ComplHist) &&
               ValidaValor(Valor) &&
               ValidaSaldo(Saldo);
    }
    
    @Override
    public String getTabela(){
        return this.tabela;
    }
    
    public String dadosSQLValues(){
        String dadosExtratos;
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataMovimento = dateFormater.format(this.getData_mov());
        dadosExtratos = "'"
                + this.getNum_agencia() + "','"                
                + this.getNum_conta() + "','"
                + dataMovimento + "','"                
                + this.getDocumento() + "','"
                + this.getCredito_debito() + "','"
                + this.getID_hist() + "','"
                + this.getComplHist() + "', "
                + this.getValor() + ", "
                + this.getSaldo();
                        
        return dadosExtratos;
    }
    
    public String alterarDadosSQLValues(){
        String dadosExtratos;
        
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataMovimento = dateFormater.format(this.getData_mov());
        
        dadosExtratos = "NUM_AGE='"
                + this.getNum_agencia() + "',NUM_CC='"
                + this.getNum_conta() + "',DATA_MOV='"
                + dataMovimento + "',NUM_DOCTO='"
                + this.getDocumento() + "',DEBITO_CREDITO='"
                + this.getCredito_debito() + "',ID_HIS='"
                + this.getID_hist() + "',COMPL_HIS='"
                + this.getComplHist() + "',VALOR='"
                + this.getValor() + "',SALDO='"
                + this.getSaldo() + "'";
        
        return dadosExtratos;
    }

    public void importaSQLValues (List<String> dadosSQL){
        try{
            SimpleDateFormat dateFormatFromDB = new SimpleDateFormat("yyyy-MM-dd");
            
            this.setNum_agencia(dadosSQL.get(0));
            this.setNum_conta(dadosSQL.get(1));
            this.setID_hist(Integer.parseInt(dadosSQL.get(2)));
            this.setDocumento(dadosSQL.get(3));	
            this.setData_mov(dateFormatFromDB.parse(dadosSQL.get(4)));	
            this.setCredito_debito(dadosSQL.get(5));	
            this.setComplHist(dadosSQL.get(6));	
            this.setValor(Integer.parseInt(dadosSQL.get(7)));	
            this.setSaldo(Integer.parseInt(dadosSQL.get(8)));
            
        } catch (Exception ex) {
            
            Logger.getLogger(ContaCorrente.class.getName()).log(Level.SEVERE, null, ex);

        }
                
        
        
        
    }
    @Override
    public String pesquisaSQLValues() {
        return "NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO";
    }
}
