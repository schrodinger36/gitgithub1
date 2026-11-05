/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstuniquecharacter;

/**
 *
 * @author APOORVA
 */
public class FirstUniqueCharacter {
class Solution {
    public int firstUniqChar(String s) {
       /* HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            hs.put(ch1,hs.getOrDefault(ch1,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(hs.get(ch1)==1)return i;
        }
        return -1;*/
      int c[]=new int[26];
      for(int i=0;i<s.length();i++){
         char ch1=s.charAt(i);
         c[ch1-'a']++;
      }
    for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        if(c[ch1-'a']==1)return i;
    }
    return -1;

    }
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
