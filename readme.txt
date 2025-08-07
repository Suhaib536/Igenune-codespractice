I have creaded 5 classes and 1 main class
the first class name is smartdevice which is a Abstract class...in that i have 1 field (deviceName)
        here i have added the getter and setter
the second class name is Light which i have extended with smartdevice.....i this i have 1 field (brightness)....and used the super keyword to bring the fields from the smardevice class and used set keyword
        here i have override the performFunction()...this will show the brightness level
the third class name is Thermostat which is also extended to smartdevice class
        in this i have a field (temperature)...which i have initialized like same as i did with the Light class then i have override initialized
the fourth class name is Room here i have three fields (roomname, dev1 and dev2)...here dev1 and dev2 are taken from the abstract class
        created a void showRoomDevice to print the three....we use getDevname() from smartdevice to print the dev1 and dev2 data
the fifth class name is House... here i have 2 fields extended from Room class
In the main function i have created named 2objects namely LivingRoomLight and LivingRoomtheromstat and i have set the values for them using set
same goes with the BedRoom....then finally   created a myhouse object and printed the output