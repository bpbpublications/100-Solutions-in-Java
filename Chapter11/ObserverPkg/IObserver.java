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
public interface IObserver {

    //method to update the observer, will be used by subject
    public void updateObserver();

    //method to attach observer with subject to observe
    public void attachToSubject(ISubject sub);
}
