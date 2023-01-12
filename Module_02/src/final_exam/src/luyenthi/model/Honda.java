package luyenthi.model;

public class Honda {
    private String idHonda;
    private String nameHonda;
    private String powerHonda;
    private String yearHonda;
    private String madeInHonda;

    public Honda() {
    }

    public Honda(String idHonda, String nameHonda, String powerHonda, String yearHonda, String madeInHonda) {
        this.idHonda = idHonda;
        this.nameHonda = nameHonda;
        this.powerHonda = powerHonda;
        this.yearHonda = yearHonda;
        this.madeInHonda = madeInHonda;
    }

    public String getIdHonda() {
        return idHonda;
    }

    public void setIdHonda(String idHonda) {
        this.idHonda = idHonda;
    }

    public String getNameHonda() {
        return nameHonda;
    }

    public void setNameHonda(String nameHonda) {
        this.nameHonda = nameHonda;
    }

    public String getPowerHonda() {
        return powerHonda;
    }

    public void setPowerHonda(String powerHonda) {
        this.powerHonda = powerHonda;
    }

    public String getYearHonda() {
        return yearHonda;
    }

    public void setYearHonda(String yearHonda) {
        this.yearHonda = yearHonda;
    }

    public String getMadeInHonda() {
        return madeInHonda;
    }

    public void setMadeInHonda(String madeInHonda) {
        this.madeInHonda = madeInHonda;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "idHonda='" + idHonda + '\'' +
                ", nameHonda='" + nameHonda + '\'' +
                ", powerHonda='" + powerHonda + '\'' +
                ", yearHonda='" + yearHonda + '\'' +
                ", madeInHonda='" + madeInHonda + '\'' +
                '}';
    }

    public String convertToCSVHonda(){
        return this.getIdHonda() +","+ this.getNameHonda() +","+ this.getPowerHonda() +","+ this.getYearHonda() +","+ this.getMadeInHonda();
    }
}
