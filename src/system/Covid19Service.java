package system;

public interface Covid19Service {

    void start();
    void stop() throws InterruptedException;
    void addServiceSubscriber(Covid19ServiceSubscriber subscriber);
}
