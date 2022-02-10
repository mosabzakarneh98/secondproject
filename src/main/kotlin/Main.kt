fun main()
{
 printMyName(arrayOf("mosab","zakarneh"))
 val village= village(listOf
     ( home (
               listOf(person(12),person(30),person(25),person(23) )
             ),

      home (
          listOf(person(32),person(45) )
      ),
     home (
         listOf(person(33),person(21),person(27),person(16) ,person(12) )
     )
     )
 )
    val d =village.homes.sortedByDescending { it.persons.size }
    println(d)

}
fun printMyName(arg:Array<String>) {
    var temp=""
    for (i in arg ) temp+=i+" "
    println(temp)
}
data class village(val homes:List<home>)
data class home(val persons:List<person>)
data class person(val age:Int)
