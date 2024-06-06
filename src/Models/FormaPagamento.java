package Models;

import java.util.UUID;

public class FormaPagamento {
    private String id;
    private String descricao;

    public FormaPagamento(String descricao) {
        this.id = UUID.randomUUID().toString();
        this.descricao = descricao;
    }

    /**
     * Altera a descrição da forma de pagamento.
     * @param novaDescricao Nova descrição da forma de pagamento.
     * @return Mensagem de confirmação.
     */
    public String alterarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
        return "Descrição da forma de pagamento alterada para " + novaDescricao;
    }

    /**
     * Valida se a descrição da forma de pagamento é aceitável.
     * @param descricao Descrição a ser validada.
     * @return true se a descrição for válida, false caso contrário.
     */
    public boolean validarDescricao(String descricao) {
        return descricao != null && !descricao.isEmpty();
    }

    /**
     * Exibe as informações da forma de pagamento.
     * @return String formatada com as informações da forma de pagamento.
     */
    public String exibirInfo() {
        return "ID: " + id + "\n" +
                "Descrição: " + descricao;
    }

    /**
     * Sobrecarga do método validarDescricao que valida a descrição com um tamanho mínimo
     * @param descricao Descrição a ser validada.
     * @param tamanhoMinimo Tamanho mínimo aceitável.
     * @return true se a descrição for válida, false caso contrário.
     */
    public boolean validarDescricao(String descricao, int tamanhoMinimo) {
        return validarDescricao(descricao) && descricao.length() >= tamanhoMinimo;
    }
}

