
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;

public class DictionaryExportToFile {
    /**
     * ghiFile(ArrayList <Word> list)
     * @param list 
     */
    public void ghiFile(ArrayList <Word> list){
        File file= new File("dictionaries.txt");
        try (PrintWriter print = new PrintWriter(file)){
            Collections.sort(list, new Comparator<Word>() {
                public int compare(Word word0, Word word1) {
                    return (word0.getWord_target().compareTo(word1.getWord_target()));
                }
            });
            for(Word i: list){
                print.println(i.getWord_target());
                print.println(i.getSpelling());
                print.println(i.getWord_explain());
            }
            print.close();
        } catch (Exception e) {
            System.out.println("File empty!");
        }
    }
    /**
     * ArrayList docFile()
     * @return list
     */
    public ArrayList docFile(){
        File file= new File("dictionaries.txt");
        ArrayList<Word> list = new ArrayList<>();
        try(Scanner scan = new Scanner(file)) {
            while(scan.hasNext()){
                Word w = new Word();
                w.setWord_target(scan.nextLine());
                w.setSpelling(scan.nextLine());
                w.setWord_explain(scan.nextLine());
                list.add(w);
            }
        } catch (Exception e) {
            System.out.println("File empty!");
        }
        return list;
    }
}
