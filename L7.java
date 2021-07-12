class L7 {
  public static void main(String[] args){
   
byte var01 = 1;
short var02 = 12345;
int var03 = 1234567890;
long var04 = 123456789000l;

// byte -100~100
// short -3万〜3万
// int -20億〜20億
// long 京の桁以上 最後にLをつける。


System.out.println(var01);
System.out.println(var02);
System.out.println(var03);
System.out.println(var04);


float var05 = 1.234F;
double var06 = 1.23456789;

System.out.println(var05);
System.out.println(var06);

// floatは最後にF doubleの方が多くの桁を扱える。こちらを使うことが多い。




char var07 = 'c';
String var08 = "hello,World!";

System.out.println(var07);
System.out.println(var08);


// charは一文字  シングルクォーテーション
// StringのSは大文字 ダブルクォーテーション

  }



}
