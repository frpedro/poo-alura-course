package br.com.alura.films.main;
import br.com.alura.films.exception.yearError;
import br.com.alura.films.model.APITittle;
import br.com.alura.films.model.Tittle;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class API {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in); // creates a scanner to capture user input
        System.out.println("Enter a movie to search: ");
        var search = scanner.nextLine(); // reads user input and stores it in the `search` variable

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

        String json = response.body(); // gets the response body in JSON format
        System.out.println(json); // displays the JSON returned by the API

        // creates a Gson object configured to handle JSON -> Java object conversion
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        // converts the JSON to an APITittle object
        APITittle api = gson.fromJson(json, APITittle.class);

        // try-catch block to show results and handle potential movie year conversion errors
        try {
            Tittle mytittle = new Tittle(api); // creates a Tittle object based on the API response
            System.out.println(mytittle);
        }
        catch (NumberFormatException e) {
            System.out.println("An error occurred related to the movie's year.");
        }
        finally {
            System.out.println("Program Finished!");
        }

    }
}
