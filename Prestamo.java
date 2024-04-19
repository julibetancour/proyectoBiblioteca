package proyecto_biblioteca;

class Prestamo {
    private String tituloLibro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String nombreUsuario;


    public Prestamo(String tituloLibro, String fechaPrestamo, String fechaDevolucion, String nombreUsuario) {
        this.tituloLibro = tituloLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.nombreUsuario = nombreUsuario;
    }



    @Override
    public String toString() {
        return "Prestamo{" +
                "tituloLibro='" + tituloLibro + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
