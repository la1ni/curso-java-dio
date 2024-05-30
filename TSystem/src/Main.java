import java.util.*;
import java.io.*;
import java.net.*;
import java.io.BufferedReader;


class Main {
    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                ArrayList<String> lista = new ArrayList<String>();
                while ((line = reader.readLine()) != null) {
                    lista.add(line);
                System.out.println(lista);
                }
                reader.close();
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}