# Juegos de Adivinanzas

¡Bienvenido a los Juegos de Adivinanzas! Este proyecto contiene dos versiones del juego de adivinanzas, cada una con un rango de números diferentes.

## JuegoAdivinanzas

La clase `JuegoAdivinanzas` es una versión del juego donde el número aleatorio a adivinar se genera en un rango de 0 a 100, incluyendo ambos extremos. Aquí está el fragmento de código relevante: `int numeroAdivinar = random.nextInt(101);`. Esta versión del juego permite que el número aleatorio generado sea 0 y hasta 100.

## AdivinaElNumero

La clase `AdivinaElNumero` es otra versión del juego donde el número aleatorio a adivinar se genera en un rango de 1 a 100, excluyendo el 0. Aquí está el fragmento de código relevante: `int numeroAdivinar = random.nextInt(100) + 1;`. Esta versión del juego excluye el número 0 del rango, generando números aleatorios desde 1 hasta 100.

## Requisitos

- Java JDK (Java Development Kit) instalado en tu sistema.

## Autor

- [Julio Macias](https://github.com/jamzlibra)