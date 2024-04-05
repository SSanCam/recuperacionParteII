package interfaces

import otros.Estado

interface IGestorElementos<T> {

    val elementos: MutableList<T>

    fun generarId(): String

    fun agregar(elemento: T): Boolean

    fun eliminar(id: String): Boolean

    fun buscar(id: String, estado: Estado): T?

    fun obtenerElementos(id: String): List<T>

    fun filtrarPorCriterio(criterio: (T) -> Boolean): List<T>

}