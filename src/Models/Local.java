package Models;
import java.util.Random;
import java.util.UUID;

public class Local {
    private String id;
    private String nome;
    private String descricao;
    private double latitude;
    private double longitude;

    public Local(String nome, String descricao) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.descricao = descricao;
        gerarCoordenadasAleatorias();
    }

    private void gerarCoordenadasAleatorias() {
        // Gerar valores aleatórios para latitude e longitude dentro de um intervalo razoável
        Random random = new Random();
        // Latitude varia de -90 a 90
        this.latitude = -90 + (90 - (-90)) * random.nextDouble();
        // Longitude varia de -180 a 180
        this.longitude = -180 + (180 - (-180)) * random.nextDouble();
    }

    /**
     * Atualiza o local.
     * @return Mensagem de confirmação.
     */
    public String atualizarCoordenadas(double novaLatitude, double novaLongitude) {
        this.latitude = novaLatitude;
        this.longitude = novaLongitude;
        return "Coordenadas do local " + nome + " atualizadas com sucesso!";
    }

    /**
     * Calcula a distância do local até outro ponto geográfico.
     * @return Distância calculada.
     */
    public double calcularDistancia(double lat, double lon) {
        double deltaLat = Math.toRadians(lat - this.latitude);
        double deltaLon = Math.toRadians(lon - this.longitude);
        double a = Math.sin(deltaLat/2) * Math.sin(deltaLat/2) +
                Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(lat)) *
                        Math.sin(deltaLon/2) * Math.sin(deltaLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distancia = 6371.0 * c; // Raio da Terra em km
        return distancia;
    }

    /**
     * Exibe as informações do local.
     *
     * @return String formatada com as informações do local.
     */
    public String exibirInfo() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Coordenadas: (" + latitude + ", " + longitude + ")";
    }

    /**
     * Sobrecarga do método calcularDistancia que calcula a distância até outro local.
     *
     * @param outroLocal Outro objeto Local.
     * @return Distância calculada.
     */
    public double calcularDistancia(Local outroLocal) {
        return calcularDistancia(outroLocal.latitude, outroLocal.longitude);
    }
}

