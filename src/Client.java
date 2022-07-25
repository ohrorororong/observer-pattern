import config.Covid19ServiceConfig;
import observer.Naekang;
import subject.CovidProbabilitySubjectImpl;
import system.Covid19Service;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        Covid19Service service = Covid19ServiceConfig.getInstance().covid19Service();
        service.addServiceSubscriber(Covid19ServiceConfig.getInstance().actionGuideline());
        service.addServiceSubscriber(Covid19ServiceConfig.getInstance().covidProbabilitySubject());

        CovidProbabilitySubjectImpl subject = new CovidProbabilitySubjectImpl();
        service.addServiceSubscriber(subject);
        subject.addObserver(new Naekang());

        service.start(); // 서비스 시작

        scanner.nextLine();
        scanner.nextLine();

        service.stop(); // 서비스 종료
    }
}
