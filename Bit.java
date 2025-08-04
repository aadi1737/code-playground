import java.util.Scanner;

class Bit{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Bit b = new Bit();

        b.upodateBitTo0();
    }
    
    public void getBit(){
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Position:");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        
        if((bitMask&n)>0)
        System.out.print("Number is 1");
        else
        System.out.print("Number is 0");
    }
    
    
    public void setBit(){
        
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Position:");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        
        int newNum=bitMask|n;
        System.out.println("New Number:"+newNum);
    }
    
    
    public void clearBit(){
        
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Position:");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        bitMask=~bitMask;
        int newNumber = bitMask & n;
        System.out.println("After Clearing Bit New Number is:"+newNumber);
    }
    
    public void upodateBitTo0(){
        
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Position:");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        bitMask=~bitMask;
        int updatedNum = bitMask & n;
        System.out.println("After Updating Position "+pos+" Num to 0\nNew Num is:"+updatedNum);

        
    }
    
    public void upodateBitTo1(){
        
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Position:");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        int updatedNum = bitMask|n;
        System.out.println("After Updating Position "+pos+" Num to 1\nNew Num is:"+updatedNum);
    }
}