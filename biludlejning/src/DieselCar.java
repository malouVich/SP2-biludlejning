public class DieselCar extends AFuelCar{

    private boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int totalRegistrationFee = 0;

        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            totalRegistrationFee = 330+130;
        }
        if (kmPrLitre >= 15 && kmPrLitre <= 20) {
           totalRegistrationFee = 1050+1390;
        }
        if (kmPrLitre >= 10 && kmPrLitre <= 15){
            totalRegistrationFee = 2340+1850;
        }
        if (kmPrLitre >= 5 && kmPrLitre <= 10){
            totalRegistrationFee = 5500+2770;
        }
        if (kmPrLitre <= 5){
            totalRegistrationFee = 10470+15260;
        }
        if (!hasParticleFilter()){
            return totalRegistrationFee + 1000;
        }
        return totalRegistrationFee;


    }

    @Override
    public String toString() {
        return super.toString();
    }


}

