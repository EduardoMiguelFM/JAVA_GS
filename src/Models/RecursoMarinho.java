package Models;

import java.util.UUID;

public class RecursoMarinho extends DadosPoluicao {
    private String id;
    private String nome;
    private String tipo;
    private String descricao;

    public RecursoMarinho(String nome, String tipo, String descricao) {
        super();
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    /**
     * Atualiza a descrição do recurso marinho.
     *
     * @param novaDescricao Nova descrição do recurso marinho.
     * @return Mensagem de confirmação.
     */
    public String atualizarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
        return "Descrição do recurso " + nome + " atualizada com sucesso!";
    }

    /**
     * Calcula o impacto total do recurso marinho com base na poluição e um fator de impacto.
     * @param fator Fator de impacto adicional.
     * @return Impacto total calculado.
     */
    public double calcularImpactoTotal(double fator) {
        double impactoTotal = calcularPontuacaoPoluicao() * fator;
        return impactoTotal;
    }

    /**
     * Exibe as informações do recurso marinho, incluindo dados de poluição.
     *
     * @return String formatada das informações do recurso marinho.
     */
    public String exibirInfo() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Tipo: " + tipo + "\n" +
                "Descrição: " + descricao + "\n" +
                super.exibirDadosPoluicao();
    }

    /**
     * Sobrecarga do método calcularImpactoTotal com um fator padrão.
     *
     * @return Impacto total calculado com fator padrão.
     */
    public double calcularImpactoTotal() {
        return calcularImpactoTotal(1.5); // Usando 1.5 como fator padrão
    }
}

