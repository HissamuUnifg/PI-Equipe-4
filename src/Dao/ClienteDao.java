package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDao {
    private Connection conexao;
    
    public ClienteDao(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste","rubens","1234");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet selectAll(){
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        String query = "SELECT * FROM tb_cliente";
        
        try {
            ps = conexao.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
        
    }

    public void insert(String nome, String sobrenome, String cpf, String rg, String rua, int numero, String bairro, String telefone){
        PreparedStatement ps = null;
        
        String query = "INSERT INTO funcionarios (nome, sobrenome, cpf, rg, rua, numero, bairro, telefone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(query);
            ps.setString(1, nome);
            ps.setString(2, sobrenome);
            ps.setString(3, cpf);
            ps.setString(4, rg);
            ps.setString(5, rua);
            ps.setInt(6, numero);
            ps.setString(7, bairro);
            ps.setString(8, telefone);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
