
// Consulta.java
import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private String diagnostico;
    private String prescricao;

    // Construtor
    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String diagnostico, String prescricao) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    // Método para exibir informações da consulta
    public void exibirConsulta() {
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("Prescrição: " + prescricao);
    }
}
