import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * Created by widemos on 26/5/17.
 */

fun main(args: Array<String>) {

    // Conectar
    var conexion: Connection? = null

    try {
        val controlador = "org.sqlite.JDBC"
        val cadenaconex = "jdbc:sqlite:corredores.sqlite"

        Class.forName(controlador)
        conexion = DriverManager.getConnection(cadenaconex)
    } catch (ex: ClassNotFoundException) {
        println("No se ha podido cargar el driver JDBC")
    } catch (ex: SQLException) {
        println("Error de conexión")
    }

    // Leer datos
    val lista = ArrayList<Corredor>()

    try {

        val st = conexion?.createStatement()
        val sql = "SELECT * FROM corredores"
        val rs = st?.executeQuery(sql)

        while (rs!!.next()) {

            val c = Corredor(
                    rs.getLong("id"),
                    rs.getString("nombre"),
                    rs.getInt("dorsal"),
                    rs.getInt("categoria")
            )

            lista.add(c)
        }

    } catch (ex: SQLException) {
        println("Error al recuperar los datos")
    }

    // Mostrar los datos
    println("Recuperados: ${lista.size} registros")
    for (corredor in lista) {
        println(corredor)
    }

    // Desconectar
    conexion?.close()

}
