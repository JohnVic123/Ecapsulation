import java.util.Scanner;
public class RunBloodData{
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        RunBloodData bd = new RunBloodData();
        
        System.out.print("Enter blood type of patient:");
        BType = input.nextLine();
        
        System.out.print("Enter the Rhesus factor (+ or -):");
        Factor = input.nextLine();
        
        if(BType.equals("")&&(Factor(""))){
        	bd.setBloodType("O");
        	bd.setRhFactor("+");
        	System.out.println(bd.getBloodType() + bd.RhFactor() +"is added to the blood bank.");
        	
        	}
        	else if(BType.isEmpty()&&Factor.equals("+")||Factor.equals("-")){
        			System.out.println("Invalid input!");
        			}
        			
        			else if(BType.equalsIgnoreCase("O")||BType.equalsIgnoreCase("A")||BType.equalsIgnoreCase("B")||BType.equalsIgnoreCase("AB")&&Factor.equals("+")||Factor("-"))
        				bd.setBloodType(BType);
        				bd.setBloodType(Factor);
        				{
        					System.out.println(bd.getBloodType() + bd.RhFactor() +"is added to the blood bank.");
        					}
        					else{
        						System.out.println("Invalid input");
        						}       				
    }
}
