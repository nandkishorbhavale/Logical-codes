abstract class Vehical {
    public abstract int getNoOfWheelers();
}

class Bus extends Vehical {
    public int getNoOfWheelers() {
        return 6;
    }
}

class Auto extends Vehical {
    public int getNoOfWheelers() {
        return 3;
    }
}
public class AbstractVehical extends Bus {

    public static void main(String[] args) {
        Vehical obj1 = new Bus();
        Vehical obj2=new Auto();
        System.out.println("Number of Wheels in: " + obj1.getNoOfWheelers());
        System.out.println("Number of Wheels in: " + obj2.getNoOfWheelers());
    }
}
