package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Jan_29 {
    public static void main(String[] args) throws Exception{
        String url="https://jsonplaceholder.typicode.com/albums";

        //Building a Request
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        //Getting the HttpClient object
        HttpClient httpClient=HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse= httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}