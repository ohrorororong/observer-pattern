import config.Covid19ServiceConfig;
import observer.Observer;
import observer.Observer1;
import subject.ActionGuidelineImpl;
import subject.CovidProbabilitySubjectImpl;
import system.Covid19Service;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Covid19Service service = Covid19ServiceConfig.getInstance().covid19Service();
        service.addServiceSubscriber(Covid19ServiceConfig.getInstance().actionGuideline());
        service.addServiceSubscriber(Covid19ServiceConfig.getInstance().covidProbabilitySubject());

        service.start(); // 서비스 시작

        scanner.nextLine();
        scanner.nextLine();

        service.stop(); // 서비스 종료
    }
}
