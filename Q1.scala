import scala.io.StdIn.readLine

object ReadName{
    def main(args: Array[String]): Unit = {
        printf("Enter a word / string : ")
        var w = readLine() // w is word
        var l = w.length() // l is length of word
    
        reverse(w,l-1)
        
        def reverse(w1:String,l1:Int):Unit = l1 match{
            case x if (l1>=0) => print( w1(l1))
                                reverse(w1,l1-1)
            case _ => println("")
        
        
    }


    

}
}