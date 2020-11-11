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
public class TestObserver {

    public static void main(String[] args) {
        //create subject
        MsgService msgs = new MsgService();

        //create observers
        IObserver obs1 = new SubscriberMsgService("Observer 1");
        IObserver obs2 = new SubscriberMsgService("Observer 2");
        IObserver obs3 = new SubscriberMsgService("Observer 3");

        //register observers to the subject
        msgs.registerObserver(obs1);
        msgs.registerObserver(obs2);
        msgs.registerObserver(obs3);

        //attach observer to subject for changes
        obs1.attachToSubject(msgs);
        obs2.attachToSubject(msgs);
        obs3.attachToSubject(msgs);

        //check if any update is available
        obs1.updateObserver();

        //now send message to subject 
        msgs.sendMessage("Good Morning!!");
    }
}
