package observer;

public class StockObserver implements Observer {
    private double _ibmPrice;
    private double _applePrice;
    private double _googlePrice;
    private int _observerId;
    private StockGrabber _stockGrabber;

    private static int OBSERVER_ID_TRACKER = 0;

    public StockObserver(StockGrabber stockGrabber) {
        _stockGrabber = stockGrabber;
        _observerId = ++OBSERVER_ID_TRACKER;

        System.out.println("New observer added: " +  _observerId);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        _ibmPrice = ibmPrice;
        _applePrice = applePrice;
        _googlePrice = googlePrice;

        printPrices();
    }

    private void printPrices() {
        System.out.println("========== Observer ID:" + _observerId + " ===========");
        System.out.println("IBM price is:" + _ibmPrice);
        System.out.println("Apple price is: " + _applePrice);
        System.out.println("Google price is: " + _googlePrice);
        System.out.println("=====================================================");

        System.out.println();
    }
}
