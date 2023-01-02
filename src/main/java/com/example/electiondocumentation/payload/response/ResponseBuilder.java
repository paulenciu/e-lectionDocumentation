package com.example.electiondocumentation.payload.response;

import com.example.electiondocumentation.entity.Ballot;
import com.example.electiondocumentation.entity.Election;
import com.example.electiondocumentation.security.user.UserAuthority;

import java.util.List;
import java.util.Map;

/**
 * This class is the ResponseBuilder.
 *
 * It is responsible for building a response from the API, that can be returned by the controller.
 * This class is designed after the singleton pattern, so there is only one response created.
 *
 *@version 1.0
 * */
public class ResponseBuilder {

    private static ResponseBuilder instance;
    private ApiResponse apiResponse;

    private ResponseBuilder() {
        this.apiResponse = new ApiResponse();
    }

    /**
     * Getter for the instance of the ResponseBuilder.
     *
     * @return the only instance in the system of the ResponseBuilder
     * */
    public static ResponseBuilder getInstance() {
        if (instance == null) {
            instance = new ResponseBuilder();
        }
        return instance;
    }

    /**
     * Building the response that contains the all public meta information of one specific election.
     * This information is needed to describe an election.
     *
     * @param election is the election to extract the information from
     * */
    public void buildElectionMetaResponse(Election election) {

    }

    /**
     * Building the response that contains the all public meta information of multiple elections.
     *
     * @param elections is the list of elections to extract the information from
     * */
    public void buildAllElectionMetaResponse(List<Election> elections) {

    }

    /**
     * Building the response that contains all questions of a ballot.
     *
     * @param ballot is the ballot to extract the questions from
     * */
    public void buildBallotQuestionsResponse(Ballot ballot) {

    }

    /**
     * Building the response that informs about the success of a ballot submission.
     * This contains the tracking-code of the submitted ballot.
     *
     * @param ballot is the ballot to extract the information from
     * */
    public void buildBallotSubmissionResponse(Ballot ballot) {

    }

    /**
     * Building the response that contains all trustees' email of a specific election.
     *
     * @param election is the election to extract the trustees from
     * */
    public void buildAllTrusteesResponse(Election election) {

    }

    /**
     * Building the response that contains all voters' email of a specific election.
     *
     * @param election is the election to extract the voters from
     * */
    public void buildAllVotersResponse(Election election) {

    }

    /**
     * Building the response that contains all tracking-codes of the submitted ballots.
     *
     * @param election is the election to extract the tracking-codes from
     * */
    public void buildAllTrackingCodesResponse(Election election) {

    }

    /**
     * Building the response that contains all public auxiliary keys of a specific election.
     *
     * @param election is the election to extract the public auxiliary keys from
     * */
    public void buildAllAuxKeysResponse(Election election) {

    }

    /**
     * Building the response that contains the result of a specific election.
     *
     * @param election is the election to extract the result from
     * */
    public void buildElectionResultResponse(Election election) {

    }

    /**
     * Building the response for a election that got created.
     * This contains the state and the id of the created election.
     *
     * @param election is the election to extract the information from
     * */
    public void buildElectionCreatedResponse(Election election) {

    }

    /**
     * Building the response that contains the state of the election.
     *
     * @param election is the election to extract the state from
     * */
    public void buildElectionStateResponse(Election election) {

    }

    /**
     * Building the response that contains a record compatible with ElectionGuard {@see https://www.electionguard.vote/develop/Election_Record/}.
     *
     * @param election is the election to extract the information needed for the record from
     * */
    public void buildElectionGuardRecordResponse(Election election) {

    }

    /**
     * Getter for the created API response.
     *
     * @return response formatted and created by the API
     * */
    public Map<String, Object> getResponse() {
        return apiResponse.getResponse();
    }







}
