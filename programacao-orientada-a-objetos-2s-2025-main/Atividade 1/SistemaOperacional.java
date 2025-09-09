public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        System.out.println("--- Tentando executar o programa: " + p.getNome() + " ---");

        // Cenário 1: Erro na instalação do programa (SSD insuficiente)
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("ERRO: O programa requer " + p.getSSDOcupado() + " de SSD, mas o computador tem apenas " + computador.getSSD() + " disponível. Falha na instalação.");
            return false;
        }

        // Cenário 2: Erro na execução do programa (RAM insuficiente)
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("ERRO: O programa requer " + p.getMemoriaRAMAlocada() + " de RAM, mas o computador tem apenas " + computador.getMemoriaRAM() + " disponível. Falha na execução.");
            return false;
        }

        // Cenário 3: Execução com sucesso
        computador.alocarSSD(p.getSSDOcupado());
        computador.alocarRAM(p.getMemoriaRAMAlocada());

        float tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("SUCESSO: O programa '" + p.getNome() + "' foi executado com sucesso.");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");

        computador.desalocarSSD(p.getSSDOcupado());
        computador.desalocarRAM(p.getMemoriaRAMAlocada());

        return true;
    }
}public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        System.out.println("--- Tentando executar o programa: " + p.getNome() + " ---");

        // Cenário 1: Erro na instalação do programa (SSD insuficiente)
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("ERRO: O programa requer " + p.getSSDOcupado() + " de SSD, mas o computador tem apenas " + computador.getSSD() + " disponível. Falha na instalação.");
            return false;
        }

        // Cenário 2: Erro na execução do programa (RAM insuficiente)
        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("ERRO: O programa requer " + p.getMemoriaRAMAlocada() + " de RAM, mas o computador tem apenas " + computador.getMemoriaRAM() + " disponível. Falha na execução.");
            return false;
        }

        // Cenário 3: Execução com sucesso
        computador.alocarSSD(p.getSSDOcupado());
        computador.alocarRAM(p.getMemoriaRAMAlocada());

        float tempoExecucao = p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("SUCESSO: O programa '" + p.getNome() + "' foi executado com sucesso.");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");

        computador.desalocarSSD(p.getSSDOcupado());
        computador.desalocarRAM(p.getMemoriaRAMAlocada());

        return true;
    }
}