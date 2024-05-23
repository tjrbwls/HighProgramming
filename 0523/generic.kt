/* fun main(){
    val root = TreeNode("Hello").apply { addChild("world") }
    println(root)
} 제네릭 선언 예제1 (TreeNode 사용 코드) */

fun <T> TreeNode<T>.addChildren(vararg data:T){
    data.forEach { addChild(it) }
}

fun <T> TreeNode<T>.walkDepthFirst(action:(T)->Unit){
    children.forEach { it.walkDepthFirst(action) }
    action(data)
}

val <T> TreeNode<T>.depth:Int
    get()=(children.asSequence().map { it.depth }.maxOrNull()?:0)+1

fun main(){
    val root = TreeNode("Hello").apply {
        addChildren("haha","hoho","hehe","!!!")
    }
    println(root)
} // 제네릭 선언 예제2 (타입 파라미터)