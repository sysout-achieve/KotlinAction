class ConstructorExample(val name:String="hi", var isAble:Boolean){
    var count=0
    private var inVisible=0
    private set

}

fun main() {
    var constructorExample = ConstructorExample(name="ii", isAble = true)
    constructorExample.isAble = false
    println(constructorExample.name)
}