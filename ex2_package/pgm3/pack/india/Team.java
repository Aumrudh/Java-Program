package india;
public class Team{
/** The package has class team and three fields . 
 *  It has Constructor to initalize and also display method to dispaly.
 *  @author aumrudh
 *  @since 2019-12-19
 */
	private String playerName;
	private int position;
	private String nickName;
	public Team(String playerName,int position,String nickName){
		this.playerName=playerName;
		this.position=position;
		this.nickName=nickName;
	}
	public void display(){
		System.out.println("Player Name : "+playerName);
		System.out.println("Player Position : "+position);
		System.out.println("Player NickName : "+nickName);
	}
}

