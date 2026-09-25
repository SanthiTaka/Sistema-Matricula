package br.pucminas.matriculas.model;

import java.util.List;

public class Aluno extends Usuario {

    private List<Matricula> matriculas;

    public Aluno(Long id, String login, String senha) {
        super(id, login, senha);
    }

    public List<Disciplina> consultarDisciplinas() {
        return null;
    }

    public Matricula realizarMatricula(Disciplina disciplina, TipoMatricula tipo) {
        return null;
    }

    public void cancelarMatricula(Matricula matricula) {

    }

    public List<Matricula> consultarMatriculas() {
        return matriculas;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}