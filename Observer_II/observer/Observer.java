package observer;

import subject.Subject;

public abstract class Observer {
    public Observer(Subject subject){
        subject.registerObserver(this);
    }

    private Observer(){}
    public abstract void update(Subject subject);
}
