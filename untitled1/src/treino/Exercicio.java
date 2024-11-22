package treino;

public class Exercicio {
    private String nome;
    private int series;
    private int repeticoes;
    private int intervalo;

    public Exercicio(String nome, int series, int repeticoes, int intervalo) {
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.intervalo = intervalo;
    }

    public String getNome() {
        return nome;
    }

    public int getSeries() {
        return series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public int getIntervalo() {
        return intervalo;
    }

    @Override
    public String toString() {
        return nome + ": " + series + " séries de " + repeticoes + " repetições, Intervalo: " + intervalo + "s";
    }

}
