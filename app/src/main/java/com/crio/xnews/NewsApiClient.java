package com.crio.xnews;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 import java.util.Collections;

public class NewsApiClient {

    private static final String API_URL = "https://newsapi.org/v2/everything";
    private static final String API_KEY = "<_YOUR_API_KEY_>";

    private final OkHttpClient client = new OkHttpClient();

// TODO: CRIO_TASK_MODULE_PROJECT
// Please define all the methods required here as mentioned in the XNews BuildOut Milestone for each functionality before implementing the logic.
// This will ensure that the project can be compiled successfully.

    public List<NewsArticle> fetchNewsArticles(String query, String language, String sortBy) {

        return Collections.emptyList();
    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Please define all the methods required here as mentioned in the XNews BuildOut Milestone for each functionality before implementing the logic.
// This will ensure that the project can be compiled successfully.

    private String buildUrl(String query, String language, String sortBy) {

      return "";
    }
}