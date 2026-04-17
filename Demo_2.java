

public class Demo_2 {
    public static void main(String[] args){
        System.out.println("Hallo Robert");
        System.out.println("Die ersten 30 geraden Zahlen:");
        for(int zahl=0; zahl<60; zahl++){               //Operation wird wie in C durchgeführt % ist modulo und gibt den rest der division aus 
            if(zahl % 2 == 0){                    //println(zahl) gibt den wert der int variable "zahl" aus 
                System.out.println(zahl);
            }
        }
        System.out.println("Die ersten 30 ungeraden Zahlen:");
        for(int zahl2 =0; zahl2<60; zahl2++){
            if(zahl2 % 2 != 0){
                System.out.println(zahl2);
            }
        }
    }
    
}
