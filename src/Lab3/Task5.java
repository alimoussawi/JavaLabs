package Lab3;

import static Lab3.Task4.ComputerArray;

public class Task5 {
    public static void main(String[] args) {
        for (int i=0;i<ComputerArray.length;i++){
            ComputerArray[i]= new Computer("toshiba",i,i,i,i);
            ComputerArray[i].setPrice(ComputerArray[i].getPrice()+10);
        }
    }
}

