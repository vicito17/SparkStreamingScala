// FUnction
//format def name(parameter name: type) :return type = {}
def squareIt(x: Int): Int={
 x * x
}

def cubeIt(x: Int): Int={  x * x * x }
println(squareIt(2))
println(cubeIt(3))

def trandformInt(x: Int, f:Int => Int): Int ={
  f(x)
}

val result = trandformInt(2,cubeIt)
println(result)
trandformInt(3, x=> x*x*x)
trandformInt(10, x=> x/2)
trandformInt(2 , x => {val y = x*2; y*y})


val firstString: String = "hola"
def funUperCase(x: String): String ={ x.toUpperCase()}

funUperCase(firstString)
firstString.toUpperCase()