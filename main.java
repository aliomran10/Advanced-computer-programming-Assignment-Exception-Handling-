import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        try{
            String fileName = args[0];
            if (!fileName. endsWith(".arxml")) {
                throw new NotVaildAutosarFileException("Invalid file extension");
            }
            File file = new File(fileName);
            FileInputStream inputStream = new FileInputStream(file);
            int d;
            StringBuilder stringBuilder = new StringBuilder();
            while((d=inputStream.read()) != -1){
                stringBuilder.append((char) d);
            }
            String data = stringBuilder.toString();
            if(data.length() == 0){
                throw new EmptyAutosarFileException("Empty ARXML file!");
            }
            Scanner scanner = new Scanner(data);
            ArrayList<Containers> containers = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("<SHORT-NAME>")) {
                    String shortName = line.substring(line.indexOf(">") + 1, line.indexOf("</"));
                    String long_name = scanner.nextLine();
                    String longName = "";
                    if (long_name.contains("</")) {
                        longName = long_name.substring(long_name.indexOf(">") + 1, long_name.indexOf("</"));
                    }
                    Containers container = new Containers();
                    container.setShortName(shortName);
                    container.setLongName(longName);
                    containers.add(container);
                }
            }            Collections.sort(containers);

            String outName = fileName.substring(0,fileName.indexOf(".")) + "_mod.arxml";
            FileOutputStream outputStream = new FileOutputStream(outName);
            outputStream.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
            outputStream.write("<AUTOSAR>\n".getBytes());
            for(int i=0; i<containers.size(); i++){
                outputStream.write(containers.get(i).toString().getBytes());
            }
            outputStream.write("</AUTOSAR>".getBytes());
        }
        catch(FileNotFoundException e){
            e = new FileNotFoundException("File not found!");
        }
        catch(IOException e){
            e = new IOException("IO Exception!");
        }
        catch(NotVaildAutosarFileException e) {
            e = new NotVaildAutosarFileException("\n");
        }
        catch(EmptyAutosarFileException e){
            e = new EmptyAutosarFileException("\n");
        }
    }
}
