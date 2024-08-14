

//Implementando a classe livro
public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, String codigo, int ano, String autor) {
        super(titulo, codigo, ano);
        this.autor = autor;
    }

    // Getter e Setter para o atributo "autor"
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Sobreposição do método toString()
    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}