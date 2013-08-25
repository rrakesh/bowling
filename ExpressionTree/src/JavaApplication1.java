public class JavaApplication1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(shortenString("aaabbbcddff"));
    }
   
    static String shortenString(String string)
    {
        char lastChar = '\0';
        int count = 0;
        String temp = "";
        for(int i=0;i< string.length (); i++)
        {
            if(lastChar != '\0')
            {
                if(lastChar == string.charAt ( i ))
                {
                    count++;
                }
                else
                {
                    temp += String.format("%s%s", string.charAt(i-1), count);
                    lastChar = string.charAt ( i );
                    count = 0;
                    count ++;
                }
            }
            else
            {
                lastChar = string.charAt ( i );
                count++;
            }
 
           
       }
       
        temp += String.format("%s%s", string.charAt(string.length()-1), count);;
       
        return temp;
    }
}
 
