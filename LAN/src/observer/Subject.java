package observer;

import observer.MessageListener;

public interface Subject {

    void addMessageListener(MessageListener ml);
    void removeMessageListener(MessageListener ml);

}
