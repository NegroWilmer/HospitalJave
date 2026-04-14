package ejercicio1;

public class Tratamiento {

    private int id;
    private String nombre;
    private int duracionDias;
    private String efectosSecundarios;

    public Tratamiento(int id, String nombre, int duracionDias, String efectosSecundarios) {
        this.id = id;
        this.nombre = nombre;
        this.duracionDias = duracionDias;
        this.efectosSecundarios = efectosSecundarios;
    }

    public double calcularEficacia(String tipoCancer) {
        if (tipoCancer.equalsIgnoreCase("leucemia")) {
            return 75.0;
        } else if (tipoCancer.equalsIgnoreCase("linfoma")) {
            return 65.0;
        } else {
            return 50.0;
        }
    }

    @Override
    public String toString() {
        return "Tratamiento [nombre=" + nombre + ", duracion=" + duracionDias + " días]";
    }
}