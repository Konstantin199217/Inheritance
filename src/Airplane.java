public class Airplane extends Transport{

    int numberOfEngines;
    int numberOfSeats;

    public Airplane(String name, String model, int numberOfEngines, int numberOfSeats) {
        super(name, model);
        this.numberOfEngines = numberOfEngines;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Вид: " + name + ";" + " Модель: " + model + ";"
                + " Колличество мест для пассажиров: " + numberOfSeats + ";" + " Колличество двигателей:"
                + numberOfEngines + ";" ;
    }

}
