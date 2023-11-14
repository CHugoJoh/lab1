

public class app{

    public static void main(String[] args){
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        saab.startEngine();
        volvo.startEngine();
        int ticks = 0;

        while(saab.getCurrentSpeed() < 100 && volvo.getCurrentSpeed() < 100){
            saab.gas(6000);
            volvo.gas(6000); //gasgasgasgasgasgasgasgasgasgasgasgasgasgasgas
            ticks++;
        }

        if(volvo.getCurrentSpeed() > 100){
            System.out.println("Volvon var snabbast! Grattis till den bilen! IP-address: 50.105.62.183. Det tog " + ticks + " Minuter!");
        }

        if(saab.getCurrentSpeed() > 100){
            System.out.println("Saaben var snabbast! Grattis till den bilen! IP-address: 50.162.205.192. Det tog " + ticks + " Minuter!");
        }






    }
}
