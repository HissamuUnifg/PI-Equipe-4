
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
    
        //daqui pra baixo a classe não foi editada direito, copiado de outro exemplo
        
    public ResultSet selectAll(){
        ResultSet rs = null;
        PreparedStatement ps = null;

        String query = "SELECT * FROM funcionarios";

        try {
            ps = conexao.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    
    }
    
    public void insert(String nome, String sobrenome, int salario, String cargo){
        PreparedStatement ps = null;
        
        String query = "INSERT INTO funcionarios (nome, sobrenome, salario, cargo) VALUES (?, ?, ?, ?)";
        
        try{
            ps = conexao.prepareStatement(query);
        ps.setString(1, nome);
        ps.setString(2, sobrenome);
        ps.setInt(3, salario);
        ps.setString(4, cargo);
        ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}