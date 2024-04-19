DigiWallet

App para consola programada en lenguaje Java JDK-17.

La clase "runner" que contiene el main() es RunnerPrincipal.java
El programa simula procesos de movimiento de dinero entre cuentas.
Al iniciar el programa, se crean 3 usuarios con sus credenciales, información es expuesta en pantalla.

Los usuarios pueden iniciar session con las credenciales generadas.
Los usuarios pueder utilizar todas las funcionalidades excepto las señaladas con (admin), a las cuales puede acceder el usuario admin.


Un usuario puede crear nuevas cuentas, contactos, cuentas de pago y contactos.
Un usuario puede realizar transferencias entre sus cuentas y a sus contactos.
Un usuario peuede realizar giros, abonos y pago de cuentas de pago.
Un usuario no puede editar información sólo el usuario admin.
Un usuario no puede eliminar transferencias, cuentas ni contactos.
Un usuario sólo puede eliminar sus cuentas de pago.
Un usuario cuando crea un contacto debe crear la cuenta asociada al nuevo contacto.
Un usuario al crear un contacto sólo ingresa información general del contacto, 


Un usuario admin puede desactivar cuentas y usuarios.
Un usuario admin puede reversar transferencias.
Un usuario admin puede editar datos sensibles de los usuarios.
Un usaurio admin puede conceder acceso a un contacto mediante la edición.
un nuevo contacto no esta habilitado como usuario.


Pruebas unitarias con libreria JUnit y Mockito, alojadas en carpeta bibliotec.
Prueba de conexion a base de datos implementada pero esta deshabilitada.