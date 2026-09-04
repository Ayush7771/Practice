fun main() {
    val a = Child()
    a.printValue()
}

internal open class Parent {
    protected val protectedValue = 42
    val privateValue = 20
}

private class Child : Parent() {
    fun printValue() {
        println(protectedValue)
        println(privateValue)
    }
}