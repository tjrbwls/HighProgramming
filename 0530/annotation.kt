/* package annotation

@Repeatable
@Retention(AnnotationRetention.SOURCE)
annotation class Author(val name:String)

@Author("happy")
@Author("merry")
class Services 내장 애너테이션 예제1 */

@Deprecated(
    "Use readInt() instead",
    ReplaceWith("readInt()"),
    DeprecationLevel.WARNING
)

fun readNum() = readLine()!!.toInt()

fun main(){
    val a = readNum()
} // 내장 애너테이션 예제2