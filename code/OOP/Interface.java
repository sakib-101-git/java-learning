public class Interface {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}


interface Car {
    void start();
    void accelerate();
    void brake();
}

class FuelCar implements  Car {

    //Annotations
    @Override
    //public modifier is needed because all interface access modifiers are public
    public void start() {
        System.out.println("Fuel car has started");
    }
    @Override
    public void accelerate() {
        System.out.println("car running but fuel is decreasing");
    }

    @Override
    public void brake() {
        System.out.println("car stopped but still fuel decreasing");
    }
}

class ElectricCar implements Car {

    @Override
    public void start() {
        System.out.println("oreee sudanirfuar tesla durer dee!!");
    }

    @Override
    public void accelerate() {
        System.out.println("teslar maarebap");
    }

    @Override
    public void brake() {
        System.out.println("tesla tham!! tor maarebap");
    }

}