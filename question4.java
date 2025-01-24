import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] myArr = new int[10];
        for(int i = 0; i < myArr.length;i++){
            System.out.println("enter a value of index"+i+ ":");
            myArr[i] = myObj.nextInt();
        }
        for(int value : myArr){
            System.out.println(value);

        }
    }
}
