package WorkinWithAbstraction.HotelReservation;

public enum Discount {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1);

    private double priceReductionFactor;

    Discount(double priceReductionFactor) {
        this.priceReductionFactor = priceReductionFactor;
    }

    public double getPriceReductionFactor() {
        return priceReductionFactor;
    }
}
