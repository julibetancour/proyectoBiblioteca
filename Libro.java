package proyecto_biblioteca;

class Libro {
    private String titulo;
    private String autor;
    private int numero;
    private String editorial;
    private int anoPublicacion;
    private double precio;


    public Libro(String titulo, String autor, int numero, String editorial, int anoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero = numero;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.precio = precio;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero=" + numero +
                ", editorial='" + editorial + '\'' +
                ", añoPublicacion=" + anoPublicacion +
                ", precio=" + precio +
                '}';
    }
}


