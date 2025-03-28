package br.com.alura.films.main;
import br.com.alura.films.model.APITittle;
import br.com.alura.films.model.Tittle;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        List<Tittle> listOfMovies = new ArrayList<>(); // creates a movies arraylist
        String search = ""; // creates empty var for input

        // creates a Gson object configured to handle JSON -> Java object conversion
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        // loop for get movies
        while(true) {

            System.out.println("Qual filme você está procurando? ");

            search = scanner.nextLine(); // reads user input and stores it in the `search` variable

            if(search.equalsIgnoreCase("sair")){break;}

            // builds the URL for the OMDb API request, replacing spaces with "-"
            String address = "http://www.omdbapi.com/?t=" + search.replace(" ", "-") +
                    "&apikey=c1c84c5e";

            // creates an HTTP client to make requests
            HttpClient client = HttpClient.newHttpClient();

            // builds the HTTP request using the created URL
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address)) // sets the URI of the request
                    .build();

            // sends the request and stores the response as a string
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // gets the response body in JSON format
            String json = response.body();

            System.out.println(json);

            // converts the JSON to an APITittle object
            APITittle api = gson.fromJson(json, APITittle.class);

            // try-catch block to show results and handle potential movie year conversion errors
            try {
                Tittle mytittle = new Tittle(api);
                System.out.println(mytittle);
                // add json on the list
                listOfMovies.add(mytittle);
            } catch (NumberFormatException e) {
                System.out.println("Ocorreu um erro relacionado ao ano do filme.");
            }
        }
            // creates json file
            FileWriter wjson = new FileWriter("movies.json");
            wjson.write(gson.toJson(listOfMovies));
            wjson.close();

        System.out.println(listOfMovies);

        System.out.println("Programa finalizado!");

    }
}
