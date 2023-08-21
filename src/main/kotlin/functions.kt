fun main(){

    println("hello kotlin")
//standard library/predefined  function.....
    var squareroot=Math.sqrt(81.0)
    println(squareroot)
//double and float are differentiated with F at the end of th float
    var num=Math.round(34.56f)
    println(num)

    var number=Math.ceil(43.2)
    println(number)


    //user defined function should be outside the main function


    add()
    //aguments.....
    multi(10,6)
    details("shackro",19)

}

//user defined function.....
//to work it should be recalled in th main function...<<<
fun add(){
    var nmber1=3
    var nmber2=4
    println(nmber1+nmber2)

}
//parameterized functions

fun multi(number1:Int,number2:Int){

    println("Product: "+number1*number2)
}

fun details(name:String,age:Int){
    println("my name is $name i am $age years old")

}