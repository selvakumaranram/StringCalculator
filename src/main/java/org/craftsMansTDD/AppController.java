package org.craftsMansTDD;

/**
 * Hello world!
 *
 */
public class AppController
{
    public static void main( String[] args )
    {
        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.addStringNumbers("1;2,1\n14"));
    }
}
