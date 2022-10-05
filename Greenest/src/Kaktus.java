public class Kaktus extends Plantor{
    public Kaktus(double height, String name) {
        super(height, name);
        fluid = Fluid.Mineral;
    }

    public String getFluid() {
        return null;
    }

    public void calculateFluid() { fluidAmount = fluid.base;

    }
}
