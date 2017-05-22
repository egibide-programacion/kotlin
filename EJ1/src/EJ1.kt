import javafx.scene.control.RadioMenuItem
import java.util.*

/**
 * Created by 7FPROG07 on 22/05/2017.
 */
fun main(args: Array<String>) {
    println("hola klotin")

    /* # Ejercicio 1 - Comparar variables

     Escribe un programa que cree al azar tres variables enteras
      y las compare entre sí, sacando en pantalla cual de ellas
      es la mayor, la siguiente más grande y la menor.

     Hay que tener en cuenta si son iguales, nunca se sabe.*/
val r = Random()

    val a = r.nextInt(10)
    val b = r.nextInt(10)
    val c = r.nextInt(10)

    println ("$a $b $c")

    if (a > b && a > c) {
        println("El mayor es ${a}")
    } else {

        println("el mayor es: ${c}")
    }

    if (b > c) {
        println("el mayor es: ${b}")
    } else {

        println("el mayor es: ${c}")
    }

}


