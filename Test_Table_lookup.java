import java.io.*;

public class Test_Table_lookup {
    // public static String state = "state_begin";
    public static void main(String[] args)throws IOException{
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

        call(value_file);
        // String state = "state_begin";
        // String input = "";
        // String p[] = {"s","a"};
        // while(true){
            
        // }
    }


    public static void check(String check_value[][]){
        String[][] g = new String[2][2];
        for(int i=0; i<g.length; i++){
            if(g[i][1] == "s"){

            }
        }
        
        // return g;
    }

    public static void call(String[] n_file){
        String call_state = "";
        // String file[][] = new String[n_file.length][n_file.length];
        String file[][] = new String[n_file.length][2];
        
        for(int i=0; i<n_file.length; i++){
            String[] kkk = n_file[i].split("");
            System.out.println("*****************");
            // for(String l:kkk) System.out.println(kkk[0]);
            if(kkk[0].equals("/")){
                // call_state = "state_slash";
                file[i][0] = "state_slash";
                file[i][1] = n_file[i];
            }
            else if( !kkk[0].equals("}") && n_file[i].length() >= 1 && !kkk[0].equals("\n")){
                // call_state = "state_begin";
                file[i][0] = "state_begin";
                file[i][1] = n_file[i];
            }
            else if(kkk[0].equals("}")){
                file[i][0] = "state_eof";
                file[i][1] = n_file[i];
            }
        }
        // System.out.println(file.length);

        for(int i=0; i<file.length; i++){
            // System.out.print("index\n["+(i+1)+"]");
            for(int j=0; j<2; j++){
                // System.out.println("index: ["+i+"]["+j+"] : "+file[i][j]);
                // System.out.print("["+(i+1)+"]"+"["+(j+1)+"]\t");
                System.out.print("line "+(i+1)+": ["+file[i][j]+"]"+"["+(j+1)+"]\t");

            }
            System.out.println();
        }

    }
}