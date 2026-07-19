package br.com.dfcodelab.sistemabiblioteca;

public class Livro extends ItemBiblioteca{
    private String autor;
    private int quantidadaPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int quantidadePaginas) {
        super(titulo, anoPublicacao);
        if (autor == null || autor.trim().isEmpty()){
            throw new BibliotecaException("Autor do livro não pode ser vazio.");
        }
        if (quantidadePaginas <= 0){
          throw new BibliotecaException("Quantidade de paginas deve ser maior que 0 .");
        }
        this.autor = autor;
        this.quantidadaPaginas = quantidadePaginas;

    }







    @Override
    public void exibirResumo(){
        System.out.println("Tipo: Livro | Título: "+ getTitulo() + " | Autor: " + autor +" | Código: " +
                codigo );
    }

    public boolean isLivroGrande(){
        return quantidadaPaginas > 300;
    }
}
