package programmes.string;

public class special_character {
    public static void main (String[] args){
        /*
         The solution to avoid this problem, is to use the backslash escape character.

            The backslash (\) escape character turns special characters into string characters:

        Escape character	Result	Description
        \'	                    '	Single quote
        \"                  	"	Double quote
        \\                  	\	Backslash           */

        String text = "Hii, I am \"ashish kumar patel\"";
        System.out.println(text);

        String txt2 = "It\'s alright.";
        System.out.println(txt2);

        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3);



    }
    
}
