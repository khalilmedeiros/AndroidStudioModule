
public class Main {

    public static void main(String[] args) {
        MotorTurbinado motor1 = new MotorTurbinado("ZeroM", 50.0f);
        MotorTurbinado motor2 = new MotorTurbinado("UmM",50.0f);
        Aviao aviao1 = new Aviao("Spitfire","AG007",motor1,motor2);
        Passageiro p1 = new Passageiro("Khalil","Gibran","123");
        Passageiro p2 = new Passageiro("Carlos","Magnum","456");
        Passageiro p3 = new Passageiro("Maria","Lourdes","147");
        Passageiro p4 = new Passageiro("Jessica","Alves","258");
        Passageiro p5 = new Passageiro("Veronica","Lima","369");

        aviao1.ligarMotor();
        aviao1.adicionarPassageiro(p1);
        aviao1.adicionarPassageiro(p2);
        aviao1.adicionarPassageiro(p3);
        aviao1.adicionarPassageiro(p4);
        aviao1.adicionarPassageiro(p5);
       
        aviao1.acelerar();
        aviao1.acelerar();
        aviao1.acelerar();
        //aviao1.imprimirListaDePassageiro();
        aviao1.desacelerar();
        aviao1.desacelerar();
        aviao1.desacelerar();
        aviao1.desembarcarPassageiros();
        aviao1.imprimirListaDePassageiro();
    }
    
}
