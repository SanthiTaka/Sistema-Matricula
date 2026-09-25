package br.pucminas.matriculas.model;

import java.util.List;

public class Professor extends Usuario {

    private List<Disciplina> disciplinas;

    public Professor(Long id, String login, String senha) {
        super(id, login, senha);
    }

    public List<Aluno> consultarAlunosMatriculados(Disciplina disciplina) {
        return null;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}