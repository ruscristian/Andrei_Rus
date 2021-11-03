package tema.sci.IO;

public class Athlete {

    private String id;
    private String name;
    private String country;
    private String time;
    private Integer finalTimeInSeconds;
    private String firstShooting;
    private String secondShooting;
    private String thirdShooting;


    public Athlete(String id, String name, String country, String time,
                   String firstShooting, String secondShooting, String thirdShooting) {

        this.id = id;
        this.name = name;
        this.country = country;
        this.time = time;
        this.firstShooting = firstShooting;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;

        this.finalTimeInSeconds = makeFinalTimeInSeconds(time, firstShooting, secondShooting, thirdShooting);
    }


    public int calculateResultFromShooting(String shooting){
        int shootingInSeconds = 0;
        try{
        for(int i =0; i < shooting.length(); i++) {
            if (shooting.charAt(i) == 'x' || shooting.charAt(i) =='X') {
            } else if (shooting.charAt(i) == 'o' || shooting.charAt(i) =='O') {
                shootingInSeconds += 10;
            } else {
                throw new CharException();
            }
        }}catch (CharException e){
            System.out.println("WRONG DATA FROM FILE. Expected: x or o");
            }
        return shootingInSeconds;
    }

    public int makeFinalTimeInSeconds(String time, String firstShooting, String secondShooting, String thirdShooting){

        int minutes = (Integer.parseInt(String.valueOf(time.charAt(0)))*10 +
                                                            Integer.parseInt(String.valueOf(time.charAt(1)))) * 60;
        int seconds = Integer.parseInt(String.valueOf(time.charAt(3)))*10 +
                                                            Integer.parseInt(String.valueOf(time.charAt(4)));
        int secondsFromShootings = calculateResultFromShooting(firstShooting) + calculateResultFromShooting(secondShooting)
                                                               + calculateResultFromShooting(thirdShooting);
        int totalTimeInSeconds = minutes + seconds + secondsFromShootings;

        return totalTimeInSeconds;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTime() {
        return time;
    }

    public int getFinalTimeInSeconds() {
        return finalTimeInSeconds;
    }

    public String getFirstShooting() {
        return firstShooting;
    }

    public String getSecondShooting() {
        return secondShooting;
    }

    public String getThirdShooting() {
        return thirdShooting;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", time='" + time + '\'' +
                ", finalTimeInSeconds=" + finalTimeInSeconds +
                ", firstShooting='" + firstShooting + '\'' +
                ", secondShooting='" + secondShooting + '\'' +
                ", thirdShooting='" + thirdShooting + '\'' +
                '}'+ "\n";
    }
}

