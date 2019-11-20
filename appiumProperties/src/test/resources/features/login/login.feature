#Author: David Cardenas Guzman
@Tag
Feature: prueba de ingreso a la app

  @Tag1
  Scenario: login exitoso
    Given Ingreso a la aplicacion
    When ingreso usuario "company" y contrasena "company"
      
