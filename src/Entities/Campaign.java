package Entities;

public class Campaign {

    private String name;
    private double discount;
    private double productDiscount;

    public Campaign() {

    }

    public Campaign(String name, double productDiscount, double discount) {
        this.name = name;
        this.productDiscount = productDiscount;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getProductDiscount() {
        return this.productDiscount - (this.productDiscount * this.discount / 100);
    }
}
