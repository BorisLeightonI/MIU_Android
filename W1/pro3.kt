fun main(args: Array<String>) {
var forOddSquared = intArrayOf(1,2,3,4,5,6)

  printFirstLast()
  weight()
  sumOddSquared(forOddSquared)
}

fun weight(){
  var weigthPound = 10
  println("Enter a planet from our solar system: ")
    var choise = readLine()
    val relGrav = when (choise) {
        "Venus" -> 0.78
        "Mars" -> 0.39
        "Jupiter" -> 2.65
        "Saturn" -> 1.17
        "Uranus" -> 1.05
        "Neptune" -> 1.23
        else -> 0
    }
    println("result = ${weigthPound*relGrav}")
}

fun sumOddSquared(arr: Array<Integer>){
  var oddSum = 0
  for (i in arr) {
    if(i%2!=0) oddSum += i
  }
  return oddSum
}


fun printFirstLast(){
    println("Enter an integer number: ")
    var num1 = readLine()
    var first = num1.get(0)
    var last = num1.get(num1.length()-1)
    return first+last
}