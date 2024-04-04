public class Java_02Suma {
    // atrubutos;
    int x, y, z;

    // metodos
    public static void main(String[] args) {
        Java_02Suma suma1 = new Java_02Suma(); // asi se crean los objetos en java
        suma1.x = 8;
        suma1.y = 7;
        suma1.z = suma1.x + suma1.y;
        System.out.println("la suma es:" + suma1.z);
    }
}
