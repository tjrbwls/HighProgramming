/* interface List<out T>{ // 실제로 생산자 타입으로 동작
    val size:Int
    fun get(index:Int):T
}
class ListByArray<T>(private vararg val items:T):List<T>{
    override val size:Int get() = items.size
    override fun get(index:Int) = items[index]
}
fun <T> concat(list1:List<T>,list2:List<T>) = object : List<T>{
    override val size: Int
        get() = list1.size+list2.size
    override fun get(index: Int): T {
        return if(index < list1.size){
            list1.get(index)
        }else{
            list2.get(index-list1.size)
        }
    }
}

fun main(){
    val numbers = ListByArray<Number>(1, 2.5, 3f)
    val integers = ListByArray(10, 20, 30)
    println(concat(numbers, integers))
} 선언 지점 변성 예제 */

/* fun <T,U:T> TreeNode<T>.addSubtree(node:TreeNode<U>):TreeNode<T>{
    val newNode= addChild(node.data)
    node.children.forEach{ newNode.addSubtree(it) }
    return newNode
}

fun main(){
    val root = TreeNode("abc")
    val subRoot= TreeNode("def")

    root.addSubtree(subRoot)
    println(root)
} 프로젝션을 사용한 사용지점 변성 예제1 */

fun <T> TreeNode<T>.addTo(parent:TreeNode<in T>){
    val newNode= parent.addChild(data)
    children.forEach{ it.addTo(newNode) }
}
fun main(){
    val root = TreeNode<Number>(123)
    val subRoot= TreeNode(456.7)
    subRoot.addTo(root)
    println(root)
} // 프로젝션을 사용한 사용지점 변성 예제2

