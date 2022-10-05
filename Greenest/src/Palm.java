public class Palm extends Plantor{


    Palm(double height, String name) {
        super(height, name);
        fluid = Fluid.Kran;
    }

    public String getFluid() {
        return null;
    }

    public void calculateFluid() { fluidAmount = fluid.base *height;

    }
}
