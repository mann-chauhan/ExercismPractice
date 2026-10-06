public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int tillMinute){
        return expectedMinutesInOven() - tillMinute;
    }

    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    public int totalTimeInMinutes(int layers, int tillInOven){
       
        return preparationTimeInMinutes(layers) + tillInOven;
    }
}
