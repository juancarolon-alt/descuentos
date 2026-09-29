import java.util.Scanner;

public class descuentos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir nombre del producto
        System.out.print("Ingrese el nombre del producto: ");
        String producto = teclado.nextLine();

        // Pedir el precio
        System.out.print("Ingrese el precio: $");
        double compra = teclado.nextDouble();

        double descuento;

        if (compra >= 500000) {
            descuento = 20;
        } else if (compra >= 300000) {
            descuento = 15;
        } else if (compra >= 100000) {
            descuento = 10;
        } else {
            descuento = 0;
        }

        // Cálculos
        double valorDescuento = compra * descuento / 100;
        double subtotal = compra - valorDescuento;
        double iva = subtotal * 0.19; // IVA del 19% aplicado al subtotal
        double total = subtotal + iva;

        // Mostrar resumen de compra
        System.out.println("\n========== RESUMEN DE COMPRA ==========\n");
        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + (long) compra);
        System.out.println("Descuento aplicado: " + (int) descuento + "%");
        System.out.println("Valor descuento: $" + (long) valorDescuento);
        System.out.println("Subtotal: $" + (long) subtotal);
        System.out.println("IVA: $" + (long) iva);
        System.out.println("TOTAL: $" + (long) total);

        teclado.close();
    }
}


