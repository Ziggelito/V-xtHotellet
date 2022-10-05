public enum Fluid {

    Protein ("Proteindryck", 0.02),
    Mineral("Mineralvatten", 0.1),
    Kran("Kranvatten", 0.5);



    public final String typ;
    public final double base;

    Fluid(String s, double b){
        typ = s;
        base = b;
    }




}
