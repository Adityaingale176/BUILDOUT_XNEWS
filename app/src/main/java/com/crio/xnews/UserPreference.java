package com.crio.xnews;

// TODO: CRIO_TASK_MODULE_PROJECT
// Refer users.json in the app/src/main/resources directory to declare the necessary variables.
// Utilize your IDE to generate getters and setters for these variables.
// Use your IDE to generate the toString method to create a string representation of the variables.

public class UserPreference {

    String name;

    String query;

    String language;

    String sortBy;

    public String getName() {
        return name;
    }

    public String getQuery() {
        return query;
    }

    public String getLanguage() {
        return language;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    @Override
    public String toString() {
        return "UserPreference [language=" + language + ", name=" + name + ", query=" + query
                + ", sortBy=" + sortBy + "]";
    }

}
