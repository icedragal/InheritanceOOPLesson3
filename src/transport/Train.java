package transport;

public class Train extends Transport{
    private double priceTrip;
    private int hourTrip;
    private String departureStation;
    private String arrivalStation;
    private int wagonsNumber;

    public Train(String brand, String model, int year, String country,  double maxSpeed, double priceTrip, int timeTrip, String departureStation, String arrivalStation, int wagonsNumber) {
        super(brand, model, year, country, "Стандарт", maxSpeed);
        setPriceTrip(priceTrip);
        setHourTrip(timeTrip);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setWagonsNumber(wagonsNumber);
    }

    public double getPriceTrip() {
        return priceTrip;
    }

    public int getTimeTrip() {
        return hourTrip;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public int getWagonsNumber() {
        return wagonsNumber;
    }

    public void setPriceTrip(double priceTrip) {
        if (priceTrip > 0) {
            this.priceTrip = priceTrip;
        } else this.priceTrip = 100;
    }

    public void setHourTrip(int hourTrip) {
        if (hourTrip > 0) {
            this.hourTrip = hourTrip;
        } else this.hourTrip = 1;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null && !departureStation.isEmpty() && !departureStation.isBlank()) {
            this.departureStation = departureStation;
        } else this.departureStation = "Начальная";
    }

    public void setArrivalStation(String arrivalStation) {
        if (arrivalStation != null && !arrivalStation.isEmpty() && !arrivalStation.isBlank()) {
            this.arrivalStation = arrivalStation;
        } else this.arrivalStation = "Начальная";
    }

    public void setWagonsNumber(int wagonsNumber) {
        if (wagonsNumber > 0) {
            this.wagonsNumber = wagonsNumber;
        } else this.wagonsNumber = 5;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", стоимсоть поездки: " + priceTrip +
                ", время поездки в часа: " + hourTrip +
                ", станция отправления: " + departureStation +
                ", станция прибытия: " + arrivalStation +
                ", количество вагонов: " + wagonsNumber;
    }
}
