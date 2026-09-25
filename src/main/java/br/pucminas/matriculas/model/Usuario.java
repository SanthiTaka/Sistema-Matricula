package br.pucminas.matriculas.model;

public abstract class Usuario {

    private Long id;
    private String login;
    private String senha;

    public Usuario(Long id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public boolean fazerLogin(String senha) {
        return this.senha.equals(senha);
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}