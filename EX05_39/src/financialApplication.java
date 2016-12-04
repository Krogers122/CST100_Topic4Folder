import javax.swing.JOptionPane;
public class financialApplication {
    public static void main (String[]Args){
        String commissionS = JOptionPane.showInputDialog("Enter the amount of the commission you would like to have:");
        int desiredCommission = Integer.parseInt(commissionS);
        int salesAmount = 0;
        double commissionRate = 0;
        double commissionAmount = 0;
        System.out.println("Sales Amount" + "\t\t" + "Commission Rate" + "\t\t" + "Commission Amount");
         
        for (salesAmount=1; salesAmount <= 500000;salesAmount++){
        if(salesAmount <= 5000){
            commissionRate =  0.08;
        }
        if(salesAmount >= 5001 &&  salesAmount <= 10000){
            commissionRate = 0.10;
        }
        if(salesAmount >= 10000){
            commissionRate = 0.12;  
        }   
        salesAmount += 4999;
        commissionAmount = salesAmount * commissionRate;
        System.out.println(salesAmount + "\t\t\t" + commissionRate + "\t\t\t" + commissionAmount);
        if(commissionAmount==desiredCommission){
            break;}
        }
        JOptionPane.showMessageDialog(null, "To earn a commission amount of €" + desiredCommission + " , Your sale amount has to reach €" + salesAmount);
    }
}