fun main(){
    var inital="hello world!"
    var school="emobilis"
    


    println(inital)
    //ways of accessing elements in a string per char
    println(inital[0])
    println(inital.indexOf(char = 'd'))
    println(inital.indexOf(string = "world"))
    println(inital[10])

//stules that can be applied........
    println(inital.toUpperCase())
    println(inital.toUpperCase()+ " " +school.toUpperCase())
    println(inital.plus( school))
    println(inital+"i study at "+school+" join me today and learn how to code...")
    //combining strings in a way known as string interpolation
    println("$inital i stady at $school welcom today and see what the school does $school better learning skills")


}