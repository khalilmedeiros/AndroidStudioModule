public class AguiaGigante implements Motorizavel{
    private float peso;
    private String nome;
    private float força;
    private Boolean acordada;

    AguiaGigante(float peso, String nome, float força){
        setPeso(peso);
        setNome(nome);
        setForça(força);
        setAcordada(true);
    }
    public float getPeso(){
        return this.peso;
    }

    public String getNome(){
        return this.nome;
    }

    public float getForça(){
        return this.força;
    }

    public Boolean getAcordada(){
        return this.acordada;
    }
    private void setPeso(float peso){
        this.peso=peso;
    }
    private void setNome(String nome){
        this.nome=nome;
    }
    private void setForça(float força){
        this.força=força;
    }
    private void setAcordada(Boolean acordada){
        this.acordada=acordada;
    }

    public Boolean getAtivo(){
        return getAcordada();
    }
    public float getPotencia(){
        if(getAcordada()){
            return getForça();
        }else{
            return 0;
        }
    }
    public void ligar(){
        setAcordada(true);
        System.out.println("A aguia pia!");
    }
    public void desligar(){
        setAcordada(false);
    }

}