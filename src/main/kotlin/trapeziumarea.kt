import java.util.Scanner


fun main(){
    var reader= Scanner(System.`in`)

    println("Enter a ::")
    var a=reader.nextDouble()

    println("Enter b ::")
    var b=reader.nextDouble()

    println("Enter height ::")
    var height=reader.nextDouble()

    var sum=a+b
    var half=sum*0.5

    var area=half*height
    println("THE Area of Trapezium Is:: $area")


}

