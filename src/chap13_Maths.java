class Maths {
    static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.05));
        System.out.println(Math.floor(5.08));
        System.out.println(Math.round(6.67));
        System.out.println(Math.PI);



        for (int i =0;i<10;i++){
            int  random =  (int) Math.round(Math.random()*100);
            System.out.println(random);
        }
    }
}
