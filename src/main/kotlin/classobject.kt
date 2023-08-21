class Person{
    //ATTRIBUTE /property/variables
    var name ="shackro"
    var skintone="darkskin"
    var age=21

    //method /function
    fun eat(){
        println("EATING")

    }
    fun walk(){
        println("WALKING")

    }

}
fun main(){
    //object 1
    var teacher= Person()
    println(teacher.age)

//to be able to call a function with a object it must be called
    teacher.walk()

    //object 2
    var teacher2= Person()
    println(teacher2.name)

    teacher2.eat()
}