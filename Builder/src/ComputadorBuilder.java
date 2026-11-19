public class ComputadorBuilder {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public ComputadorBuilder armazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder sistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        if (processador == null || memoriaRam == null || armazenamento == null) {
            throw new IllegalStateException("Processador, RAM e armazenamento são obrigatórios.");
        }
        return new Computador(processador, memoriaRam, armazenamento, placaDeVideo, sistemaOperacional);
    }
}
