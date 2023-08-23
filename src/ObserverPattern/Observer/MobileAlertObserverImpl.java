package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName,"Product is in stock, hurry up");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Message has been sent on mobile to "+userName);
        System.out.println(message);
    }
}