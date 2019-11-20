#Author: Nicolas Epia
#

@tag
Feature: Lleno de formulario Mortgage
  I want to use this template for my feature file

   @Mortgage
  Scenario Outline: Formularios Hipoteca
    Given Ingreso a la aplicacion
    And ingreso usuario "company" y contrasena "company"
    When ingreso a la opcion Mortgage lleno el primer formulario <Nombre><Apellido><Edad><Dir1><Dir2><Pais>
    And lleno el segundo formulario <Tipo><Años><Ocupacion><Ingresos>

    Examples: 
      | Nombre    | Apellido | Edad | Dir1               | Dir2              | Pais       | Tipo        | Años | Ocupacion | Ingresos |
      | "Nicolas" | "Epia"   |   23 | "Cll 159 n° 17-38" | "Torre 3 Apt 304" | "Colombia" | "Education" |    5 | "None"    |   500000 |

