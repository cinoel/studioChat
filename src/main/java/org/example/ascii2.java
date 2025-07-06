package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class ascii2 {
    public static String main(String[] args) {

        Scanner input = new Scanner(System.in);

        //prompt for ascii string
        System.out.print("ascii string");
        String asciiString = input.nextLine();

        //prompt for ascii.length
        System.out.print("please input the longest ascii string");
        String stringvalue = input.nextLine();
        int maxAsciiLength = stringvalue.length();

        //prompt for ascii.height
        System.out.print("please input the number of lines present in the ascii image");
        String heightvalue = input.nextLine();
        int height = stringvalue.length();


        List<String> tempList  = new ArrayList<String>();
        String completeString = "";
        for (int i = 0; i < maxAsciiLength; i++)
        {
            tempList.add(asciiString.substring(i));
            int counter = 0;
            if (asciiString.substring(i).equals(" "))
            {
                counter = counter + 1;
                if (counter >= 50)
                {
                    break;
                }
            }
            if (i == maxAsciiLength - 1)
            {
                completeString = "System.out.println(\"" +  tempList + "\");";
            }
        }
        return completeString;
    }

}
