package exercises

fun main(args: Array<String>) {
//    buildSimpleSpice()
    val game = Game()

    while(true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}

private fun buildSimpleSpice() {
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}

    val spiceContainer1 = SpiceContainer(Spice("curry", "mild"))
    println(spiceContainer1)

    val spiceContainer2 = SpiceContainer(Spice("green curry", "mild"))
    println(spiceContainer2)

    val spiceContainer3 = SpiceContainer(Spice("hot pepper", "extremely spicy"))
    println(spiceContainer3)
}

data class SpiceContainer(val spice: Spice, val label: String = spice.name)


fun makeSalt() = Spice("Salt")