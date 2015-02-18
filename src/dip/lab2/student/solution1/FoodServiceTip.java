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
public class FoodServiceTip implements Tippable {

    private static final double MIN_BILL = 0.00;

    private static final String BILL_ENTRY_ERR
            = "Error: bill must be greater than or equal to " + MIN_BILL;

    private static final double TERRIBLE_RATE = .5;
    private static final double POOR_RATE = 0.10;
    private static final double FAIR_RATE = 0.15;
    private static final double GOOD_RATE = 0.20;
    private static final double EXCELLENT_RATE = .25;

    private double bill;

    private ServiceQuality serviceQuality;

    public FoodServiceTip(double bill, ServiceQuality serviceQuality) {
        this.bill = bill;
        this.serviceQuality = serviceQuality;
    }

    @Override
    public final double tipEmployee() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case TERRIBLE:
                tip = bill * TERRIBLE_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case EXCELLENT:
                tip = bill * EXCELLENT_RATE;
                break;
        }
        return tip;
    }

    public final void setBill(double billAmt) {
        if (billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}