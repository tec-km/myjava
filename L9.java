class L9 {
    public static void main(String[] args) {

      int x = 10;
      int y = 2;

// 算術演算子 足し算 + 引き算 - 掛け算* 割り算 / 剰余 %
      System.out.println(x+y);
      System.out.println(x-y);
      System.out.println(x*y);
      System.out.println(x/y);
      System.out.println(x%y);

// 関係演算子 正しい場合はTrue
      int a = 10;
      int b = 2;
 
      System.out.println(a > b);
      System.out.println(a < b);
 
      
      int c = 10;
      int d = 2;
      int e = 10;

      System.out.println(c >= d);
      System.out.println(c <= d);
      System.out.println(c <= e);


// 等価は ==   等価ではない !=

      int f = 10;
      int g = 2;
 
      System.out.println(f == g);
      System.out.println(f != g);

// 論理演算子 かつ and  &&    または or ||

      int h = 8;
      int i = 3;
 
      System.out.println(h >= 5 && h <= 10);
      System.out.println(i >= 5 && i <= 10);



    }

}