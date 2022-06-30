public class A {
 
 static void func1() {
  System.out.printf("void 형 메소드는 돌려줄게 없음. \n");
 }
 
 static int fnc2() {
  return 100;
 }
 
 pblic ststic void main(String[] args) {
  int a;
  
  func1();
  
  a = func2();
  System.out.printf("int 형 메소드에서 돌려준 값 => %d\n", a);
  }
 }
