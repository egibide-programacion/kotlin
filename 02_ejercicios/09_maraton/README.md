# Ejercicio 9 - Maratón

La organización del Maratón Martin Fiz nos ha pedido que, para la próxima edición, les desarrollemos una aplicación de gestión de corredores y tiempos de carrera.

![Interfaz de usuario](maraton.png)

Nos han proporcionado una base de datos inicial alojada en el fichero [corredores.sqlite](./corredores.sqlite) que podéis abrir y editar con el programa [DB Browser for SQLite](http://sqlitebrowser.org/).

Puntos a desarrollar:

1. Al iniciar la aplicación, cargar corredores, carreras y registros desde la BD a memoria.
2. Nuevos corredores y carreras: pedir los datos para corredores y carreras y almacenarlos, primero en memoria y después en la BD.
3. Registrar tiempo: crear un formulario que permita seleccionar un corredor, una carrera e introducir el tiempo que ha tardado en completarla. 
4. Crear un objeto con el registro de tiempo y almacenarlo en memoria y en la BD.
5. Crear un formulario que permita seleccionar una prueba y muestre el listado con los nombres, dorsales y tiempos de los participantes de la misma.

> En [este repositorio](https://github.com/xerial/sqlite-jdbc) está disponible el driver JDBC para SQLite.
