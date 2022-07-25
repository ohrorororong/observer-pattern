package observer;

public class Naekang implements Observer {

    @Override
    public void update(Integer confirmPersonnel, Integer deadPersonnel, Integer healerPersonnel) {
        System.out.println("누적 확진자 = " + confirmPersonnel + ", 사망자 = " + deadPersonnel);
        System.out.println("========================================");
        System.out.println("재택근무 할 확률 = " + (double) deadPersonnel / confirmPersonnel * 100);
    }
}
