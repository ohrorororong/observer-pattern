package system;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Covid19ServiceImpl implements Covid19Service {

    private Integer confirmedPersonnel;
    private Integer deadPersonnel;
    private Integer healerPersonnel;

    private Random random = new Random();

    private List<Covid19ServiceSubscriber> subscribers = new ArrayList<>();

    private final Integer TIME_INTERVAL = 1000;
    private final Integer MAX_CONFIRMED_PERSONNEL = 10000;
    private final Integer MAX_DEAD_PERSONNEL = 10;
    private final Integer MAX_HEALER_PERSONNEL = 5000;


    private boolean isRun = false;

    private Thread thread;
    @Override
    public void start() {
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                serviceRequest();
            }
        });
        isRun = true;
        thread.start();
    }

    @Override
    public void stop() throws InterruptedException {
        isRun = false;
        thread.join();
    }

    @Override
    public void addServiceSubscriber(Covid19ServiceSubscriber subscriber) {
        for (Covid19ServiceSubscriber covid19ServiceSubscriber : subscribers) {
            covid19ServiceSubscriber.update(
                    this.confirmedPersonnel,
                    this.deadPersonnel,
                    this.healerPersonnel);
        }
    }

    private void serviceRequest() {
        while (isRun) {
            try {
                confirmedPersonnel = random.nextInt(MAX_CONFIRMED_PERSONNEL);
                deadPersonnel = random.nextInt(MAX_DEAD_PERSONNEL);
                healerPersonnel = random.nextInt(MAX_HEALER_PERSONNEL);
                System.out.println("확진자 : " + this.confirmedPersonnel + ", 사망자 : " + this.deadPersonnel
                        + " 완치자 : " + this.healerPersonnel);
                Thread.sleep(TIME_INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
