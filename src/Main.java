import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 2015, "Россия", "Желтый",110 , 1.7F, "Механическая","универсал","p231jh374",6, false, null, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0F);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0F);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "Крсный", 1.7F);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6F);
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Train lastochka = new Train("Поезд Ласточка", "B-901", 2011, "Россия", 301, 3500, 1, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train lenin = new Train("Поезд «Ленинград»", "D-125", 2019, "Россия", 270, 1700, 2, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(lenin);

        Bus bus1 = new Bus("ПАЗ", "3205", 1989, "Россия", "Белый", 60);
        Bus bus2 = new Bus("ЛиАЗ", "677", 1963, "Россия", "Желтый", 50);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 2004, "Россия", "Синий", 80);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}