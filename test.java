import java.io.*;
import java.util.Scanner;

public class test{
    public static void main(String[] args)throws IOException{
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter Filename: ");
        // String Filename = scan.next();
        BufferedReader br = new BufferedReader(new FileReader("source"+".cpp"));
        String st;
        int count = 0 ;
        while((st = br.readLine()) != null)
            count++; //นับว่ามีไฟล์เท่าไหร่ทุกครั้งที่ขึ้นบรรทัดใหม่
        String value_file[] = new String[count]; //เก็บข้อมูลในไฟล์ทั้งหมด จากนั้นจึงค่อยมาเก็บแค่ตัวสตริงทีหลัง
        // String number_file[] = new String[count]; //เก็บเฉพาะตัวเลขเท่านั้นในไฟล์เท่านั้น
        String str_temp = ""; //คอยเก็บค่าที่อ่านได้จากไฟล์
        int i = 0; //ทำหน้าที่เป็นตัวหมุนตำแหน่งอินเด็กซ์
        try {
            BufferedReader br_loop = new BufferedReader(new FileReader("source"+".cpp"));
            while(str_temp != null){
                if(str_temp == null) break;
                str_temp = br_loop.readLine();
                value_file[i] = str_temp; //เก็บค่าในไฟล์ทั้งหมดมาเก็บไว้ตามตำแหน่งบรรทัดตามไฟล์
                i++;
            }
            br_loop.close();
        } catch (Exception e) {}
        // System.out.println(value_file.length);
        // for(String str:value_file)
        //     System.out.println(str);

        String state = "state_0";
        String input = "";
        int n_file = 0; //สำหรับนับอินเด็กในไฟล์
        int n_comment = 0;
        int line_comment = 0;
        int s_line = 0;
        // while(true){
        //     String check_file[] = value_file[n_file].split(" ");
        //     if(state.equals("state_0")){
        //         if(check_file[n_file].equals("//")) n_comment++;
        //     }
        //     n_file++;
        //     if(n_file == value_file.length) break;
        // }
        // System.out.println(n_comment);

        /***********************ในส่วนที่ใช้ **********************/
        String check_file[] = new String[100];
        for(int k=0; k<12; k++){
            int n=0;
            // check_file[k] = "eol";
            // check_file[k] = value_file[n_file].split(" ");
            String[] kkkk = value_file[k].split(" ");
            // System.out.println("check_file: "+check_file.length+" and n_file: "+n_file);
            
            System.out.println(kkkk[0]);
            if(state.equals("state_0")){
                if(kkkk[0].equals("//")) {
                    // String[] slash = value_file[n_file].split(" ");
                    for(int p=1; p<kkkk.length; p++){
                        n_comment += kkkk[p].length();
                    }
                    // System.out.println(slash.length);
                    // n_comment += slash.length-2;
                    line_comment++;
                    // String n_cha[] = value_file[n_file].split("");
                    // n_comment = n_cha.length;
                }
                //เช็คว่า มี souce code กี่บรรทัด
                else if(value_file[k].length() >= 1 && !value_file[k].equals("")){
                    s_line++;
                    System.out.println("\n************************\nThis is !kkkk[0].equals("+"): "+value_file[k]);
                }
            }
            // System.out.println(check_file.length);
            // System.out.println(n_file);
            n_file++;
            n++;
            if(n_file == value_file.length) break;

        }
        System.out.println("the number of characters in the comment : "+n_comment);
        System.out.println("the number of comment lines : "+line_comment);
        System.out.println("the number of source line : "+s_line);
    }
}