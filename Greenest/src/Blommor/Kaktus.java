package Blommor;

public class Kaktus extends Plantor{
    public Kaktus(double height, String name) {
        super(height, name);
        fluidAmount = 0.2;
    }

    public String getFluid() {
        return "Växten ska ha " + fluidAmount + " liter mineralvatten.";
    }


}
