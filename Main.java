public class Main {

    public static void main(String[] args) {
        // Create instances of SmartTV and GeneralTV
        TV smartTV = new SmartTV();
        TV generalTV = new GeneralTV();

        // Operate SmartTV with SmartRemote
        Remote smartRemote = new SmartRemote(smartTV);
        smartRemote.togglePower();
        
        //access youtube on smartTV with SmartRemote
        //smartRemote to a SmartRemote object explicitly using (SmartRemote)
        ((SmartRemote) smartRemote).showYouTube();
        

       // Operate GeneralTV with SmartRemote
        Remote smartRemote2 = new SmartRemote(generalTV);
        smartRemote2.togglePower();
    }
    
}
