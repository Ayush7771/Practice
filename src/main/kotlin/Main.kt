import kotlin.math.pow

fun main(){
    println(calculateArea(shape = Shape.Rectangle(10.0,12.0)))
}

// Add calculateArea() here
fun calculateArea(shape : Shape):Double{
    return when(shape){
        is Shape.Rectangle -> shape.width * shape.height
        is Shape.Circle -> kotlin.math.PI * (shape.radius.pow(2))
        is Shape.Pentagon -> kotlin.math.sqrt(25 + 10 * kotlin.math.sqrt(5.0)) / 4 * shape.side * shape.side
        is Shape.Square -> shape.side.pow(2)
        is Shape.Triangle -> shape.height * shape.base / 2
    }
}

// Don't change this code
sealed class Shape {
    data class Rectangle(val width: Double, val height: Double) : Shape()
    data class Square(val side: Double) : Shape()
    data class Circle(val radius: Double) : Shape()
    data class Triangle(val base: Double, val height: Double) : Shape()
    data class Pentagon(val side: Double) : Shape()
}