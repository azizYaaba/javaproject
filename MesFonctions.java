public class MesFonctions{


public int minimum(int a, int b){
	return Math.min(a,b);

   }
public boolean estPalindrome(String ch){
	String original=ch;
	String reverse="";
	int taille=original.length();
	for(int i=taille-1;i>=0;i--)
		{
		  reverse = reverse + original.charAt(i); 
		}
	return  original.equals(reverse);
   }

}
