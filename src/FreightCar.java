public class FreightCar extends Automobile {

    int loadCapacity;

    public FreightCar(String name, String model, int power, int loadCapacity) {
        super(name, model, power);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Вид: " + name + ";" + " Модель: " + model + ";" + " Мощность: " + power + "л.с. " + ";"
                + " Грузоподъемность: " + loadCapacity + " тонн"+";";
    }
}
