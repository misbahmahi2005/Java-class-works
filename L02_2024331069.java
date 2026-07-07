import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @LabID:02
 * @Date:2026-06-03
 * @RegNo:2024331069
 * @Section:A
 */


class L02_2024331069{

    public static void main(String[] args) throws IOException{

         
        IO.print("IO_print 2\n");
        IO.println("LAB 02");
        System.out.print("System_print");
        System.out.println("Old System Print");
        int m=75;
        IO.println(m);
        String s="Str4564";
        IO.println(s);
        s=IO.readln("Enter your name: ");
        IO.println(s);
        m=Integer.parseInt(IO.readln("Enter an int: "));
        IO.println(m*10);
        double d= Double.parseDouble(IO.readln("Enter a double: "));
        IO.println(d/30);
 
         
        
        int i=Integer.parseInt(args[0]);
  
        if(i%2==0){
            IO.println("EVEN");

        }
        else{
            IO.println("ODD");

        }

        int i2=Integer.parseInt
        (JOptionPane.showInputDialog( "Enter an int: "));
        IO.println(i2-50);

        
       
        String s2=Files.readString(Paths.get("input.txt"));
       Files.write(Paths.get("output.txt"), Arrays.asList(s2.toUpperCase()));
       

        for(int i3=0;i3<10;i3++){
            IO.println("*".repeat(10));

        }

        String s3 = IO.readln();
        String[] nums = s3.split(" ");
        IO.println(Arrays.stream(nums).mapToInt(Integer::parseInt).sum());
        IO.println(Arrays.stream(nums).mapToInt(Integer::parseInt).average().getAsDouble());

    }
       

}

