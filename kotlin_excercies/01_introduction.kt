/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

data class Book(var title:String, var author:String)

fun printRelations(company: String,product: String, pred: (String,String) -> String): Unit {
    val result = pred(company,product)
    println(result)
}

fun main(args: Array<String>){
    val fn:(String,String)->String={org,portal->"$org develops $portal"};
    
    printRelations("JetBrains","Kotlin",fn);
    //val message: String= "geeksforgeeks";
    //println(message);
}