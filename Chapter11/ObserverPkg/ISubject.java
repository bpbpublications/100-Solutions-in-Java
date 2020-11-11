/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPkg;

/**
 *
 * @author dhrutis
 */
public interface ISubject {

    //methods to register and unregister observers
    public void registerObserver(IObserver obj);

    public void unregisterObserver(IObserver obj);

    //method to notify observers of change
    public void notifyAllObservers();

    //method to get updates from subject
    public Object getSubjectUpdate(IObserver obj);
}
