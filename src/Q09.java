public class Q09 {
    public static void main(String[] args) {
        int x=5;
        x=x++;
        System.out.print("A") ;
        if(x!=5){
            System.out.print("B") ;
            System.out.print(x) ;
            while(x<10) x++;
            System.out.print("C");
        }else{
            System.out.print("D") ;
            System.out.print(x);
            while(x<10) x++;
            System.out.print("E");
        }
    }
}
// Answer C