import java.util.Scanner;

class Main {
  //public 
  //access level modifier - public and private
  // public allows you to use the method and class wherever you want
  //private can only be used in the file it was made in

  //static
  //working with static method becasue the main is static

  //void
  //return type - tells java what data type will be returned after running the method

  //bark
  //method name - should follow same nameing convention as variables
  // can't start with numbers and special characters except a few
  // can but shouldn't start with a capital letter
  // should follow camel casing (camelCasing)
  public static void bark(){
    System.out.println("woof");
  }

  public static void meow() {
    System.out.println("meow");
  }
  // add(int a, int b)
  //variables inside the parenthesis called arguments
  // arguments are taken in to be used
  public static int add(int a, int b) {
    return a + b;
  }

  //square method

  // public static int square(int a) {
  //   return a * a;
  // }

  // public static int power(int base, int exp) {
  //   int answer = base;
  //   if (exp ==0){
  //     return 1;
  //   }
  //   for (int i = exp; i>1; i--){
  //     answer = answer * base;
  //   }
  //   return answer;
  // }

  // area of a triangle

  public static double triangle(double base, double height){
     return (base * height)/2;
  }

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("enter base");
    double base = scan.nextDouble();
    System.out.println("enter height");
    double height = scan.nextDouble();
    double area = triangle(base, height);
    System.out.println(area);
    // double area = triangle(7, 7);
    // System.out.println(area);

    // int number = add(5, 6);
    // System.out.println(number);

    // int answer = power(2, 3);
    // System.out.println(answer);

    // int result = square(4);
    // System.out.println(result);

    // bark();
    // meow();

    // review
    // loops: while and for 
    // for - loops 
    // while - qualitative conditions (booleans)
    // while format:
    // while (booleans){
    //  any code that you want to run
    // }
    // for format:
    // for (starting variable; condition; updating the variable){
    //  code that you run
    //}

    //scanners (isn't on AP test)
    //scanners allow us (users to put in values to the code)
    //type in numbers of letters (depending on scanners) to the console and the code will use that value
    // to use one, you need to import it first
    // after you need to make the scanner object
    // then you can use the scanner to take the inputs

    //  Scanner scan = new Scanner(System.in); // making the object
    // System.out.println("What is your name: ");
    // String name = scan.nextLine();
    // System.out.println("My name is " + name + ".");
    // System.out.println("How old are you: ");
    // int age = scan.nextInt();
    // System.out.println("I am "+ age + " years old.");

    // methods 
    // another word for functions (python)
    // purpose of methods is so that you can use a specific set of code over and over again
    // 2 types of methods 
    // static and nonstatic (will come when we make classes and objects later)
    // we will be working with static methods today
  }
}