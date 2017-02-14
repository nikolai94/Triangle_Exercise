/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_opg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nikolai
 */
public class Test_Opg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //test if is triangle    
//        //should be false
//        System.out.println("Test if is triangle(4): " + calc(1,2,3));
//        
//        //ligesidet
//        System.out.println("Skulle være ligesidet(1): " + calc(3,3,3));
//        
//        //ligebenet
//        System.out.println("Skulle være ligebenet(2): " + calc(3,3,1));
//        
//        //ingen ens sider
//        System.out.println("Skulle ikke have nogle ens sider(3): " + calc(2, 3, 4));
//        
//        //en eller flere sider er 0
//        System.out.println("En eller flere sider er 0(4): " + calc(0, 1, 2));  

        //this is only for read from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countWhile = 0;
        int vaules[] = new int[3];
        String arrayMsg[] = {"Ligesidet", "Ligebenet", "Ingen ens sider", "Ikke en trekant", "En anden fejl" };
        
        while (true) {
            if(countWhile > 2){
                System.out.println("Resultat " + arrayMsg[(calc(vaules[0], vaules[1], vaules[2])-1)] );
                break;
            }
                
            try {
                System.out.print("Enter "+(countWhile+1)+" value");
                System.out.println("");

                int vaule = Integer.parseInt(br.readLine());
                vaules[countWhile] = vaule;
                System.out.println("Vaule "+(countWhile+1)+" : " + vaule);
            } catch (NumberFormatException | IOException nfe) {
                System.err.println("Invalid Format. All values most be int, please run the program again.");
                break;
            }
            countWhile++;
        }
    }

    /*
    Returns:
    1 = ligesidet
    2 = ligebenet
    3 = ingen ens sider
    4 = ikke en trekant
    5 = en anden fejl
     */
    private static int calc(int value1, int value2, int value3) {
        //check if is a triangle
        if ((value1 + value2) <= value3 || (value1 + value3) <= value2 || (value2 + value3) <= value1) {
            return 4;
        } //equilateral triangle (ligesidet)
        else if (value1 == value2 && value1 == value3) {
            return 1;
        } //isosceles (ligebenet)
        else if (value1 == value2 || value1 == value3 || value2 == value3) {
            return 2;
        } //scalene (ingen ens sider)
        else if (value1 != value2 && value1 != value3 && value2 != value3) {
            return 3;
        }

        return 5;
    }

}
