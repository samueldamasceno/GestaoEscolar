package model;

import util.Endereco;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private int idAluno;
    private Turma turma;
    private Endereco endereco;
    private LocalDate dataDeNascimento;

    public Aluno(String nome, int idAluno, Turma turma, Endereco endereco, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.idAluno = idAluno;
        this.turma = turma;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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
}
