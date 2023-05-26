# aepd_sede_electronica
Repo automatización sede electronica y firma con Autofirma.

# Realización de tests automáticos
Se sigue el patrón Page Object Model y mediante Selenide se ejecutan diferentes tests automáticos a la sede eléctronica. Queda pendiente refactorizar y dejar los elementos y los métodos lo más independientes posibles.

# Autofirma
Este proyecto utiliza scripts de vbs para poder automatizar el paso de la firma electrónica mediante el uso de AutoFirma. Está preparado para tener un certificado de representación y uno de usuario a la vez.
En el entorno de pruebas, mediante un script de Powershell cargamos el certificado que necesitamos para realizar las pruebas, y borramos el resto, así sólo tendrá uno en el que elegir. 

# Actualizar resultados en JIRA
Se ha desarollado una clase concreta llamada *AIORestAssuredExample* para actualizar la suite creada en Jira cloud con el plugin AIO Test. Una vez se han ejecutado todos los tests, mediante una llamada API se actualiza el test cycle que indicamos. 

Nuestro JIRA de pruebas es:
https://alfdevtest.atlassian.net/jira/your-work
y el usuario para probar lakele2359@jwsuns.com/\*Test01Test02\*


