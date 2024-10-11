import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConvertirDivisa {
    Divisa conversion(String divisaInicial, String divisaFinal) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/039ddc1264098dde385020ee/pair/" + divisaInicial + "/" + divisaFinal);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        } catch (Exception e) {
            throw new RuntimeException("Opcion invalida");
        }




    }
}

