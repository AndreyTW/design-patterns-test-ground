package ru.andreyTw.designPatternsTestGround.builder

class ThingKotlin private constructor(
    private val name: String,
    private val weight: Int,
    private val feature: String,
    private val dangerousness: Int
) {

    fun print() {
        println(
            "\nMonster info:" +
                    "\n\tname: " + name +
                    "\n\tweight: " + weight +
                    "\n\tfeature: " + feature +
                    "\n\tdangerousness: " + dangerousness
        )
    }

    data class ThingKotlinBuilder(
        private var name: String = "Unknown thing",
        private var weight: Int = 1000,
        private var feature: String = "WTF",
        private var dangerousness: Int = 50
    ) {

        fun setName(name: String) = apply { this.name = name }
        fun setWeight(weight: Int) = apply { this.weight = weight }
        fun setFeature(feature: String) = apply { this.feature = feature }
        fun setDangerousness(dangerousness: Int) = apply { this.dangerousness = dangerousness }
        fun build() = ThingKotlin(name, weight, feature, dangerousness)
    }
}