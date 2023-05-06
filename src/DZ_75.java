import java.io.*;
import java.util.Scanner;

public class DZ_75 {
    public static void main(String[] args){
        String str;
        int a=0;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();

        File file = new File("C:\\Users\\rak15\\IdeaProjects\\DZ_75\\src\\file.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write(str);
            str ="";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileReader fr = new FileReader(file)){
            int c;
            while ((c=fr.read())!=-1){
                str = String.format("%s%s", str, (char) c);
                if (c==97||c==1072||c==65||c==1040)
                    a++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(file)){
            str= "Буква а встретилась в строке "+a;
            fw.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
