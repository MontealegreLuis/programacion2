#Programacion 2  

##Tarjetas **CRC** para Blackjack

###Primera Clase
Class: Banca|
----------------- |----------------
 Responsabilidades:  |
*Repartir las cartas|  
*Repartir a los jugadores cartas adicionales|
*Mostrar toda o parte de una mano|
*Calcular el valor de la totalidad o parte de una mano|
*Calcular el numero de cartas de una mano|
*Determinar el ganador|
*Empezar una nueva mano|
Colaboraciones:|
*Baraja|
*Jugador|


***
***
###Segunda Clase
Class: Jugador |
----------------- |----------------
 Responsabilidades:  | 
*Pedir que se le reparta una carta a su mano | 
*Mostrar su mano|  
*Calcular el valor de su mano| 
*Determinar el numero de cartas en su mano|
Colaboraciones:|
*Banca|
*Carta|
*Mano|

***
***
###Tercera Clase
Class: Baraja|
----------------- |----------------
 Responsabilidades:  |  
*Poder repartir la siguiente carta|
*Reportar cuantas cartas quedan en la baraja|
Colaboraciones:|
*Banca|
*Carta|

***
***
###Cuarta Clase
Class: Carta|
----------------- |----------------
 Responsabilidades:  | 
*Saber su valor y debe ser capaz de reportarlo|
*Todas las cartas deben de ser parte de una baraja|
Colaboraciones:|
*Banca|
*Jugador|
*Baraja|
*Mano|

***
***
###Quinta Clase
Class: Mano|
----------------- |----------------
 Responsabilidades:  | 
*Saber el numero de cartas que lo forman|
*Saber la suma total de las cartas|
Colaboraciones:|
*Banca|
*Jugador|
*Carta|
