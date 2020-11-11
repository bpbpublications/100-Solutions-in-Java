/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPkg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhrutis
 */
public class MsgService implements ISubject {

    private List<IObserver> lstObserver;
    private String message;
    private boolean changed;
    private final Object SYNC = new Object();

    public MsgService() {
        lstObserver = new ArrayList<>();
    }

    //implement all overridden methods
    @Override
    public void registerObserver(IObserver obj) {
        if (obj == null) {
            throw new NullPointerException("Unknown Observer");
        }
        synchronized (SYNC) {
            if (!lstObserver.contains(obj)) {
                lstObserver.add(obj);
            }
        }
    }

    @Override
    public void unregisterObserver(IObserver obj) {
        synchronized (SYNC) {
            lstObserver.remove(obj);
        }
    }

    @Override
    public void notifyAllObservers() {
        List<IObserver> observersLocal = null;
        //synchronization ensure that an observer registered
        // after message is received is not notified
        synchronized (SYNC) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.lstObserver);
            this.changed = false;
        }
        for (IObserver obj : observersLocal) {
            obj.updateObserver();
        }
    }

    @Override
    public Object getSubjectUpdate(IObserver obj) {
        return this.message;
    }

    //method to send message to the MsgService
    public void sendMessage(String msg) {
        System.out.println("Message Sent to Messenger Service:" + msg);
        this.message = msg;
        this.changed = true;
        notifyAllObservers();
    }
}
