fun <T:Number> TreeNode<T>.average():Double{
    var count = 0
    var sum = 0.0
    walkDepthFirst {
        count++
        sum += it.toDouble()
    }
    return sum/count
}

fun <T:Comparable<T>> TreeNode<T>.maxNode():TreeNode<T>{
    val maxChild = children.maxByOrNull { it.data }?: return this
    return if(data>=maxChild.data) this else maxChild
}

fun main(){
    val root = TreeNode(1).apply {
        addChildren(1,3,5,6,8,0,1,3,5,6,8)
    }
    println(root)
    println(root.depth)
    println(root.average())
    println(root.maxNode())
} // 타입 파라미터 제약 예제