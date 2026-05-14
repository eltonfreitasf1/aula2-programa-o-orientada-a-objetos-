package wifrei;

public abstract class Midia {

    protected String titulo;
    protected int duracaoEmMinutos;

    public Midia(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

    public abstract double calcularCusto();
}