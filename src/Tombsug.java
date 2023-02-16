import java.util.Scanner;

public class Tombsug {

    public Tombsug() {
        this.feladat0312();
    }
    private void feladat0312(){
        System.out.println("0312 megoldás");
        System.out.println("Rombuszba írható kör sugara");
         //Bekérés
        // A Scanner osztály példányosítása
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oldal:");
        double side = Double.parseDouble(scanner.nextLine());
        System.out.print("Alfa szög:");
        double alpha = Double.parseDouble(scanner.nextLine());
        scanner.close();
        
        double radius = Rhombus.calcRadius(side, alpha);
        System.out.println("Sugar:"+radius);
 
 
     }
}
