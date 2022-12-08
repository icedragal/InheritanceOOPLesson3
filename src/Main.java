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
    }
}