package bonus_track;

public class TestDe {

    public static void main(String[] args) {

        De de = new De(6);
        int nbrfois6 = 0;
        int nbrtest = 0;

        while (nbrfois6 < 10){
            if (de.getResultat() == 6){
                nbrfois6++;
            }
            nbrtest++;
        }

        System.out.println(nbrfois6);
        System.out.println(nbrtest);

        System.out.printf("hello %d %d",nbrfois6,nbrtest);

    }

}
