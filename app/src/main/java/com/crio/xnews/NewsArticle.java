package com.crio.xnews;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: CRIO_TASK_MODULE_PROJECT
// Declare variables for the fields: "title","description","author","url","publishedAt" & "content." Ignore any other fields.
// Utilize your IDE to generate getters and setters for these variables.
// Use your IDE to generate the toString method to create a string representation of the variables.
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsArticle {

    String title;
    String author;
    String url;
    String publishedAt;
    String content;

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getUrl() {
        return url;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public String getContent() {
        return content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public void setContent(String content) {
        this.content = content;
    }
   
    @Override
    public String toString() {
        return "NewsArticle [author=" + author + ", content=" + content + ", publishedAt="
                + publishedAt + ", title=" + title + ", url=" + url + "]";
    }

}
