package DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Alunos
 */
public class Cliente  implements BaseDAO {
    private String tabela = "clientes";
    private String ID_cliente;
    private String Nome;
    private String Endereco; 
    private String Numero;
    private String Complemento;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String CEP;    
    private String Telefone;    
    private String CPF;
    private Date Data_nascimento;
    private String CNPJ; 
    private boolean Status;

    public Cliente() {
    }

    public Cliente(String ID_cliente, String Nome, String CPF, String Endereco, String Numero, String Complemento, String Bairro, String Cidade, String UF, String CEP, Date Data_nascimento, String Telefone, String CNPJ, boolean Status) {
        if (!ValidaCliente(ID_cliente, Nome, CPF, Endereco, Numero, Complemento, Bairro, Cidade, UF, CEP, Data_nascimento, Telefone, CNPJ, Status)){
            System.out.println("Erro");
        }
        this.ID_cliente = ID_cliente;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.UF = UF;
        this.CEP = CEP;
        this.Data_nascimento = Data_nascimento;
        this.Telefone = Telefone;
        this.CNPJ = CNPJ;
        this.Status = Status;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) throws Exception {
        if (ValidaIDCliente(ID_cliente)){
           this.ID_cliente = ID_cliente;   
        }else{
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }         
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) throws Exception {
        if (ValidaNome (Nome)){
           this.Nome = Nome;
        }else{
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) throws Exception{
        if (ValidaCPF (CPF)){
            this.CPF = CPF;
        }else{
            JOptionPane.showMessageDialog(null, "CPF precisa ter 11 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) throws Exception{
        if (ValidaEndereco(Endereco)){
           this.Endereco = Endereco;
        }else{
            JOptionPane.showMessageDialog(null, "Endereço não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }    
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) throws Exception{
        if (ValidaNumero(Numero)){
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
        if (ValidaComplemento(Complemento)){
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
        if (ValidaBairro(Bairro)){
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
        if (ValidaCidade(Cidade)){
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
        if (ValidaUF(UF)){
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
        if (ValidaCEP(CEP)){
        this.CEP = CEP;
        }else{
            JOptionPane.showMessageDialog(null, "CEP precisa ter 8 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }

    public Date getData_nascimento() {
        return Data_nascimento;
    }

    public void setData_nascimento(Date Data_nascimento) throws Exception{
        if (ValidaData_nascimento(Data_nascimento)){
        this.Data_nascimento = Data_nascimento;
        }else{
            JOptionPane.showMessageDialog(null, "Data de Nascimento não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) throws Exception{
        if (ValidaTelefone(Telefone)){
            this.Telefone = Telefone;
        }else{
            JOptionPane.showMessageDialog(null, "Telefone não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) throws Exception{
        if (ValidaCNPJ(CNPJ)){
            this.CNPJ = CNPJ;
        }else{
            JOptionPane.showMessageDialog(null, "CNPJ precisa ter 14 dígitos");
            throw new Exception("Dados invalidos");
        }
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    
    @Override
    public String getTabela() {
        return tabela;
    }
    
    private boolean ValidaIDCliente(String ID_cliente){
        return ID_cliente != null &&
               !ID_cliente.isBlank() &&
               !ID_cliente.isEmpty();
    }
    
    private boolean ValidaCPF(String CPF){
        return CPF == null ||
               !CPF.isBlank() ||
               !CPF.isEmpty() ||
               CPF.length() == 11;
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
        return Complemento == null ||
               !Complemento.isBlank() ||
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
    
    private boolean ValidaData_nascimento(Date Data_nascimento){
        return Data_nascimento != null;
    }
    
    private boolean ValidaTelefone(String Telefone){
        return Telefone != null &&
               !Telefone.isBlank() &&
               !Telefone.isEmpty();
    }
    
    
    private boolean ValidaCNPJ(String CNPJ){
        return CNPJ == null ||
               CNPJ.isBlank() ||
               CNPJ.isEmpty() ||
               CNPJ.length() ==14;
    }
    
    private boolean ValidaStatus(Boolean Status){
        return Status != null;
    }
    
    private boolean ValidaCliente(String ID_cliente, String Nome, String CPF, String Endereco, String Numero, String Complemento, String Bairro, String Cidade, String UF, String CEP, Date Data_nascimento, String Telefone, String CNPJ, boolean Status){
        return ValidaIDCliente(ID_cliente) &&
               ValidaNome(Nome) &&
               ValidaCPF(CPF) &&
               ValidaEndereco(Endereco) &&
               ValidaNumero(Numero) &&
               ValidaComplemento(Complemento) &&
               ValidaBairro(Bairro) &&
               ValidaCidade(Cidade) &&
               ValidaUF(UF) &&
               ValidaCEP(CEP) &&
               ValidaData_nascimento(Data_nascimento) &&
               ValidaTelefone(Telefone) &&
               ValidaCNPJ(CNPJ) &&
               ValidaStatus(Status);
    }

    public String dadosSQLValues(){
        String dadosClientes;
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataNascimento = dateFormater.format(this.getData_nascimento());
        dadosClientes = "'"
                + this.getID_cliente() + "','"
                + this.getNome() + "','"
                + this.getEndereco() + "','"
                + this.getNumero() + "','"                
                + this.getComplemento() + "','"
                + this.getBairro() + "','"
                + this.getCidade() + "','"
                + this.getUF() + "','"
                + this.getCEP() + "','"
                + this.getTelefone() + "','"
                + this.getCPF() + "','"                    
                + dataNascimento + "','"
                + this.getCNPJ() + "'";   
        
        return dadosClientes;
    }
    
    public String alterarDadosSQLValues(){
        String dadosClientes;
        
        SimpleDateFormat dateFormaterToDb = new SimpleDateFormat("dd/MM/yyyy");
        String dataNascimentoFormatada = dateFormaterToDb.format(this.getData_nascimento());
        
        dadosClientes = "NOME_CLI='"
                + this.getNome() + "',ENDE_CLI='"
                + this.getEndereco() + "',NUME_CLI='"
                + this.getNumero() + "',COMPL_CLI='"                
                + this.getComplemento() + "',BAIR_CLI='"
                + this.getBairro() + "',CIDA_CLI='"
                + this.getCidade() + "',UF_CLI='"
                + this.getUF() + "',CEP_CLI='"
                + this.getCEP() + "',FONE_CLI='"
                + this.getTelefone() + "',CPF_CLI='"
                + this.getCPF() + "',DATA_NASC='"                    
                + dataNascimentoFormatada + "',CNPJ_CLI='"
                + this.getCNPJ() + "'";   
        
        return dadosClientes;
    }
    
    public void importaSQLValues(List<String> dadosSQL) {
        try {
            this.setID_cliente(dadosSQL.get(0));
            this.setNome(dadosSQL.get(1));
            this.setEndereco(dadosSQL.get(2));
            this.setNumero(dadosSQL.get(3));
            this.setComplemento(dadosSQL.get(4));
            this.setBairro(dadosSQL.get(5));
            this.setCidade(dadosSQL.get(6));
            this.setUF(dadosSQL.get(7));
            this.setCEP(dadosSQL.get(8));
            this.setTelefone(dadosSQL.get(9));
            this.setCPF(dadosSQL.get(10));
            
            String dataSQL = dadosSQL.get(11);
            SimpleDateFormat dateFormaterFromDB = new SimpleDateFormat("yyyy-MM-dd");
            Date dataFormatada = dateFormaterFromDB.parse(dataSQL);
            this.setData_nascimento(dataFormatada);
            
            this.setCNPJ(dadosSQL.get(12));
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    
    @Override
    public String pesquisaSQLValues() {
        return "ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI";
    }
    
}
