package Lab01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task01 {
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
}
