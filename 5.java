class Main {
    public static void main(String[] args) {
     int x, y;
     x = 10;
     y = 20;
        System.out.print("x:10 ");
        
        System.out.print("y:20 ");
       

        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x - 1; i > y; i--) {
                System.out.println(i);
            }
        }
}
}
