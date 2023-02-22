public class Main {
    public static void main(String[] args) {

        /*Создать иерархию родительский и дочернии классы для Транспорта
            Например Транспорт - > Автомобиль - > Автобус
            Транспорт - > Автомобиль - > Легковой
            Используем наследование, инкапсуляцию*/

        Transport transport = new Transport("Транспорт", "Любой вид");
        System.out.println(transport);

        Bus bus = new Bus("Автобус","Икарус", 32 );
        System.out.println(bus);

        Automobile automobile = new Automobile("Автомобиль", "Волга", 200);
        System.out.println(automobile);

        FreightCar freightCar = new FreightCar("Грузовой автомобиль", "Камаз", 210, 3);
        System.out.println(freightCar);

        Airplane airplane = new Airplane("Самолет", "Боинг", 4, 90 );
        System.out.println(airplane);
    }
}