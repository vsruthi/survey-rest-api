package no.sruthi.api.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import no.sruthi.api.restapi.model.Question;
import no.sruthi.api.restapi.service.SurveyService;

@RestController
class SurveyController {
    @Autowired
    private SurveyService surveyService;

    /**
     * This method return list of questions for survey
     * @param surveyId
     * @return list of questions
     */
    @GetMapping("/surveys/{surveyId}/questions")
    public List<Question> retrieveQuestions(@PathVariable String surveyId) {
        return surveyService.retrieveQuestions(surveyId);
    }
}