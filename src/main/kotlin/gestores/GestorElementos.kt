package gestores

import elementos.ElementoBiblioteca
import interfaces.IGestorElementos
import otros.Estado
import otros.UtilidadesBiblioteca

class GestorElementos<T: ElementoBiblioteca> : IGestorElementos<T> {
    override val elementos = mutableListOf<T>()

    override fun generarId() = UtilidadesBiblioteca.generarIdentificadorUnico()

    override fun agregar(elemento: T): Boolean = elementos.add(elemento)

    override fun eliminar(id: String): Boolean = elementos.removeAll { it.id == id }

    override fun buscar(id: String, estado: Estado): T? = elementos.find { it.id == id }

    override fun filtrarPorCriterio(criterio: (T) -> Boolean): List<T> = elementos.filter(criterio)

    override fun obtenerElementos(id: String): List<T> = elementos.toList()
}