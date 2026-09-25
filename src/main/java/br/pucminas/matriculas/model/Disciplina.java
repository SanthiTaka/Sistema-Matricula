package br.pucminas.matriculas.model;
import java.util.List;

public class Disciplina {

    private String codigo;
    private String nome;
    private int creditos;
    private int capacidadeMaxima;
    private int quantidadeMinima;
    private StatusDisciplina status;

    public void adicionarAluno(Aluno aluno) {
        // Stub do método
    }

    public void removerAluno(Aluno aluno) {
        // Stub do método
    }

    public List<Aluno> consultarAlunos() {
        // Stub do método
        return null;
    }

    public boolean estaLotada() {
        // Stub do método
        return false;
    }

    public boolean podeSerAtivada() {
        // Stub do método
        return false;
    }
}