package lambda;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> create3cars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for(int i =0; i < 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }
    public static void main(String[] args){
        ArrayList<Car> ourCar = create3cars(() -> new Car("MDX", "clack", 3.0));
        System.out.println(ourCar);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
