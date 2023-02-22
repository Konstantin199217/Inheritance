public class Transport {

    public String name;

    public String model;

    public String transferMethod;


    public Transport(String name, String model) {
        this.name = name;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Вид: " + name + ";" + " Модель: " + model + ";";
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

}
