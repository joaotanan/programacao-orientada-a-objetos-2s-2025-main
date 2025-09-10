package sistema_iptu;

public class imovel {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;

    public imovel(Double areaM2, Municipio municipio, Integer vagas) {
        this.areaM2 = areaM2;
        this.municipio = municipio;
        this.vagas = vagas;
    }

    public Double calcularIPTU(){
        return (this.areaM2 * this.municipio.getPrecoM2())*1.005;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    
}

