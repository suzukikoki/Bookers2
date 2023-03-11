class Employee {
  int id;
  void setld(int i) {
    id = i;
  }
  int getld() {
    return id;
  }
}
class sample6_2 {
  public static void main(String[] args) {
    Employee a = new Employee();
    a.setld(100);
    
    Employee b = new Employee();
    b.setld(200);
    
    System.out.println("Aさん:" + a.getld());
    System.out.println("Bさん:" + b.getld());
  }
}