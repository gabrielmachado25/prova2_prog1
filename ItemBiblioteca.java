
//Implementando a classe "ItemBiblioteca" com os atributos solicitados

public class ItemBiblioteca {
    private String titulo;
    private String codigo;
    private int ano;
    private boolean emprestado;

    public ItemBiblioteca(String titulo, String codigo, int ano) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.ano = ano;
        this.emprestado = false; // Inicialmente não emprestado
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

        //Emprestado
    public boolean isEmprestado() {
        return emprestado;
    }

    public void alternarStatusEmprestado() {
        emprestado = !emprestado;
    }

    // Sobreposição do método toString()
    @Override
    public String toString() {
        return "Título: " + titulo + ", Código: " + codigo + ", Ano: " + ano + ", Emprestado: " + emprestado;
    }
}