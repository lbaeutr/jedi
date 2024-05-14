## Clase Jedi
***
![Portada](/images/fondo.jpg)

La clase __Jedi__ representa a un __Jedi__ en el universo de Star Wars.

### Constructor

El __constructor__ de la clase __Jedi__ recibe cuatro parámetros: `nombre`, `edad`, `habilidades` y `colorSableLaser`. `nombre` es una cadena que representa el nombre del __Jedi__, `edad` es un entero que representa la edad del __Jedi__, `habilidades` es un arreglo de cadenas que representa las habilidades del __Jedi__, y `colorSableLaser` es una cadena que representa el color del sable láser del __Jedi__.

```java

    public Jedi(String nombre, int edad, String[] habilidades, String colorSableLaser) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidades = habilidades;
        this.colorSableLaser = colorSableLaser;
    }
```
### Métodos:


La clase __Jedi__ cuenta con los siguientes métodos:
<ul>

![icono](/images/iconoLista.png) `getNombre()`: Devuelve el nombre del __Jedi__. 

```java
public String getNombre() {
        return nombre;
    }
````

![icono](/images/iconoLista.png) `getEdad()`: Devuelve la edad del __Jedi__. 

```java
 public int getEdad() {
        return edad;
    }
````

![icono](/images/iconoLista.png) `getHabilidades()`: Devuelve las habilidades del __Jedi__.

```java
public String[] getHabilidades() {
        return habilidades;
    }
```

![icono](/images/iconoLista.png) `getColorSableLaser()`: Devuelve el color del sable láser del __Jedi__.

```java
 public String getColorSableLaser() {
        return colorSableLaser;
    }
```

![icono](/images/iconoLista.png) `entrenarEnHabilidad(habilidad)`: Imprime un mensaje indicando que el __Jedi__ está entrenando en una habilidad específica.

```java
public void entrenarEnHabilidad(String habilidad) {
        System.out.println(this.nombre + " está entrenando en " + habilidad);
    }
```

![icono](/images/iconoLista.png) `usarLaFuerza()`: Imprime un mensaje indicando que el __Jedi__ está usando la Fuerza. 

```java
 public void usarLaFuerza() {
        System.out.println(this.nombre + " está usando la Fuerza!");
    }

```

![icono](/images/iconoLista.png) `setColorSableLaser()`: Establece el color del sable laser.

```java
 public void setColorSableLaser(String colorSableLaser) {
        this.colorSableLaser = colorSableLaser;
    }
```

![icono](/images/iconoLista.png) `atacar()`: Imprime un mensaje indicando que el Jedi está atacando con su sable láser. 

```java
 public void atacar() {
        System.out.println(this.nombre + " está atacando con un sable de luz " + this.colorSableLaser + "!");
    }
```

</u>


***
#### Sobre esta documentación:

Documentacion sobre esta [clase](https://www.reddit.com/r/StarWars/), encontrada en Reddit.

Mas informacion encontrada sobre [Markdown](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/quickstart-for-writing-on-github).

***

>He recorrido esta galaxia de un extremo a otro, he visto cosas muy raras, pero nunca vi nada que me impulsara a creer que haya una única fuerza poderosa que lo controla todo. Ningún campo de energía mística controla mi destino. - Han Solo


| PERSONAJES  |  |
| ------------- | ------------- |
| ![ICONO](/images/darth-vader_icon-icons.com_76959.png)  | ![ICONO](/images/x.png)  |
| ![ICONO](/images/r2d2.png)  | ![ICONO](/images/tropher.png) |