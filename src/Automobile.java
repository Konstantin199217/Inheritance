public class Automobile extends Transport{

    int power;
    public Automobile(String name, String model, int power) {
        super(name, model);
        this.power = power;
    }

    @Override
    public String toString() {
        return "Вид: " + name + ";" + " Модель: " + model + ";" + " Мощность: " + power + "л.с. " + ";";
    }
}
