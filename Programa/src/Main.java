import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("---- MENÚ ----");
            System.out.println("1. Productos");
            System.out.println("2. Proveedores");
            System.out.println("3. Nuevo pedido");
            System.out.println("4. Pedido mayor");
            System.out.println("5. Total facturado");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el número

            switch (opcion) {
                case 1:
                    ingresarProductos(scanner);
                    break;
                case 2:
                    ingresarProveedores(scanner);
                    break;
                case 3:
                    ingresarNuevoPedido(scanner, pedidos);
                    break;
                case 4:
                    mostrarPedidoMayor(pedidos);
                    break;
                case 5:
                    mostrarTotalFacturado(pedidos);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    static class Pedido {
        private String producto;
        private String proveedor;
        private double precioUnitario;
        private int unidades;

        public Pedido(String producto, String proveedor, double precioUnitario, int unidades) {
            this.producto = producto;
            this.proveedor = proveedor;
            this.precioUnitario = precioUnitario;
            this.unidades = unidades;
        }

        public double calcularTotal() {
            return precioUnitario * unidades;
        }

        @Override
        public String toString() {
            return producto + "|" + proveedor + "|" + precioUnitario + "|" + unidades + "|";
        }
    }

    private static void ingresarProductos(Scanner scanner) {
        System.out.println("---- Ingresar Productos ----");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String producto = scanner.nextLine();
            // Aquí se puede realizar el almacenamiento o procesamiento del producto
        }
        System.out.println();
    }

    private static void ingresarProveedores(Scanner scanner) {
        System.out.println("---- Ingresar Proveedores ----");
        for (int i = 1; i <= 2; i++) {
            System.out.print("Ingrese el nombre del proveedor " + i + ": ");
            String proveedor = scanner.nextLine();
            // Aquí se puede realizar el almacenamiento o procesamiento del proveedor
        }
        System.out.println();
    }

    private static void ingresarNuevoPedido(Scanner scanner, ArrayList<Pedido> pedidos) {
        System.out.println("---- Ingresar Nuevo Pedido ----");

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el nombre del proveedor: ");
        String proveedor = scanner.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de leer el número

        System.out.print("Ingrese la cantidad de unidades: ");
        int unidades = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de leer el número

        Pedido pedido = new Pedido(producto, proveedor, precioUnitario, unidades);
        pedidos.add(pedido);

        System.out.println("¡Pedido registrado exitosamente!");
        System.out.println();
    }

    private static void mostrarPedidoMayor(ArrayList<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        } else {
            Pedido pedidoMayor = pedidos.get(0);
            for (int i = 1; i < pedidos.size(); i++) {
                Pedido pedidoActual = pedidos.get(i);
                if (pedidoActual.unidades > pedidoMayor.unidades) {
                    pedidoMayor = pedidoActual;
                }
            }

            System.out.println("---- Pedido con más unidades ----");
            System.out.println("Producto: " + pedidoMayor.producto);
            System.out.println("Proveedor: " + pedidoMayor.proveedor);
            System.out.println("Precio Unitario: " + pedidoMayor.precioUnitario);
            System.out.println("Unidades: " + pedidoMayor.unidades);
            System.out.println();
        }
    }

    private static void mostrarTotalFacturado(ArrayList<Pedido> pedidos) {
        double totalFacturado = 0.0;
        for (Pedido pedido : pedidos) {
            totalFacturado += pedido.calcularTotal();
        }

        System.out.println("---- Total Facturado ----");
        System.out.println("Total: $" + totalFacturado);
        System.out.println();
    }
}
