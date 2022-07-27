
public class Main {

    public static void main(String[] args) {
        Motor motor1 = new Motor("ZeroM", 50.0f);
        Motor motor2 = new Motor("UmM",50.0f);
        Aviao aviao1 = new Aviao("Spitfire","AG007",motor1,motor2);

        System.out.println(aviao1.toString());

        aviao1.ligarMotor();
        aviao1.imprimeEstadoMotor();
        aviao1.desligarMotor();
        aviao1.imprimeEstadoMotor();
    }
    
}
