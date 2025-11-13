package bagroot2021task;


public class MyString {
	private String str;
	
	public MyString() {
		this.str=null;
	}
	
	public void setStr(String str) {this.str = str;}
	
	public String getStr() {return str;};
	
	//אולי זה לא מה שאתה צריך, אבל הבנתי את התרגום כך
    public int countChar (char ch) {
        int count = 0;
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) count++;
        }
        return count;
    }
    
    public void removeChar(char ch) {
    	char[] arr = str.toCharArray();
    	
    	for(int i = 0; i<str.length();i++) {
    		if(arr[i]==ch) {
    			arr[i]=' ';
    		}
    		str = String.valueOf(arr);
    	}
     }
    
    public void appendChar(char ch) {
    	StringBuffer sb = new StringBuffer(str);
    	sb.append(ch);
    	this.str = sb.toString();
    }
    
    public char firstChar() {
    	return str.charAt(0);
    }

    public boolean isEmpty() {
    	if(str.length()==0) return true;
    	else return false;
    }
    
}
