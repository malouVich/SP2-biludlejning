public class ElectricCar extends ACar{
    private final int batteryCapacity;
    private final int maxRange;



    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }
    public int getBatteryCapacity() {

        return batteryCapacity;
    }

    public int getMaxRange() {

        return maxRange;
    }

    public int getWhPrKm(){
        return (getBatteryCapacity()*1000) / getMaxRange();
    }
    @Override
    public  int getRegistrationFee(){
        int kmPrLitreConversion = (int) (100 / (getWhPrKm() / 91.25));
        if(kmPrLitreConversion<5){
            return 10740;
        }
        if(kmPrLitreConversion<10){
            return 5500;
        }
        if(kmPrLitreConversion<15){
            return 2340;
        }
        if(kmPrLitreConversion<20){
            return 1050;
        }
        return 330;

    }




    @Override
    public String toString() {
        return super.toString()+"\n Fuel type: Electric \n Battery capacity: "+batteryCapacity+" kWh \n Maximum range: "+maxRange+" km \n";
    }

    


}
