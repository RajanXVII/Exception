// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        try{testExce1.test1();}
        catch(CustException e){
           System.out.println("Hello, World!");  
        }
    }
}
class testExce1 {
    public static void test1() throws CustException{
        throw new CustException();
    }
}

class CustException extends Exception{
     public CustException(){
        super();
    }
}
