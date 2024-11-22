package treino;

import models.Aluno;
import java.util.ArrayList;
import java.util.List;

public class FichaTreino {
    private Aluno aluno;
    private List<Treino> treinos;

    public FichaTreino(Aluno aluno) {
        this.aluno = aluno;
        this.treinos = new ArrayList<>();
    }

    public void adicionarTreino(Treino treino) {
        treinos.add(treino);
    }


    @Override
    public String toString() {
        return "Ficha de Treino do Aluno: " + aluno.getNome() + "\n" +
                "Treinos: " + treinos;
    }

    public Aluno getAluno() {

        return aluno;
    }

}


