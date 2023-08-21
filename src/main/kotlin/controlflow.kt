import java.util.Scanner

fun main(){
    var check=Scanner(System.`in`)

    println("Enter the current temperature = ")
    var temperature=check.nextInt()

    if (temperature>37){
        println("IT IS TOO HOT")
    }

    else if (temperature<20){
        println("IT IS TOO COLD")
    }
    else {
        println("normal  temperature")
    }


}