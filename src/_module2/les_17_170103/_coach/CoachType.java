package _module2.les_17_170103._coach;

public enum CoachType {
    P(54), L(18), K(36);
    private int placesCount;
    public int getPlacesCount() {
        return placesCount;
    }
    CoachType(int placesCount) {
        this.placesCount = placesCount;
    }
}
