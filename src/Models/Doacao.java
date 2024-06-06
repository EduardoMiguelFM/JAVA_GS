package Models;

import java.util.UUID;

public class Doacao {
    private String id;
    private String usuarioId;
    private double valor;
    private String formaPagamento;

    public Doacao(String usuarioId, double valor, String formaPagamento) {
        this.id = UUID.randomUUID().toString();
        this.usuarioId = usuarioId;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    /**
     * Atualiza o valor da doação.
     *
     * @param novoValor Novo valor da doação.
     * @return Mensagem de confirmação.
     */
    public String atualizarValor(double novoValor) {
        this.valor = novoValor;
        return "Valor da doação atualizado para " + novoValor;
    }

    /**
     * Calcula um valor estimado de doação baseado em uma taxa de crescimento.
     *
     * @param taxa Taxa de crescimento.
     * @return Valor estimado da doação.
     */
    public double calcularValorEstimado(double taxa) {
        return valor * (1 + taxa);
    }

    /**
     * Exibe as informações da doação.
     *
     * @return String formatada com as informações da doação.
     */
    public String exibirInfo() {
        return "ID da doação: " + id + "\n" +
                "ID do Usuário: " + usuarioId + "\n" +
                "Valor: " + valor + "\n" +
                "Forma de Pagamento: " + formaPagamento;
    }

    /**
     * Sobrecarga do método calcularValorEstimado com uma taxa padrão.
     *
     * @return Valor estimado da doação com taxa padrão.
     */
    public double calcularValorEstimado() {
        return calcularValorEstimado(0.05); // Usando 5% como taxa padrão
    }
}
