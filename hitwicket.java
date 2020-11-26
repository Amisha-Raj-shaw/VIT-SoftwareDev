import java.io.*;
import java.util.*;
import java.lang.*;
class  Node{
	 int x;
	 int y;
	 public Node(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class hitwicket {
	static String mat[][];
	static HashMap<String,Node> seta;
	static HashMap<String,Node> setb;
	public static void main(String args[]) {
		mat=new String[5][5];
		Scanner sc=new Scanner(System.in);
		String ip1=sc.nextLine();
		String ip11[]=ip1.split(",");
		 seta=new HashMap<>();
		 setb=new HashMap<>();
		for(int i=0;i<5;i++){
			String a="A-"+ip11[i];
			mat[0][i]=a;
			seta.put(ip11[i],new Node(0,i));
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		String ip2=sc.nextLine();
		String ip12[]=ip2.split(",");
		for(int i=0;i<5;i++){
			String b="B-"+ip12[i];
			mat[4][i]=b;
			setb.put(ip12[i],new Node(4,i));
			
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int flag=0;
		while(!seta.isEmpty() || !setb.isEmpty()) {
			if(flag==0){
				System.out.println("Next Move for A");
				String ipa=sc.nextLine();
				System.out.println(ipa);
				String ipaa[]=ipa.split(":");
				System.out.println(ipaa[0]+" "+ipaa[1]);
				String player=ipaa[0];
				int newx=-1;
				int newy=-1;
				int xpos=seta.get(player).x;
				int ypos=seta.get(player).y;
				System.out.println(xpos+" "+ypos);
				if(ipaa[1].equals("L")) {
					newx=xpos;
					newy=ypos-1;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalid input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
							setb.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") ||mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3")||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=0;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
						}
						
												
					}
				}
				if(ipaa[1].equals("R")) {
					newx=xpos;
					newy=ypos+1;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
							setb.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") ||mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3")||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=0;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
						}
						
												
					}
				}
				if(ipaa[1].equals("B")) {
					newx=xpos+1;
					newy=ypos;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalid input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
							setb.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") ||mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3")||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=0;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
						}
						
												
					}
				}
				
				if(ipaa[1].equals("U")) {
					newx=xpos-1;
					newy=ypos;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
							setb.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") ||mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3")||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=0;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							seta.put(player,new Node(newx,newy));
						}
						
												
					}
				}
			}
				
			else if(flag==1){
				System.out.println("Next Move for B");
				String ipa=sc.nextLine();
				String ipaa[]=ipa.split(":");
				String player=ipaa[0];
				int newx=-1;
				int newy=-1;
				int xpos=setb.get(player).x;
				int ypos=setb.get(player).y;
				if(ipaa[1].equals("L")) {
					newx=xpos;
					newy=ypos-1;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") ||mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
							seta.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=1;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
						}
						
												
					}
				}
				if(ipaa[1].equals("R")) {
					newx=xpos;
					newy=ypos+1;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") ||mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
							seta.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=1;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
						}
						
												
					}
				}				
				if(ipaa[1].equals("B")) {
					newx=xpos+1;
					newy=ypos;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") ||mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
							seta.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=1;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
						}
						
												
					}
				}
				
				if(ipaa[1].equals("U")) {
					newx=xpos-1;
					newy=ypos;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") ||mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
							String remplayer=mat[newx][newy];
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=1;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
							seta.remove(remplayer);
						}
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-p1") || mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3") ||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
							System.out.println("Invalid Move choose again");
							flag=1;
						}
						else {
							mat[newx][newy]=player;
							mat[xpos][ypos]=null;
							flag=0;
							for(int i=0;i<5;i++) {
								for(int j=0;j<5;j++) {
									System.out.print(mat[i][j]+" ");
								}
								System.out.println();
							}
							setb.put(player,new Node(newx,newy));
						}
						
												
					}
				}
			}
		}

	}
}
