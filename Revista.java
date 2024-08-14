

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, String codigo, int ano, int edicao) {
        super(titulo, codigo, ano);
        this.edicao = edicao;
    }

    // Getter e Setter para o atributo "edicao"
    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    // Sobreposição do método toString()
    @Override
    public String toString() {
        return super.toString() + ", Edição: " + edicao;
    }
}