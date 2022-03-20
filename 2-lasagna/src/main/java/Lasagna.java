public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int timeInOven) {
        int timeLeft = this.expectedMinutesInOven() - timeInOven;
        return timeLeft;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        // Default time for preparing per layer is 2 minutes
        int totalTimeInMinutes = numberOfLayers * 2;

        return totalTimeInMinutes;
    }

    public int totalTimeInMinutes(int numberOfLayers, int totalTimeInTheOven) {
        int totalTimePreparating = this.preparationTimeInMinutes(numberOfLayers);

        return totalTimePreparating + totalTimeInTheOven;
    }
}
