package config;

import subject.ActionGuidelineImpl;
import subject.CovidProbabilitySubjectImpl;
import system.Covid19Service;
import system.Covid19ServiceImpl;

public class Covid19ServiceConfig {

    private static Covid19ServiceConfig instance = null;

    public static Covid19ServiceConfig getInstance() {
        if (instance == null) {
            instance = new Covid19ServiceConfig();
        }
        return instance;
    }



    public Covid19Service covid19Service() {
        return new Covid19ServiceImpl();
    }

    public ActionGuidelineImpl actionGuideline() {
        ActionGuidelineImpl actionGuideline = new ActionGuidelineImpl();
        //actionGuideline.addObserver();
        return actionGuideline();
    }

    public CovidProbabilitySubjectImpl covidProbabilitySubject() {
        CovidProbabilitySubjectImpl covidProbabilitySubject = new CovidProbabilitySubjectImpl();
        //covidProbabilitySubject.addObserver();
        return covidProbabilitySubject;
    }
}

