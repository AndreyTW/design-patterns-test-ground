package ru.andreyTw.designPatternsTestGround.builder

fun main() {
    val unknownThingKotlin = ThingKotlin.ThingKotlinBuilder().build()
    val cuteThingKotlin = ThingKotlin.ThingKotlinBuilder()
        .setName("Cutie")
        .setWeight(5)
        .setFeature("Very sweet")
        .setDangerousness(0)
        .build()
    val dangerThingKotlin = ThingKotlin.ThingKotlinBuilder()
        .setFeature("Danger as covid")
        .setDangerousness(100)
        .setName("Devastator")
        .setWeight(500)
        .build()

    unknownThingKotlin.print()
    cuteThingKotlin.print()
    dangerThingKotlin.print()

    val stupidThing = ThingKotlinAlternative(
        feature = "Dumb as hell",
        name = "Silly",
        dangerousness = 2,
        weight = 777
    )
    val anotherUnknownThing = ThingKotlinAlternative(
        name = "Another unknown thing"
    )

    stupidThing.print()
    anotherUnknownThing.print()
}