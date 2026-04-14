package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Paciente> listaPacientes;

    public Sistema() {
        this.listaPacientes = new ArrayList<>();
    }

    
    public void agregarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }


    public void agregarExamen(Paciente paciente, Examen examen) {
        paciente.agregarExamen(examen);
    }


    public void agregarTratamiento(Paciente paciente, Tratamiento tratamiento) {
        paciente.agregarTratamiento(tratamiento);
    }

    public void contarPacientesPorTipoCancer() {
        int sarcoma = 0, leucemia = 0, linfoma = 0;

        for (Paciente paciente : listaPacientes) {
        
            switch (paciente.getTipoCancer().toLowerCase()) {
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
        int tratamientoCount = 0, remision = 0, fallecido = 0;

        for (Paciente paciente : listaPacientes) {
            switch (paciente.getEstado().toLowerCase()) {
                case "en tratamiento":
                    tratamientoCount++;
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

        if (total > 0) {
            System.out.println("En tratamiento: " + (tratamientoCount * 100.0 / total) + "%");
            System.out.println("Remisión: " + (remision * 100.0 / total) + "%");
            System.out.println("Fallecido: " + (fallecido * 100.0 / total) + "%");
        } else {
            System.out.println("No hay pacientes registrados en el sistema.");
        }
    }


    public Paciente buscarPaciente(int id) {
        for (Paciente paciente : listaPacientes) {
            if (paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }

    public void mostrarPaciente(int id) {
        Paciente pacienteEncontrado = buscarPaciente(id);

        if (pacienteEncontrado != null) {
            System.out.println(pacienteEncontrado);
        } else {
            System.out.println("Paciente con ID " + id + " no encontrado en el sistema.");
        }
    }
}