package observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private double _ibmPrice;
    private double _applePrice;
    private double _googlePrice;

    @Override
    public void register(Observer newObserver) {
        observerList.add(newObserver);
    }

    @Override
    public void unregister(Observer observerToDelete) {
        int observerToDeleteIndex = observerList.indexOf(observerToDelete);
        if (observerToDeleteIndex == -1) {
            System.out.println("Observer not found");
            return;
        }

        observerList.remove(observerToDeleteIndex);
        System.out.println("Observer was deleted: " + (observerToDeleteIndex + 1));
    }

    @Override
    public void notifyAllObservers() {
        observerList.forEach(observer -> observer.update(_ibmPrice, _applePrice, _googlePrice));
    }

    public double getIbmPrice() {
        return _ibmPrice;
    }

    public void setIbmPrice(double newIbmPrice) {
        _ibmPrice = newIbmPrice;
        notifyAllObservers();
    }

    public double getApplePrice() {
        return _applePrice;
    }

    public void setApplePrice(double newApplePrice) {
        _applePrice = newApplePrice;
        notifyAllObservers();
    }

    public double getGooglePrice() {
        return _googlePrice;
    }

    public void setGooglePrice(double newGooglePrice) {
        _googlePrice = newGooglePrice;
        notifyAllObservers();
    }
}
