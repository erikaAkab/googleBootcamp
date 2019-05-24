package Aquarium.Decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    val d4 = Decorations2("crystal", "wood", "diver")
    println(d4)

    val (rock, wood, diver) = d4
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks: String)

data class Decorations2(val rocks: String, val wood: String, val diver: String)