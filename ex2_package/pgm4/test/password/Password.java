package password;
import java.lang.Character;
import java.lang.String;
public class Password{
/** The Package has Password class which will have only one method.
 * The check password method will check the string wheather it has
 * atleast 6 characters , 3 digits and uppercase characters or digits.
 * @author aumrudh
 * @since 2019-12-19
 */
	public int checkPassword(String S){
		if((S.length())<6){
			return 0;
		}
	int count=0,flag=0;
	char c;
	for(int i=0;i<S.length();i++){
		c=S.charAt(i); //return character at position 'i'
		if(Character.isDigit(c)){
			count++;
		}
	}
	if(count<3){
		return 0;
	}
	for(int i=1;i<S.length();i++){
		c=S.charAt(i);
		if(Character.isDigit(c) || Character.isUpperCase(c)){
			flag=1; //if uppercase or digit then set flag=1 else flag=0
		}
		else
			flag=0;
			break;
	}
	if(flag==0){
		return 0; //if false return 0
	}
	return 1; //if all are satisfied then return 1
	}
}
