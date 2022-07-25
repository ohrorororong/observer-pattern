package system;

public interface Covid19ServiceSubscriber {
    void update(Integer confirmedPersonnel, Integer deadPersonnel, Integer healerPersonnel);
}
