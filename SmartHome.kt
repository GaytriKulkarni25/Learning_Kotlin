class SmartHome(val smartTV : SmartTvDevice,
                val smartLight: SmartLightDevice) {


    var deviceTurnOnCount = 0
        private set(value) {
            field = value
        }

    fun turnOnTV(){
        if(this.smartTV.deviceStatus=="online") {
            deviceTurnOnCount++
            smartTV.turnOn()
        }
    }

    fun turnOffTV(){
        if(this.smartTV.deviceStatus=="online") {
            deviceTurnOnCount--
            smartTV.turnOff()
        }
    }

    fun increaseTvVolume() {
        if(this.smartTV.deviceStatus=="online") {
            smartTV.increaseSpeakerVolume()
        }
    }

    fun changeTvChannelToNext() {
        if(this.smartTV.deviceStatus=="online") {
            smartTV.nextChannel()
        }
    }

    fun turnOnLight() {
        if(this.smartTV.deviceStatus=="online") {
            smartLight.turnOn()
        }
    }

    fun turnOffLight() {
        if(this.smartTV.deviceStatus=="online") {
            smartLight.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if(this.smartTV.deviceStatus=="online") {
            smartLight.increasebrightnessLevel()
        }
    }

    fun turnOffAllDevices() {
        if(this.smartTV.deviceStatus=="online") {
            turnOffTV()
        }
        if(this.smartLight.deviceStatus=="online") {
            turnOffTV()
        }
        turnOffLight()
    }


}