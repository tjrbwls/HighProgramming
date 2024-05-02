fun processCollection(c:Iterable<Any>){} //가변 컬렉션인 경우에는 에러 발생

fun main(){
    val list = listOf("red", "green", "blue")
    for(item in list){
        print(item + " ")
    }
    processCollection(list)
} // 이터러블 불변 타입 예제