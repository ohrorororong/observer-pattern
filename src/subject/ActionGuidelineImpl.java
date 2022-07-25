package subject;

import observer.Observer;
import system.Covid19ServiceSubscriber;

import java.util.ArrayList;
import java.util.List;

public class ActionGuidelineImpl implements ActionGuideline, Covid19ServiceSubscriber {
    private List<Observer> observers = new ArrayList<>();
    private Integer confirmedPersonnel;
    private Integer deadPersonnel;
    private Integer healerPersonnel;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(confirmedPersonnel, deadPersonnel, healerPersonnel);
        }
    }


    @Override
    public void update(Integer confirmedPersonnel, Integer deadPersonnel, Integer healerPersonnel) {
        this.confirmedPersonnel = confirmedPersonnel;
        this.deadPersonnel = deadPersonnel;
        this.healerPersonnel = healerPersonnel;
        notifyObserver();
    }
}
