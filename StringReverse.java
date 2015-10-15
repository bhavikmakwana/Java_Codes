class  StringReverse
{
	static StringBuffer s = new StringBuffer("This is best programming lanuage");
	public static void main(String[] args) 
	{
		int i=0,j=0,w=0;
		while(i<s.length()){
		if(i==0){
			w =0;
			}
			else if(s.charAt(i) == ' ' || i == s.length()-1){
				j =i;
				if(i == s.length()-1)
			j =i;
				else
			j--;
			swap(w,j);
			w = i+1;
			}//if(s.charAt(i) == ' ')
			i++;
		}//while(i<s.length())
		swap(0,s.length()-1);
		System.out.println(s);
		
	}//main
	static void swap(int i,int j){
		while (i < j) {
			char ch = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, ch);
			i++;
			j--;
		}//while (condition)

	
	}//static void swap
}//StringReverse