package exercises.spices

sealed class Spice(val name: String, open val spiciness: String = "mild") {
    val heat: Int
        get() {
            return (when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            })
        }

    abstract fun prepareSpice()
}

class Curry(
    override val spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice("curry", spiciness), Grinder, SpiceColor by color {
    override fun grind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun prepareSpice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}


object GreenSpiceColor : SpiceColor {
    override val color = Color.GREEN
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

fun main(args: Array<String>) {
    val curry = Curry("mild")
    val curry1 = Curry("mild", GreenSpiceColor)

    println(curry.color)
    println(curry1.color)
}