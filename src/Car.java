import java.time.LocalDate;
public class Car extends Transport{

    private float engineVolume;
    private String transmissionType;
    private final String bodyworkType;
    private String registrationNumber;
    private final int numberOfSeats;
    private Boolean isSummerTires;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int year, String country, String color, double maxSpeed, float engineVolume, String transmissionType, String bodyworkType, String registrationNumber, int numberOfSeats, Boolean isTiresSummer, Key key, Insurance insurance) {
        super(brand, model, year, country, color, maxSpeed);

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5F;

        if (transmissionType != null && !transmissionType.isEmpty() && !transmissionType.isBlank()) {
            this.transmissionType = transmissionType;
        } else this.transmissionType = "Автомат";

        if (bodyworkType != null && !bodyworkType.isEmpty() && !bodyworkType.isBlank()) {
            this.bodyworkType = bodyworkType;
        } else this.bodyworkType = "Седан";

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else this.registrationNumber = "Отсутствует";

        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else this.numberOfSeats = 2;

        if (isTiresSummer != null) {
            this.isSummerTires = isTiresSummer;
        } else this.isSummerTires = true;

        if (key == null) {
            this.key = new Key();
        } else this.key = key;

        if (insurance == null) {
            this.insurance = new Insurance();
        } else this.insurance = insurance;

    }
    public Car(String brand, String model, int year, String country, String color, float engineVolume) {
        this(brand, model,year, country, color,120, engineVolume, "Автомат", "Седан", "d231aa131", 4, true, new Key(), new Insurance());

    }

    public String getBodyworkType() {
        return bodyworkType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else this.engineVolume = 1.5F;
    }


    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        if (transmissionType != null && !transmissionType.isEmpty() && !transmissionType.isBlank()) {
            this.transmissionType = transmissionType;
        } else this.transmissionType = "Автомат";
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else this.registrationNumber = "Отсутствует";
    }

    public Boolean getSummerTires() {
        return isSummerTires;
    }

    public void setTiresSummer(Boolean tiresSummer) {
        if (tiresSummer != null) {
            this.isSummerTires = tiresSummer;
        } else this.isSummerTires = true;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changTires(){
        int monthNumber = LocalDate.now().getMonthValue();
        switch (monthNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                isSummerTires = false;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                isSummerTires = true;
                break;
        }
    }
    public boolean isCorrectRegistrationNumber(){
        if (registrationNumber.length() != 9){
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8]))
            return false;
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " +
                getYear()+ " года выпуска, страна сборки: " + getCountry() + ", " +
                getColor() + " цвет, объем двигателя — " + engineVolume +
                " л., тип коробки передач:  " + transmissionType +
                ", тип кузова: " + bodyworkType +
                ", регистрационный номер: " + registrationNumber +
                ", количество сидячи мест: " + numberOfSeats +
                ", максимальная скорость движения: " + getMaxSpeed() + " км/ч" +
                ", резина: " + (isSummerTires ? "летняя, " : "зимняя, ") +
                (key.remoteRunEngine ? "удаленный запуск, " : "обычный запуск, ") +
                (key.withoutKeyAccess ? "безключевой доступ " : "ключевой доступ ") +
                ", номер страховки: " + insurance.getNumber() +
                ", стоимость страховки: " + insurance.getCost() +
                ", срок страховки: " + insurance.getExpireDate()
                ;
        }

    public static class Key{
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }

        public Key() {
            this(false, false);

        }
    }
    public static class Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else this.expireDate = expireDate;
            this.cost = cost;

            if (number == null) {
                this.number = "000000000";
            } else this.number = number;
        }
        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate(){
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }
        public void checkNumber(){
            if (number.length() != 9){
                System.out.println("Номер страховки некоректный!");
            }
        }
    }
}
