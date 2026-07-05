package o_01ArrayList.Exercise.Test02;

public class Phone {
    private  String brand;
    private  int charge;

    public Phone() {
    }

    public Phone(String brand, int charge) {
        this.brand = brand;
        this.charge = charge;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
    public  void checkPower(){
        if (this.charge < 20) System.out.println("电量过低，请充电");
    }
}
