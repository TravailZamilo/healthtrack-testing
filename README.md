# HealthTrackTest 🧪

Proyecto de automatización de pruebas para la plataforma HealthTrack, enfocado en validar la lógica de actualización de peso de los usuarios.

## ✅ Objetivo

Detectar y corregir un error en la lógica del sistema donde, al actualizar el peso de un usuario, se restaba 1 kg en lugar de asignar el nuevo valor. Además, implementar pruebas automatizadas y configurar un pipeline de integración continua.

## 🛠 Tecnologías Utilizadas

- Java 17
- Maven
- JUnit 5
- GitHub Actions

## 📁 Estructura del Proyecto

```
HealthTrackTest/
├── src/
│   ├── main/java/com/healthtrack/Usuario.java
│   └── test/java/com/healthtrack/UsuarioTest.java
├── .github/workflows/test.yml
├── pom.xml
└── .gitignore
```

## 🔍 Descripción de Archivos

- `Usuario.java`: Clase con atributos `nombre` y `peso`, y método `actualizarPeso()`.
- `UsuarioTest.java`: Prueba unitaria que valida el comportamiento correcto del método `actualizarPeso()`.
- `pom.xml`: Archivo de configuración Maven con dependencias y plugins.
- `.gitignore`: Excluye carpetas y archivos innecesarios como `/target`, `.idea/`, etc.
- `test.yml`: Workflow de GitHub Actions para automatizar la ejecución de pruebas.

## 🧪 Pruebas Automatizadas

La prueba unitaria implementada verifica:

- Que al ejecutar `actualizarPeso(75.0)`, el atributo `peso` refleje correctamente el nuevo valor (`75.0`).

```java
@Test
public void testActualizarPeso() {
    Usuario u = new Usuario("Camilo", 70.0);
    u.actualizarPeso(75.0);
    assertEquals(75.0, u.getPeso(), 0.01);
}
```

## 🔁 CI/CD con GitHub Actions

El archivo `.github/workflows/test.yml` configura una acción automática que:

- Se ejecuta en cada push o pull request.
- Instala Java 17.
- Ejecuta `mvn test`.

```yaml
name: Java CI

on: [push, pull_request]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v3

    - name: Set up JDK
      uses: actions/setup-java@v3
      with:
        java-version: '17'
        distribution: 'temurin'

    - name: Run tests with Maven
      run: mvn test
```

## 📌 Estado del Proyecto

- ✅ Código corregido
- ✅ Prueba unitaria funcionando
- ✅ CI/CD activo en GitHub Actions
- ✅ Repositorio limpio y organizado

## 👨‍💻 Autor

**Camilo (TravailZamilo)**  
📎 [Repositorio en GitHub](https://github.com/TravailZamilo/healthtrack-testing)
