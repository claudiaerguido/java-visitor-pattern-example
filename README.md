# Patrón Visitor - Cálculo de Costos de Seguros

Este repositorio contiene una implementación del patrón de diseño **Visitor** en Java, aplicada al cálculo de costos de distintos tipos de seguros: médico, vida y automóvil. Utilizar el patrón Visitor permite definir nuevas operaciones sobre objetos de una estructura de clases sin modificar las clases en sí.

## Descripción

El proyecto utiliza el patrón Visitor para separar el cálculo del costo de los seguros de la estructura de clases de los seguros (`SeguroMedico`, `SeguroVida`, `SeguroAuto`). Este enfoque facilita la adición de nuevas operaciones relacionadas con el costo de los seguros sin modificar las clases de cada tipo de seguro.

### Clases y Componentes Principales

- **Principal**: Clase principal que instancia los seguros y el visitante que calculará sus costos. Ejecuta el programa y muestra los resultados.
- **Seguro** (Interfaz): Define el método `aceptar`, el cual acepta un visitante que realiza una operación en la clase de seguro.
- **SeguroMedico, SeguroVida, SeguroAuto**: Clases concretas que implementan la interfaz `Seguro` y representan tipos específicos de seguros.
- **VisitanteSeguros** (Interfaz): Define métodos `visitar` para cada tipo de seguro.
- **VisitanteCostoSeguros**: Implementa `VisitanteSeguros` y proporciona la lógica para calcular el costo de cada seguro.

## Estructura de Carpetas

El código fuente está organizado en el directorio `src`, dentro de la carpeta raíz `patron_visitor`.

## Ejemplo de Uso

En la clase `Principal`, se instancian diferentes seguros y se calcula su costo utilizando el visitante `VisitanteCostoSeguros`.

```java
public class Principal {
    public static void main(String[] args) {
        SeguroMedico seguroMedico = new SeguroMedico(500);
        SeguroVida seguroVida = new SeguroVida(1000);
        SeguroAuto seguroAuto = new SeguroAuto(800);

        VisitanteCostoSeguros visitanteCostoSeguros = new VisitanteCostoSeguros();

        double costoMedico = seguroMedico.aceptar(visitanteCostoSeguros);
        double costoVida = seguroVida.aceptar(visitanteCostoSeguros);
        double costoAuto = seguroAuto.aceptar(visitanteCostoSeguros);

        System.out.println("Costo del seguro médico: " + costoMedico);
        System.out.println("Costo del seguro de vida: " + costoVida);
        System.out.println("Costo del seguro de automóvil: " + costoAuto);
    }
}
```

### Ejecución

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu_usuario/java-visitor-pattern-example.git
   ```
   
2. Navega a la carpeta `src` y compila los archivos Java:
   ```bash
   cd Patron-Visitor-Seguros/src
   javac Principal.java
   ```

3. Ejecuta la clase principal:
   ```bash
   java Principal
   ```

### Salida Esperada
El programa mostrará el costo de cada tipo de seguro en la consola:
```
Costo del seguro médico: 500.0
Costo del seguro de vida: 1000.0
Costo del seguro de automóvil: 800.0
```

## Contribuciones

Las contribuciones son bienvenidas. Puedes abrir issues para reportar bugs o sugerir mejoras, y pull requests para aportar al código.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
