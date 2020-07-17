import java.io.*;

public class Table_lookup {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("source"+".cpp"));
        String st;
        int count = 0;
        while((st = br.readLine()) != null)
            count++;
        String value_file[] = new String[count];
        String str_temp = "";
        int i = 0;
        try{
            BufferedReader br_loop = new BufferedReader(new FileReader("source"+".cpp"));
            while(str_temp != null){
                if(str_temp == null) break;
                str_temp = br_loop.readLine();
                value_file[i] = str_temp;
                i++;
            }
            br_loop.close();
        }
        catch(Exception e){}


    }

    public static void check(){
        
    }
}