package ar.edu.undef.fie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int suma = 0;
        for(var arg:args){
            suma += Integer.parseInt(arg);

        }
        System.out.println(suma);
    }
}