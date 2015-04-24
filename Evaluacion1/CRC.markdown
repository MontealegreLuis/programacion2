#TARJETAS CRC

|**Clase Juego** | **--------------** |
|---------------- | --------------- |
|*Responsabilidad* | *Colaboración* |
|* Marcador| |

|**Clase Jugador** | **----------** |
|-------------------|----------------|
|*Responsabilidad* | *Colaboración* |
|* Pide cartas| * Banca |
|* Verifica Puntos| * Puntos|
|* Checa cartas| * Carta|
|* Muestra mano| * Mano|

|**Clase Banca** | **----------** |
|-------------------|----------------|
|*Responsabilidad* | *Colaboración* |
|* Revolver baraja| * Baraja|
|* Repartir cartas| * Baraja;Jugadores|
|* Recibir apuesta| * Jugadores|
|* Verifica puntos| * Marcador|
|* Determina ganador| * Marcador|
|* Calcula cartas| * Mano|
|* Muestra mano| * Mano|

|**Clase Carta** | **----------** |
|-------------------|-------------|
|*Responsabilidad* | *Colaboración* |
|* Ver valor| * Puntos|

|**Clase Baraja** | **----------** |
|-------------------|-------------|
|* Verifica cantidad| * Cartas|

