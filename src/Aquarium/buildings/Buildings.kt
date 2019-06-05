package Aquarium.buildings

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(val baseBuildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded.times(baseBuildingMaterial.numberNeeded)

    fun build() {
        println("Type: ${baseBuildingMaterial::class.simpleName}. Number of materials needed: $actualMaterialsNeeded")
    }

    fun <T : BaseBuildingMaterial> isSmallBuilding(build : Building<T>) {
        if (build.actualMaterialsNeeded < 500) println("small building") else print("large building")
    }
}