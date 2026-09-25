package br.pucminas.matriculas.model;

public class Secretaria extends Usuario {

    public Secretaria(Long id, String login, String senha) {
        super(id, login, senha);
    }

    public CurriculoSemestral gerarCurriculo(int semestre, int ano) {
        // Stub do método
        return null;
    }

    public void cadastrarDisciplina(Disciplina disciplina) {
        // Stub do método
    }

    public void manterDisciplina(Disciplina disciplina) {
        // Stub do método
    }

    public void cadastrarProfessor(Professor professor) {
        // Stub do método
    }

    public void manterProfessor(Professor professor) {
        // Stub do método
    }

    public void cadastrarAluno(Aluno aluno) {
        // Stub do método
    }

    public void manterAluno(Aluno aluno) {
        // Stub do método
    }
}