# Comparacion_Algoritmos_De_Ordenacion

Objetivo: Ejecutar y analizar comparativamente los algoritmos de Burbuja, Selección e Inserción sobre casos de prueba, 
          para determinar cuándo conviene cada uno en función de tamaño, grado de orden y duplicados.
## 2. Equipos y herramientas utilizadas
- **JDK OpenJDK** (obligatorio).  
- **IDE:** IntelliJ IDEA Community o Visual Studio Code (Extension Pack for Java).  
- **Sistema de control de versiones:** Git + repositorio GitHub.  
- **EVA/Moodle institucional** para entrega de evidencias.  
- **Herramientas de documentación:** README 

---

##  3. Estructura del Proyecto

<img width="606" height="764" alt="image" src="https://github.com/user-attachments/assets/d8f35e04-d20f-4270-8099-b1b02beb6d15" />


## 7. Requisitos previos

Antes de ejecutar el proyecto, asegúrate de contar con el siguiente entorno:

| Componente | Versión recomendada | Descripción |
|-------------|---------------------|--------------|
| **Java JDK** | **24 (OpenJDK 24)** | Requerido para compilar y ejecutar el proyecto. Puede descargarse desde [Open JDK]([https://jdk.java.net/25/](https://openjdk.org/projects/jdk/24/)). |
| **Maven** | 3.9.x o superior | Maneja dependencias y estructura del proyecto. |
| **IDE recomendado** | [Visual Studio Code](https://code.visualstudio.com/) con extensión *Extension Pack for Java* | Permite editar, compilar y ejecutar fácilmente. También puedes usar IntelliJ IDEA o Eclipse. |
| **Sistema operativo** | Windows / Linux / macOS | Compatible con cualquier entorno que soporte JDK 25. |

>  **Nota:** Asegúrate de tener configurada la variable de entorno `JAVA_HOME` apuntando al directorio donde está instalado el JDK 25, y de incluir `%JAVA_HOME%\bin` en el `PATH`.

---

## 8. Guía de Ejecución

Sigue estos pasos para descargar, configurar y ejecutar el proyecto:

### 1. Clonar el Repositorio

Abre tu terminal (o la consola integrada de tu IDE) y ejecuta el siguiente comando para clonar el proyecto desde GitHub:

```bash
git clone [https://github.com/JuanCalopinoo/Comparacion_de_Ordenacion.git](https://github.com/JuanCalopinoo/Comparacion_de_Ordenacion.git)
cd Comparacion_De_Ordenacion
```
---

### 8.1 Importar en el IDE

> Abre **IntelliJ IDEA** o **Visual Studio Code**.
>
> Importa el proyecto `Comparacion_De_Ordenacion` como un proyecto existente (ya sea como proyecto Maven, Gradle, o simplemente una carpeta de código fuente Java).

---


### 8.2 Cambiar Rutas

En la seccion de `src/main/java/edu/unl/cc/Main.java` especificamente en esta linea : 
> Paciente[] pacientes = CSVLoader.loadPacientes("C:\\Users\\Usuario\\Desktop\\EstructuraDeDatos\\Comparacion_de_Ordenacion-main\\Comparacion_de_Ordenacion-main\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\pacientes_500.csv");

Remplazar por la ruta en donde guardas los csv en tu dispositivo, aplica para las siguientes rutas tambien :

>ItemInventario[] items = CSVLoader.loadInventario("C:\\Users\\Usuario\\Desktop\\EstructuraDeDatos\\Comparacion_de_Ordenacion-main\\Comparacion_de_Ordenacion-main\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\inventario_500_inverso.csv");
        
>ItemInventario[] items = CSVLoader.loadInventario("C:\\Users\\Usuario\\Desktop\\EstructuraDeDatos\\Comparacion_de_Ordenacion-main\\Comparacion_de_Ordenacion-main\\Comparacion_De_Ordenacion\\src\\main\\java\\edu\\unl\\cc\\datasets\\casi_ordenadas.csv");
---

### 8.3 Ejecutar la Clase Principal

El punto de entrada del programa, que inicializa los *datasets* y ejecuta las trazas de los tres algoritmos (`BubbleSort`, `SelectionSort`, `InsertionSort`), es la clase `Main.java`.

> * **Navega a la clase:** `src/main/java/edu/unl/cc/Main.java`.
> * **Ejecuta el método main** directamente desde tu IDE (usualmente haciendo clic derecho o usando el botón de "Run").

---

### 8.3 Salida Esperada

> La consola mostrará las trazas detalladas para cada algoritmo , incluyendo el estado del arreglo por iteración y los recuentos totales de operaciones.

## **Autores:**
### [Juan Calopino](https://github.com/JuaaanCalopino)
### [Anthony Yaguana](https://github.com/Artyon-13)
