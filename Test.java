package _12_10_22;

public class Test {

    public static class MarketConstructor {


        String subMarket;
        String product;
        boolean online;
        boolean margin;
        int allProdukt = 128;
        String cuntry;

        Test2 test2;


        public MarketConstructor(String subMarket, String product, boolean online, boolean margin, int allProdukt, String cuntry) {
            this.subMarket = subMarket;
            this.product = product;
            this.online = online;
            this.margin = margin;
            this.allProdukt = allProdukt;
            this.cuntry = cuntry;
            this.test2 = new Test2();
        }

        public Test2 getTest2() {
            return test2;
        }

        public String getSubMarket() {
            return subMarket;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public static void main(String[] args) {
            MarketConstructor nyse = new MarketConstructor("futures", "s&p", true, true, 36, "usa");

            System.out.println(nyse.getSubMarket());

            nyse.setProduct("7e");

            System.out.println(nyse.getProduct());

            System.out.println(nyse.getTest2().getForMonth());


        }

    }

}
