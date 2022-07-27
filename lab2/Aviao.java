import javax.management.monitor.Monitor;

public class Aviao{
    private String modelo;
    private String identificador;
    private Motor motorEsquerdo;
    private Motor motorDireito;
    private float altura;
    private float velocidade;

    Aviao(String modelo, String identificador,Motor motorEsquerdo, Motor motorDireito){
        setModelo(modelo);
        setIndentificador(identificador);
        setMotorEsquerdo(motorEsquerdo);
        setMotorDireito(motorDireito);
        setVelocidade(0f);
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
    public Motor getMotorEsquerdo(){
        return this.motorEsquerdo;
    }
    public Motor getMotorDireito(){
        return this.motorDireito;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getVelocidade(){
        return this.velocidade;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setIndentificador(String identificador){
        this.identificador=identificador;
    }
    public void setMotorEsquerdo(Motor motor){
        this.motorEsquerdo=motor;
    }
    public void setMotorDireito(Motor motor){
        this.motorDireito=motor;
    }
    public void setAltura(float altura){
        this.altura=altura;
    }
    public void setVelocidade(float velocidade){
        this.velocidade= velocidade;
    }
    public void ligarMotor(){
        getMotorDireito().ligar();
        getMotorEsquerdo().ligar();
    }
    public void desligarMotor(){
        getMotorDireito().desligar();
        getMotorEsquerdo().desligar();
    }
    public void acelerar(){
        if(getEstadoMotor()){
            if(getMotorEsquerdo().getAtivo()){
                setVelocidade(getMotorEsquerdo().getPotencia()+getVelocidade());
            }
            if(getMotorDireito().getAtivo()){
                setVelocidade(getMotorDireito().getPotencia()+getVelocidade());
            }
            System.out.println("Avião a "+getVelocidade()+"km/h");
        }else{
            System.out.println("ERRO: Motor desligado");
        }
    }
    public void desacelerar(){
        if(getEstadoMotor()){
            if(getVelocidade()==0f){
                System.out.println("Avião a "+getVelocidade()+"km/h");
            }else{
                if(!getMotorEsquerdo().getAtivo()){
                    setVelocidade(getVelocidade()-getMotorEsquerdo().getPotencia());
                }
                if(!getMotorDireito().getAtivo()){
                    setVelocidade(getVelocidade()-getMotorDireito().getPotencia());
                }
                System.out.println("Avião a "+getVelocidade()+"km/h");
            }
        }else{
            System.out.println("ERRO: Motor desligado");
        }
    }
    public Boolean getEstadoMotor(){
        if(getMotorEsquerdo().getAtivo()||getMotorDireito().getAtivo()){
            return true;
        }else{
            return false;
        }
    }
    public void imprimeEstadoMotor(){
        if(getMotorEsquerdo().getAtivo()&&getMotorDireito().getAtivo()){
            System.out.println("Os motores estão ligados..");
        }
        if(getMotorEsquerdo().getAtivo()&&!getMotorDireito().getAtivo()){
            System.out.println("Somente o motor esquerdo está ligado..");
        }
        if(!getMotorEsquerdo().getAtivo()&&getMotorDireito().getAtivo()){
            System.out.println("Somente o motor direito está ligado..");
        }else{
            System.out.println("Os motores estão desligados..");
        }
    }
    public String  toString(){
        return "Modelo: "+getModelo();
    }


}