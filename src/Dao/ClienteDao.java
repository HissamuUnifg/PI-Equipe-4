package Dao;

import Classes.Cliente;
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
            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/db_petshop","rubens","1234");
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

    public void insert(Cliente cliente){
        PreparedStatement ps = null;
        
        String query = "INSERT INTO tb_cliente (nome, sobrenome, cpf, rg, rua, numero, bairro, telefone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            ps = conexao.prepareStatement(query);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getRg());
            ps.setString(5, cliente.getRua());
            ps.setInt(6, cliente.getNumero());
            ps.setString(7, cliente.getBairro());
            ps.setString(8, cliente.getTelefone());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Cliente cliente, String cpf){
        PreparedStatement ps = null;        
        
        String query = "UPDATE tb_cliente\n"
                + "SET nome = ?, sobrenome = ?, cpf = ?, rg = ?, rua = ?, numero = ?, bairro = ?, telefone = ?\n"
                + "WHERE cpf = ?";
        
        try {
            ps = conexao.prepareStatement(query);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getRg());
            ps.setString(5, cliente.getRua());
            ps.setInt(6, cliente.getNumero());
            ps.setString(7, cliente.getBairro());
            ps.setString(8, cliente.getTelefone());
            ps.setString(9, cpf);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }                 
    }
    
    public void delete(String cpf){
            PreparedStatement ps = null;
            
            String query = "DELETE FROM tb_cliente WHERE cpf = ?";
            
        try {
            ps = conexao.prepareStatement(query);
            ps.setString(1, cpf);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
