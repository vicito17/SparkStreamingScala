//Fibonacci expresion

var i:Int = 0
var n1:Int = 0
var n2:Int = 1
var n3:Int = 0
var st: String  = n1 + ", " + n2
do{
    n3 = n1 + n2;
    n1 = n2;
    n2 = n3;
    st +=  ", " + n3
    i+=1
  } while (i < 8)
println(st)

