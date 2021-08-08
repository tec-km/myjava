class L11 {
  public static void main(String[] args) {

// 繰り返し 反復処理 for文 条件を満たしてれば繰り返す。
// for（スタート値;継続条件;増減式）{    
//  繰り返し処理
//  }

   for(int i = 0;i <= 4; i ++){
     System.out.println(i);
   }


// break文 条件に当てはまった時に繰り返し処理を終了させる。
   for(int i = 0;i <= 4; i ++){
     if(i==3){
       break;
     } 
    System.out.println(i);
}


// コンテニュー文 ある条件に当てはまったらその処理をスキップする処理。
// for (int i = 0; i <=4;i++){
// if(条件){
//   continue;
//   }
// }

  for (int i = 0; i <= 4; i ++){
   if(i==3){
     continue;
     }
     System.out.println(i);
   }
  

// for文のネスト

  for(int i = 0; i <= 2; i ++){
    for(int j = 0; j <= 2; j ++){
      System.out.println( i+ "-"+j);
    }
  }

  }
}