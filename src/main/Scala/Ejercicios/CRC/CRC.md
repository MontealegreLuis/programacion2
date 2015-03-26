#Programacion 2  

##Tarjetas **CRC** para Blackjack

###Primera Clase
Class: Banca|
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Repartir las cartas | *Baraja 
*Repartir a los jugadores cartas adicionales|*Jugador
*Mostrar toda o parte de una mano 
*Calcular el valor de la totalidad o parte de una mano
*Calcular el numero de cartas de una mano
*Determinar el ganador 
*Empezar una nueva mano

***
***
###Segunda Clase
Class: Jugador |
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Pedir que se le reparta una carta a su mano |*Banca
*Mostrar su mano|*Carta 
*Calcular el valor de su mano|*Mano
*Determinar el numero de cartas en su mano

***
***
###Tercera Clase
Class: Baraja|
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Poder repartir la siguiente carta|*Banca
*Reportar cuantas cartas quedan en la baraja|*Carta

***
***
###Cuarta Clase
Class: Carta|
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Saber su valor y debe ser capaz de reportarlo|*Banca
*Todas las cartas deben de ser parte de una baraja|*Jugador
|*Baraja
|*Mano

***
***
###Quinta Clase
Class: Mano|
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Saber el numero de cartas que lo forman|*Banca
*Saber la suma total de las cartas|*Jugador
|*Carta