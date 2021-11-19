package controller.specific;

public class CarInformationsController {
    
    private String carName;
    private String carColor;
    
    public String getCarInfo(){
        return carName+":"+carColor;
    }
    
    public void postCarInfo(String carColor,String carName){
         this.carColor=carColor;
         this.carName = carName;
    }
    
}
