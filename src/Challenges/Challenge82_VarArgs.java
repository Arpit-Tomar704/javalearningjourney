package Challenges;

 class VarArgs {

     static void main(String[] args) {
         System.out.println(concatenate("Arpit"));
     System.out.println(concatenate("Tomar"));
     System.out.println(concatenate("or"));
     System.out.println(concatenate("Ansh","bro"));


     }
     public static String concatenate(String...strs){
         StringBuilder sb = new StringBuilder();
         for (String str : strs) {
             sb.append(str).append(" ");
         }
         return sb.toString();
     }
}
