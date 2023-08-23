package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId,"Product is in stock, hurry up");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("Mail has been sent to "+emailId);
        System.out.println(message);
    }
}