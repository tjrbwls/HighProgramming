open class Vehicle {
    init{
        println("Vehicle 초기화")
    }
    var currentSpeed = 0
    open fun start() = "I'm moving"
    fun stop(){
        println("Stopped")
    }
}