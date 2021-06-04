/*
Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.util.Scanner;

public class App {
    //static int GALLON=350;
    public static void main(String[] args) {
        final int GALLON=350;
        Scanner in=new Scanner(System.in);

        System.out.print("Length: ");
        int l= in.nextInt();

        System.out.print("Width: ");
        int w=in.nextInt();

        int area=l*w;
        int numGal=area/GALLON;
        if(area%GALLON!=0)
            System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.",numGal+1,
                    area);
        else{
            System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.",numGal,
                    area);
        }
    }
}
