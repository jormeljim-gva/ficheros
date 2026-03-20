import com.google.gson.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class Specie{
    int base_happiness;
    int capture_rate;
    Color color;
    Evolve evolve_from_species;

    class Color{
        String name;
        String url;
    }

    class Evolve{
        String name;
        String url;
    }
}

public class LeerPokemons {

    public static void main (String[] args)  throws IOException {
        final Gson gson = new Gson();
        final InputStream f = new FileInputStream("src/main/resources/specie.json");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f));
        Specie e = gson.fromJson(bufferedReader, Specie.class);
        System.out.println("Base happiness: " + e.base_happiness);
        System.out.println("Capture rate: " + e.capture_rate);
        System.out.println("Color: " + e.color.name);
        System.out.println("Evolve from: " + e.evolve_from_species.name);
        bufferedReader.close();
    }
}
