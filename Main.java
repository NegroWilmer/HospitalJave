package actividad4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        // 6 pacientes
        Paciente p1 = new Paciente(1, "Ana", 30, "F", "sarcoma", "II", "en tratamiento");
        Paciente p2 = new Paciente(2, "Luis", 40, "M", "leucemia", "III", "remision");
        Paciente p3 = new Paciente(3, "Carlos", 50, "M", "linfoma", "I", "en tratamiento");
        Paciente p4 = new Paciente(4, "Maria", 35, "F", "sarcoma", "II", "fallecido");
        Paciente p5 = new Paciente(5, "Sofia", 28, "F", "leucemia", "I", "remision");
        Paciente p6 = new Paciente(6, "Pedro", 60, "M", "linfoma", "IV", "en tratamiento");

        hospital.agregarPaciente(p1);
        hospital.agregarPaciente(p2);
        hospital.agregarPaciente(p3);
        hospital.agregarPaciente(p4);
        hospital.agregarPaciente(p5);
        hospital.agregarPaciente(p6);

        // Exámenes
        hospital.agregarExamen(p1, new Examen(1, LocalDate.now(), "Resonancia", "Normal"));
        hospital.agregarExamen(p1, new Examen(2, LocalDate.now(), "Biopsia", "Positivo"));

        hospital.agregarExamen(p2, new Examen(3, LocalDate.now(), "Tomografía", "Control"));

        hospital.agregarExamen(p3, new Examen(4, LocalDate.now(), "Resonancia", "Seguimiento"));

        // Tratamientos
        hospital.agregarTratamiento(p1, new Tratamiento(1, "Quimioterapia", 30, "Náuseas"));
        hospital.agregarTratamiento(p2, new Tratamiento(2, "Radioterapia", 20, "Fatiga"));
        hospital.agregarTratamiento(p3, new Tratamiento(3, "Cirugía", 10, "Dolor"));

        // Resultados
        System.out.println("=== PACIENTES POR TIPO DE CÁNCER ===");
        hospital.contarPacientesPorTipoCancer();

        System.out.println("\n=== PORCENTAJE POR ESTADO ===");
        hospital.porcentajePorEstado();
        
        System.out.println("\n=== BUSCAR PACIENTE ===");
        hospital.mostrarPaciente(1);
    }
}
