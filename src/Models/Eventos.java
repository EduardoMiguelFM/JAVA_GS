package Models;

import java.util.UUID;
import java.util.Date;

public class Eventos {
    private String id;
    private String nome;
    private String descricao;
    private Date data;

    public Eventos(String nome, String descricao, Date data, String local) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    /**
     * Atualiza a data do evento.
     *
     * @param novaData Nova data.
     * @return Mensagem de confirmação.
     */
    public String atualizarData(Date novaData) {
        this.data = novaData;
        return "Data do evento " + nome + " atualizada com sucesso!";
    }

    /**
     * Exibe as informações do evento.
     *
     * @return String formatada com as informações do evento.
     */
    public String exibirInfo() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Data: " + data.toString();
    }

    /**
     * Calcula a diferença em dias entre a data do evento e a data atual.
     * @return Número de dias restantes para o evento.
     */
    public long diasParaEvento() {
        Date hoje = new Date();
        long diferenca = data.getTime() - hoje.getTime();
        return diferenca / (1000 * 60 * 60 * 24);
    }

    /**
     * Sobrecarga do método atualizarData para aceitar data como string.
     * @param novaData Nova data em string.
     * @return Mensagem de confirmação.
     */
    public String atualizarData(String novaData) {
        // Conversão simplificada, assumindo formato "yyyy-MM-dd"
        try {
            this.data = new Date(novaData);
            return "Data do evento " + nome + " atualizada com sucesso!";
        } catch (Exception e) {
            return "Formato de data inválido!";
        }
    }
}

