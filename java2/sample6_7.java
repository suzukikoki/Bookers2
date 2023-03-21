class sample6_7 {
  int instanceVal;
  static int staticVal;
  
  int methodA() { return instanceVal; }
  int methodB() { return staticVal; }
  
  static  int methodC() {
  sample6_7 obj = new sample6_7();
  return obj.instanceVal;
  }
}