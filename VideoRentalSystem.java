class Scratch {
	public static void main(String[] args) {
		VideoStore object=new VideoStore();
		object.addVideo("The Matrix");
		object.addVideo("Godfather II");
		object.addVideo("Star Wars Episode IV: A New Hope");
		object.reciveRate(2,3);
		object.reciveRate(1,3);
		object.reciveRate(3,3);
		object.checkOut("The Matrix");
		object.checkOut("Godfather II");
		object.checkOut("Star Wars Episode IV: A New Hope");
		object.returned_vid("The Matrix");
		object.returned_vid("Godfather II");
		object.returned_vid("Star Wars Episode IV: A New Hope");
		object.list();
	}
}
class Video{
	String title;
	boolean[] flag=new boolean[20];
	int[] rating=new int[20];
	void checkout(int i){
		if(flag[i]==true){
			flag[i]=false;
		}
	}
	void returned(int j){
		if(flag[j]==false){
			flag[j]=true;
		}
	}
	void recived_rating(int n,int no){
		rating[n]=no;
	}
}
class VideoStore extends Video{
	Video ob=new Video();
	String[] video=new String[20];
	int[] rate=new int[20];
	int i=0;
	void addVideo(String name){
		video[i++]=name;
	}
	void checkOut(String na){
		int j=0,index=0;
		while(j<3)
		{
			if(video[j].equalsIgnoreCase(na)){
				index=j;
			}
			j++;
		}
		checkout(index);
	}
	void returned_vid(String na){
		int j=0,index=0;
		while(j<3){
			if(video[j].equalsIgnoreCase(na)==true){
				index=j;
			}
			j++;
		}
	}
	void reciveRate(int n,int no){
		rate[n]=no;
		recived_rating(n,no);
	}
	void list(){
		int i=0;
		while(i<3){

			System.out.println(video[i]+" "+flag[i]);
			i++;
		}
	}
}
