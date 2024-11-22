package treino;

public class Treino {
    private String nomeExercicio;
    private int series;
    private int repeticoes;
    private int intervalo;

    public Treino(String nomeExercicio, int series, int repeticoes, int intervalo) {
        this.nomeExercicio = nomeExercicio;
        this.series = series;
        this.repeticoes = repeticoes;
        this.intervalo = intervalo;
    }
    @Override
    public String toString() {
        return "\n- Exercicio: " + nomeExercicio +
                ", Séries: " + series +
                ", Repetições: " + repeticoes +
                ", intervalo: " + intervalo + "segundos";
    }

}







