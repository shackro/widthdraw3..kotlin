fun main(arg:Array<String>) {
    var num=5
    if(num>10){
        println("The number is greater")
    }else{
        println("The number is less")
    }


//if...else if...else statements//

    val nambari=89
    if(nambari<0){
        println("It is a negative number")
    }else if (nambari>0 && nambari<10)
        println("It is a one digit number")
    else if (nambari>=10 && nambari<100)
        println("It is a double digit number")
    else
        println("It is a three or more digit number")

}



//create an if...else if, else statement to check marks as E(30 & below), fail(>30-=<49),pass(>50-)