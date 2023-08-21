class Employe(var job_description:String, var salary:Double, var Yrs_of_EXPERIENCE:Int, var AGE:Int){

}
fun main(){
    var rank1=Employe("manager",80000.0,20,32)
    var rank2=Employe("secretary",34000.0,8,28)
    var rank3=Employe("watchman",20000.0,5,24)

    print(rank1.job_description)
    println(rank1.salary)
    println(rank1.Yrs_of_EXPERIENCE)
    
    println(rank2.job_description)
    println(rank3.job_description)

}