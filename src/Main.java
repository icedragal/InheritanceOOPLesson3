import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 2015, "Россия", "Желтый",110 , 50,1.7F, "Механическая","универсал","p231jh374",6, false, null, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0F);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0F);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "Крсный", 1.7F);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6F);
        System.out.println(granta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Train lastochka = new Train("Поезд Ласточка", "B-901", 2011, "Россия", 301, 90 ,3500, 1, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train lenin = new Train("Поезд «Ленинград»", "D-125", 2019, "Россия", 270, 90,1700, 2, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(lenin);

        Bus bus1 = new Bus("ПАЗ", "3205", 1989, "Россия", "Белый", 60, 90);
        Bus bus2 = new Bus("ЛиАЗ", "677", 1963, "Россия", "Желтый", 50, 90);
        Bus bus3 = new Bus("ЛиАЗ", "5292", 2004, "Россия", "Синий", 80, 90);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        System.out.println();
        System.out.println("============ Задание 3 ============");
        System.out.println();
        Herbivore gazelle = new Herbivore("Газель", 2, "Полупустыни и пустыни",50, "Трава, листья и молодые ветки кустарников");
        Herbivore giraffe = new Herbivore("Жираф", 5, "Тропические степи с редко растущими деревьями",55, "Рразнообразные листья деревьев и ветки молодых кустарников");
        Herbivore horse = new Herbivore("Лошадь", 11, "Живут на всех континентах, кроме Антарктиды",57, "Трава, корм для лошадей, сахар, морковь");

        Predatory hyena = new Predatory("Гиена", 1, "Африка и юго-западная Азия",60, "Мясо");
        Predatory tiger = new Predatory("Тигр", 3, "Влажные тропические леса, мангровые болота и бамбуковые чащи в тропиках, сухие саванны, полупустыни, голые каменистые сопки и тайга на севере",53, "Мясо");
        Predatory bear = new Predatory("Медведь", 12, "Африка и юго-западная Азия",49, "Мясо, рыба, ягоды, орехи");

        Amphibian frog = new Amphibian("Лягушка", 1, "Пресноводные водоёмы, а для взрослых особей — дополнительно суша, кроны деревьев и подземные норы");
        Amphibian snake = new Amphibian("Уж", 2, "Территория современной Европы, Северной Африки и Азии");

        NonFlying penguin = new NonFlying("Пингвин", 3, "В открытом море Южного полушария: в прибрежных водах Антарктики, в Новой Зеландии, южной части Австралии, Южной Африке, по всему западному побережью Южной Америки от Фолклендских островов до Перу, а также на Галапагосских островах вблизи Экватора", "Хотьба, плавание и ныряние");
        NonFlying penguin1 = new NonFlying("Пингвин", 3, "В открытом море Южного полушария: в прибрежных водах Антарктики, в Новой Зеландии, южной части Австралии, Южной Африке, по всему западному побережью Южной Америки от Фолклендских островов до Перу, а также на Галапагосских островах вблизи Экватора", "Хотьба, плавание и ныряние");
        NonFlying peacock = new NonFlying("Павлин", 3, "", "Хотьба, бег");
        NonFlying dodoBird = new NonFlying("Пицца", 1, "", "");
        Flying seagull = new Flying("Чайка", 1, "", "");
        Flying albatross = new Flying("Альбатрос", 1, "", "");
        Flying falcon = new Flying("Сокол", 1, "", "");
        compareAnimals(penguin, peacock);
        compareAnimals(penguin, penguin1);
    }

    public static void compareAnimals(Animal animal1, Animal animal2){
        System.out.print("Животные " + animal1.getName() + " и " + animal2.getName());
        System.out.println(animal1.equals(animal2) ? " Одинаковые" : " Не одинаковые");
    }
}