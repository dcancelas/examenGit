data class Mouse (var tipo: String = "usb", var color: String = "negro"){
    init {
        tipo = tipo + "!"
    }
}