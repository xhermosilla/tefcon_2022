# Ponencia

El objetivo de este estudio es hacer una pequeña comparativa en un ámbito muy concreto y acotado de los lenguajes de programación:

- java (kotlin)
- python
- nodejs
- go

La prueba trata de realizar una pequeña API REST que expone un único endpoint "/files/{file_name}/search/words" que permite hacer una búsqueda sobre el fichero indicado en el parámetro _file_name_ con la palabra indicada en el parámetro de query _word_.

Ejemplo de uso de la aplicación una vez finalizada:

```bash
curl --location --request GET 'http://localhost/files/example.txt/searchWord?word=hola'
```

Respuesta del api:

```json
{
    "file": "example.txt",
    "searchWord": "hola",
    "count": 10
}
```

En la prueba realizada se medirán los siguientes valores:

- Tiempo dedicado al desarrollo por un programador con pocos conocimientos del lenguaje (aquí afecta la documentación en internet, comunidad, etc)
- Prueba de estrés.
- Tiempo de arranque de la aplicación.
- Tiempo en responder a 500 peticiones y media en responder.
- Memoria consumida de la aplicación durante las pruebas.
- Tamaño en MBs de la aplicación generada.
- Tamaño en MBs de la imagen docker para contener la aplicación.
- Notas del desarrollador sobre: legibilidad de código, robustez

Nota:

Las pruebas realizadas no tienen ni la cantidad de pruebas ni el rigor suficientes para que puedan ser relevantes a la hora de eligir un lenguaje de programación u otro para desarrollar aplicaciones complejas en este u otro ámbito.
Esta prueba no deja de ser una pequeña inscursión al desarrollo en estos lenguajes y reflejar las sensaciones que cada programador tiene sobre el lenguaje utilizado.