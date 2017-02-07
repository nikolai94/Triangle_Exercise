/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_opg1;

/**
 *
 * @author nikolai
 */
public class Test_Opg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test if is triangle    
        //should be false
        System.out.println("test if is triangle(4): "+ calc(1,2,3));
        
        //ligesidet
        System.out.println("skulle være ligesidet(1): "+ calc(3,3,3));
        
        //ligebenet
        System.out.println("skulle være ligebenet(2): "+ calc(3,3,1));
        
        //ingen ens sider
        System.out.println("skulle ikke have nogle ens sider(3): "+calc(2, 3, 4));
        
        
        
    }
    
    /*
    Returns:
    1 = ligesidet
    2 = ligebenet
    3 = ingen ens sider
    4 = ikke en trekant
    5 = en anden fejl
    */ 
    private static int calc(int value1, int value2, int value3){
        
        //check if is a triangle
        if((value1 + value2) <= value3 || (value1 + value3) <= value2 || (value2 + value3) <= value1)
            return 4;
        
        //equilateral triangle (ligesidet)
        if(value1 == value2 && value1 == value3)
            return 1;
        //isosceles (ligebenet)
        else if(value1 == value2 || value1 == value3 || value2 == value3)
            return 2;
        //scalene (ingen ens sider)
        else if(value1 != value2 && value1 != value3 && value2 != value3)
            return 3;
        
        return 5;
    }
    
}
