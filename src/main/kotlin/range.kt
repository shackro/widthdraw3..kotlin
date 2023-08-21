fun main(){
    for (num in 1..10){
        println(num)
    }
    // characters are in a single quote
    for (letter in 's'..'z')
    {
        println(letter)
    }
    //break
    for (letter in 'A'..'D')
    {
        if (letter=='C'){
            break
        }
        println(letter)

    }
    //continue
    for (num in 20..30)
    {
        if (num==25){
            continue
        }
        println(num)
    }




}