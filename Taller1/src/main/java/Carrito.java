import java.util.ArrayList;

public class Carrito {
    public static void main(String[] args) {
        carrito();
    }
    public static void carrito(){
        ArrayList<Integer> carrito = new ArrayList<>();
        int largoCarrito = random(20)+1;
        productos(carrito,largoCarrito);


    }
    public static void productos(ArrayList<Integer> a,int largoCarrito){
        ArrayList<Integer>precios = new ArrayList<>();
        for (int i = 0; i <= largoCarrito; i++) {
            int total = random(16);
            a.add(total);
            total = total*150;
            precios =PrecioTotal(precios,total);
        }
        int productos=0;
        for (int i = 0; i < a.size(); i++) {
            productos=productos+a.get(i);

        }
        Imprimir(productos,precios);
        ImprimirBoleta(a,precios);
    }
    public static int random(int a){
        int random = ((int)(Math.random()*a));
        return random;
    }
    public static ArrayList<Integer> PrecioTotal(ArrayList<Integer> a,int total){
        a.add(500 + total);
        return a;
    }
    public static void Imprimir(int a,ArrayList<Integer>b){
        System.out.println("El carrito contiene " + a + " productos");
    }
    public static void ImprimirBoleta(ArrayList<Integer> a, ArrayList<Integer> precios){
        for (int i = 0; i < a.size(); i++) {

            System.out.println("Carrito " + (i+1) +": " + a.get(i)+" Productos, Subtotal: $" + precios.get(i) );
        }
        int TotalCompra=0;
        for (int i = 0; i < precios.size(); i++) {
            TotalCompra = TotalCompra + precios.get(i);
        }
        System.out.println("Total de la compra: $" + TotalCompra);
    }
}
