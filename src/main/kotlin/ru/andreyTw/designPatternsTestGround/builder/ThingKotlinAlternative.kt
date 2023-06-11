package ru.andreyTw.designPatternsTestGround.builder

data class ThingKotlinAlternative(
    private var name: String = "Unknown thing",
    private var weight: Int = 1000,
    private var feature: String = "WTF",
    private var dangerousness: Int = 50
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
}
