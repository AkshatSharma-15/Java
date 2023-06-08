public class ternaryOperator {
    public static void main(String[] args) {
        int a=40;
        int b=30;
        int c=20;
        int res=(a<b)?a:b;
        System.out.println(res);
        System.out.println((a<b)?"a is less":"b is less");
        String result=(a<b)?"a is less":"b is less";
        System.out.println(result);
        int resout=(a<b)?(a<c ? a:c):(b<c ? b:c);
        System.out.println(resout);
    }
}
