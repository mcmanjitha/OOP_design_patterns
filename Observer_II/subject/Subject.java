package subject;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers;
    public Subject(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){}
    public void removeObserver(Observer o){}
    public void notifyObserver(){
        for(Observer o : observers){
            o.update(this);
        }
    }
}
