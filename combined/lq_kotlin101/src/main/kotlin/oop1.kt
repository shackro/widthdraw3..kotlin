class People(val name:String, val age :Int, val gender: String){
    //member function for intro//
    fun jitambulishe(){
        println("Hi my name is $name , I am $age years old and I am a $gender")
    }
    //member function to hava a birthday//
    fun havebirthday(){
        //age++
    println("$name just turned $age")


    }
}
fun main(args: Array<String>){
    //create an instance(objects) of the class
    val watu=People("John",45,"male")
    watu.jitambulishe()
    watu.havebirthday()
    var watu2=People("Annlisa",27,"female")
    watu2.jitambulishe()
    watu2.havebirthday()
}