#Programacion 2  

##Tarjetas **CRC** para Blackjack

###Primera Clase
Class: Banca|
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Repartir las cartas | *Baraja 
*Repartir a los jugadores cartas adicionales|*Jugador
*Mostrar toda o parte de una mano|*Mano 
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
*Mostrar su mano|*Mano
*Calcular el valor de su mano
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
*Saber su valor y debe ser capaz de reportarlo|*Baraja
*Todas las cartas deben de ser parte de una baraja|*Mano


***
***
###Quinta Clase
Class: Mano|
----------------- |----------------
 Responsabilidades:  | Colaboraciones: 
*Saber el numero de cartas que lo forman|*Banca
*Saber la suma total de las cartas|*Jugador
|*Carta

***
***

##Diagrama de clases para Blackjack

![Diagrama de clases](/home/alfredo/Imágenes/1.jpg)

***
***
##Diagrama de secuencia para Blackjack

![Diagrama de secuencia1](/home/alfredo/Imágenes/E1.jpg)

![Diagrama de secuencia2](/home/alfredo/Imágenes/E2.jpg)