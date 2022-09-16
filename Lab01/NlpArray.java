package Lab01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NlpArray {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        String[] abc = wordTokenizer("D:\\Work\\Practice\\data-structures\\Lab01\\test.txt");

        for (String s : abc) {
            System.out.println(s);
        }
    }

    /*
     * Words
     * Tokenizer
     */
    public static String[] wordTokenizer(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        String lines;
        String[] words = new String[100];
        int idx = 0;
        int index = 0;
        String word = "";

        Boolean check = false;

        while (sc.hasNext()) {
            lines = sc.nextLine();

            for (int i = 0; i < lines.length(); i++) {
                check = false;

                while (lines.charAt(i) != ' ') {

                    if ((lines.charAt(i) >= 'A' && lines.charAt(i) <= 'Z')
                            || (lines.charAt(i) >= 'a' && lines.charAt(i) <= 'z')) {
                        word = word + lines.charAt(i);

                        check = true;
                    }
                    i++;

                    if (i >= lines.length()) {
                        break;
                    }
                }

                if (check) {
                    words[index++] = word;

                    word = "";
                    idx++;
                }

            }

        }

        sc.close();

        return words;
    }

    /*
     * Email
     * Extractor
     */
    public static String[] extractEmail(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        String lines;
        String[] emails = new String[100];
        int index = 0;
        String email ="";

        while(sc.hasNext())
        {
        lines  = "";
        lines = sc.nextLine();

        for(int i=0; i<lines.length(); i++)
        {

                    email =   "";

            while(lines.charAt(i)!=' ')
            {
                email +=lines.charAt(i);
              i++;

              if(i>=lines.length())
              {
                  break;
              }
            }

            for(int j=0; j<email.length(); j++)
            {
                  if ( email.charAt(j)=='@')
                  {
                  emails[index++] = email;
                break;
                  }
            }

        }
    }
    sc.close();
    return emails;
    
}


/*
 * TASK 2
 * 
 * IMAGE
 * CROPPING
 */

public static void extractBoundries(int arr[][])
{

      for(int i=0; i<arr.length; i++)
      {
                System.out.print("\n");
        for(int j=0; j<arr[i].length; j++)
        {
          if( i==0 || j==0  || i==(arr.length-1) || j==(arr[j].length-1) )
          {
          System.out.print(arr[i][j]+"  ");
          }
          else
          {
            System.out.print("   ");
          }
        }
      }

}


/*
 * IMAGE
 * CROPPING
 */

public static void cropCenterPart(int arr[][])
  {

      for(int i=0; i<arr.length; i++)
      {
                System.out.print("\n      \t ");
        for(int j=0; j<arr[i].length; j++)
        {
          if( i!=0 && j!=0  && i!=(arr.length-1) && j!=(arr[j].length-1) )
          {
          System.out.print(arr[i][j]+"  ");
          }
          else
          {
            System.out.print("   ");
          }
        }
      }
  }



   






}
