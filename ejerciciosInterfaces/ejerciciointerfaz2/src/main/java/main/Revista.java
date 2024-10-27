package main;

class Revista {
    private String codigo;
    private String titulo;
    private int anioPublicacion;
    private int numero;

    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de Publicación: " + anioPublicacion + ", Número: " + numero;
    }
}