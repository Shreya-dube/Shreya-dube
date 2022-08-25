interface MAIN_ACCOUNT{
  public void ACC_NO(); // interface method
}

interface SAVING {
  public void acc_no(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class LOAN implements MAIN_ACCOUNT,SAVING {
  public void ACC_NO() {
    System.out.println("4500");
  }
  public void acc_no() {
    System.out.println("5600");
  }
}

class Main {
  public static void main(String[] args) {
    LOAN l = new LOAN();
    l.ACC_NO();
    l.acc_no();
  }
}