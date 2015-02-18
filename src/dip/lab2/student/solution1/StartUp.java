/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.text.*;

/**
 *
 * @author Matthew
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumberFormat numFor = new DecimalFormat("0.00");
        
        Tippable tipAction = new FoodServiceTip(40.75, ServiceQuality.GOOD);
        
        TipCalculator tipToEmployee = new TipCalculator(tipAction);
        System.out.println("$" + numFor.format(tipToEmployee.getTip()));
        
        

    }
    
}
