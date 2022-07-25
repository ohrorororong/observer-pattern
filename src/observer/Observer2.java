package observer;

public class Observer2 implements Observer {
    public int cumulativeDP = 0;

    @Override
    public void update(Integer confirmePersonnel, Integer deadPersonnel, Integer healerPersonnel) {
        System.out.println("누적 사망자 : " + (cumulativeDP += deadPersonnel));
    }
}
