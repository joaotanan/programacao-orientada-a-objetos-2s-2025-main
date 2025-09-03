public class carro {
    public Integer ano;
    public String  modelo;
    public static String placa;
    Integer velocidade;

    public void Carro(String placa, Integer velocidade, Integer ano, String modelo){
        carro.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }

    public static Integer getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(Integer velocidade){
        if(velocidade i= null && velocidade > 0);
        this.velocidade = velocidade;
    }

    public

    public void acelerar(){
        this.velocidade +=10;
    }

    public void frear(){
        if (this.velocidade > 0) {
            this.velocidade -= 10;
        }
    }


    
}