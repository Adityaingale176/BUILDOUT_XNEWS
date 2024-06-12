package com.crio.xnews;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.List;
 import java.util.Collections;

public class NewsApiClient {

    private static final String API_URL = "https://newsapi.org/v2/everything";
    private static final String API_KEY = "<_YOUR_API_KEY_>";

    private final OkHttpClient client = new OkHttpClient();

// TODO: CRIO_TASK_MODULE_PROJECT
// Send a request to the News API using the Okhttp3 library by passing the specified query, language, and sortBy parameters.
// Make sure Gradle dependency for Okhttp3 is added in build.gradle.
// Parse the JSON response using NewsParser. 
// If the query parameter is empty, an IllegalArgumentException is thrown. 
// If there is an error during the API request or response parsing, IOException is thrown.

    public List<NewsArticle> fetchNewsArticles(String query, String language, String sortBy) throws IOException {

        return Collections.emptyList();
    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Construct the URL required to make a request to the News API and use this in above method.
// The query parameter is mandatory and must not be empty. Throw IllegalArgumentException with message "Query parameter must not be empty" if the query parameter is empty.
// The language and sortBy parameters are optional and will be included in the URL if they are non-empty.

    private String buildUrl(String query, String language, String sortBy) {

      return "";
    }
}