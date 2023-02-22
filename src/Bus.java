public class Bus extends Transport {

    int numberOfSeats;


    public Bus(String name, String model, int numberOfSeats) {
        super(name, model);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Вид: " + name + ";" + " Модель: " + model + ";"
                + " Колличество мест для пассажиров: " + numberOfSeats + ";";
    }
}
