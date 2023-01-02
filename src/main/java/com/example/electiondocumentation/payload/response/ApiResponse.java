package com.example.electiondocumentation.payload.response;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class is the ApiResponse.
 *
 * It collects all the formatted responses to create one final response that can be returned by the API.
 * It uses a HashMap as Spring converts Map into JSON by translation the keys to section titles and values to sections.
 *
 * @version 1.0
 * */
public class ApiResponse {

    private Map<String, Object> response;

    /**
     * Constructor of the ApiResponse.
     *
     * Initializing a LinkedHashMap that stores the responses in order of adding.
     * */
    public ApiResponse() {
        this.response = new LinkedHashMap<>();
    }

    /**
     * This method adds a section to the response by providing a section title and the section information.
     * In case a title is already used, the already existing information will be overwritten.
     *
     * @param title is the section title
     * @param information is the information of the section
     * */
    public void addToResponse(String title, Object information) {

    }

    /**
     * Getter for the created response.
     *
     * Automatically resetting itself by clearing.
     *
     * @return response is the created response
     * */
    public Map<String,Object> getResponse() {
        Map<String, Object> copy = new HashMap<>(this.response);
        this.response.clear();
        return copy;
    }
}
