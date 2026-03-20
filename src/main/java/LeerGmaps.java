import com.google.gson.Gson;

import java.io.*;

public class LeerGmaps {
    public static void main (String[] args)  throws IOException {
        final Gson gson = new Gson();
        final InputStream f = new FileInputStream("src/main/resources/specie.json");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f));

        bufferedReader.close();
    }
}
