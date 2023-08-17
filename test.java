import java.io.Serializable;

/**
 *
 */
public class test extends Object implements Serializable
{

   /**
    *
    */
   public test()
   {
   }

   /**
    * @param TYPE
    * @return TYPE
    */
   public void method()
   {
      System.out.println( "Hello World!" );
   }

   /**
    *
    */
   public static void main( String[] args )
   {
      ( new test() ).method();
   }
}
