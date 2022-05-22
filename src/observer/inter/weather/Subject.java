package observer.inter.weather;

public interface Subject {
    public void registerObserver(Observer o); //옵저버 등록
    public void removeObserver(Observer o); //옵저버 제거
    public void notifyObservers(); //변경 시 모든 옵저버에게 알려줌
}
