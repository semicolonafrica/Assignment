package chapter7.exercise7_16;

public class CommandSumDouble {


		    public static void main(String args[]){


//		        double[] array = new double[args.length];
//		        double total = 0, argsValue;
//
//		        for(int count = 0; count < args.length; count++){
//		            argsValue = Double.parseDouble(args[count]);
//
//		            array[count] = argsValue;
//		        }
//		        for(double value: array){
//		        // System.out.println(value);
//		            total += value;
//		        }
//		            System.out.println("Total is: " + total);
		    	
			    	double total = 0;
			    	for(String value: args){
			         
			            total += Double.parseDouble(value);
			        }
			            System.out.println("Total is: " + total);
			    	
			    }
			}


