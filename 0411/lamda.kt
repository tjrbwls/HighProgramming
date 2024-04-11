/* fun check(s:String, condition:(Char)->Boolean):Boolean{
    for(c in s){
        if(!condition(c)) return false
    }
    return true
}

fun main(){
    println(check("Hello"){it.isLetter()}) // 파라미터가 하나일 경우 it 사용가능
    println(check("Hello"){c->c.isLowerCase()}) // 그냥 사용하여도 무관하다
} it 사용 람다 예제 */

/* fun check(s:String, condition:(Int, Char)->Boolean):Boolean{
    for(i in s.indices){
        if(!condition(i, s[i])) return false
    }
    return true
}

fun main(){
    println(check("Hello"){_, c->c.isLetter()}) // index 값을 사용하지 않는 것은 밑줄로 지정가능
    println(check("Hello"){i, c -> i==0 || c.isLowerCase()})
} it을 사용하지 않는 람다 예제 */

fun foreach(a:IntArray, action:(Int)->Unit){
    for(n in a){
        action(n)
    }
}

fun main(){
    var sum = 0
    foreach(intArrayOf(1, 2, 3, 4, 5), fun(i):Unit{sum += i})
    println(sum)
} // 익명함수 예제