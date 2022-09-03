package com.company;
/*
Time Complexity-0ms
Space Complexity-39.9 MB
 */
public class defaning_IPaddr {
    public String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }
}
