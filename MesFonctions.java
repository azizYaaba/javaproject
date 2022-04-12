public class MesFonctions{


	public int minimum(int a, int b){
		return Math.min(a,b);

   	}

	public int maximum(int a, int b){
		return Math.max(a,b);

	}
	public boolean estPalindrome(String ch){
		String original=ch;
		String reverse="";
		int taille=original.length();
		for(int i=taille-1;i>=0;i--)
			{
		  		reverse=reverse+original.charArt(i);
			}
	return  original.equals(reverse);
   	}

	public int factorielle(int n){
		if(n==0){
		  return 1;
		}else
		  return (n*factorielle(n-1));
	}
}
