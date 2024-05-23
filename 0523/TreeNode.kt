class TreeNode<T>(val data:T) {
    private val _children = arrayListOf<TreeNode<T>>()
    var parent:TreeNode<T>?=null
        private set
    val children:List<TreeNode<T>>
        get()=_children
    fun addChild(data:T) = TreeNode(data).also {
        _children += it
        it.parent = this
    }
    override fun toString(): String = _children.joinToString(prefix = "$data{", postfix = "}")
}