public class Cliente {
    /*mysql> describe tb_cliente;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| nome      | varchar(30) | YES  |     | NULL    |       |
| sobrenome | varchar(30) | YES  |     | NULL    |       |
| cpf       | varchar(14) | NO   | PRI | NULL    |       |
| rg        | varchar(13) | YES  |     | NULL    |       |
| rua       | varchar(99) | YES  |     | NULL    |       |
| numero    | int         | YES  |     | NULL    |       |
| bairro    | varchar(99) | YES  |     | NULL    |       |
| telefone  | varchar(30) | YES  |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+*/
    
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private String rua;
    private int numero;
    private String bairro;
    private String telefone;

    public Cliente(String nome, String sobrenome, String cpf, String rg, String rua, int numero, String bairro, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    
    
}
