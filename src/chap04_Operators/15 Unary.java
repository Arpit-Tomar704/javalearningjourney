package chap04_Operators;

 class Unary {
  static void main(String[] args) {
   int x = -5;
   int y = x;
   System.out.println(y);
   int z = -y;
   System.out.println(z);


   int a = 5;
   a = a+1;
   System.out.println(a);
   a += 1;
   System.out.println(a);
   a++;
   System.out.println(a);
   ++a;
   System.out.println(a);


   int b = 4;
   b = b - 1;
   System.out.println(b);
   b -=1;
   System.out.println(b);
   b--;
   System.out.println(b);

  }
}
