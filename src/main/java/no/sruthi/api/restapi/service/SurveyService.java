package no.sruthi.api.restapi.service;

import no.sruthi.api.restapi.model.Question;
import no.sruthi.api.restapi.model.Survey;

import java.util.List;

public interface SurveyService{
    public Survey retrieveSurvey(String surveyId);
    public List<Question> retrieveQuestions(String surveyId);
}
