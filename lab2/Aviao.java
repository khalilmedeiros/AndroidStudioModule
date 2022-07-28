import java.util.ArrayList;

import javax.management.monitor.Monitor;

public class Aviao{
    private String modelo;
    private String identificador;
    private Motor motorEsquerdo;
    private Motor motorDireito;
    private float altura;
    private float velocidade;
    private Boolean emVoo; 
    private ArrayList<Passageiro> ListaPassageiros; 

    Aviao(String modelo, String identificador,Motor motorEsquerdo, Motor motorDireito){
        setModelo(modelo);
        setIndentificador(identificador);
        setMotorEsquerdo(motorEsquerdo);
        setMotorDireito(motorDireito);
        setVelocidade(0f);
        ListaPassageiros = new ArrayList<Passageiro>();
        setEmVoo(false);
    }


    public void ImprimaOk(){
        System.out.println("OK");
    }
    public Boolean getEmVoo(){
        return this.emVoo;
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
    private void setEmVoo(Boolean emVoo){
        this.emVoo=emVoo;
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
        atualizarStatusVoo();
    }
    public void desacelerar(){
        if(getEstadoMotor()){
            if(getMotorEsquerdo().getAtivo()){
                setVelocidade(getVelocidade()-getMotorEsquerdo().getPotencia());
            }
            if(getMotorDireito().getAtivo()){
                setVelocidade(getVelocidade()-getMotorDireito().getPotencia());
            }
            if(getVelocidade()<=0f){
                System.out.println("Avião a 0km/h");
            }else{
                System.out.println("Avião a "+getVelocidade()+"km/h");
            }
            }
            else{
            System.out.println("ERRO: Motor desligado");
        }
        atualizarStatusVoo();
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
    public void atualizarStatusVoo(){
        if(getEmVoo()){
            if(getVelocidade()<200){
                setEmVoo(false);
                System.out.println("Estou aterrisando..");
            }
            else{
                System.out.println("Estou voando...");
            }
        }
        else{
            if(getVelocidade()<200){
                System.out.println("Estou em solo...");
            }else{
                setEmVoo(true);
                System.out.println("Estou decolando..");
            }
        }
    }
    public Boolean adicionarPassageiro(Passageiro obj){
        if(!getEmVoo()){
            ListaPassageiros.add(obj);
            return true;
        }else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
            return false;
        }
    }
    public Passageiro buscaPassageiroPorCpf(String cpf){
        for(Passageiro p : ListaPassageiros){
            if(p.getCpf()==cpf){
                return p;
            }
        }
        return null;
    }
    public void imprimirListaDePassageiro(){
        for(Passageiro p: ListaPassageiros){
            System.out.println(p.getPrimeiroNome()+" "+p.getUltimoNome()+" "+p.getCpf());
        }
    }
    public void desembarcarPassageiros(){
        if(!getEmVoo()){
            for(Passageiro p: ListaPassageiros){
                System.out.println(p.getPrimeiroNome()+" "+p.getUltimoNome()+" desembarcou da aeronave");
            }
            ListaPassageiros.removeAll(ListaPassageiros);
        }else{
            System.out.println("Protocolos de segurança não permitem desembarques com a aeronave em movimento");
        }
    }
    public String  toString(){
        return "Modelo: "+getModelo();
    }


}