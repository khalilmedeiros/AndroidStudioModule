
public class Aviao{
    private String modelo;
    private String identificador;
    private boolean motor;
    private float altura;

    Aviao(String modelo, String identificador){
        this.modelo=modelo;
        this.identificador=identificador;
        this.motor=false;
        this.altura=0.0f;
    }


    public void ImprimaOk(){
        System.out.println("OK");
    }

    public String getModelo(){
        return this.modelo;
    }
    public String getIdentificador(){
        return this.identificador;
    }
    public boolean getMotor(){
        return this.motor;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setIndentificador(String identificador){
        this.identificador=identificador;
    }
    public void setMotor(boolean motor){
        this.motor=motor;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public void ligarMotor(){
        setMotor(true);
        System.out.println("Vrummmmmmm");
    }
    public void desligarMotor(){
        setMotor(false);
    }
    public String  toString(){
        return "Modelo: "+getModelo()+"\nId: "+getIdentificador()+"\nStatus motor: "+getMotor()+"\nAltura: "+getAltura();
    }


}