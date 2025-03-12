
class Battery {
    private int capacity;  

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

   
    public void displayBatteryInfo() {
        System.out.println("Battery capacity: " + capacity + " mAh");
    }
}

class Mobile {
    private String model;
    private Battery battery;  

    public Mobile(String model, int batteryCapacity) {
        this.model = model;
        this.battery = new Battery(batteryCapacity); 
    }

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    public void displayMobileInfo() {
        System.out.println("Mobile Model: " + model);
        battery.displayBatteryInfo();  // Calling the Battery's method to display battery info
    }
}
public class Batteryy {
    public static void main(String[] args) {
        
        Mobile mobile = new Mobile("SmartPhone X", 5000);
        
        mobile.displayMobileInfo();
    }
}
