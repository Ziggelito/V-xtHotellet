// Här har vi ett exempel på ett Interface
public abstract class Plantor implements interfaceTillPlantor {
    //Här har vi ett exempel på en inkapsling

    final protected double height;

    final protected String name;

    protected double fluidAmount;



    Plantor( double height, String name){
        this.height = height;
        this.name = name;

    }




}
