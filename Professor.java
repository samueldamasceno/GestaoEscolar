import java.time.LocalDate;
import java.util.List;

public class Professor {
    private String nome;
    private Endereco endereco;
    private LocalDate dataDeNascimento;
    private double salario;
    private List<Turma> turmas;

    public Professor(String nome, Endereco endereco, LocalDate dataDeNascimento, double salario, List<Turma> turmas) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.salario = salario;
        this.turmas = turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
