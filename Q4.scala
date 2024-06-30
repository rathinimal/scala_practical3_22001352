import scala.io.StdIn.readLine

object mean_{
    def main(args: Array[String]): Unit = {
        print("Enter a list of integers with ',' : ")
        var list_1 = readLine()
        var list_2 = list_1.split(",") //to separte the words 
        var list_3 = list_2.map(_.toInt)
        var size_list = list_3.size

        println(s"The sum of even numbers is: ${even(list_3,size_list-1)}")
        
    }
    def even(list1:Array[Int],len_list1:Int):Int = len_list1 match {
        case x if (len_list1 >=0) => val current_Sum = if (list1(len_list1) % 2 ==0) list1(len_list1) else 0
                                    current_Sum + even(list1,len_list1 -1)
        case _ => 0
    }
}
