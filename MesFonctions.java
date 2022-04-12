public class MesFonctions{


public int minimum(int a, int b){
	return Math.min(a,b);

   }
public boolean estPalindrome(String ch){
	original=ch;
	reverse="";
	int taille=original.length();
	for(int i=taille-1;i>=0;i--)
		{
		  reverse=reverse+original.charArt(i)
		}
	return  origin.equals(reverse);
   }

}
