public class Q07 {
    public static void main(String[] args) {
        int[] []s1[],s2[],s3;
//    A  s1=new int[10][10]; // wrong
    s1=new int[10][10][10]; //ok
//    C s2=new int[10][10][10][10]; // wrong
 s2=new int[10][10][10]; //ok
//    E  s3=new int[10][10][10]; // wrong
        s3=new int[10][10]; // ok
    }
}
// Answer B,D,F