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
public class BaggageHandlerTip implements Tippable {

    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR
            = "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;

    private static final double TERRIBLE_RATE = .25;
    private static final double POOR_RATE = 0.5;
    private static final double FAIR_RATE = 0.75;
    private static final double GOOD_RATE = 1.0;
    private static final double EXCELLENT_RATE = 1.25;

    private double baseTipPerBag;
    private int bagCount;

    private ServiceQuality serviceQuality;

    public BaggageHandlerTip(ServiceQuality q, int bags, int bTPB) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);
        this.setBaseTipPerBag(bTPB);
    }

    @Override
    public double tipEmployee() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case TERRIBLE:
                tip = baseTipPerBag * bagCount * (1 + TERRIBLE_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case EXCELLENT:
                tip = baseTipPerBag * bagCount * (1 + EXCELLENT_RATE);
                break;
        }
        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if (bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if (baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
