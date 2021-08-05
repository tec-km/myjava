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


      int j = 8;
      int k = 3;
 
      System.out.println(j == 3 || k <= 3);
      System.out.println(j == 1 || k <= 1);

// 代入演算子 = のこと。足し算や引き算を同時に行える。複合代理演算子という。xに10を足す場合 x +=10

      int l = 8;
      int m = 12;
      int n = 20;

      System.out.println(l += 10);
      System.out.println(m += n);

// インクリメント 値に1を足す。 x++ ←同じ意味→  x = x+1 
// デクリメント   値に1を引く。 y-- ←同じ意味→  y = y-1 
      
      int o = 8;
      int p = 8;
      o++;
      p--;

      System.out.println(o);
      System.out.println(p);

    }

}