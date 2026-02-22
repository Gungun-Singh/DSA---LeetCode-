class Solution {
    public String defangIPaddr(String address) {
        String addr = address.replace(".", "[.]");
        return addr;
    }
}