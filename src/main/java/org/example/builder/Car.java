
// Car.java
public class Car {
    private String engine;
    private String transmission;
    private String interior;
    private String color;
    private boolean hasSunroof;
    private boolean hasGPS;
    private boolean hasSafetyPackage;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.interior = builder.interior;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
        this.hasSafetyPackage = builder.hasSafetyPackage;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission + ", interior=" + interior + 
               ", color=" + color + ", hasSunroof=" + hasSunroof + ", hasGPS=" + hasGPS + 
               ", hasSafetyPackage=" + hasSafetyPackage + "]";
    }

    // Builder class for Car
    public static class Builder {
        private String engine;
        private String transmission;
        private String interior;
        private String color;
        private boolean hasSunroof;
        private boolean hasGPS;
        private boolean hasSafetyPackage;

        public Builder(String engine, String transmission) {
            // Mandatory fields
            this.engine = engine;
            this.transmission = transmission;
        }

        // Optional features
        public Builder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public Builder setSafetyPackage(boolean hasSafetyPackage) {
            this.hasSafetyPackage = hasSafetyPackage;
            return this;
        }

        // Build method to return the final Car object
        public Car build() {
            return new Car(this);
        }
    }
}