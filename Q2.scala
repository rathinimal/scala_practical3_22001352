import scala.io.StdIn.readLine

object list_creation{
    def main(args: Array[String]): Unit = {
        var list_1 = readLine("Enter a list: \n")
        var list_2 = list_1.split("\\s+") //to separte the words 
        var size_list = list_2.size
        separate_5(list_2,size_list-1)

    }
    def separate_5(list1:Array[String],len_list1:Int):Unit = len_list1 match{
        case x if (len_list1 >=0 ) =>separate_5(list1,len_list1 -1)
                if (list1(len_list1).length()>4) { println(list1(len_list1))}
                        
                                        
        case _ => //
    }
}