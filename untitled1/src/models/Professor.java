package models;

public class Professor extends Pessoa {
    private String especialidade;

    public Professor(String nome, String cpf, int idade, String genero, String endereco, String matricula, String especialidade) {
        super(nome, cpf, idade, genero, endereco, matricula);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade;
    }
}
