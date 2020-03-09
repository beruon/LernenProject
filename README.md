# LernenProject
Proyecto de analisis y diseño de software enfocado a plasmar los conocimientos adquiridos en el curso en un juego didáctico de aprendizaje en la plataforma Android Studio.
Para esto se divide en varias etapas las cuales se desarrollaran en el periodo definido del proyecto(Semestre de universidad-aproximadamente de 5 a 6 meses)

  Primer Avance: 
    Creacion de las Activities(paguinas) de login, registro, informacion Usuario y Recuperar contraseña 
      Login: Se creo el Front que contiene una imagen, dos PlainTExt, un boton con la decoracion del cardboard, y un textView además de la relación del textview (Register Here!) con la activity de Registro
      Registro: See creo el Front que consiste de 7 PlainText, 2 TextVew y un boton con la decoracion del cardboard además de la relación del textview (Back) con la activity de Registro, tambien se le desavilito la ToolBar
      Información Usuario: Se creo el Front que consite en 7 TextView.
      
Segundo Avance:   
  1.Descargar la bases de datos a utiliazar Xampp - https://www.apachefriends.org/download.html -.
  2.Despues iniciar el control Panel del programa. 
  3.Iniciar Apache y MySQL.
  4.Poner Administrar a MYSQL y crear la base de datos.
      
Tercer Avance:
Se crean archivos que relacionan la base de datos con el proyecto.
1. Se crea el documento Login.php que su principal funcion es verificar si el usuario y la contraseña puestos en los campos cumplen que se igual a cualquiera de la base de datos.
2. Se crea el documento Register.php que su principal funcion es pasar la información de los campos solicitados a la base de datos.
3. Se colocan los archivos creados en la carpeta de Xampp/hdocs (Asi se relaciona la base de datos creada anterior mente.

Cuarto Avance:
Se busca en el projecto - build.gradle(:app) -, se posiciona en el metodo dependencies y se agrega en el - implementation 'com.android.volley:volley:1.1.0' - y se le da click a " sync. now " que aparece en el lado derecho superior de la pantalla.

