fun main(args: Array<String>) {
   takeInt(arrayOf(12, 13, 145, 15, 18))
    volume(7.0)
    //println( isPalindrome("madam"))
    baker("Barnie bakes brown bagels and buns")

}
//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun baker(sentence:String){
    for(x in sentence){
        println(x)
    }



}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.

//
fun takeInt(x:Array<Int>):Int{
    return(x.count())
    return(x.sum())//property


}


//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun volume(radius:Double){
    var volume = 4/3 * 3.14159 * radius
    println(volume)
}
//4. A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.

fun isPalindrome(word:String){
  var word="madam"
    if (word.reversed()=="word"){
        println("true")
    }
    else{
        println("false")
    }
    return word



}
