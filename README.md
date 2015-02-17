# Programacion 2 (Primavera 2015)
_Jorge Eduardo Montes Rios [201321617]_
#### TARJETAS CRC BLACKJACK

#### **CLASE**: Baraja

Responsabilidades | Colaboraciones
------------------|----------------
Repartir la siguiente carta. | Reportar Valores (baraja)
Reportar cuantas cartas quedan en la baraja |

#### **CLASE**: Banca

Responsabilidades | Colaboraciones
------------------|----------------
Repartir cartas.  | Barajar (baraja).
Mostrar toda o parte de la mano. | Mostrar carta (mano).
Calcular el valor de la totalidad o parte de la mano | Repartir y preguntar si desea otra carta (jugador)
Calcular el numero de cartas de una mano. | 
Determinar al ganador. |
Empezar nuevo juego. |

#### **CLASE**: Carta

Responsabilidades | Colaboraciones
------------------|----------------
Saber su valor y reportarlo. | Reportar sus valores (mano).
Deber ser parte de una mano baraja. | Ser parte de una baraja (baraja).

#### **CLASE**: Jugador

Responsabilidades | Colaboraciones
------------------|----------------
Preguntar si desea cartas. | Pedir carta (banca)
Mostrar su mano. | Reportar (mano).
Calcular el valor de su mano. | 
Determinar el numero de cartas en su mano. | mano.

#### **CLASE**: Mano

Responsabilidades | Colaboraciones
------------------|----------------
Saber su numero de cartas. | Jugador
Saber el valor de sus cartas. | Banca
Agregar cartas. |
Mostrar cartas. |
