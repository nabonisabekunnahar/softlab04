public class GeneralTV implements TV{

    // implements the methods defined in the TV interface

    @Override
    public void togglePower() {
        System.out.println("GeneralTV Toggling power");
    }

    @Override
    public void volumeUp() {
        System.out.println("GeneralTV Increasing volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("GeneralTV Decreasing volume");
    }

    @Override
    public void channelUp() {
        System.out.println("GeneralTV Going to next channel");
    }

    @Override
    public void channelDown() {
        System.out.println("GeneralTV Going to previous channel");
    }
    
}
