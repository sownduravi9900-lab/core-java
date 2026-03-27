public class GoodsDetails {
    public static void main(String[] args) {
		
        int goodsId = 701;
        double goodsPrice = 1250.00;
        String goodsName = "Electric Kettle";
        boolean isAvailable = true;
        char qualityGrade = 'A';

       
        System.out.println("Initial Goods Details:");
        System.out.println("Goods ID: " + goodsId);
        System.out.println("Goods Price: " + goodsPrice);
        System.out.println("Goods Name: " + goodsName);
        System.out.println("Available: " + isAvailable);
        System.out.println("Quality Grade: " + qualityGrade);

       
        goodsId = 702;
        goodsPrice = 1450.75;
        goodsName = "Electric Cooker";
        isAvailable = false;
        qualityGrade = 'B';

        System.out.println("\nUpdated Goods Details:");
        System.out.println("Goods ID: " + goodsId);
        System.out.println("Goods Price: " + goodsPrice);
        System.out.println("Goods Name: " + goodsName);
        System.out.println("Available: " + isAvailable);
        System.out.println("Quality Grade: " + qualityGrade);
    }
}