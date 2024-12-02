package org.miu.lesson3.problem1;

public class Main {
    public static void main(String[] args) {

        Customer customer1=new Customer("John", "Adamfo", "11228");
        Customer customer2=new Customer("Davies", "Dwabuluka", "22813");
        Customer customer3=new Customer("Samuel", "Adams", "21283");

        customer1.setBillingAddress(new Address("1000N 4th","Fairfield","Iowa","52557"));
        customer2.setBillingAddress(new Address("112S 7th","Chicago","Illinois","52556"));
        customer3.setBillingAddress(new Address("100 PKW","Seattle","Washington","52559"));
        customer1.setShippingAddress(new Address("1000N 4th MR #11","Fairfield","Iowa","52557"));
        customer2.setShippingAddress(new Address("1000N 4th MR #19","Chicago","Illinois","52757"));
        customer3.setShippingAddress(new Address("1000N 4th MR #92","Seattle","Washington","25579"));

        Customer[] customerArray= {customer1,customer2,customer3};

        for(Customer x:customerArray){
            if(x.getBillingAddress().getCity().equals("Chicago")){
                System.out.println(x);
            }
        }
    }
}
