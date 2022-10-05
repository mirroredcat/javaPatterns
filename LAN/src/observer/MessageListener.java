package observer;

import observer.MessageEvent;

import java.util.EventListener;

public interface MessageListener extends EventListener {

    void receiveConfirmation(MessageEvent m);
    String getAddress();

}
