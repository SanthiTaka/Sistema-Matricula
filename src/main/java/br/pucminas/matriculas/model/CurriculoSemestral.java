package br.pucminas.matriculas.model;
import java.util.ArrayList;
import java.util.List;

public class CurriculoSemestral {

    private Long id;
    private int semestre;
    private int ano;
    private List<Disciplina> disciplinas;

    public CurriculoSemestral() {
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        // Stub do método
    }

    public void removerDisciplina(Disciplina disciplina) {
        // Stub do método
    }

    public List<Disciplina> consultarDisciplinas() {
        // Stub do método
        return null;
    }
}