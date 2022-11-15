public class Q02 {
    public static void main(String[] args) {
        int x=5,y=6;
            /*1*/           /*1*/
           //6 >= 5   and 4 >= 7 --> true
        if((x++ >= --y)&&(x-- >= ++y)){
                           //5 6
            System.out.println(x+" "+y); //1 --> true nisa
               /*1*/    /*1*/
            // 5==5 or 6==6 --> true
            if((x==5)||(y==6)){
                            //   6 5
                System.out.print(y+" "+x+" "); //2 --> true nisa
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