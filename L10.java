class L10 {
  public static void main(String[] args) {

// 条件分岐 if文   
// if(条件){
//     処理;
// }
    int age = 18;

    if (age >= 20){
        System.out.println("adult");


    }


//  条件分岐 if~else文   
//  if(条件){
//     処理;
//  }else}
//  満たさない時の処理
//  }

    int age2 = 18;

    if (age2 >= 20){
        System.out.println("adult");
   }else{
        System.out.println("child");
    }

// else if はもう一つの条件。

    int age3 = 0;

    if (age3 >= 20){
        System.out.println("adult");
    }else if (age3 ==0){
        System.out.println("baby");
    }else{
        System.out.println("child");
    }





  }

}
