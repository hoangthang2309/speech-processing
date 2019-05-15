
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryExportToFileTuDaTra{
// Hàm ghiFile(list) ghi lại từ vừa thêm vào file
    public void ghiFile(ArrayList <TuVuaTra> list){
        File file= new File("dictionarieshistory.txt");
        try (PrintWriter print = new PrintWriter(file)){
            for(TuVuaTra i: list){
                print.println(i.getTumoi());
                print.println(i.getPhienam());
                print.println(i.getTiengviet());
            }
            print.close();
        } catch (Exception e) {
            System.out.println("File trống!");
        }
    }
// Hàm docFile() đọc dữ liệu từ file
    public ArrayList docFile(){
        File file= new File("dictionarieshistory.txt");
        ArrayList <TuVuaTra> list = new ArrayList<>();
        try(Scanner scan = new Scanner(file)) {
            while(scan.hasNext()){
                TuVuaTra tuVuaTra= new TuVuaTra();
                tuVuaTra.setTumoi(scan.nextLine());
                tuVuaTra.setPhienam(scan.nextLine());
                tuVuaTra.setTiengviet(scan.nextLine());
                list.add(tuVuaTra);
            }
        } catch (Exception e) {
            System.out.println("File trống!");
        }
        return list;
    }
}
