package com.crio.xnews;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NewsParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();

// TODO: CRIO_TASK_MODULE_PROJECT
// Deserialize JSON String representing the response from the News API and 
// then return the list of NewsArticle objects contained in the response.

    public static List<NewsArticle> parse(String json) throws IOException {

        
        // Parse the JSON string into a NewsApiResponse object
        NewsApiResponse response = objectMapper.readValue(json, NewsApiResponse.class);
    
        // Return the list of articles or an empty list if null
        return response.getArticles() != null ? response.getArticles() : Collections.emptyList();
    }
}