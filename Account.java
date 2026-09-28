class Account{
        String username;
        long accountnumber;
        private double balance;
        Account (String username, long accountnumber, double balance ){
            this.username = username;
            this.accountnumber = accountnumber;
            this.balance = balance;
        }
        public void setbalance(double Balance){
            if (Balance < 0){
                System.out.println("Balance is invalid");
                return ;
            }
            else{
                this.balance = Balance;
            }
        }
        public double getbalance(){
            return balance ;
        }
    class details{
        public static void main(String[] args) {
        Account ko = new Account("John999", 99999999, 9);
        ko.setbalance(80000.00);
        System.out.println(ko.getbalance());
        }
    }
}