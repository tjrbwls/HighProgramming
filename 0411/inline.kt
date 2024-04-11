/* var lastAction:()->Unit = {}

inline fun runAndMemorize(action:()->Unit){
    action() // 이런식으로 호출해서 사용하는 것은 가능하다
    // lastAction = action 함수 타입에 값을 넣는 것은 불가능 함
} inline 함수 예제 */

var lastAction:()->Unit = {}

inline fun runAndMemorize(action:()->Unit){
    action()
}

inline fun forach(a:IntArray, noinline action: ((Int) -> Unit?)){
    if(action == null) return
    for(n in a){
        action(n)
    }
} // inline 함수 안에서 null을 사용하는 방법 예제 (그러나 이득되는게 없으므로 안 사용 하는게 이득이다)

