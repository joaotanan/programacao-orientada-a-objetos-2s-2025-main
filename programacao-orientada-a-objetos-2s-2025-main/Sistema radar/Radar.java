public class Radar {
    public Integer limitevelocidade;
    public String modelo;
    public String localizacao;

    public void emitirnotificacao(String placa, Integer 
    velocidadeavaliada){
        System.out.println("limitedevelocidade: "+ this.
        limitevelocidade);
        System.out.println("velocidadeavaliada: "+
        velocidadeavaliada);
        System.out.println("Placa: "+placa);

    }
    public void avaliarvelocidade(carro c){
        if(c.velocidade > this.limitevelocidade){
            emitirnotificacao(c.placa, c.velocidade);
        }

    }
}
