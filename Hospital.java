package actividad4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Paciente> listaPacientes;

    public Hospital() {
        listaPacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        listaPacientes.add(p);
    }

    public void agregarExamen(Paciente p, Examen e) {
        p.agregarExamen(e);
    }

    public void agregarTratamiento(Paciente p, Tratamiento t) {
        p.agregarTratamiento(t);
    }

    public void contarPacientesPorTipoCancer() {
        int sarcoma = 0, leucemia = 0, linfoma = 0;

        for (Paciente p : listaPacientes) {
            switch (p.getTipoCancer().toLowerCase()) {
                case "sarcoma":
                    sarcoma++;
                    break;
                case "leucemia":
                    leucemia++;
                    break;
                case "linfoma":
                    linfoma++;
                    break;
            }
        }

        System.out.println("Sarcoma: " + sarcoma);
        System.out.println("Leucemia: " + leucemia);
        System.out.println("Linfoma: " + linfoma);
    }

    public void porcentajePorEstado() {
        int tratamiento = 0, remision = 0, fallecido = 0;

        for (Paciente p : listaPacientes) {
            switch (p.getEstado().toLowerCase()) {
                case "en tratamiento":
                    tratamiento++;
                    break;
                case "remision":
                    remision++;
                    break;
                case "fallecido":
                    fallecido++;
                    break;
            }
        }

        int total = listaPacientes.size();

        System.out.println("En tratamiento: " + (tratamiento * 100.0 / total) + "%");
        System.out.println("Remisión: " + (remision * 100.0 / total) + "%");
        System.out.println("Fallecido: " + (fallecido * 100.0 / total) + "%");
    }

    
    public Paciente buscarPaciente(int id) {
        for (Paciente p : listaPacientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void mostrarPaciente(int id) {
        Paciente p = buscarPaciente(id);

        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Paciente no encontrado");
        }
    }
}
