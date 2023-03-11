package InterfacesАndAbstractionLab._01_CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
 public static    int TIRE=4;


 String getModel();
 String getColor();
 int getHorsePower();
 String countryProduced();



}
