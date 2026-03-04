package ejemplos;

import java.io.File;
public class Ejemplo1 {
    public static void main(String[] args) {
        //Abre el directorio actual '.'
        File f = File.listRoots()[0];
        System.out.println("Lista de ficheros y directorios del directorio actual");
        System.out.println("---------------------------------------------------");
        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)
        for (File e : f.listFiles()){
            System.out.println(e.getName() + e.isFile());
        }
    }
}
