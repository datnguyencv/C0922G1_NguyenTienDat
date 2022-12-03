package case_study_furama_resort.models.facility;

public abstract class Facility {
    int idService;
    String nameService;
    double usableArea;
    double cost;
    int maximumPeople;
    String rentType;

    public Facility(int idService, String nameService,
                    double usableArea, double cost,
                    int maximumPeople,
                    String rentType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.cost = cost;
        this.maximumPeople = maximumPeople;
        this.rentType = rentType;
    }

    public Facility(String nameService, double usableArea,
                    double cost, String maximumPeople, String rentType) {
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return String.format("%s=%s=%.2f=%.2f=%s=%s",
                idService, nameService, usableArea, cost, maximumPeople,rentType);

    }
}
