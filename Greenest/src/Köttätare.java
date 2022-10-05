public class Köttätare extends Plantor{

    final private double multiplier;

    Köttätare(double height, String name) {
        super(height, name);
        fluid = Fluid.Protein;
        multiplier = 0.2;
    }

    public String getFluid() {
        return null;
    }

    public void calculateFluid() { fluidAmount = fluid.base + multiplier * height;

    }
}
