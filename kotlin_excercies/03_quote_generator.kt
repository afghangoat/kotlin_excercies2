import kotlin.random.Random

/*
  	const quotes_start:String =["The","A","One"];
	const quotes_subject: String=["lion","human","small dog","dragon","little pig"];
	const quotes_smth: String=["never","always","only"];
	const quotes_what: String=["rapes","barks","roars","kills","drinks","defeats"];
	const quotes_second_subject: String=["the small dog","a glass of water","its kind","the king","the traitors","the wild boar","himself","itself","herself"];
	const quotes_end: String=["when it barks.","after the fight.","before the dark.","before the light.","in the jungle.","on the rails.","in its throne."];
*/

class quoteGenerator {
    val quotes_start= arrayOf("The","A","One","Many")
    val quotes_subject=arrayOf("lion","human","small dog","dragon","little pig")
	val quotes_smth=arrayOf("never","always","only")
	val quotes_what=arrayOf("rapes","barks","roars","kills","drinks","defeats")
	val quotes_second_subject=arrayOf("the small dog","a glass of water","its kind","the king","the traitors","the wild boar","himself","itself","herself")
	val quotes_end=arrayOf("when it barks.","after the fight.","before the dark.","before the light.","in the jungle.","on the rails.","in its throne.")

    fun generate(count: Int): String {
        var quotes: String="";
        for (i in 0..count){
        	val quote: String=quotes_start[Random.nextInt(0, quotes_start.size)]+" "+quotes_subject[Random.nextInt(0, quotes_subject.size)]+" "+quotes_smth[Random.nextInt(0, quotes_smth.size)]+" "+quotes_what[Random.nextInt(0, quotes_what.size)]+" "+quotes_second_subject[Random.nextInt(0, quotes_second_subject.size)]+" "+quotes_end[Random.nextInt(0, quotes_end.size)];
            quotes+=quote;
        	quotes+="\n";
   		}
        return quotes;
    }
}

fun main(){
    
    val quotegenner = quoteGenerator()
    println(quotegenner.generate(6));
}