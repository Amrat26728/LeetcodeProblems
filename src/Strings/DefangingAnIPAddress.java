package Strings;

// problem
// https://leetcode.com/problems/defanging-an-ip-address/

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));
    }

    //// solution //////

    public static String defangIPaddr(String address) {
        String s = "";
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                s = s.concat("[.]");
            }else{
                s = s.concat(address.substring(i, i+1));
            }
        }
        return s;
    }
}
