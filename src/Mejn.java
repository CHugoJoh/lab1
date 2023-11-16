public class Mejn {
    public static void main(String[] args) {
        Volvo240 volvo = new Volvo240();
        Scandia scandia = new Scandia();
        VolvoMechanic vmech = new VolvoMechanic();
        vmech.load(volvo);
        //vmech.load(scandia);

    }
}
