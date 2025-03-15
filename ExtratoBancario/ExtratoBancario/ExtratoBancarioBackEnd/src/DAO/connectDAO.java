/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package DAO;
 
import DAO.Cliente;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
 
/**
 *
 * @author Alunos
 */
public class connectDAO {
    Connection con;
    public Connection connectDB(){
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }
    
    public void insereRegistroJFBD(String tabela, String strDados){
    
        con = connectDB();
        Statement stmt;
        try{
            stmt = con.createStatement();
            
            String sql = "INSERT INTO dbo."+tabela+" VALUES ("+ strDados+")";
            JOptionPane.showMessageDialog(null, "String de Insert: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
                    
        } catch (SQLException erro){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
            
      }
}
    
    public void alteraRegistroJFBD(String tabela, String strDados, String condicao) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            
            String sql = "UPDATE dbo."+tabela+" SET "+strDados+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de update: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Alteração executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void excluiRegistroJFBD(String tabela, String condicao) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            
            String sql = "DELETE FROM dbo."+tabela+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de delete: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Exclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }
    
    public Cliente pesquisaClienteJFBD(String tabela, String select, String pesquisaID){
        Cliente clientesReturn = new Cliente();
        String tabelaSGBD = "CLIENTES";
        if (tabela.toLowerCase().equals(tabelaSGBD.toLowerCase())){
            //Fazer a pesquisa e retornar a tbaela como resultado
            con = connectDB(); //Executa o método que conecta no BD e retorna
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                //cria a string com a sentença SQL para inserir registro
                String sql = "SELECT "+select+" FROM " +tabela
                        + " WHERE "+pesquisaID;
                System.out.println(sql);
                //JOptionPane.showMessageDialog(null, "String de Select: "+sql)
                try {
                    //Executar a sentença de insert
                    //stmt = con.prepareStatement(sql);
                    //JOptionPane.showMessageDialog(null,"Vai executar a query com: "+sql);
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi "+ "encontrado para essa pesquisa");
                    }
                    else
                    {
                        SimpleDateFormat dateFormaterFromDB = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat dateFormaterToField = new SimpleDateFormat("dd/MM/yyyy");
                        
                        try {
                            clientesReturn.setID_cliente(dados.getString(1));                       
                            clientesReturn.setNome(dados.getString(2));
                            clientesReturn.setEndereco(dados.getString(3));
                            clientesReturn.setNumero(dados.getString(4));
                            clientesReturn.setComplemento(dados.getString(5));
                            clientesReturn.setBairro(dados.getString(6));
                            clientesReturn.setCidade(dados.getString(7));
                            clientesReturn.setUF(dados.getString(8));
                            clientesReturn.setCEP(dados.getString(9));
                            clientesReturn.setTelefone(dados.getString(10));
                            clientesReturn.setCPF(dados.getString(11));
                            
                            Date dateFromDB = dateFormaterFromDB.parse(dados.getString(12));
                            String formatedDate = dateFormaterToField.format(dateFromDB);
                            clientesReturn.setData_nascimento(formatedDate);
                            
                            clientesReturn.setCNPJ(dados.getString(13));
                        } catch (Exception ex) {
                            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    con.close();
                    
                    return clientesReturn; //lista;
                }catch (SQLException erro){
                    JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                    JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
                }
                con.close();
            }catch (SQLException ex){
              Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //TODO: repensar a lógica deste retorno
        return new Cliente();
    }

    
    public List<String> consultaRegistroJFBD(String tabela, String campos, String condicao) {
        con = connectDB();
        Statement stmt;
        ResultSet rs;
        List<String> lista = new ArrayList<>();
        try {
            stmt = con.createStatement();
            
            String sql = "SELECT "+campos+" FROM dbo."+tabela+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de select: "+sql);
            
            try {
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    lista.add(rs.getString(1));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
        return lista;
    }
    
}


