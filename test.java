import java.io.*;
import java.util.Scanner;

public class test{
    public static void main(String[] args)throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Filename: ");
        String Filename = scan.next();
        BufferedReader br = new BufferedReader(new FileReader(Filename+".cpp"));
        String st;
        int count = 0 ;
        while((st = br.readLine()) != null)
            count++; //นับว่ามีไฟล์เท่าไหร่ทุกครั้งที่ขึ้นบรรทัดใหม่
        String value_file[] = new String[count]; //เก็บข้อมูลในไฟล์ทั้งหมด จากนั้นจึงค่อยมาเก็บแค่ตัวสตริงทีหลัง
        // String number_file[] = new String[count]; //เก็บเฉพาะตัวเลขเท่านั้นในไฟล์เท่านั้น
        String str_temp = ""; //คอยเก็บค่าที่อ่านได้จากไฟล์
        int i = 0; //ทำหน้าที่เป็นตัวหมุนตำแหน่งอินเด็กซ์
        try {
            BufferedReader br_loop = new BufferedReader(new FileReader(Filename+".cpp"));
            while(str_temp != null){
                if(str_temp == null) break;
                str_temp = br_loop.readLine();
                value_file[i] = str_temp; //เก็บค่าในไฟล์ทั้งหมดมาเก็บไว้ตามตำแหน่งบรรทัดตามไฟล์
                i++;
            }
            br_loop.close();
        } catch (Exception e) {}
        
        // for(String str:value_file)
        //     System.out.println(str);

        String state = "state_0";
        String input = "";
        int n_file = 0; //สำหรับนับอินเด็กในไฟล์
        int n_comment = 0;

        // while(true){
        //     String check_file[] = value_file[n_file].split(" ");
        //     if(state.equals("state_0")){
        //         if(check_file[n_file].equals("//")) n_comment++;
        //     }
        //     n_file++;
        //     if(n_file == value_file.length) break;
        // }
        // System.out.println(n_comment);
        String check_file[] = new String[100];
        for(int k=0; k<12; k++){
            check_file = value_file[n_file].split(" ");
            if(state.equals("state_0")){
                if(check_file[n_file].equals("//")) {
                    String n_cha[] = value_file[n_file].split("");
                    n_comment = n_cha.length;
                }
            }
            System.out.println(n_file);
            n_file++;
            if(n_file == value_file.length) break;

        }
        System.out.println(n_comment);
        
    }
}