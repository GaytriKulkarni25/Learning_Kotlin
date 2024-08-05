class SmartDevice(var name : String, var category : String) {

         var speakerVolume=2
         var deviceStatus="online"

        fun turnOn() {
            println("Smart device is turned on")
        }

        fun turnOff() {
            println("Smart device is turned off")
        }

        fun display() {
            println("Device name is $name ")
            println("Device category is $category ")
            println("Device volume is $speakerVolume")
            println("Device status is $deviceStatus")
        }

    //secondary constructor
    constructor(name : String, category : String, statusCode : Int) : this(name, category){
        this.name=name
        this.category=category

        deviceStatus = when(statusCode)
        {
            0 -> "online"
            1 -> "offline"
            else -> "unknown"
        }

    }


    }
