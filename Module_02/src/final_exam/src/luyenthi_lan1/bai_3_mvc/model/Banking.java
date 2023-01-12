package luyenthi_lan1.bai_3_mvc.model;

public class Banking {
    private String id;
    private String name;
    private String moneyValue;
    private String dateExp;
    private String costIn;

    public Banking() {
    }

    public Banking(String id, String name, String moneyValue, String dateExp, String costIn) {
        this.id = id;
        this.name = name;
        this.moneyValue = moneyValue;
        this.dateExp = dateExp;
        this.costIn = costIn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoneyValue() {
        return moneyValue;
    }

    public void setMoneyValue(String moneyValue) {
        this.moneyValue = moneyValue;
    }

    public String getDateExp() {
        return dateExp;
    }

    public void setDateExp(String dateExp) {
        this.dateExp = dateExp;
    }

    public String getCostIn() {
        return costIn;
    }

    public void setCostIn(String costIn) {
        this.costIn = costIn;
    }

    @Override
    public String toString() {
        return "Banking{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", moneyValue='" + moneyValue + '\'' +
                ", dateExp='" + dateExp + '\'' +
                ", costIn='" + costIn + '\'' +
                '}';
    }

    public String convertCSV(){
        return this.getId() +","+ this.getName()+","+this.getMoneyValue()+","+this.getDateExp()+","+this.costIn;
    }
}
