class sample4_4 {
  public static void main(String[] args) {
    int count = 5;
    
    //while
    while(count != 5 && count > 0) {
      System.out.println("while  :count =" + count);
      count--;
    }
    
    //do-while
    do {
      System.out.println("do-while:count =" + count);
      count--;
    } while (count != 5 && count > 0);
    
  }
}