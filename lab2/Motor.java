public class Motor{
    private String modelo;
    private float potencia;
    private Boolean ativo;

    Motor(String modelo,float potencia){
        setModelo(modelo);
        setPotencia(potencia);
        setAtivo(false);
    }

    public String getModelo(){
        return this.modelo;
    }
    public float getPotencia(){
        return this.potencia;
    }
    public Boolean getAtivo(){
        return this.ativo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPotencia(float potencia){
        this.potencia=potencia;
    }
    public void setAtivo(Boolean ativo){
        this.ativo=ativo;
    }

    public void ligar(){

    }
    public void desligar(){

    }

}