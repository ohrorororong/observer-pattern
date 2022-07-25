package system;

public interface Covid19Service {

    void start();
    void addServiceSubscriber(Covid19ServiceSubscriber subscriber);
}
