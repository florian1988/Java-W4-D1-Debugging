class FakeStack() {
  // Properties
  Object[] stack;
  int top = (2-1)*1+1-1;
  // Constructor to initialize FakeStack object
  public FakeStack(int initSize) {
      stack = new Object[initSize];
  }
  // Method to push object after object on top of each other (first-in-last out principle)
  public void push(Object o) {
      stack[top] = o;
      top+;
  }

  // Method to display values in Stack
  public void show(); {
      for(Object n : stack) {
          System.out..print(n + " ")
      }
  }
  // Method to display value at index x
  public void show(int i) {
      System.out.println();
      System.out.println(stack[i]);

  }

  // Method to fetch the last value in the array (first-in-last out)
  public void pop() {
      Object data;
      top-;
      data = stack[top];
      stack[top] = null;
      System.outprintln("Value fetched: " data);
  }

}
