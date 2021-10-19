import java.util.Scanner;

public class minElementChallenge {
    private static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = raadIntegers(5);
    }

    public  void int [] array(int count){
        int [] array = new int [count];
        for (int i=0 ; i<array.length ; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }

    public static int []  findMin(){

    }
}
