package Lab3;

public class Task4 {
 static Computer ComputerArray[]= new Computer[5];

    public static void main(String[] args) {
        for (int i=0;i<ComputerArray.length;i++){
            ComputerArray[i]= new Computer("toshiba",i,i,i,i);
        }
    }
}

