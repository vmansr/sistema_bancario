# Sistema Bancario - Proyecto Java

## Descripción

Este proyecto es un sistema bancario simplificado desarrollado en Java utilizando Programación Orientada a Objetos (POO). El sistema permite la gestión de clientes y varios productos financieros, como cuentas de ahorro, cuentas corrientes, certificados de depósito a término (CDT) y tarjetas de crédito. Cada producto financiero tiene su propia lógica para el cálculo de intereses y manejo de saldos, lo que hace de este proyecto un ejercicio práctico de cómo aplicar POO en la simulación de operaciones bancarias.

## Estructura del Proyecto

El proyecto está organizado en las siguientes clases principales:

### Cliente:
- Contiene los atributos y métodos relacionados con la información personal del cliente, como documento de identidad, nombre, correo electrónico, número de celular y dirección.

### ProductoBancario (Clase Abstracta):
- Actúa como una superclase abstracta que define los atributos comunes a todos los productos financieros (por ejemplo, número de cuenta, fecha de apertura, saldo).
- Contiene métodos abstractos que son implementados por las subclases para calcular intereses y gestionar los productos específicos.

### CuentaAhorro:
- Hereda de ProductoBancario.
- Implementa el cálculo de intereses mensuales sobre el saldo basado en un porcentaje de interés fijo.
- Incluye métodos para la gestión de depósitos y retiros.

### CuentaCorriente:
- Hereda de ProductoBancario.
- Añade funcionalidades como el manejo de sobregiros y la aplicación de intereses sobre el saldo disponible.
- También permite depósitos y retiros con la consideración del límite de sobregiro.

### CDT:
- Hereda de ProductoBancario.
- Implementa el cálculo de intereses al finalizar el plazo del depósito, sumando el monto inicial y los intereses generados.
- No permite retiros antes del vencimiento del plazo.

### TarjetaCredito:
- Hereda de ProductoBancario.
- Gestiona el cálculo de intereses sobre el valor utilizado del crédito y el manejo del límite de crédito.
- Permite la simulación de pagos y cargos en la tarjeta.

## Requisitos

- Java Development Kit (JDK): versión 8 o superior.
- NetBeans IDE: versión 12.0 o superior, aunque es compatible con otros entornos de desarrollo integrados (IDE) que soporten proyectos Java.
- Bibliotecas externas: No se requieren bibliotecas adicionales fuera de las incluidas en el JDK estándar.

## Instalación

1. **Clonar el Repositorio:**
   - Clona el repositorio del proyecto desde [GitHub] o descarga el archivo ZIP del código fuente.

2. **Abrir en NetBeans:**
   - Abre NetBeans IDE.
   - Selecciona File > Open Project y navega hasta la carpeta del proyecto clonado o descomprimido.
   - Selecciona la carpeta del proyecto y haz clic en Open Project.

3. **Ejecutar el Proyecto:**
   - Compila y ejecuta el proyecto directamente desde NetBeans utilizando el botón de Run o Shift + F6.
   - El programa iniciará en la consola, donde podrás interactuar con las funcionalidades del sistema bancario.

## Uso

El sistema está diseñado para ejecutarse en un entorno de línea de comandos. Ofrece un menú interactivo donde se pueden realizar las siguientes acciones:

1. Registrar un nuevo cliente: Captura y almacena la información básica del cliente.
2. Crear un producto financiero: Asocia un producto financiero (cuenta de ahorro, cuenta corriente, CDT, o tarjeta de crédito) con un cliente existente.
3. Realizar operaciones: Permite realizar depósitos, retiros, y consultar saldos e intereses.
4. Calcular intereses: Calcula y aplica intereses según las reglas definidas para cada tipo de producto financiero.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, puedes seguir estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tu característica o corrección (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -m 'Añadir nueva característica'`).
4. Sube tu rama (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.

