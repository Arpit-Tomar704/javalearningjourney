package chap06_Loops;

public class ForeachLoop {
    static void main(String[] args) {
        String array[] = new String[]{
                "Ansh" ,"Arpit","harsh"
        };
        printArrayforeach(array);

        }
    public static  void printArrayforeach(String[] array){
        for(String name:array){
            System.out.println(name);

        }
    }

}
