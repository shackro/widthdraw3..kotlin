fun main() {
//    for loops    //
    for (i in 5..15){
        println("My loops: $i")
    }
    var  myarr= arrayOf("Eric", "John","Clare","Purity")
    for (names in myarr){
        println("Students : $names")
    }
//    do..while   //
    var num=100
    do {
        println("Loop : $num")
        num++
        //num+=2//
    }while (num<=110)

}