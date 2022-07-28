public class MotorTurbinado extends Motor{
    MotorTurbinado(String modelo,Float potencia){
        super(modelo,potencia);
    }
    @Override
    public void ligar(){
        super.ligar();
        System.out.println("TRUMMMMMMM….");
    }

    @Override
    public float getPotencia(){
        return super.getPotencia()*1.2f;
    }
}
