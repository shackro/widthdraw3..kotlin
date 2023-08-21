open class Animal(val name:String){
    open fun sound(){
        println("$name makes a sound")
    }
}
class Cat(name:String):Animal(name){
    override fun sound(){
        println("$name meows")

    }
}
class Dog(name:String):Animal(name){
    override fun sound(){
        println("$name barks")
    }
}
class cow(name: String):Animal(name)
{
    override fun sound()
        {
            println("$name moow")
        }

}

fun main(){
    val dog=Dog("Bosco")
    val cat=Cat("Meow")
    val Cow=cow("mooooow")
}