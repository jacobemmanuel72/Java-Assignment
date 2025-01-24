import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[][] myArr= new int[10][10];
        for(int i = 0; i < myArr.length; i++){
            for(int j = 0; j < myArr[i].length; j++){
                System.out.println("enter a value for index " + i +","+ j+ ":");
                myArr[i][j] = myObj.nextInt();

                
            }

        }
        for(int[]row: myArr){
            for(int value : row){
                System.out.println(value);
            }
        }

    }
    
}
