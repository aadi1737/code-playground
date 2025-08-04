import java.util.Scanner;

class l1{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
 //       System.out.println("Enter Number:");
//        int n=sc.nextInt();
        
        StringBuilder str = new StringBuilder("Olaa");
        StringBuilder rev = new StringBuilder();

        for(int i=0;i<str.length();i++){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);

    }
}