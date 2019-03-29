Para generar el analizador descendente de javaCC primero hay que crear un archivo de extension '.jj'
en el cual se definen tanto los aspectos léxicos del analizador lexico como el sintáctico. 
En este archivo estableceremos los tokens y los estados del analisis sintáctico.

Para poder obtener las clases de java necesarias para poder realizar el analisis del
lenguaje en la consola deberemos introducir la siguiente orden:

	java -cp javacc.jar javacc analizadorCC.jj

En mi caso yo había introducido los elementos necesarios ('javacc.jar' y el archivo al que llamé 'analizadorCC.jj')
en una misma carperta, tambien puede hacerte así:

	java -cp PATH/javacc.jar javacc PATH/analizadorCC.jj

Una vez ejecutada esta orden se crearán las clases de java necesarias en la carpeta que se encuentre tu consola.
Las clases tendrán un paquete por defecto si lo has especificado por el archivo de extensión '.jj'.

Tras crear un proyecto de java e introducir los archivos correspondientes simplemente hay que modificar
el metodo main() para que inicie el analizador sintáctico.