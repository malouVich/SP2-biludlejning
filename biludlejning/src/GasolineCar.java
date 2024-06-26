public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber,make, model, numberOfDoors,kmPrLitre);
    }

@Override
    public String getFuelType(){
        return "Gasoline";
}

@Override
    public int getRegistrationFee(){
        int kmPrLitre = getKmPrLitre();
        if(kmPrLitre >= 20 && kmPrLitre <= 50){
            return 330;
        } if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            return 1050;
        }if (kmPrLitre >= 10 && kmPrLitre <= 15){
            return 2340;
        }if (kmPrLitre >= 5 && kmPrLitre <= 10){
            return 5500;
        }
            return 10470;
        }

    @Override
    public String toString() {
        return super.toString();
    }
    }



