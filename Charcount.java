/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charcount;

/**
 *
 * @author APOORVA
 */
public class Charcount {

   
    public static void main(String[] args) {
        String str="appppppppppuaaaaaaaaaaazssssaqa";
        String visted="";
       
        for(int i=0;i<str.length();i++){
            char ch1=str.charAt(i);
            int count=0;
            if(visted.indexOf(ch1)!=-1)continue;
            
            for(int j=i;j<str.length();j++){//j=0also works
                if(ch1==str.charAt(j))count++;
            }
            visted+=ch1;
            System.out.println(ch1+"---->" +count);
        }
    }
    
}
