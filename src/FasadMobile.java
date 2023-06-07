public class FasadMobile {
    public static void main(String[] args) throws Exception {
        SimCardCheck simCardCheck = createSim("On");
        simCardCheck.aktivate();
    }
    static SimCardCheck createSim(String message) throws Exception {
        if (message.equalsIgnoreCase("On")){
            return new SimCardMessage();
        } else{
            throw new Exception("Sim card no activate");
        }
    }
}

