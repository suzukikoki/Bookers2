class test {
  void myPrint() { System.out.println("myPrint()"); }
  void myPrint(int a) { System.out.println("myPrint(int a)"); }
  void myPrint(int a, int b) {
    System.out.println("myPrint(int a, int b"); }
  void myPrint(String s) {
    System.out.println("myPrint(String s"); }
  }
  class sample6_3 {
    public static void main(String[] args) {
      test t =new test();
      t.myPrint();
      t.myPrint(100);
      t.myPrint(100, 200);
      t.myPrint("yamamoto");
    }
}