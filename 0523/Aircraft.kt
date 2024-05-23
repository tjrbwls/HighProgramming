class Aircraft : FlyingVehicle {
    override var currentHeight = 0
        private set

    override var currentSpeed = 0
        private set

    override fun takeOff(){
        println("Taking Off...")
        currentHeight = 5000
        currentSpeed = 200
    }

    override fun land() {
        println("Landed")
        currentHeight = 0
        currentSpeed = 0
    }

    override fun move(){
        println("Moving")
        currentSpeed = 200
    }

    override fun stop(){
        println("Stopped")
        currentSpeed = 0
    }
}