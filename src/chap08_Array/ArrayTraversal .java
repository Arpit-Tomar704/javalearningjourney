package chap08_Array;

 class ArrayTraversal {
    static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] =25;
//        myArr[1] =20;
//        myArr[2] =21;
//        myArr[3] =22;
//        myArr[4] =23;

        int[] myArr = {25,20,21,22,23};
//        int index = 2;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        arry traversal bolte hai iss method ko
        int index = 0;
        while (index<5){   //orr ye bhi likh skte hai (index<myArr.length)//
            System.out.println(myArr[index]);
            index++;
        }


        String[] strarr = new String[5];
        strarr[0] = "My String";
         String[] newstrarr = {"first","second","third"};
        System.out.println(newstrarr.length);

    }




 }
