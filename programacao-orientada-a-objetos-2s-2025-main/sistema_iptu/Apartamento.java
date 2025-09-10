package sistema_iptu;

public class Apartamento extends imovel {
    private Boolean possuiElevador;

    public Apartamento(Double areaM2, Municipio municipio, Integer vagas, Boolean possuiElevador){
        super(municipio, areaM2, vagas, possuiElevador);
    
}
    
