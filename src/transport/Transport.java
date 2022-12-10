package transport;

import java.text.DecimalFormat;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;
    private double fuelPercentage;

    public Transport(String brand, String model, int year, String country) {
        this(brand, model, year, country, "Белый", 120, 50.00);
    }

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed, double fuelPercentage) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else this.brand = "default";

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else this.model = "default";

        if (year > 0) {
            this.year = year;
        } else this.year = 2000;

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else this.country = "default";

        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else this.color = "Белый";
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else this.maxSpeed = 120;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage >= 0 && fuelPercentage <=100) {
            this.fuelPercentage = fuelPercentage;
        } else System.out.println("Сколько ты хочешь заправить?!");
    }

    public abstract void refill();

    @Override
    public String toString() {
        return brand + " " + model + " " +
                year + " года выпуска, страна сборки: " + country +
                ", цвет: " + color  +
                ", максимальная скорость движения: " + maxSpeed + " км/ч"+
                ", количество топлива: " + ( new DecimalFormat("#.00").format(fuelPercentage)) + "%";
    }
}
