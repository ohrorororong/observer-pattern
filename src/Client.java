import config.Covid19ServiceConfig;
import observer.Observer;
import observer.Observer_ag1;
import observer.Observer_ag2;
import subject.ActionGuidelineImpl;
import system.Covid19Service;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Covid19Service service = Covid19ServiceConfig.getInstance().covid19Service();
        ActionGuidelineImpl ag = new ActionGuidelineImpl();
        Observer o1 = new Observer_ag1();
        Observer o2 = new Observer_ag2();

        // 구독자 등록

        ag.addObserver(o1);
        ag.addObserver(o2);
        service.addServiceSubscriber(ag);
        service.start(); // 서비스 시작

        scanner.nextLine();
        scanner.nextLine();

        service.stop();
    }
}
