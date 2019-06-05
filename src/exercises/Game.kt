package exercises

import org.w3c.dom.bootstrap.DOMImplementationRegistry

class Game() {
    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(move: String?) {
       move?.apply {
           when(this) {
               "n" -> move(north)
               "s" -> move(south)
               "e" -> move(east)
               "w" -> move(west)
               else -> move(end)
           }
       }

    }
}