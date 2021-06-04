/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_arguments_20190131;

/**
 *
 * @author basma adel
 */
public class Area_Arguments_20190131 {
    public static void main(String[] args) {
		
		double area ;
		if(args.length==0) {
			System.out.println(" area = 0 ");
		}
			else if (args.length==2 ||args.length==3) {
				String shape=args[0];
				if(shape.compareToIgnoreCase("square")==0) {
					double lenght = Double.parseDouble(args[1]);
					area = lenght *lenght ;
					System.out.println("the area of the square is :"+area );}
				else if(shape.compareToIgnoreCase("rectangle")==0) {
					double lenght = Double.parseDouble(args[1]);
					double widht = Double.parseDouble(args[2]);
					area = lenght *widht ;
					System.out.println("the area of the rectangle is :"+area);}
				else if(shape.compareToIgnoreCase("circule")==0) {
					double r = Double.parseDouble(args[1]);
					area= (3.14*r*r) ;
					System.out.println("the area of the triangel is :"+area);}
				else 
					System.out.println("your shape not found");
			}
			
		}
    
}
