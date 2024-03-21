public abstract class AFuelCar extends ACar {

    public final int kmPrLitre;



    public AFuelCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber,make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){
        return "Fuel";

    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Fuel type: "+getFuelType()+" \n Km per litre: "+getKmPrLitre()+"\n";
    }
}
