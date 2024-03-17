import java.util.Scanner



fun main(){

    val sc=Scanner(System.`in`)
    //Leap Year
    val year=sc.nextInt()

    val leapYear= year%4

    if (leapYear==0){
        println("$year is Leap Year")

    }
    else{
        println("$year is not Leap Year")
    }

}