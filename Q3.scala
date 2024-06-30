import scala.io.StdIn.readInt

object mean_{
    def main(args: Array[String]): Unit = {
        print("Enter the a Integer1: ")
        var a = readInt()
        print("Enter the a Integer2: ")
        var b = readInt()

        average(a,b)
    }
    def average(x:Int,y:Int):Unit = {
        var x1 :Float = x
        var y1 :Float = y
        var average_ : Float= (x1+y1)/2
        printf("The average of numbers is: %.2f \n",average_)
    }
}