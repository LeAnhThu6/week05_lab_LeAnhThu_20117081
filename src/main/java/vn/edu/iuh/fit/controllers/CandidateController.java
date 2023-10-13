package vn.edu.iuh.fit.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class CandidateController {
    @GetMapping("/candidates")
    public void showCandidate() {
        System.out.println("CandidateController.showCandidate");
    }
}
