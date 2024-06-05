public class ZombiePlant {
    private int potency;
    private int treatmentsNeeded;

    public ZombiePlant(int potency, int treatmentsNeeded) {
        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;
    }
    public int getPotencyRequired() {
        return potency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        return treatmentsNeeded() > 0;
    }

    public void treat(int potency) {
        if (potency > 0) {
            if (treatmentsNeeded()>=0 && potency > this.potency) {
                treatmentsNeeded++;
            } else if (treatmentsNeeded()>0) {
                treatmentsNeeded--;

            }
        }
    }
}

