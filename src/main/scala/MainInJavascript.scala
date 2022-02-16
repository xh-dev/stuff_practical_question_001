import javax.script.{Invocable, ScriptEngineManager}

object MainInJavascript extends App {
  val jsEngine = new ScriptEngineManager().getEngineByName("JavaScript")
  val script = """
    |function recur(n, cur){
    |    if(!cur){
    |        cur=0;
    |    }
    |    if(n<2){
    |        throw new Error("invalid input");
    |    }
    |    if(n===2){
    |        return 1/n +cur;
    |    }
    |    return recur(n-1, cur + 1/(n*(n-1)));
    |}
    |""".stripMargin

  jsEngine.eval(script)

  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",2))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",3))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",4))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",5))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",6))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",7))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",8))
  println(jsEngine.asInstanceOf[Invocable].invokeFunction("recur",9))



}
