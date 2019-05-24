package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(true, 9) {
        println("running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = 2 * volumeNeeded
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish()
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}