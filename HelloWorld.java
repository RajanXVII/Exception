// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        try{testExce3.test3();}
        catch(ArithmeticException e){
           System.out.println("Hello, World!");  
        }
    }
}
class testExce1 {
    public static void test1() {
        throw new ArithmeticException();
    }
}
class testExce2 {
    public static void test2() {
        testExce1.test1();
    }
}
class testExce3 {
    public static void test3() {
        testExce2.test2();
    }
}

class CustException extends Exception{
     public CustException(){
        super();
    }
}
