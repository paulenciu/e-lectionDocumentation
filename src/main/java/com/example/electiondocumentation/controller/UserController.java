package com.example.electiondocumentation.controller;

import com.example.electiondocumentation.payload.response.ResponseBuilder;
import com.example.electiondocumentation.security.user.UserPrincipal;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * This class is the UserController.
 *
 * It is responsible for managing the "/api/user" endpoint and is reachable for all logged-in user.
 *
 * @version 1.0
 * */
@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    /**
     * This method is called by a GET-Request on /api/user/ and handels the user roles request.
     *
     * @param user is the currently logged-in user
     * @return response containing the roles of the user in the system.
     * */
    @GetMapping("/")
    public Map<String, Object> getUserRoles(@AuthenticationPrincipal UserPrincipal user) {
        return ResponseBuilder.getInstance().getResponse();
    }

}
