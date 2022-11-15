public class Q02 {
    public static void main(String[] args) {
        int x=5,y=6;
        if((x++ >= --y)&&(x-- >= ++y)){
            System.out.println(x+" "+y);
            if((x==5)||(y==6)){
                System.out.print(y+" "+x+" ");
            }
            else{
                System.out.print(x++ +" "+ ++y+" ");
            }
        }else{
            System.out.print(x++ +" "+ ++y+" ");
        }
    }
}
// Answer A.Prints 5 6 6 5