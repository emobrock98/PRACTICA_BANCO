public class Cuenta {
    int id, pin;
    String dni;
    double saldo;

    public Cuenta(int id, int pin, String dni, double saldo) {
        this.id = id;
        this.pin = pin;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getId() {return id; }
    public void setId(int id) {this.id = id; }
    public int getPin() {return pin; }
    public void setPin(int pin) {this.pin = pin; }
    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni; }
    public double getSaldo() {return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

}
