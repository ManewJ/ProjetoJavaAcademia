package models;

public class Personal extends Pessoa {
    private int CREF;

    public Personal(String nome, String cpf, int idade, String genero, String endereco, String matricula, int CREF) {
        super(nome, cpf, idade, genero, endereco, matricula, CREF);
        this.CREF = CREF;


    }

    public int getCREF() {
        return CREF;
    }

    public void setCREF(int CREF) {
        this.CREF = CREF;
    }

    @Override
    public String toString() {
        return super.toString() + ", CREF: " + CREF;
    }
}
