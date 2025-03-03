# Microservicio de Citas

Este microservicio se encarga de la **gestión de citas** (listado, alta, edición y eliminación) para la veterinaria **Patitas**. Está desarrollado con **Java 17** y **Spring Boot 3.4.3**, utilizando **H2** como base de datos en memoria y ejecutándose por defecto en el **puerto 8080**.

## Características

- **CRUD completo** para la entidad “Cita”: listar, crear, actualizar y eliminar.
- **Base de datos H2** en memoria, ideal para pruebas sin instalar un SGBD adicional.
- **Endpoints REST** accesibles vía HTTP para integrarlo con otras aplicaciones o frontends (por ejemplo, Angular).
- **Configuración** en `application.properties`.
- **Java 17** y **Spring Boot 3.4.3** para un entorno moderno y estable.

---

## Requisitos Previos

- **Java 17** (o superior) instalado en tu sistema.

---

## Ejecución (Varios Métodos)

### 1. Ejecución con Maven

1. **Clona** este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/microservicio-citas.git
   cd microservicio-citas

2. **Compila y ejecuta
   - **mvn clean install
   - **mvn spring-boot:run
