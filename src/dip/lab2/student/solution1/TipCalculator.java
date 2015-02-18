/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Matthew
 */
public class TipCalculator {
    
    Tippable employeeTip;
    
    public TipCalculator(Tippable t){
        this.employeeTip = t;
    }
    
    public final double getTip(){
        return employeeTip.tipEmployee();
    }
    
}