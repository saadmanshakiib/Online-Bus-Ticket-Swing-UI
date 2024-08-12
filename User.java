package src;

public class User {
        private Account account[];

        User(int sent){
            this.account = new Account[sent];
        }

        public void removeAccount(Account sent){
            for(int i=0;i<account.length;i++){
                if(account[i]==sent){
                    account[i]=null;
                }
            }
        }

        
}
