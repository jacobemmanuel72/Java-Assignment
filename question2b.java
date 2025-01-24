public class question2b{
    public static void main(String[] args) {
        for(int i = 0;i < 7; i++){
            for(int j = 0; j<12; j++){
                if(i<3 && j<5 ){
                    System.out.println("*");
                }
                else if(i >3 && j > 5){
                    System.out.println("=");
                }
                else{
                    System.out.println("");
                }
            }
            System.out.println();
        }
    }
}