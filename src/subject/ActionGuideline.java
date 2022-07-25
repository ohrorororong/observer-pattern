package subject;

import observer.Observer;

public interface ActionGuideline {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
