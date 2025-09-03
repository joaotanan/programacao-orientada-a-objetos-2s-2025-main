package sistema_radar;

public class Radar {

    public Integer limitevelocidade;
    private String localizacao;

    public Radar(String localizacao, Integer limiteVelocidade){
        this.localizacao = localizacao;
        this.limitevelocidade = limiteVelocidade;
    }

    public Radar(Integer limiteVelocidade){
        this.limitevelocidade = limiteVelocidade;
    }

    public void emitirnotificacao(String placa, Integer 
    velocidadeObservada){
        System.out.println("limitedevelocidade: "+ this.
        limitevelocidade);
        System.out.println("Localizacao: " this.localizacao);
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: " + "Velocidadeobservada");

    }
    public void avaliarvelocidade(carro c){
        if(carro.getVelocidade() > this.limitevelocidade){
            emitirnotificacao(carro.placa, carro.getVelocidade());
        }

    }
}
