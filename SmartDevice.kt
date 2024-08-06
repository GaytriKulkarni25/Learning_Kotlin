open class SmartDevice(var name : String, var category : String) {

    protected var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    var deviceStatus="online"
             protected set(value) {
                 field = value
             }
    open val deviceType = "unknown"

       open fun turnOn() {
           deviceStatus = "on"
        }

        open fun turnOff() {
            deviceStatus = "off"
        }

        fun display() {
            println("Device name is $name ")
            println("Device category is $category ")
            println("Device volume is $speakerVolume")
            println("Device status is $deviceStatus")
        }

    fun printDeviceInfo(){
        println("Device name : $name ")
        println("Device category : $category ")
        println("Device volume : $speakerVolume")
        println("Device status : $deviceStatus")
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
