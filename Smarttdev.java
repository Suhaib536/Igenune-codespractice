abstract class smartdevice{
    private String deviceName;
    public smartdevice(String deviceName){
        this.deviceName=deviceName;
    }
    public String getDevName(){
        return deviceName;
    }
    public void setDevName(String deviceName){
        this.deviceName=deviceName;   
    }
    abstract public void performFunction();
}

/*---------------------------------------------------------------------------------------------------- */


class Light extends smartdevice{
    private int brightnessLevel;
    public Light(String deviceName){
        super(deviceName);
    }
    public void setBrightness(int Level){
        this.brightnessLevel=Level;
    }
    public void performFunction(){
        System.out.println(getDevName()+" " + brightnessLevel);
    }
}

/*---------------------------------------------------------------------------------------------------- */


class Thermostat extends smartdevice{
    private double temperature;
    public Thermostat(String devName){
        super(devName);
    }
    public void setTemperature(double temp){
        this.temperature=temp;
    }
    public void performFunction(){
        System.out.println(getDevName()+" " + temperature);
    }
}

/*---------------------------------------------------------------------------------------------------- */


class Room{
    private String roomName;
    private smartdevice dev1;
    private smartdevice dev2;
    public Room(String roomName,smartdevice dev1,smartdevice dev2){
        this.roomName=roomName;
        this.dev1=dev1;
        this.dev2=dev2;
    }
    public void showRoomDevice(){
        System.out.println("ROOM NAME : "+roomName);
        System.out.println("DEVICE NAME 1 : "+dev1.getDevName());
        System.out.println("DEVICE NAME 2 : "+dev2.getDevName());
    }
    public void controlDevice(){
        dev1.performFunction();
        dev2.performFunction();
    }
}

/*---------------------------------------------------------------------------------------------------- */

class House{
    private Room room1;
    private Room room2;
    public House(Room room1, Room room2){
        this.room1=room1;
        this.room2=room2;
    }
    public void showAllDevice(){
        room1.showRoomDevice();
        room2.showRoomDevice();
    }
    public void controlDevice(){
        System.out.println();
        room1.controlDevice();
        room2.controlDevice();
    }
}

/*---------------------------------------------------------------------------------------------------- */

public class Smarttdev {
    public static void main(String[] args){
        Light  LivingRoomLight = new Light("Living Room");
        LivingRoomLight.setBrightness(20);
        Thermostat LivingRoomThermostat = new Thermostat("Living Room");
        LivingRoomThermostat.setTemperature(32);
        Room LivngRoom = new Room("Living Room", LivingRoomLight, LivingRoomThermostat);

        /*---------------------------------------------------------------------------------------------------- */


        Light BedRoomLight = new Light("Bed Room");
        BedRoomLight.setBrightness(60);
        Thermostat BedRoomThermostat = new Thermostat("Bed Room");
        BedRoomThermostat.setTemperature(70);
        Room BedRoom = new Room("Bed Room", BedRoomLight, BedRoomThermostat);

        /*---------------------------------------------------------------------------------------------------- */


        House myHouse = new House(LivngRoom, BedRoom);
        myHouse.showAllDevice();
        myHouse.controlDevice();

         /*---------------------------------------------------------------------------------------------------- */
 
    }
}
