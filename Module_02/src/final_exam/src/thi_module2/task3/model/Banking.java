package thi_module2.task3.model;

public class Banking {
    //Tính bao đống
    private int idCustomer;
    private String idMoneyBook;
    private String nameCustormer;
    private String money;
    private String expDate;
    private String costMoney;

// Tính trừu tượng
    public Banking() {
    }

    public Banking(int idCustomer, String idMoneyBook, String nameCustormer, String money, String expDate, String costMoney) {
        this.idCustomer = idCustomer;
        this.idMoneyBook = idMoneyBook;
        this.nameCustormer = nameCustormer;
        this.money = money;
        this.expDate = expDate;
        this.costMoney = costMoney;
    }
//tính bao đống
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdMoneyBook() {
        return idMoneyBook;
    }

    public void setIdMoneyBook(String idMoneyBook) {
        this.idMoneyBook = idMoneyBook;
    }

    public String getNameCustormer() {
        return nameCustormer;
    }

    public void setNameCustormer(String nameCustormer) {
        this.nameCustormer = nameCustormer;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCostMoney() {
        return costMoney;
    }

    public void setCostMoney(String costMoney) {
        this.costMoney = costMoney;
    }

    //tính đa hình
    @Override
    public String toString() {
        return "Banking{" + "idCustomer='" + idCustomer + '\'' + ", idMoneyBook='" + idMoneyBook + '\'' + ", nameCustormer='" + nameCustormer + '\'' + ", money='" + money + '\'' + ", expDate='" + expDate + '\'' + ", costMoney='" + costMoney + '\'' + '}';
    }

    public String convertCSV() {
        return this.getIdCustomer() + "," +this.nameCustormer + "," + this.getIdMoneyBook() + "," + this.getMoney() + "," + this.getExpDate() + "," + this.getCostMoney();
    }

}
