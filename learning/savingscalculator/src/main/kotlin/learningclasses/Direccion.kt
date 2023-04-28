package learningclasses

data class Direccion(val calle: String, val numero: Int, val codigoPostal: Int, val poblacion: String) {
    //conjunto de datos relacionados, sin funcion especifica
    // data nos da un toString()

    // si no queremos que alguna propiedad sea by default, se la agrega aca abajo
    // no aparece en el toString() tho
}