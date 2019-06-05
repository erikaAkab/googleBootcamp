package Aquarium.buildings

fun main(args: Array<String>) {
//    val build = Aquarium.buildings.Building(Wood())
//    build.build()
//    build.isSmallBuilding(build)
//    fishExample()

    labels()
}

fun labels() {
    loop@ for (i in 1..100) {
        println("i is: $i")
        for (j in 1..100) {
            println("j is: $j")
            if (i > 10) break@loop
        }
    }

    println("OPS")
}


//fun buildAquarium() {
//    val myAquarium = Aquarium()
//
//    println("Length: ${myAquarium.length} " +
//            "Width: ${myAquarium.width} " +
//            "Height: ${myAquarium.height}")
//
//    myAquarium.height = 80
//
//    println("Height: ${myAquarium.height} cm")
//    println("Volume: ${myAquarium.volume} liters")
//
//    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
//    println("Small aquarium: ${smallAquarium.volume} liters")
//
//    val myAquarium2 = Aquarium(numberOfFish = 9)
//    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
//            "length ${myAquarium2.length} " +
//            "width ${myAquarium2.width} " +
//            "height ${myAquarium2.height}")
//}

