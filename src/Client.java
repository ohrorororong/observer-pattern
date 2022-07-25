import config.Covid19ServiceConfig;
import system.Covid19Service;
import system.Covid19ServiceImpl;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Covid19Service service = Covid19ServiceConfig.getInstance().covid19Service();
        // 구독자 등록

        service.start(); // 서비스 시작

        scanner.nextLine();
        scanner.nextLine();
    }
}
