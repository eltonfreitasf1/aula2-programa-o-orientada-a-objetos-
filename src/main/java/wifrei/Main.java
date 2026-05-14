package wifrei;


public class Main {


    public static void processarPlayer(Reproduzivel item) {
        item.darPlay();
    }

    public static void main(String[] args) {

        Filme filme = new Filme("Avatar", 125, "4K");
        Musica musica = new Musica("Imagine", 4, "John Lennon");


        filme.exibirDetalhes();
        System.out.println("Custo: R$ " + filme.calcularCusto());
        System.out.println("Duração formatada: "
                + ConversorTempo.formatarMinutos(filme.duracaoEmMinutos));

        System.out.println();

        musica.exibirDetalhes();
        System.out.println("Custo: R$ " + musica.calcularCusto());
        System.out.println("Duração formatada: "
                + ConversorTempo.formatarMinutos(musica.duracaoEmMinutos));

        System.out.println();


        processarPlayer(filme);
        processarPlayer(musica);

        System.out.println();


        filme.realizarDownload();


    }
}



