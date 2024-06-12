/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.xnews;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
 import java.util.Collections;

public class App {
    public String getGreeting() {
        return "Hello World from XNews!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Check if the file path is passed as an argument
        if (args.length < 1) {
            System.out.println("Please provide the file path as a command line argument.");
            return;
        }

        // The file path passed as a command line argument
        String filePath = args[0];

        // Load and parse the resource
        try {
            List<UserPreference> userPreferences = readUserPreferences(filePath);
            userPreferences.forEach(System.out::println);

        //    NewsApiClient newsApiClient = new NewsApiClient();
        //    for (UserPreference userPreference : userPreferences) {
        //        String query = userPreference.getName();
        //        String language = userPreference.getLanguage();
        //        String sortBy = userPreference.getSortBy();
        //        List<NewsArticle> articles = newsApiClient.fetchNewsArticles(query, language, sortBy);
        //         System.out.println("News for " + query + ":");
        //         System.out.println(articles.size());
        //         // for (NewsArticle article : articles) {
        //         //     System.out.println(article);
        //         //     System.out.println("----------");
        //         // }
        // }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

// TODO: CRIO_TASK_MODULE_PROJECT
// Loads the JSON file from the provided file path 
// Parse its content into a list of UserPreference objects using Jackson's ObjectMapper, and returns the list. 
// If there is an error during file reading or JSON parsing, an IOException is thrown.

    public static List<UserPreference> readUserPreferences(String filePath) throws IOException {

        return Collections.emptyList();
    }
}
