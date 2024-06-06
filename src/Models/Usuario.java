package Models;

import java.util.UUID;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    /**
     * Atualiza o email do usuário.
     * @param novoEmail Novo email.
     * @return Mensagem de confirmação.
     */
    public String atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        return "Email atualizado para " + novoEmail;
    }

    /**
     * Verifica se a senha é correta.
     * @param senhaFornecida Senha fornecida pelo usuário.
     * @return true se a senha estiver correta, false caso contrário.
     */
    public boolean verificarSenha(String senhaFornecida) {
        return this.senha.equals(senhaFornecida);
    }

    /**
     * Exibe as informações do usuário.
     * @return String formatada com as informações do usuário.
     */
    public String exibirInfo() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email;
    }

    /**
     * atualizar email e senha.
     * @param novoEmail Novo email.
     * @param novaSenha Nova senha.
     * @return Mensagem de confirmação.
     */
    public String atualizarEmail(String novoEmail, String novaSenha) {
        this.email = novoEmail;
        this.senha = novaSenha;
        return "Email e senha atualizados";
    }
}

