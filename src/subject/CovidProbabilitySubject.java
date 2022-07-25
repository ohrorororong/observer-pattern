package subject;

import observer.Observer;

public interface CovidProbabilitySubject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
