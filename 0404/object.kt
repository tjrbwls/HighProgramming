/* object Application{
    val name="My Application"
    override fun toString()=name
    fun exit(){}
}

fun describe(app:Application) = app.name // Application은 타입

fun main(){
    println(Application) // Application은 값
} 객체 선언 예제 */

/* class Application private constructor(val name:String){
    object Factory{
        fun create(args: Array<String>):Application?{
            val name=args.firstOrNull()?:return null
            return Application(name)
        }
    }
}

fun main(){
    val app = Application.Factory.create(args)?: return
    println("Application started : ${app.name}")
} 동반 객체 선언 예제 */

fun main(Array<String>) {
    fun midPoint(xRange: IntRange, yRange: IntRange) = object {
        val x = (xRange.first + xRange.last) / 2
        val y = (yRange.first + yRange.last) / 2
    }

    val midPoint = midPoint(1..5, 2..6)
    println("${midPoint.x}, ${midPoint.y}")
} // 객체 식 사용 예제