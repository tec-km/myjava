class  L8 {
  public static void main(String[] args){
    String[] arr;

    arr = new String[3];
    arr[0]="sato";
    arr[1]="suzuki";
    arr[2]="takahashi";


    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);


// 配列の作り方。宣言と代入を別にやるか同時にやるか。

// 別の場合
// データ型[]配列変数名;
// 配列変数名=new データ型[要素数];



  String[] arr2 = {"sato","suzuki","takahashi"};

  System.out.println(arr2[0]);
  System.out.println(arr2[1]);
  System.out.println(arr2[2]);

// 同時の場合
// データ型[]配列変数={"データ１","データ２","データ３"};


String[][] arr3;

arr3 = new String[2][2];

arr3[0][0] = "sato";
arr3[0][1] = "suzuki";
arr3[1][0] = "takahashi";
arr3[1][1] = "tanaka";


System.out.println(arr3[0][0]);
System.out.println(arr3[0][1]);
System.out.println(arr3[1][0]);
System.out.println(arr3[1][1]);



}


}
