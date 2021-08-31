class Main {
  public static void main(String[] args) {
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);
    
    // 変数numberを9で上書きしてください
    number = 9;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数textを「Java」で上書きしてください
    text = "Java";
    
    // 変数textを出力してください
    System.out.println(text);
    
    int number2 = 3;
    System.out.println(number2);
    
    // 変数numberの値に7を足して、変数numberを上書きしてください
     number2 =  number2 + 7;
    
    // 変数numberを出力してください
    System.out.println(number2);
      
//////////////
    int number3 = 8;
    
    // 変数numberに7をかけて、変数numberを上書きしてください
    number3 *= 7;
    
    // 変数numberを出力してください
    System.out.println(number3);
    
    // 変数numberの値に1を足して、変数numberを上書きしてください
    number3 ++;  
    
    // 変数numberを出力してください
    System.out.println(number3);
    
//////////////
    int length = 6;
    int height = 8;

    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea =  length * height;

    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);

    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = length * height / 2;

    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);

//////// double型は小数点以下
   // double型の変数number1を定義し、8.5を代入してください。
    double number5 = 8.5;

    // double型の変数number2を定義し、3.4を代入してください。
    double number6 = 3.4;
    
    // number1にnumber2を足した値を出力してください
    System.out.println( number5 + number6);
    
    // number1からnumber2を引いた値を出力してください
    System.out.println (number5 - number6);
    
///////
int month = 12;
int date = 31;

// 「12月31日」となるように変数と文字列を連結して出力してください
System.out.println ( month + "月" + date + "日");

// 7を2で割った値を出力してください
System.out.println(7 / 2);

// 7.0を2.0で割った値を出力してください
System.out.println(7.0 / 2.0);

// 7を2.0で割った値を出力してください
System.out.println(7 / 2.0);

/////////

int number8 = 7;
int number9 = 2;
System.out.println(number8 / number9);

// number1をdouble型にキャストし、number2で割った値を出力してください
System.out.println((double)number8 / number9);

//////
  // 変数nameに、好きな名前を代入してください
  String name = "好きな名前";
    
  // 変数ageに、好きな年齢を代入してください
  int age = 30;
  
  // 変数heightに、好きな身長を代入してください（例: 1.2）
   double  height1 = 1.8;
  
  // 変数weightに、好きな体重を代入してください（例: 20.0）
   double  weight = 70.0;
  
  // 変数bmiに、BMIを計算して代入してください
   double bmi = (weight / height1 / height1);
  
  // 名前、年齢、身長、体重、BMIに関する情報を出力してください
  System.out.println("名前は" + name + "です");
  System.out.println("年齢は" + age + "歳です"); 
  System.out.println("身長は" + height1 + "mです");
  System.out.println("体重は" + weight + "kgです");
  System.out.println("BMIは" + bmi + "です");
 
  



  }
}
