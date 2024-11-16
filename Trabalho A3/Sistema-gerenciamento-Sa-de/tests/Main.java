
// Main.java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Paciente
        Paciente paciente = new Paciente("João Silva", "123.456.789-00", "1990-06-15",
                "Rua Exemplo, 123", "98765-4321", "joao@email.com", "Nenhuma doença grave.");

        // Exibindo informações do Paciente
        System.out.println("=== Informações do Paciente ===");
        paciente.exibirInformacoes();

        // Criando instâncias de Médico
        Medico medico = new Medico("Dr. Maria Souza", "Cardiologia", "CRM123456",
                "maria@email.com", "32165-4321");

        // Exibindo informações do Médico
        System.out.println("\n=== Informações do Médico ===");
        medico.exibirInformacoes();

        // Criando uma Consulta
        Consulta consulta = new Consulta(paciente, medico, LocalDateTime.of(2024, 11, 17, 14, 30),
                "Diagnóstico: Hipertensão", "Prescrição: Medicamento A");

        // Exibindo informações da consulta
        System.out.println("\n=== Detalhes da Consulta ===");
        consulta.exibirConsulta();
    }
}
