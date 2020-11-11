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
public class SubscriberMsgService implements IObserver {

    private final String name;
    private ISubject msgServ;

    public SubscriberMsgService(String name) {
        this.name = name;
    }

    // implement all overridden methods
    @Override
    public void updateObserver() {
        String msg = (String) msgServ.getSubjectUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Received message::" + msg);
        }
    }

    @Override
    public void attachToSubject(ISubject sub) {
        this.msgServ = sub;
    }
}
