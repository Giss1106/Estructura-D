package ejercicioslista;

import java.util.Scanner;


public class EjerciciosLista {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NodoLista cabeza = null; // Inicializar la lista como vacía

        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menu de opciones");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar datos originales");
            System.out.println("3. Mostrar datos intercambiados");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();

            // Realizar la acción correspondiente a la opción seleccionada
            switch (opcion) {
                case 1:
                    // Ingresar datos a la lista
                    cabeza = crearListaDinamica();
                    break;
                case 2:
                    // Mostrar datos originales
                    System.out.println("Lista original");
                    imprimirLista(cabeza);
                    break;
                case 3:
                    // Mostrar datos intercambiados
                    if (cabeza != null) {
                        NodoLista listaIntercambiada = intercambiarNodos(cabeza);
                        System.out.println("Lista despues del intercambio");
                        imprimirLista(listaIntercambiada);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Gracias");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4); // Repetir el menú hasta que el usuario elija salir
    }

    // Función para crear una lista enlazada ingresando valores dinámicamente
    private static NodoLista crearListaDinamica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores de la lista ");

        NodoLista cabeza = null;
        NodoLista actual = null;

        String valor;
        while (true) {
            System.out.print("Ingrese un valor (ingrese 0 para dejar de ingresar )--> ");
            valor = scanner.next();

             if (valor.equals("0")) {
                break;
            }

            // Crear un nuevo nodo con el valor ingresado
            NodoLista nuevoNodo = new NodoLista(valor);

            // Configurar la cabeza si es el primer nodo, de lo contrario, agregar al final
            if (cabeza == null) {
                cabeza = nuevoNodo;
                actual = cabeza;
            } else {
                actual.siguiente = nuevoNodo;
                actual = nuevoNodo;
            }
        }

        // Devolver la cabeza de la lista
        return cabeza;
    }

    // Función para intercambiar parejas de nodos adyacentes
    private static NodoLista intercambiarNodos(NodoLista cabeza) {
        // Verificar si la lista tiene al menos dos nodos
        if (cabeza != null && cabeza.siguiente != null) {
            // La nueva cabeza será el segundo nodo
            NodoLista nuevaCabeza = cabeza.siguiente;
            NodoLista prev = null;

            // Iterar a través de la lista y realizar el intercambio
            while (cabeza != null && cabeza.siguiente != null) {
                NodoLista temp = cabeza.siguiente;
                cabeza.siguiente = temp.siguiente;
                temp.siguiente = cabeza;

                // Conectar el nodo anterior al par intercambiado
                if (prev != null) {
                    prev.siguiente = temp;
                }

                // Actualizar el nodo anterior y avanzar al siguiente par de nodos
                prev = cabeza;
                cabeza = cabeza.siguiente;
            }

            // Devolver la nueva cabeza de la lista después del intercambio
            return nuevaCabeza;
        }

        // Devolver la cabeza original si la lista tiene menos de dos nodos
        return cabeza;
    }

    // Función para imprimir la lista enlazada
    private static void imprimirLista(NodoLista cabeza) {
        while (cabeza != null) {
            System.out.print(cabeza.valor + " -- ");
            cabeza = cabeza.siguiente;
        }
        System.out.println("null");
    }
}

