package com.example.electiondocumentation.controller;

import com.example.electiondocumentation.entity.Election;
import com.example.electiondocumentation.payload.response.ResponseBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * This class is the AuthorityController.
 *
 * It is responsible for managing the "/api/authority/elections" endpoint and is reachable only for authority users.
 * This means that a user can only access these endpoints if he is assigned as an authority in at least one election.
 *
 * @version 1.0
 * */
@RestController
@RequestMapping(path = "/api/authority/elections")
public class AuthorityController {

    /**
     * This method is called by a POST-Request on /api/authority/elections/create and handles election creations.
     * This endpoint can only be accessed by users with authority authorization written in the authority config.
     *
     * @param election is the election translated by Spring from the JSON in the request.
     * @return response of the API containing electionId and current state, or error if failing.
     * */
    @PostMapping("/create")
    public Map<String, Object> createElection(@RequestBody Election election) {
        return ResponseBuilder.getInstance().getResponse();
    }

    /**
     * This method is called by a PATCH-Request on /api/authority/elections/{electionId} and handles election state changes.
     * This endpoint can only be accessed by users with authority authorization and assigned to the election that maps to the electionId parsed in the URL.
     *
     * @param electionId is the id of the election to be changed.
     * @param state is the state to set the election mapped to the id.
     * @return response of the API containing the new election state, or error if failing.
     * */
    @PatchMapping("/{electionId}")
    public Map<String, Object> setElectionState(@PathVariable("electionId") Long electionId, @RequestBody String state) {
        return ResponseBuilder.getInstance().getResponse();
    }

    /**
     * This method is called by a GET-Request on /api/authority/elections/{electionId} and handles election state requests.
     * This endpoint can only be accessed by users with authority authorization and assigned to the election that maps to the electionId parsed in the URL.
     *
     * @param electionId is the id of the election to be get the state from.
     * @return response of the API containing the current election state, or error if failing.
     * */
    @GetMapping("/{electionId}")
    public Map<String, Object> getElectionState(@PathVariable("electionId") Long electionId) {
        return ResponseBuilder.getInstance().getResponse();
    }

}
