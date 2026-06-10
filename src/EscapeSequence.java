public class EscapeSequence
{
    public static void main(String[] args)
    {
        // 1. \t - Insert a tab in the text at this point
        System.out.println("1. Tab (\\t):");
        System.out.println("Hello\tRutvik");
        System.out.println("----------------------------------------");

        // 2. \b - Insert a backspace in the text at this point
        System.out.println("2. Backspace (\\b):");
        System.out.println("Hello\bRutvik");
        System.out.println("----------------------------------------");

        // 3. \n - Insert a newline in the text at this point
        System.out.println("3. Newline (\\n):");
        System.out.println("Hello\nRutvik");
        System.out.println("----------------------------------------");

        // 4. \r - Insert a carriage return in the text at this point
        System.out.println("4. Carriage Return (\\r):");
        System.out.println("Hello\rRutvik");
        System.out.println("----------------------------------------");

        // 5. \f - Insert a formfeed in the text at this point
        System.out.println("5. Formfeed (\\f):");
        System.out.println("Hello\fRutvik");
        System.out.println("----------------------------------------");

        // 6. \' - Insert a single quote character in the text at this point
        System.out.println("6. Single Quote (\\'):");
        System.out.println("Hello \'Rutvik\'");
        System.out.println("----------------------------------------");

        // 7. \" - Insert a double quote character in the text at this point
        System.out.println("7. Double Quote (\\\"):");
        System.out.println("Hello \"Rutvik\"");
        System.out.println("----------------------------------------");

        // 8. \\ - Insert a backslash character in the text at this point
        System.out.println("8. Backslash (\\\\):");
        System.out.println("Hello \\ Rutvik");
        System.out.println("----------------------------------------");

        // 9. \ddd - Octal escape sequence (ddd represents octal number from 000 to 377)
        System.out.println("9. Octal Escape (\\ddd):");
        System.out.println("Character for octal 101 (\\101): \101");
        System.out.println("----------------------------------------");

        // 10. \\uXXXX - Unicode escape sequence (XXXX represents 4 hexadecimal digits)
        System.out.println("10. Unicode Escape (\\\\uXXXX):");
        System.out.println("Character for Unicode u0041 (\\u0041): \u0041");
        System.out.println("----------------------------------------");
    }
}
