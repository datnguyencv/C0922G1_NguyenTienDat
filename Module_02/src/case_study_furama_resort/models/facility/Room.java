package case_study_furama_resort.models.facility;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String idService, String nameService,
                double usableArea, double cost, int maximumPeople,
                String rentType, String freeServiceIncluded) {
        super(idService, nameService, usableArea, cost, maximumPeople, rentType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {

        this.freeServiceIncluded = freeServiceIncluded;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(",%s,", freeServiceIncluded);

    }
}
