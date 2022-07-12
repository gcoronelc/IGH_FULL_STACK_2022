//permiten al compilador informar de muchos errores de compilación
//permiten eliminar los cast
//Los generics permiten usar tipos para parametrizar las clases, interfaces y métodos al definirlas.
/*
Los genéricos  proporciona verificación de tipo en tiempo de compilación y eliminar el riesgo de ClassCastException

Comprobación de tipos más fuerte en tiempo de compilación.
Eliminación de casts aumentando la legibilidad del código.
Posibilidad de implementar algoritmos genéricos, con tipado seguro.

Cuando no proporcionamos el tipo, el tipo se convierte en Objeto.

No podemos usar tipos de parametros primitivos

E: elemento de una colección.
K: clave. - Map
N: número.
T: tipo.
V: valor. Map
S, U, V etc: para segundos, terceros y cuartos tipos.


 */
package javagenerics;

public class JavaGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box<Integer> integerBox1 = new Box<>();
        Box<Integer> integerBox2 = new Box<>();
        OrdenPair<String, Integer> p1 = new OrdenPair<>("Even", 8);

        Box rawBox = new Box();

        IPair<Integer, String> pair1 = new OrdenPair<>(1, "Apple");
        IPair<Integer, String> pair2 = new OrdenPair<>(2, "PEar");

        boolean same = OrdenPair.compare(pair1, pair2);
        System.out.println(same);

        integerBox1.set(10);
        //integerBox1.inspect("sometext");
        System.out.println(integerBox1.get());

        Number number = 11;
        Integer integer = new Integer(10);
        number = integer;

        Box<Number> boxnumber = new Box<>();
        Box<Integer> boxinteger = new Box<>();

        // boxnumber = boxinteger;
    }

}

class A {

}

interface B {

}

interface C {

}

class D<T extends A & B & C> {

}

class E {

}
