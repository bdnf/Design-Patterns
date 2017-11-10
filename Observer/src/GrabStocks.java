public class GrabStocks{

    public static void main(String[] args){

        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them

        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(149.16);
        stockGrabber.setAAPLPrice(174.67);
        stockGrabber.setGOOGPrice(1028.07);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(149.18);
        stockGrabber.setAAPLPrice(174.55);
        stockGrabber.setGOOGPrice(1028.02);

        // Delete one of the observers
        stockGrabber.unregister(observer1);

    }

}