package filmes;

public class Filme {
    //Atributos
    String titulo;
    String genero;
    int anoLancamento;
    int duracao;

    //Ingresso
    int qtdIngresso;
    double valorIngresso;

    @Override
    public String toString() {
        return
                "\ntitulo: " + titulo +
                "\ngenero: " + genero +
                "\nAno de Lancamento: " + anoLancamento +
                "\nduracao: " + duracao +
                "\nQuantidade de Ingresso: " + qtdIngresso +
                "\nValor do Ingresso: " + valorIngresso;
    }
}
