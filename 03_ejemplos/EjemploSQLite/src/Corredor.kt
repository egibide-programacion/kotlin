/**
 * Created by widemos on 26/5/17.
 */

data class Corredor(
        val id: Long = 0,
        val nombre: String? = null,
        val dorsal: Int = 0,
        val categoria: Int = 0 // 0, Masculina - 1, Femenina - 2, Niños
)
