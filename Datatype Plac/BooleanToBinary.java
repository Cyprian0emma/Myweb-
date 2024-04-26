public class BooleanToBinary {
     public  static int toBinary(boolean boolvalue)
     {
         if (boolvalue)
         {
             return 1;
         }else
         {
             return 0;
         }
     }

    public static void main(String[] args) {
        System.out.println(toBinary(true));
        System.out.println(toBinary(false));
        System.out.println();
    }
}
