package com.grepp.llm.gemini.text;

import com.grepp.llm.gemini.ChatModel;
import com.grepp.llm.gemini.Request;
import com.grepp.llm.gemini.Response;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class GeminiChatModel implements ChatModel {

    private String API_URL;
    private String API_KEY;

    public GeminiChatModel(String version, String apiKey) {
        this.API_URL = "https://generativelanguage.googleapis.com"
            + "/v1beta"
            + "/models"
            + "/gemini-" + version +"-flash:generateContent";

        this.API_KEY = apiKey;
    }

    @Override
    public Response invoke(Request request) {

        String body = request.toJson();

        try (
            HttpClient client = HttpClient.newBuilder()
                .version(Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        ) {
            HttpRequest requestClient = HttpRequest.newBuilder()
                .uri(URI.create(
                    API_URL + "?key=" + API_KEY))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(body))
                .build();

            HttpResponse<String> response = client.send(requestClient, BodyHandlers.ofString());
            return new TextResponse(response.body());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("gemini 서버의 통신에 실패했습니다.");
        }
    }
}