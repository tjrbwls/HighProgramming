class Car : Vehicle {
    override var currentSpeed = 0
        private set

    override fun move(){
        println("Riding...")
        currentSpeed = 100
    }

    override fun stop(){
        println("Stopped")
        currentSpeed = 0
    }
}