
// Class representing a Smart Remote, serving as an adapter to enable communication 
// between the Remote interface and the SmartTV class.

public class SmartRemote implements Remote {
    private TV tv;

    //constructor that takes a TV object as a parameter.
    // This constructor allows the SmartRemote instance to be associated with a specific TV,
    // which can be either a smart TV or a general TV.

    public SmartRemote(TV tv) {
        this.tv = tv;
    }

    // implements the methods defined in the Remote interface

    @Override
    public void togglePower() {
        tv.togglePower();
    }

    @Override
    public void volumeUp() {
        tv.volumeUp();
    }

    @Override
    public void volumeDown() {
        tv.volumeDown();
    }

    @Override
    public void channelUp() {
        tv.channelUp();
    }

    @Override
    public void channelDown() {
        tv.channelDown();
    }

    // Additional method acting as an adapter to provide YouTube functionality 
    // specifically for SmartTVs.

    public void showYouTube() {
        if (tv instanceof SmartTV) {
            ((SmartTV) tv).youtube();
        }
    }
    
}
