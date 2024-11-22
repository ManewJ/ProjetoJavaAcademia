package models;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private String genero;
    private String matricula;
    private String personal;


    public Aluno(String nome, String cpf, int idade, String genero, String matricula, String personal) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.matricula = matricula;
        this.personal = personal;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getPersonal() { return personal; }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                ", matricula='" + matricula + '\'' +
                ", personal='" + personal + '\'' +
                '}';

    }
}