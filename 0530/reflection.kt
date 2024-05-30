/* import kotlin.reflect.KClass

annotation class Dependency(vararg val componentClasses:KClass<*>)

annotation class Component(
    val name:String= "Core",
    val dependency:Dependency= Dependency()
)

@Component("I/O")
class IO

@Component("Log", Dependency(IO::class))
class Logger

@Component(dependency = Dependency(IO::class, Logger::class))
class Main

fun main(){
    val component = Main::class.annotations.filterIsInstance<Component>().firstOrNull()?:return
    println("Component name : ${component.name}")
    val depText= component.dependency.componentClasses.joinToString{ it.simpleName?:"" }
    println("Dependencies : $depText")
    println((1+2)::class) // kClass 인스턴스 얻기
    println(String::class.isFinal)
    val stringClass = Class.forName("java.lang.String").kotlin
    println(stringClass.isInstance("Hello"))
} 리플렉션 예제1 */

fun main(){
    val personClass= Class.forName("Person").kotlin // fullName을 사용해야만 오류가 나지 않음
    val person = personClass.constructors.first().call("John", "Doe")
    val fullNameFun= personClass.members.first{ it.name== "fullName"}
    println(fullNameFun.call(person, false))
} // 리플렉션 예제2