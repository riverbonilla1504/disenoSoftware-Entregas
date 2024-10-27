package main;

class Libro implements Prestable {
    private String codigo;
    private String titulo;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro " + titulo + " ha sido devuelto.");
        } else {
            System.out.println("El libro " + titulo + " no estaba prestado.");
        }
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de Publicación: " + anioPublicacion + ", Prestado: " + (prestado ? "Sí" : "No");
    }
}