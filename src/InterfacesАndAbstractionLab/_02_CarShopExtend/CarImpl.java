package InterfacesАndAbstractionLab._02_CarShopExtend;


public class CarImpl implements Car {

  private static final Integer TIER =4 ;

    private String model;
    private String color;
    private  Integer horsePower;
    private String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduce() {
        return countryProduced;
    }


    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",model,countryProduced,TIER);
    }
}
