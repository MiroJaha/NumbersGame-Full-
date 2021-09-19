import java.lang.Exception
import kotlin.random.Random

fun main(){
    val number= Random.nextInt(10)

    println("\nGuess The Number Between 0 and 10:\n ")

    try {
        var count=0
        for (i in 1..3) {
            print("Please Enter The Guessing Number or (quiet) to Exit: ")
            var guess = readLine()
            if(guess=="quiet") {
                println("You Are Out!!\n")
                break
            }
            when (guess!!.toInt()) {
                number -> {
                    println("You Got it!!\n")
                    break
                }
                else -> {
                    println("Wrong Guess.\n")
                    count++
                }
            }
        }

        println("You Failed $count times")
        println("The Correct answer is: $number")
    }
    catch(e: Exception){
        println("Please Enter a Number")
    }

    println("Game Over!")

}
