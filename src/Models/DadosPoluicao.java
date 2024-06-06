package Models;

public class DadosPoluicao {
    private static int contadorId = 1;
    private int id;
    private String tipoPoluicao;
    private double nivelPoluicao;
    private String fontePoluicao;
    private String impactoAmbiental;

    public DadosPoluicao() {
        this.id = contadorId++;
        this.nivelPoluicao = nivelPoluicao;
    }

    public DadosPoluicao(String tipoPoluicao, double nivelPoluicao, String fontePoluicao, String impactoAmbiental) {
    }

    public int getId() {
        return id;
    }
    public String getTipoPoluicao() {
        return tipoPoluicao;
    }

    public double getNivelPoluicao() {
        return nivelPoluicao;
    }

    public String getFontePoluicao() {
        return fontePoluicao;
    }

    public String getImpactoAmbiental() {
        return impactoAmbiental;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoPoluicao(String tipoPoluicao) {
        this.tipoPoluicao = tipoPoluicao;
    }

    public void setNivelPoluicao(double nivelPoluicao) {
        this.nivelPoluicao = nivelPoluicao;
    }

    public void setFontePoluicao(String fontePoluicao) {
        this.fontePoluicao = fontePoluicao;
    }

    public void setImpactoAmbiental(String impactoAmbiental) {
        this.impactoAmbiental = impactoAmbiental;
    }

    /**
     * Atualiza o impacto ambiental.
     *
     * @param novoImpacto Nova descrição do impacto ambiental.
     * @return Mensagem de confirmação.
     */
    public String atualizarImpacto(String novoImpacto) {
        this.impactoAmbiental = novoImpacto;
        return "Impacto ambiental atualizado para: " + novoImpacto;
    }

    /**
     * Calcula a pontuação de poluição com base no nível de poluição e na fonte de poluição.
     * @return Pontuação calculada.
     */
    public double calcularPontuacaoPoluicao() {
        // Exemplo simples de cálculo de pontuação
        return this.nivelPoluicao * (this.fontePoluicao.equals("Industrial") ? 2.0 : 1.0);
    }

    /**
     * Exibe os dados de poluição .
     * @return String formatada dos dados de poluição.
     */
    public String exibirDadosPoluicao() {
        return "Nível de Poluição: " + nivelPoluicao + "\n" +
                "Fonte de Poluição: " + fontePoluicao + "\n" +
                "Impacto Ambiental: " + impactoAmbiental;
    }

    public String exibirInfo() {
        return null;
    }
}

