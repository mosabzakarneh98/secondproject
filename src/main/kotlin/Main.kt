import kotlin.reflect.typeOf

@OptIn(ExperimentalStdlibApi::class)
fun b(s:String?)=s?.length
fun vv()= println("df")
fun v(){


}
fun main(args: Array<String>) {

    vv()
    val k:String?=null
   val t:String= when (k)
    {

        null ->"5 as String"
      else ->""
    }
    println(t)
    val s="${k?.length?:b("mosa")}"
    val w="""for (c in "dfg") 
        |println(c) """.trimMargin()
    if(k==null)println("mosab$s")
    println("zak1")



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}