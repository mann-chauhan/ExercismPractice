public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int tillMinute){
        return 40 - tillMinute;
    }
    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int tillInOven){
        int x = (layers*2) + tillInOven;
        return x;
    }
}
