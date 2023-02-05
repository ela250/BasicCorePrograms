package BasicPrograms;

public class FlipCoin {
    public static void main(String[] args) {
        int Number_of_Times_to_FliptheCoin = 7;
        for (int i = 1; i <= 7; i++) {
            double coincheck = Math.random();
            if (coincheck < 0.5) {
                System.out.println("head or tail");
            } else if (coincheck < 0.6 && coincheck >= 0.5) {
                System.out.println(" Head appears");
            }else if(coincheck < 1 && coincheck >=0.6){
                System.out.println("Tail appears");
            }
        }
    }
}