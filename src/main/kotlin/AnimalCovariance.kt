interface Cage<out T>

open class Animalia {}

class Canidae : Animalia() {}

class Felidae : Animalia() {}

class AnimalCage<T : Animalia>(animalia: T): Cage<T> {}

fun addAnimalToZoo(cages: MutableList<Cage<Animalia>>, animal: Cage<Animalia>) {
    cages.add(animal)
}

fun main() {
    val dogCage: AnimalCage<Canidae> = AnimalCage(Canidae())

    val catCage: AnimalCage<Felidae> = AnimalCage(Felidae())

    val zoo = mutableListOf<Cage<Animalia>>() // Zoo que aceita jaulas genéricas
    addAnimalToZoo(zoo, dogCage)
    addAnimalToZoo(zoo, catCage)

    println("Zoo contém ${zoo.size} jaulas.")
}

