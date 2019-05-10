import java.util.*
import kotlin.system.measureNanoTime

fun main(args: Array<String>) {
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
    }

    whatShouldIDoToday()
}

fun dayOfWeek() {
    println("What day is it today?")
    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (dayOfWeek) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped"
        }
    )
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    return fortunes[when (birthday) {
        28, 31 -> 2
        in 1..7 -> 3
        else -> birthday.rem(fortunes.size)
    }]
}

fun getBirthday(): Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}

fun whatShouldIDoToday(
    weather: String = "sunny",
    temperature: Int = 24
) {
    print("What is your mood today?:")
    val mood = readLine().toString()
    println( when {
        isWalkMood(mood, weather) -> "go for a walk"
        isBedMood(mood, weather, temperature) -> "stay in bed"
        isSwimmingMood(temperature) -> "go swimming"
        else -> "Stay home and read."
    })
}

fun isWalkMood(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun isBedMood(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun isSwimmingMood(temperature: Int) = temperature > 35