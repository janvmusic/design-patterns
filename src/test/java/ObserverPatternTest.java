import observer.StockGrabber;
import observer.StockObserver;
import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void testObserverPattern() {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver firstObserver = new StockObserver(stockGrabber);

        stockGrabber.setGooglePrice(100);
        stockGrabber.setApplePrice(200);
        stockGrabber.setIbmPrice(300);

        StockObserver secondObserver = new StockObserver(stockGrabber);
        stockGrabber.setGooglePrice(400);
        stockGrabber.setApplePrice(500);
        stockGrabber.setIbmPrice(600);

        stockGrabber.unregister(firstObserver);

        stockGrabber.setGooglePrice(700);
        stockGrabber.setApplePrice(800);
        stockGrabber.setIbmPrice(900);
    }
}
