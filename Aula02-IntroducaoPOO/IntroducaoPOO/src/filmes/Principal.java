package filmes;

public class Principal {
    public static void main(String[] args) {

        Filme homemAranha = new Filme();

        homemAranha.titulo = "Homem Aranha: Um Novo Dia ";
        homemAranha.genero = "Ação/Aventura";
        homemAranha.anoLancamento = 2026;
        homemAranha.duracao = 145;
        homemAranha.valorIngresso = 45;
        homemAranha.qtdIngresso = 5;

        Filme robinHood = new Filme();

        robinHood.titulo = "Robin Hood";
        robinHood.genero = "Ação/Aventura";
        robinHood.anoLancamento = 2006;
        robinHood.duracao = 160;
        robinHood.valorIngresso = 30;
        robinHood.qtdIngresso = 3;

        System.out.println(homemAranha.toString());
        System.out.println(robinHood.toString());
    }
}
