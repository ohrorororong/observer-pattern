package observer;

public class Observer_ag1 implements Observer {
    public int cumulativeCP = 0;

    @Override
    public void update(Integer confirmePersonnel, Integer deadPersonnel, Integer healerPersonnel) {
        System.out.println("누적 확진자 : " + (cumulativeCP += confirmePersonnel));
    }
}
