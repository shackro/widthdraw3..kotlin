fun main(){
    var language= arrayOf("kotlin","java","php")
    //accessing an element
    println(language[0])
    println(language[2])
    //reassigning an array according to the index position
    language[1]="python"

    //to print out an array we use a loop ;;;for loop
    for (x in language){
        println(x)
    }

    //length of the array.......
    println(language.size)


    //adding an element to an array
    var new=language.plus("C++")
    for (y in new){
        println(y)
    }


}