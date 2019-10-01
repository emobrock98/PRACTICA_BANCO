import java.util.Hashtable;
import java.util.Scanner;

public class Personas {
    String nombre, apellidos, dni;

    public Personas(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre; }
    public String getApellidos() {return apellidos; }
    public void setApellidos(String apellidos) {this.apellidos = apellidos; }
    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni; }

    public static void main(String[] args) {
        int id, pin;
        double saldo;
        String dni;
        Hashtable<Integer,Cuenta> cuentas = new Hashtable();
        Scanner sc = new Scanner(System.in);
        System.out.println("dni: ");
        dni = sc.next();
        System.out.println("saldo: ");
        saldo = sc.nextDouble();
        System.out.println("id: ");
        id = sc.nextInt();
        System.out.println("pin: ");
        pin = sc.nextInt();
        Cuenta cuenta = new Cuenta(id,pin,dni,saldo);
        cuentas.put(id,cuenta);


    }
}
