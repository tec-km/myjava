public class progate2 {
  
  public static void main(String[] args) {
    // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);
    
    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);
    
    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 == 3);
    
    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 != 3);
    
    // 変数を定義し、値を比較した結果を代入してください
    boolean bool = 3 * 9 == 27;
    
    // 変数boolの値を出力してください
    System.out.println(bool);
    

/////////
 // 8と5を比較し、falseとなるようにしてください
 System.out.println( 8 < 5 );
    
 // 3と2を比較し、trueとなるようにしてください
 System.out.println( 3 >= 2 );
 

///////
   // trueと出力されるようにしてください
   System.out.println(true || false);
    
   // falseと出力されるようにしてください
   System.out.println(false && true);
   
   // 「8 < 5」かつ「3 >= 2」の結果を出力してください
   System.out.println(8 < 5 && 3 >= 2);
   
   // 「8 < 5」または「3 >= 2」の結果を出力してください
   System.out.println(8 < 5 || 3 >= 2);
   
   // 「8 < 5」でない、の結果を出力してください
   System.out.println(!(8 < 5));
   
/////

   // 条件式に直接trueをいれてください
   if (true) {
    System.out.println("条件式がtrueのため、出力されます");
  }
  
  // 条件式に直接falseをいれてください
  if (false) {
    System.out.println("条件式がfalseのため、出力されません");
  }
  
  int x = 5;
  // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
  if (x > 2) { 
    System.out.println("xは2より大きい");
  }
  
  // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
  if (x > 8) { 
    System.out.println("xは8より大きい");
  }
  














  }
}
