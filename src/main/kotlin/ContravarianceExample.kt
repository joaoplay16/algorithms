/*
* Contravariance (reversed subtyping relations)

→ A generic class is called contravariant on the type parameter
* when the following holds: Class<A> is a subtype of Class<B> if B is a subtype of A.
*
*  For example, Consumer<Animal> is a subtype of
* Consumer<Cat> because Cat is a subtype of Animal.
* The subtyping relation is reversed, in comparison to Covariance.
* Contravariance can be seen as a mirror to covariance.
* */

interface EventListener<in T> {
    fun onEvent(event: T)
}

open class View {
    open fun click() {}
}

class Button : View() {
    override fun click() {
        println("Button clicked!")
    }
}

class OnClickListener : EventListener<View> {
    override fun onEvent(event: View) {
        event.click()
    }
}

fun main() {
    // OnClickListener is a subtype of EventListener<Button> because
    // Button is a subtype of View. Button = B, View = A
    val listener: EventListener<Button> = OnClickListener()
    val view: Button = Button()
    listener.onEvent(view)
}