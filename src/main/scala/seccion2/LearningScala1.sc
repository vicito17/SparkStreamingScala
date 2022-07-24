// Values are inmmutable constans

val hello: String= "Hola!"

// Variable are mutable

var helloThere: String= hello
helloThere = hello + " There"
println(helloThere)

val theUltimateAnswer: String = "To life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString)= theUltimateAnswer
val answer: Int = answerString.toInt
println(answer)

val pi: Double= 3.1415
println(f"the number pi with 3 decimal to the right is $pi%3d")