package Blommor;

import Blommor.Kaktus;
import Blommor.Köttätare;
import Blommor.Palm;
import Blommor.Plantor;

import javax.swing.*;
import java.util.ArrayList;

public class Rutan {




    public static String Rutan() {
        String input = JOptionPane.showInputDialog("Vilken planta vill du vattna?");




        ArrayList<Plantor> plantor = new ArrayList<Plantor>();

        plantor.add(new Kaktus(0.02, "Igge"));
        plantor.add(new Palm(5, "Laura"));
        plantor.add(new Köttätare(0.7, "Meatloaf"));
        plantor.add(new Palm(1,"Putte"));

        String planta;
        switch (input){
            case "Igge": planta = plantor.get(0).getFluid();
            break;
            case "Laura": planta = plantor.get(1).getFluid();
            break;
            case "Meatloaf": planta = plantor.get(2).getFluid();
            break;
            case "Putte": planta = plantor.get(3).getFluid();
            break;
            default: planta = "Den gästen finns inte.";
            break;
        }
        return planta;





    }
}
