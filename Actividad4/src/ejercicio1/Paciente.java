package ejercicio1;

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

   
    public void agregarExamen(Examen examen) {
        this.listaExamenes.add(examen);
    }

  
    public void agregarTratamiento(Tratamiento tratamiento) {
        this.listaTratamientos.add(tratamiento);
    }

    public String getTipoCancer() {
        return tipoCancer;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Paciente [" +
               "ID=" + id + 
               ", Nombre='" + nombre + '\'' + 
               ", Edad=" + edad + 
               ", Género='" + genero + '\'' + 
               ", Tipo de Cáncer='" + tipoCancer + '\'' + 
               ", Etapa='" + etapa + '\'' + 
               ", Estado='" + estado + '\'' + 
               ']';
    }
}