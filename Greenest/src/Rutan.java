import javax.swing.*;

public class Rutan {

    public static String Rutan() {
        String input = JOptionPane.showInputDialog("Vilken planta vill du vattna?");

        String planta;
        switch (input){
            case "Igge": planta = "Igge";
            break;
            case "Laura": planta = "Laura";
            break;
            case "Meatloaf": planta = "Meatloaf";
            break;
            case "Putte": planta = "Putte";
            break;
            default: planta = "Den gästen finns inte.";
            break;
        }
        return planta;





    }
}
