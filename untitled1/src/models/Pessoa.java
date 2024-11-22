package models;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String endereco;
    private String matricula;
    private int CREF;

    public Pessoa(String nome, String cpf, int idade, String genero, String endereco, String matricula, int CREF) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.endereco = endereco;
        this.matricula = matricula;
        this.CREF = CREF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCREF() { return CREF; }

    public void setCREF(int CREF) { this.CREF = CREF; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade + ", Gênero: " + genero;
    }
}
