import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Moneda {
    String apikey = "35a307ae44ac1175533d2c97";


    public void busqueda(String choose, double monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apikey + "/pair/" + choose + "/" + monto);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            Respuestas respuestas = gson.fromJson(json, Respuestas.class);
            System.out.println("La conversión es " + respuestas.getConversionResult());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void busquedaEspecifica(String divisa, String divisaConvert, double monto) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apikey + "/pair/" + divisa + "/" + divisaConvert + "/" + monto);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();
            Respuestas respuestas = gson.fromJson(json, Respuestas.class);
            System.out.println("La conversión es " + respuestas.getConversionResult());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}