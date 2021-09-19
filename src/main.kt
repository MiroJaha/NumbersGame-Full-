import java.lang.Exception
import kotlin.random.Random

fun main(){
    val number= Random.nextInt(10)

    println("\nGuess The Number Between 0 and 10:\n ")


        var count=0
        while (count<3) {
            print("Please Enter The Guessing Number or (quiet) to Exit: ")
            var guess = readLine()
            if (guess == "quiet") {
                println("You Are Out!!\n")
                break
            }
            try {
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
            catch(e: Exception){
                println("Please Enter a Number\n")
            }
        }

        println("You Failed $count times")
        println("The Correct answer is: $number")



    println("Game Over!")

}
