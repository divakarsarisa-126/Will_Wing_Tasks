package Task_WW2;

public class userName_valid {
	
	public boolean validateUserName(String username) {
		
		String last="_job";
		
		
		if(username.endsWith(last)) {
			String initial=username.substring(0,username.length()-last.length());
			return initial.length()>=8;
		}
		return false;
			
	}

	public static void main(String[] args) {
		userName_valid obj= new userName_valid();
		System.out.println(obj.validateUserName("sanjaysahuuu_job"));
	}

}
