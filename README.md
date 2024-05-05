## Descripcion del Proyecto:
Este proyecto esta construido con el patron de diseño POM y usando BDD con la utilizacion de Cucumber y su desarrollo de los casos de prueba con el lenguaje Gerkin; El lenguaje que programacion utilizado es Java con el motor de automatizacion Appium.

Dentro de este proyecto encontraremos 2 casos de prueba el cual utilizamos como prueba la aplicacion de sample-apps que se encuentra alojada en la ruta src/java/resources

- Nombres de los casos de prueba:
1. Add Contact
2. Invisible Contacts

Tambien contiene el instalador de Allure para el manejo de reportes.

**Para la correcta ejecucion de los casos de prueba es necesario seguir los pasos en el orden que se encuentra en esta documentacion**

## Descarga de Herramientas:

1. Java 11 y agregar variable de entorno JAVA_HOME <C:\Program Files\Java\jdk-11>
2. Maven y agregar variable de entorno MAVEN_HOME <C:\Program Files\Maven\apache-maven-3.9.6>
3. Android Studio y agregar variable de entorno ANDROID_HOME <C:\Users\"TU USUARIO"\AppData\Local\Android\Sdk>
4. Agregar a la variable de PATH las variables:
	- JAVA_HOME <C:\Program Files\Java\jdk-11\bin>
	- MAVEN_HOME <C:\Program Files\Maven\apache-maven-3.9.6\bin>
	- ANDROID_HOME <C:\Users\"TU USUARIO"\AppData\Local\Android\Sdk\plataform-tools>
5. Node JS 
6. Ecplise IDE o el de tu preferencia
7. Git
8. Appium Inspector : <Appium-Inspector-2024.3.4-win-x64.exe>

## Descarga de Dependencias:

1. Abrir un cmd para ejecutar las siguientes dependencias
2. Appium : <npm -g appium@latest>
3. Appium driver andorid : <appium driver install uiautomator2>
4. Appium driver ios : <appium driver install xcuitest>

## Pasos para Emular un Dispositivo en Andorid Studio:

1. Abrir la app de Andorid Studio
2. Abrir Device Manager 
3. Clic en Create Virtual Device 
4. Seleccionar dispositivo
5. Seleccionar imagen para version del SO del dispositivo; En caso de no tenerlo descargado seleccionar la version y dar clic en el icono de descarga
6. Ingresar Nombre del dispositivo 
7. Clic en el icono de play del dispositivo a emular

## Agregar un APK al Dispositivo Emulado (Esto solo en caso de no tener la ruta agregada en las capabilites del proyecto):

1. Descargar el apk a probar de algun repositorio
2. Identificar el archivo de la aplicacion (apk)
3. Una ves inicializado el dispositivo emulado en Android Studio tendras que arrastar el archivo apk de tu computador y soltarlo en el dispositivo
4. Validar que la app se haya instalado correctamente

## Obtener appPackage y appActivity:

1. Abrir la app dentro del dispositivo emulado 
2. Abrir un CMD
3. Escribir el siguiente comando: <adb shell dumpsys window | find "mCurrentFocus">
4. Te dara la respuesta donde la primera parte despues del "u0" y antes del "/" sera el appPackage
5. Dentro de esa misma respuesta del comando despues del "/" y antes del "}" sera el appActivity

## Obtener el UDID:

1. Abir un cmd 
2. Validar que tengas inicializado del dispositivo emulado en Android Studio 
3. Dentro del CMD colocar el siguiente comando <adb devices>
4. La respuesta te diran los dispositivos emulados que se encuentras activos

## Levantar Servidor de Appium:

1. Abrir un CMD
2. Ingresar el siguiente comando: <appium --address 127.0.0.1 --port 4723>
3. Validar que no marque ningun error 

## Iniciar Appium Inspector (Esto solo es necesario para el desarrollo de las pruebas):

1. Abrir la app de appium inspector 
2. En remote host colocar la ip: 127.0.0.1
3. En el puerto colocar: 4723
4. Ingresar las capabilites:
	- platformName = Android
	- appium:automationName = UiAutomator2
	- appium:deviceName = Pixel 8 Pro API 33 V13 <nombre de tu dispositivo como aparece en Android Studio>
	- appium:platformVersion = 13 <numero de tu version del SO del dispositivo>
	- udid = emulator-5554 <udid del dispositivo emulado>
	- appActivity = <nombre de la actividad de la app>
	- appPackage = <nombre del paquete de la app>
5. Clic en Start Session
6. Validar que se muestre el dispositivo inicialidado en la app previamente instalada

## Ejecucion de los Casos de Prueba:
  
1. Abrir un cmd en la ruta raiz del proyecto
2. Ejecutar el comando: mvn test
3. Visualizar en consola los logs de la ejecuion de la prueba automatizada mobile

## Ver y Generar Reportes de Allure:

1. Abrir un cmd en la ruta raiz del proyecto 
2. Ejecutar el comando: npm install -g allure-commandline --save -dev
3. Ejecutar el comando allure serve y esperar que se abra el reporte en el reporteador

## 
**Autor: Andrea Gonzalez Cortes**
**Tester Automation**
##
