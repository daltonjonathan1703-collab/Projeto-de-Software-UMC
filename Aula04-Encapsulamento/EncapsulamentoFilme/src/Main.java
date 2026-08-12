import entidades.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Homem Aranha", "Ação", "Dan Slott", 115, 35,
        50);

        System.out.println("Novo filme: "  + filme.getTitulo());
        System.out.println("Valor do Filme: " + filme.getValor());

        filme.setValor(55);

        System.out.println("Valor do Filme: " + filme.getValor());
    }
}
