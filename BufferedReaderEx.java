import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
public static void main(String[] args) throws IOException{
    int num =0;
    // BufferedReader br=null;
    // try{
    //      br = new BufferedReader(new InputStreamReader(System.in));
    //     num = Integer.parseInt(br.readLine());
    //     System.out.println(num);
    // }
    // finally{
    //     br.close();
    // }


    //It will automatically close the br
    try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
        num = Integer.parseInt(br.readLine());
        System.out.println(num);
    }
    
}    
}