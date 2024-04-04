public class Java_03Suma2 {
    int x, y, z;

    public void asignarValores() {
        x = 8;
        y = 7;
    }

    public void sumar() {
        z = x + y;
    }

    public void imprimir() {
        System.out.println("La suma es: " + z);
    }

    public static void main(String[] args) {
        Java_03Suma2 suma = new Java_03Suma2();
        suma.asignarValores();
        suma.sumar();
        suma.imprimir();
    }
}
