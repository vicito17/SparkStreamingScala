//Data structures

//Tuples
// Inmutable lists

val capitanStuff = ("picard", "enterprise d", "Ncc-1701-d")
println(capitanStuff)

//Refer to the individual flieds with a One Based index
println(capitanStuff._1)
println(capitanStuff._2)
println(capitanStuff._3)

val picardShip = "picard" ->"enterprise d"
println(picardShip._2)

val shipList: List[String]= List("Enterprise","Defiant","Voyager")
println(shipList(0))
println(shipList.tail)
println(shipList.head)


val backwardShips = shipList.map((ship: String)=> ship.reverse)
val numberList: List[Int]= List(1,2,3,4,5,6)

val sum = numberList.reduce((x: Int, y: Int)=> x + y)
numberList.filter((x:Int)=> x%2==0)
numberList.filter(_%2==0)

for(ele <- numberList){
  println(ele)
}
