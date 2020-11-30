package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDao {
    private Connection conexao;

    public FuncionarioDao(){
        
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste","rubens","1234");
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public boolean login (String cpf, String senha){
        ResultSet rs = null;
        PreparedStatement ps = null;

        String query = "SELECT * FROM funcionarios WHERE nome = ?";
        
        try{
        ps = conexao.prepareStatement(query);
        ps.setString(1, cpf);        
        rs = ps.executeQuery();
        
        String cpfFromDb = null, senhaFromDb = null;
        if ( rs.next() ){
            cpfFromDb = rs.getString("cpf"); // a string nome se refere ao nome da coluna
            senhaFromDb = rs.getString("senha");
            if(cpf.equals(cpfFromDb) && senha.equals(senhaFromDb)){
                System.out.println("Login feito com sucesso!");
                return true;
            } else{
                System.out.println("Usuario ou senha incorreto!");
                return false;
            }            
        }else{
            System.out.println("Usuario nao cadastrado.");
            return false;
        }     
                
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;  
    }
}