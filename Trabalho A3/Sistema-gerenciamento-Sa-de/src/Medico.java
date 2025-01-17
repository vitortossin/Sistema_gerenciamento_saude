// Medico.java
public class Medico {
    private String nome;
    private String especialidade;
    private String crm;
    private String email;
    private String telefone;

    // Construtor
    public Medico(String nome, String especialidade, String crm, String email, String telefone) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para exibir informações do médico
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }
}
