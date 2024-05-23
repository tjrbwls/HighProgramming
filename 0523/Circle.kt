import kotlin.math.PI
class Circle(val radius:Double):Shape() {
    val diameter
        get()=2*radius
    override val width: Double
            get() = diameter
    override val height: Double
        get() = diameter
    override fun area()= PI*radius*radius
}