#Tarjeta CRC
##BlackJack

###Class:Carta
-------


**Responsabilidades**|**Colaboraciones**
---------|-----------
Mostrar valor|Baraja
Saber su valor|Mano
           


###Class:Baraja
-------

**Responsabilidades**|**Colaboraciones**
---------|-----------
Dar carta|Tener cartas
Numero de cartas|


###Class:Banca
-------

**Responsabilidades**|**Colaboraciones**
---------|-----------
preguntar si reparte carta|Baraja
Apostar|Jugador
Pagar apuesta|Mano



###Class:Jugador
---------

**Responsabilidades**|**Colaboraciones**
---------|------------
responder si desea carta|mano
apostar |banca

###Class:Mano
---------

**Responsabilidades**|**Colaboraciones**
---------|------------
Saber su numero de cartas|jugador
Saber el valor de sus cartas |banca
Agregar carta|
Mostrar cartas|

