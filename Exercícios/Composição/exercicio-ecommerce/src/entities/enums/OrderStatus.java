package entities.enums;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int enumIndex;

    OrderStatus(int enumIndex) {
        this.enumIndex = ordinal();
    }
}
