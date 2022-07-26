
public class Main {

    public static void main(String[] args) {
        Aviao aviao1 = new Aviao("Spitfire","AG007");

        System.out.println(aviao1.toString());

        aviao1.ligarMotor();
        aviao1.imprimeEstadoMotor();
        aviao1.desligarMotor();
        aviao1.imprimeEstadoMotor();
    }
    
}
