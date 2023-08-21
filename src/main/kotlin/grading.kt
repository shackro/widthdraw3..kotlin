import java.util.Scanner

fun main() {

    var grade = Scanner(System.`in`)

    println("ENTER YOUR TOTAL MARKS ::")
    var comments=grade.nextInt()

    if (comments>=92 && comments<100){
        println("A")
    }
    else  if (comments>=87 && comments<92){
        println("A-")
    }
    else if (comments>=70 && comments<87){
        println("B+")
    }
    else if (comments>=64 && comments<70){
        println("B")
    }
    else if (comments>=55 && comments<64){
        println("B-")
    }
    else if (comments>=50 && comments<55){
        println("C")
    }
    else if (comments>=40 && comments<50){
        println("D")
    }
    else {
        println("E")
    }



}