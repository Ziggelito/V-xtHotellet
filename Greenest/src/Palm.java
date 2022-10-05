// Här har vi exempel på ett Arv
public class Palm extends Plantor{


    Palm(double height, String name) {
        super(height, name);
        fluidAmount = 0.5 * height;
    }
// Här har vi ett exempel på Polymorfism
    public String getFluid() {
        return "Växten ska ha " + fluidAmount + " liter vatten.";
    }


}
