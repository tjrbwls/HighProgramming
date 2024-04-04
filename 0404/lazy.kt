import java.io.File

val text by lazy {
    File("data.txt").readText()
}

fun main(){
    while(true){
        when(val= readLine() ?: return){
            "print data" -> println(text)
            "exit" -> return
        }
    }
} // 지연계산 프로퍼티 예제