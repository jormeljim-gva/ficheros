package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio{
    public static void main(String[] args) throws IOException {
        File f = File.listRoots()[0];
        int cont = 0;
        int indice = 0;
        Scanner sc = new Scanner(System.in);
        while(indice!=-1){
            System.out.println("Directorios y ficheros de " + f + "Pulse -1 para salir");
            for (File fichero : f.listFiles()){
                System.out.println(cont++ + " " + fichero.getName());
            }
            indice = sc.nextInt();
            //Aquí hay que coger el File de listFiles con dicho indice
        }
    }
}