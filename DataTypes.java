public class DataTypes
{
  public static void main(String[] args)
  {
    //byte
    System.out.println("byte Declaration example");
    byte bnumPos = 127;
    byte bnumNeg = -128;
    
    //byte error, too long
    
    //byte bnumPos = 128;
    //byte bnumNeg = -129;
    System.out.println("\n Positive num "+ bnumPos);
    System.out.println("\n Negative num "+ bnumNeg);
    System.out.println("\n*****************************************");
    
    /*************************************************************************/
    
    //short
    System.out.println("short Declaration example");
    short snumPos =  32767;
    short snumNeg = -32768;
    //Short num error
    //short snumPos =  32767;
    //short snumNeg = -32768;
    System.out.println("\n Positive num "+ snumPos);
    System.out.println("\n Negative num "+ snumNeg);
    System.out.println("\n*****************************************");
    
    /*************************************************************************/
    
    //int
    System.out.println("int Declaration example");
    int inumPos =  2147483647;
    int inumNeg = -2147483648;
    //int num error
    //int inumPos =  2147483648;
    //int inumNeg = -2147483649;
    System.out.println("\n Positive num "+ inumPos);
    System.out.println("\n Negative num "+ inumNeg);
    System.out.println("\n*****************************************");
    
    /*************************************************************************/
    
    //long
    System.out.println("long Declaration example");
    long lnumPos =  9223372036854775807L;
    long lnumNeg = -9223372036854775808L;
    //long num error
    //long lnumPos =  9223372036854775808L;
    //long lnumNeg = -9223372036854775809L;
    System.out.println("\n Positive num "+ inumPos);
    System.out.println("\n Negative num "+ inumNeg);
    System.out.println("\n*****************************************");
    
    /*************************************************************************/
    
    //float
    System.out.println("float Declaration example");
    float fnumPos =  9229.54775807000F;
    float fnumNeg = -9229.54775808000F;
 
    System.out.println("\n Positive num "+ fnumPos);
    System.out.println("\n Negative num "+ fnumNeg);
    System.out.println("\n*****************************************");
    
    /*************************************************************************/
    
    //double
    System.out.println("double Declaration example");
    double dnumPos =  9229999.54775807000D;
    double dnumNeg = -9229999.54775808000D;
 
    System.out.println("\n Positive num "+ dnumPos);
    System.out.println("\n Negative num "+ dnumNeg);
    System.out.println("\n*****************************************");
    
    /*************************************************************************/
    
    //char
    System.out.println("char Declaration example");
    char cnum =  64;    
 
    System.out.println("\n Char"+ cnum); //Note ISO Unicode Charset
    System.out.println("\n*****************************************");
    
   	/*************************************************************************/
    
    //boolean
    System.out.println("boolean Declaration example");
    boolean trueOpt  =  true;
    boolean falseOpt =  false;
 
    System.out.println("\n true value:  >> "+ trueOpt);
    System.out.println("\n false value: >> "+ falseOpt);
    System.out.println("\n*****************************************");
       
  } 
}