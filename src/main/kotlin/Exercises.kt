import java.time.Year
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
    //println(mapOf(1 to 4,2 to 10, 3 to 2,4 to 7))



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
fun <K,V>sortMapByValue(map:Map<K,V>): Map<K,V>?
{
  return null
}

