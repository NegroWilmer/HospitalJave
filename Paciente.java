package actividad4;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private int id;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estado;

    private List<Examen> listaExamenes;
    private List<Tratamiento> listaTratamientos;

    public Paciente(int id, String nombre, int edad, String genero, String tipoCancer, String etapa, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estado = estado;
        this.listaExamenes = new ArrayList<>();
        this.listaTratamientos = new ArrayList<>();
    }

    public void agregarExamen(Examen e) {
        listaExamenes.add(e);
    }

    public void agregarTratamiento(Tratamiento t) {
        listaTratamientos.add(t);
    }

    public String getTipoCancer() {
        return tipoCancer;
    }

    public String getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nombre=" + nombre + ", tipoCancer=" + tipoCancer + ", estado=" + estado + "]";
    }
}
