package ejercicio1;

import java.time.LocalDate;

public class Hospital {

    public static void main(String[] args) {

     
        Sistema sistema = new Sistema();

    
        Paciente paciente1 = new Paciente(1, "Ana", 30, "F", "sarcoma", "II", "en tratamiento");
        Paciente paciente2 = new Paciente(2, "Luis", 40, "M", "leucemia", "III", "remision");
        Paciente paciente3 = new Paciente(3, "Carlos", 50, "M", "linfoma", "I", "en tratamiento");
        Paciente paciente4 = new Paciente(4, "Maria", 35, "F", "sarcoma", "II", "fallecido");
        Paciente paciente5 = new Paciente(5, "Sofia", 28, "F", "leucemia", "I", "remision");
        Paciente paciente6 = new Paciente(6, "Pedro", 60, "M", "linfoma", "IV", "en tratamiento");

      
        sistema.agregarPaciente(paciente1);
        sistema.agregarPaciente(paciente2);
        sistema.agregarPaciente(paciente3);
        sistema.agregarPaciente(paciente4);
        sistema.agregarPaciente(paciente5);
        sistema.agregarPaciente(paciente6);

       
        Paciente pacienteEncontrado = sistema.buscarPaciente(1); 
        if (pacienteEncontrado != null) {
            sistema.agregarExamen(pacienteEncontrado, new Examen(1, LocalDate.now(), "Resonancia", "Normal"));
            sistema.agregarExamen(pacienteEncontrado, new Examen(2, LocalDate.now(), "Biopsia", "Positivo"));
            
            sistema.agregarTratamiento(pacienteEncontrado, new Tratamiento(1, "Quimioterapia", 30, "Náuseas"));
        }

        pacienteEncontrado = sistema.buscarPaciente(2);
        if (pacienteEncontrado != null) {
            sistema.agregarExamen(pacienteEncontrado, new Examen(3, LocalDate.now(), "Tomografía", "Control"));
            sistema.agregarTratamiento(pacienteEncontrado, new Tratamiento(2, "Radioterapia", 20, "Fatiga"));
        }

        pacienteEncontrado = sistema.buscarPaciente(3);
        if (pacienteEncontrado != null) {
            sistema.agregarExamen(pacienteEncontrado, new Examen(4, LocalDate.now(), "Resonancia", "Seguimiento"));
            sistema.agregarTratamiento(pacienteEncontrado, new Tratamiento(3, "Cirugía", 10, "Dolor"));
        }


        System.out.println("=== PACIENTES POR TIPO DE CÁNCER ===");
        sistema.contarPacientesPorTipoCancer();

        System.out.println("\n=== PORCENTAJE POR ESTADO ===");
        sistema.porcentajePorEstado();
        
        System.out.println("\n=== DETALLE DE BÚSQUEDA ===");
        sistema.mostrarPaciente(2);
    }
}