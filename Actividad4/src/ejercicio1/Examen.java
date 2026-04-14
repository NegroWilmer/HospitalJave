package ejercicio1;

import java.time.LocalDate;

public class Examen {

    private int id;
    private LocalDate fecha;
    private String tipo;
    private String resultado;

    public Examen(int id, LocalDate fecha, String tipo, String resultado) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Examen [id=" + id + ", fecha=" + fecha + ", tipo=" + tipo + ", resultado=" + resultado + "]";
    }
}