package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint > 0) {
            for (int i = 0; i <= 10; i++){
                int num = i * numberTableToPrint;
                System.out.println(num);
            }
        }

    }
}
