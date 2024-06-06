package Models;

import java.util.UUID;

public class Conteudo {
    private String id;
    private String titulo;
    private String descricao;
    private String tipo;

    public Conteudo(String titulo, String descricao, String tipo) {
        this.id = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    /**
     * Atualiza o título do conteúdo.
     *
     * @param novoTitulo Novo título.
     * @return Mensagem de confirmação.
     */
    public String atualizarTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
        return "Título atualizado para " + novoTitulo;
    }

    /**
     * Adiciona uma tag ao conteúdo.
     *
     * @param tag Tag a ser adicionada.
     * @return Mensagem de confirmação.
     */
    public String adicionarTag(String tag) {
        return "Tag " + tag + " adicionada ao conteúdo " + titulo;
    }

    /**
     * Exibe as informações do conteúdo.
     *
     * @return String formatada com as informações do conteúdo.
     */
    public String exibirInfo() {
        return "ID: " + id + "\n" +
                "Título: " + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Tipo: " + tipo;
    }

    /**
     * Sobrecarga do método adicionarTag para adicionar múltiplas tags.
     * @param tags Array de tags a serem adicionadas.
     * @return Mensagem de confirmação.
     */
    public String adicionarTag(String[] tags) {
        StringBuilder mensagem = new StringBuilder("Tags adicionadas ao conteúdo " + titulo + ": ");
        for (String tag : tags) {
            mensagem.append(tag).append(", ");
        }
        return mensagem.toString();
    }
}

