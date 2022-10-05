public class Köttätare extends Plantor{

    final private double additive;

    Köttätare(double height, String name) {
        super(height, name);

        additive = 0.2;
        fluidAmount = 0.1 + additive * height;

    }

    public String getFluid() {
        return "Växten ska ha " + fluidAmount + " liter vatten.";
    }



    }

