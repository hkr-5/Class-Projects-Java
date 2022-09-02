/*
 * Class Testing
 */

public class Testing {
    
    public static void main (String[] args) {         
       testA();
       testB();
       testC();
       testD();
       testE();
       testF();
       testG();
    }
    
    public static void testA() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION A\n");
       
       YourCode a = new YourCode();
         
       a.sectionA("WooHoo");
       a.sectionA("HelloThere");  
       a.sectionA("abcdef");   
       a.sectionA("ab");   
       a.sectionA("0123456789");   
       a.sectionA("kitten");
    }
    
    public static void testB() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION B\n");
              
       YourCode b = new YourCode();
              
       b.sectionB("Hello");    
       b.sectionB("java");     
       b.sectionB("coding");   
       b.sectionB("code");    
       b.sectionB("ab");    
       b.sectionB("Chocolate!");
       b.sectionB("kitten");
       b.sectionB("woohoo");
    }
    
    public static void testC() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION C\n");
       
       YourCode c = new YourCode();
      
       c.sectionC("Hello","hi");  
       c.sectionC("hi","Hello"); 
       c.sectionC("aaa","b");    
       c.sectionC("b","aaa");  
       c.sectionC("aaa","1234");  
       c.sectionC("aaa","bb"); 
       c.sectionC("a","bb");    
       c.sectionC("bb","a"); 
       c.sectionC("xyz","ab");
    }
    
    public static void testD() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION D\n");
       
       YourCode d = new YourCode();
     
       d.sectionD("Hello","There"); 
       d.sectionD("java","code"); 
       d.sectionD("shotl","java"); 
       d.sectionD("ab","xy"); 
       d.sectionD("ab","x"); 
       d.sectionD("x","ac"); 
       d.sectionD("a","x"); 
       d.sectionD("kit","kat"); 
       d.sectionD("mart","dart"); 
    }
    
    public static void testE() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION E\n");
       
       YourCode e = new YourCode();
  
       e.sectionE("Hello"); 
       e.sectionE("java");
       e.sectionE("Hi");
       e.sectionE("code");
       e.sectionE("cat");
       e.sectionE("12345");
       e.sectionE("Chocolate");
       e.sectionE("bricks");
    }
    
    public static void testF() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION F\n");
       
       YourCode f = new YourCode();
   
       f.sectionF("string");
       f.sectionF("code");
       f.sectionF("Practice");
       f.sectionF("ab");
       f.sectionF("0123456789");       
    }
    
    public static void testG() {
       System.out.println("\n**********************************************************");
       System.out.println("TESTING SECTION G\n");
       
       YourCode g = new YourCode();
   
       g.sectionG("abc hi ho");
       g.sectionG("ABChi hi");
       g.sectionG("hihi");
       g.sectionG("hiHIhi");
       g.sectionG("h");
       g.sectionG("hi");
       g.sectionG("Hi is no HI on ahI");
       g.sectionG("hiho not HOHIhi");
    }
}
    
