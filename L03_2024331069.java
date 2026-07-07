import java.util.Arrays;

/**
 * @LabID:03
 * @Date:2026-06-30
 * @RegNo:2024331069
 * @Section:A
 */

public class L03_2024331069{

    public static void main(String[] args){
        
        byte bt=10;
        short sh=256;
        int i=54687;
        float f=12.457f;
        double d=789.54879;
        boolean bl= true;
        IO.println("Byte "+ bt);
        IO.println("Byte Max: "+ Byte.MAX_VALUE);
        IO.println("Byte Min: "+ Byte.MIN_VALUE);
        IO.println("Short Max: "+ Short.MAX_VALUE);
        IO.println("Short Min: "+ Short.MIN_VALUE);
        
        //int if;

        //int_;error:=expected
        int _=1;
        //_++; error: undescore is not be allowed here;
       
        int __;
        var a=10;//Local variable type inference;
        int var=11;
        var=a+10;
        IO.println(var);
        double $=1.5;
        IO.println($);
        IO.println(123_456_709);
        IO.println(1_23_456_78_9);
        //IO.println(i9_);error:illegal underscore
        IO.println(0757);
        IO.println(0_75_7); //error:illegal underscore
        IO.println(0xaFbc);
       // IO.println(0x_aFbc); error illegal underscore
       IO.println(0B010101);
       //IO.println(12345678912); //error: integer variable too large
       IO.println(12345678912L);
       IO.println(1.2456e5);
       IO.println(1.456e-5);
       //IO.println(0x1.456); // error: malinformed
       IO.println(0x1.456p2);
       IO.println('\077');
       IO.println('\u0906');
      // IO.println('\u09960'); error:enclosed character literal
      IO.println("\"ABC\"");
      IO.println("""
              ABC\
              DEF\
              GHI""");

     //Type conversion

     int[] ar= new int[10];
     for(int i_=1;i_<11;i_++)ar[i_-1]=i_;

     for(int i_=0;i_<10;i_++){
        IO.print(ar[i_]+" ");

     }

     IO.println(Arrays.toString(ar));

  for(int j:ar)IO.print(j+" ");

        
      byte b=1;

      //b=128: //error: incompitable types: possible lossy conversion from int to byte

      //b=j;

     // b=b+1;

     b++;

     b+=1;
     b=5;

     b+=b++ +1;
     IO.println(b);
     //bl=(boolean)1; error:incompitable types: int cannot be converted to boolean


     b=(byte)256; // Narrowing conversion

     System.out.printf("%d,%f" ,123,3.14);
     System.out.printf("%10d,%10f",123,3.14);
     bl=1.5==1.50000001;
     IO.println(bl);
     bl=1.5==1.500_000_000_000_000_000_000_000_000_0001;
     IO.println(b);
     


 
    }

}