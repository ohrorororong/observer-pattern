package observer;

public class Observer1 implements Observer {

    @Override
    public void update(Integer confirmedPersonnel, Integer deadPersonnel) {
        System.out.println("누적 확진자: " + confirmedPersonnel + ", 사망자: " + deadPersonnel);
        double ratio = (double) deadPersonnel / confirmedPersonnel;
        System.out.println("===============================");
        System.out.println("재택 근무 할 확률: " + ratio);
    public int cumulativeCP = 0;

    @Override
    public void update(Integer confirmePersonnel, Integer deadPersonnel, Integer healerPersonnel) {
        System.out.println("누적 확진자 : " + (cumulativeCP += confirmePersonnel));
    }
}
