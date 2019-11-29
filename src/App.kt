fun main() {
    //Increíble comentario
    val mouseA = Mouse()
    mouseA.color = "blanco"
    println(mouseA.toString())
    println(mouseA.color)
    val mouseB = Mouse("bluetooth")
    println(mouseB.toString())
    var miComputador = Computer(Cpu(5000,5), Mouse("usb"))
    println("${miComputador.cpu} y ${miComputador.mouse.tipo}")
    println(miComputador.toString())
    var ratonSorpresa=Mouse ("ay")
    println(ratonSorpresa.tipo)
}
