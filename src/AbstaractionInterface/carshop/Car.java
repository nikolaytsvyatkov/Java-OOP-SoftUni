package AbstaractionInterface.carshop;

import java.io.Serializable;

public interface Car extends Serializable {
    public int TIRES = 4;
    public String getModel();

    public String getColor();

    public int getHorsePower();

    public String countryProduced();
}
