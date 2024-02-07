public class SmartTV implements TV{

    // implements the methods defined in the TV interface

    @Override
    public void togglePower() {
        System.out.println("SmartTV Toggling power");
    }

    @Override
    public void volumeUp() {
        System.out.println("SmartTV Increasing volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("SmartTV Decreasing volume");
    }

    @Override
    public void channelUp() {
        System.out.println("SmartTV Going to next channel");
    }

    @Override
    public void channelDown() {
        System.out.println("SmartTV Going to previous channel");
    }

    //additional method as explain in question

    public void youtube() {
        System.out.println("SmartTV Showing YouTube");
    }
    
}
