import java.time.Year
import java.util.*

object single{
    var name:String=""
    fun printName()= println(name)
}
interface PrinterTexts{
    fun print(text:String)
}
class Exercises private constructor(val name:String){
    companion object{
        fun factory(name:String)= Exercises(name);
    }
    fun printName()= println(name)

}
data class Complex(val real:Double,val imag:Double)
operator fun Complex.plus(com1:Complex):Complex
{

    return Complex((this.real+com1.real),(this.imag+com1.imag))
}
data class EntryTag(
    val id: Long,
    val name: String,
    val color: String,
    val status: String
)
data class EntryTagSelectable(
   val content: EntryTag,
   val isSelected: Boolean,
   val title: String
)



fun main()
{
    val printer= object:PrinterTexts {
        override fun print(text: String) {
            println(text)
        }
    }
    printer.print("mosab")
    single.name="mosab"
    single.printName()
    Exercises.factory("mosab").printName()
    println(addTwoInt(5,6))
    println(multTwoFloat(5.2F,6.5F))
    println(resRem(13,4))
    var num1=4
    var num2=5
    println("$num1 & $num2")
    var temp=num1
    num1=num2
    num2=temp
    println("$num1 & $num2")
    println(removeWhiteSpace("mosab zakarneh"))
    println(frequncyOfChar("mosab zakarneh",'a'))
    println(round(12.9543445,2))
    println(evenOrOdd(31))
    println(largest(listOf(50,90,32,12)))
    println(isLeapYear(366))
    println(posOrNeg(-22.0))
    println(isAlphabet('X'))
    println(isAlphabet('#'))
    println(sumOfNaturalNumbers(1,2,4,5,6,7))
    println(factorial(4))
    println(vowelOrConsonant('x'))
    println(FibonacciSeries(100))
    println(decToBinOrBintoDec(10))
    println(checkValue(arrayOf(1,2,3,4),6))
    println(joinTwoLists(listOf(1,2,3,4), listOf(5,6,7,8)))
    println(sortMapByValue(mapOf("1" to 4,"2" to 10, "3" to 2,"4" to 7)))
    val complex=Complex(2.0,3.0)+Complex(-1.0,-1.0)
    println("${complex.real }+${complex.imag}j ")
    println(isStringANummeric("12a4"))
    val list = mutableListOf<EntryTag>().apply {
        add(EntryTag(9, "Ahmad","#0088dd","ACTIVE"))
        add(EntryTag(5, "rami","#005285","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(7, "Rami","#ffffff","ACTIVE"))
        add(EntryTag(21, "ah","#409bdf","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(76, "Anas","#0079c4","ACTIVE"))
        add(EntryTag(214, "mais","#0088dd","ACTIVE"))
        add(EntryTag(214, "mais","#5c6991","ACTIVE"))
    }
    println(sortList(list))
    val selectedEntryTagId = 43
    val inputList = mutableListOf<EntryTag>().apply {
        add(EntryTag(9, "Ahmad","#0088dd","ACTIVE"))
        add(EntryTag(5, "rami","#005285","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(7, "Rami","#ffffff","ACTIVE"))
        add(EntryTag(21, "ah","#409bdf","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(76, "Anas","#0079c4","ACTIVE"))
        add(EntryTag(214, "mais","#0088dd","ACTIVE"))
        add(EntryTag(214, "mais","#5c6991","ACTIVE"))
    }
    println(createList(inputList,selectedEntryTagId))
    takePrintFun( {println(it)},"mosab")
    val list2= mutableListOf<Int>()
    for (i in 1..12)
    {
        list2.add(i)
        list2.add(i)
    }
    println(removeDuplicates(list2))
    println(twoArrayIsEqual(arrayOf(1,2,3,4), arrayOf(1,2,3,4)))
    println(removeOddOrNegativeFromList(listOf(1,-1,3,4,7,-3)))
    println(removeNullFromList(listOf(null,1,null,2,null)))
    println(reverseList(listOf(1,2,3,5)))
    println(stringToArray("mosab"))










}
fun addTwoInt(num1:Int,num2:Int)=num1+num2
fun multTwoFloat(num1:Float,num2:Float)=num1*num2
fun resRem(num1:Int,num2:Int)="result= ${num1/num2} remainder=${num1%num2} "
//fun swapTwoNumber(num1:Number,num2:Number){ }
fun removeWhiteSpace(text : String)=text.replace(" ","")
fun frequncyOfChar(string: String,char:Char):Int {
    var count=0
    for (c in string) if(c==char) count++
    return count
}
fun round(num:Double,n:Int)= kotlin.math.round(num*10*n)/(10*n)
fun evenOrOdd (num:Int):String{
    if(num%2==0)return "$num is even"
    else return "$num is odd"
}
fun <T:Int> largest(listOfNumbers:List<T>):T?
{
    return listOfNumbers.maxOrNull()
}
fun isLeapYear(daysOfYear: Int)=daysOfYear==366
fun posOrNeg(num:Double):String{
    if(num>0)return " is postive number"
    else return "is negative"
}
fun isAlphabet(char: Char)=char in 'a'..'z' || char in 'A'..'Z'
fun sumOfNaturalNumbers(vararg vars:Int):Int
{
    var sum=0
    for(i in vars)sum+=i
    return sum
}
fun factorial(num:Int):Int{
    if (num==0) return 1
    else
    return num*factorial(num-1)
}
fun vowelOrConsonant(char: Char):String{
    val vowel= setOf('a','e','i','o','u')
    val set= mutableSetOf<Char>()
    for (c in 'a'..'z')set.add(c)
    val consonant= set.minus(vowel)
    if(char in vowel)return "is vowel"
    else if(char in consonant) return "is Consonant"
    else return ""
}
fun FibonacciSeries(limit:Int):String
{
    var pre=0
    var summation:String= "0 1 "
    var next =1
    var res=0
    while(res<=limit)
    {
        res=pre+next
        pre=next
        next=res
        summation+="$res "
    }

    return summation
}
fun decToBinOrBintoDec(num:Int):Int{
    var number=num
    var res=0
    var n=0
    if(isBinary(num))
    {
        while(number>0)
        {
            res+=(number%10)*power(2,n++)
            number/=10

        }
    }
    else
    {
        while(number>0)
        {
            res+=(number%2)*power(10,n++)
            number/=2
        }

    }
    return res
}
fun power(base:Int,n:Int):Int{
    if (n==0)return 1
    if(n==1)return base
    var res=1
    for(i in 1..n )res*=base
    return res
}
fun isBinary(num:Int):Boolean
{
    var number=num
    while(number>0)
    {
      if(number%10!=0 && number%10!=1) return false
        number/=10
    }
        return true

}
fun checkValue(array:Array<Any>,value:Any)=value in array
fun <T>joinTwoLists(list1:List<T>,list2:List<T>):List<T>{

    return list1.plus(list2)
}
fun sortMapByValue(map:Map<String,Int>): Map<String,Int>
{
  return map.toList().sortedBy { it.second}.toMap()
}
fun addTwoComplexNum(num1:Double,num2:Double):Double
{
   return num1
}
fun isStringANummeric(string:String):Boolean
{
    for(i in string)
        if(!i.isDigit()) return false

    return true
}
fun sortList(list:MutableList<EntryTag>):MutableList<EntryTag>
{

   return list.sortedBy { it.name }.toMutableList()
}
fun createList(list:List<EntryTag>,selectedId:Int):List<EntryTagSelectable>
{
    val mutableList= mutableListOf<EntryTagSelectable>()
    for (i in list)
        if(i.id!=selectedId.toLong())
        mutableList.add(EntryTagSelectable(i,false,"something"))
    else
            mutableList.add(EntryTagSelectable(i,true,"something"))
    return mutableList
}
fun takePrintFun(funPrint: (String) -> Unit,messageToPrint:String):Unit
{
funPrint(messageToPrint)
}
fun <T>removeDuplicates(list:MutableList<T>):List<T>
{

return list.distinct()
}
fun <T>twoArrayIsEqual(a1:Array<T>,a2:Array<T>):Boolean
{
    return a1.contentEquals(a2)
}
fun removeOddOrNegativeFromList (list:List<Int> ) : List<Int>
{

return list.filter { it%2==0 && it>0 }
}
fun <T> removeNullFromList(list:List<T?>):List<T?>
{

    return list.toMutableList().apply {  removeIf { it==null }}.toList()

}
fun <T> reverseList(list:List<T>):List<T>
{
    return list.reversed()
}
fun stringToArray(string: String):CharArray
{
    return string.toCharArray()
}

