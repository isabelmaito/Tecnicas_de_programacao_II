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
public class Historico {
    private String tabela = "Historico";
    private Integer ID_historico;
    private String Historico;

 public Historico() {
    }   
    
    public Historico(Integer ID_historico, String Historico) {
        if (!ValidaHistorico(ID_historico, Historico)){
            System.out.println("Erro");
        }
        this.ID_historico = ID_historico;
        this.Historico = Historico;
    }

    public int getID_historico() {
        return ID_historico;
    }

    public void setID_historico(Integer ID_historico) throws Exception{
        if(ValidaIDHistorico(ID_historico)){
            this.ID_historico = ID_historico;
    }else{
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
        
    public String getHistorico() {
        return Historico;
    }

    public void setHistorico(String Historico) throws Exception{
        if(ValidaHist(Historico)){
            this.Historico = Historico;
    }else{
            JOptionPane.showMessageDialog(null, "Historico não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    private boolean ValidaIDHistorico(Integer ID_historico){
        return ID_historico != null;
    }
    
    private boolean ValidaHist (String Historico){
        return Historico != null &&
               !Historico.isBlank() &&
               !Historico.isEmpty();
    }
    
    private boolean ValidaHistorico(Integer ID_historico, String Historico){
        return ValidaIDHistorico(ID_historico) &&
               ValidaHist(Historico);
    }
    
    public String dadosSQLValues(){
        String dadosHistoricos;
        dadosHistoricos = "'"
                + this.getID_historico() + "','"
                + this.getHistorico() + "'";
        
        return dadosHistoricos;
    }
}
