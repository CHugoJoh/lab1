public class Mejn {
    public static void main(String[] args) {
        Volvo240 volvo1 = new Volvo240();
        Volvo240 volvo2 = new Volvo240();
        Scandia scandia = new Scandia();
        VolvoMechanic vmech = new VolvoMechanic();

        vmech.load(volvo1);
        vmech.load(volvo2);
        vmech.checkCars();

        vmech.unload(volvo1);
        vmech.checkCars();

        vmech.load(volvo2);
        vmech.load(volvo2);
        vmech.load(volvo2);
        vmech.load(volvo2);
        vmech.checkCars();




    }
}
