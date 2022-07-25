package subject;

import observer.Observer;
import system.Covid19Service;
import system.Covid19ServiceSubscriber;

import java.util.ArrayList;
import java.util.List;

public class CovidProbabilitySubjectImpl implements CovidProbabilitySubject, Covid19ServiceSubscriber {

    private final List<Observer> observers = new ArrayList<>();
    private Integer confirmedPersonnel;
    private Integer deadPersonnel;
    private Integer healerPersonnel;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(confirmedPersonnel, deadPersonnel);
        }
    }

    @Override
    public void update(Integer confirmedPersonnel, Integer deadPersonnel, Integer healerPersonnel) {
        this.confirmedPersonnel = confirmedPersonnel;
        this.deadPersonnel = deadPersonnel;
        this.healerPersonnel = healerPersonnel;
        System.out.println("CovidProbabilitySubjectImpl.update");
        notifyObserver();
    }
}
