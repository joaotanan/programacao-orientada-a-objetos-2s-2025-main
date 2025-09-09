public class Main {
    public static void main(String[] args) {
        // Instanciação de um computador com recursos
        Computador meuComputador = new Computador(16000, 512, 4, 1000.5f);
        
        // Instanciação de um sistema operacional para o computador
        SistemaOperacional meuSO = new SistemaOperacional(meuComputador);
        
        // Instanciação de programas para testar os cenários
        
        // Cenário 1: Programa executado com sucesso
        Programa programa1 = new Programa("Programa de Edição de Vídeo", 4000, 20, 2, 5000000);
        
        // Cenário 2: Erro na instalação do programa (SSD Ocupado > SSD Disponível)
        Programa programa2 = new Programa("Jogo Pesado", 1000, 600, 4, 1000000);
        
        // Cenário 3: Erro na execução do programa (memoriaRAMAlocada > memoriaRAM Disponível)
        Programa programa3 = new Programa("IDE de Programação", 20000, 10, 4, 2000000);

        // Execução dos cenários
        
        // Teste do cenário 1: sucesso
        meuSO.executarPrograma(programa1);
        System.out.println("\n--- Estado atual do computador ---");
        System.out.println("RAM disponível: " + meuComputador.getMemoriaRAM() + " | SSD disponível: " + meuComputador.getSSD());
        
        System.out.println("\n------------------------------------------------\n");
        
        // Teste do cenário 2: falha na instalação
        meuSO.executarPrograma(programa2);
        System.out.println("\n--- Estado atual do computador ---");
        System.out.println("RAM disponível: " + meuComputador.getMemoriaRAM() + " | SSD disponível: " + meuComputador.getSSD());
        
        System.out.println("\n------------------------------------------------\n");
        
        // Teste do cenário 3: falha na execução
        meuSO.executarPrograma(programa3);
        System.out.println("\n--- Estado atual do computador ---");
        System.out.println("RAM disponível: " + meuComputador.getMemoriaRAM() + " | SSD disponível: " + meuComputador.getSSD());
    }
}