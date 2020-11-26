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
	/*for(Node a:seta.values()) {
		System.out.println(a.x+" "+a.y);*/
	}
}
class Hitlev2 extends hitwicket{
	public static void main(String args[]) {
		hitwicket obj=new hitwicket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 2 character int chess with pos for team A as H1/H2:pos of x and y");
		String h1a=sc.nextLine();
		String h2a=sc.nextLine();
		String h1aa[]=h1a.split(":");
		String h2aa[]=h2a.split(":");
		String mat2[][]=obj.mat;
		int x1=Integer.parseInt(String.valueOf(h1aa[1].charAt(0)));
		int y1=Integer.parseInt(String.valueOf(h1aa[1].charAt(1)));
		if(mat2[x1][y1]!=null)
			System.out.println("Invalid input try again");
		else
			mat2[x1][y1]="A-H1";
		int x2=Integer.parseInt(String.valueOf(h1aa[1].charAt(0)));
		int y2=Integer.parseInt(String.valueOf(h1aa[1].charAt(1)));
		if(mat2[x2][y2]!=null)
			System.out.println("Invalid input try again");
		else
			mat2[x2][y2]="A-H2";
		
		
		System.out.println("Input 2 character int chess with pos for team B as H1/H2:pos of x and y");
		String h1b=sc.nextLine();
		String h2b=sc.nextLine();
		String h1ba[]=h1a.split(":");
		String h2ba[]=h2a.split(":");
		int x1b=Integer.parseInt(String.valueOf(h1ba[1].charAt(0)));
		int y1b=Integer.parseInt(String.valueOf(h2ba[1].charAt(1)));
		if(mat2[x1b][y1b]!=null)
			System.out.println("Invalid input try again");
		else
			mat2[x1b][y1b]="B-H1";
		int x2b=Integer.parseInt(String.valueOf(h1ba[1].charAt(0)));
		int y2b=Integer.parseInt(String.valueOf(h2ba[1].charAt(1)));
		if(mat2[x2b][y2b]!=null)
			System.out.println("Invalid input try again");
		else
			mat2[x2][y2]="B-H2";
		
		seta.put("H1",new Node(x1,y1));
		seta.put("H2",new Node(x2,y2));
		
		setb.put("H1",new Node(x1b,y1b));
		setb.put("H2",new Node(x2b,y2b));
		
		
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
				if(player.equals("H1")) {
					if(ipaa[1].equals("L")) {
						newx=xpos;
						newy=ypos-2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
					else if(ipaa[1].equals("R")) {
						newx=xpos;
						newy=ypos+2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
					else if(ipaa[1].equals("U")) {
						newx=xpos-2;
						newy=ypos;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
						newx=xpos+2;
						newy=ypos;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
				if(player.equals("H2")) {
					if(ipaa[1].equals("FL")) {
						newx=xpos+2;
						newy=ypos-2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
					else if(ipaa[1].equals("FR")) {
						newx=xpos+2;
						newy=ypos+2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
					else if(ipaa[1].equals("BL")) {
						newx=xpos-2;
						newy=ypos-2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))) {
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
					if(ipaa[1].equals("BR")) {
						newx=xpos-2;
						newy=ypos+2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=0;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								seta.put(player,new Node(newx,newy));
								setb.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))){
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
					
					
				}
			
			
			
			else if(flag==1){
				System.out.println("Next Move for A");
				String ipa=sc.nextLine();
				System.out.println(ipa);
				String ipaa[]=ipa.split(":");
				System.out.println(ipaa[0]+" "+ipaa[1]);
				String player=ipaa[0];
				int newx=-1;
				int newy=-1;
				int xpos=setb.get(player).x;
				int ypos=setb.get(player).y;
				System.out.println(xpos+" "+ypos);
				if(player.equals("H1")) {
				if(ipaa[1].equals("L")) {
					newx=xpos;
					newy=ypos-2;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalid input");
					else
					{
						if(mat[newx][newy]!=null && ( mat[newx][newy].equals("A-H1") || mat[newx][newy].equals("A-H2")  || mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
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
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-H1") || mat[newx][newy].equals("B-H2")  || mat[newx][newy].equals("B-p1") ||mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3")||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
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
					newy=ypos+2;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-H1") || mat[newx][newy].equals("A-H2")  ||mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
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
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-H1") || mat[newx][newy].equals("B-H2")  ||mat[newx][newy].equals("B-p1") ||mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3")||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
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
							setb.put(player,new Node(newx,newy));
						}
						
												
					}
				}
				if(ipaa[1].equals("B")) {
					newx=xpos+2;
					newy=ypos;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalid input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-H1") || mat[newx][newy].equals("A-H2")  || mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
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
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-H1") || mat[newx][newy].equals("B-H2")  ||mat[newx][newy].equals("B-p1") ||mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3")||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
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
					newx=xpos-2;
					newy=ypos;
					if(newx<0 || newy<0 || newx>=5 || newy>=5)
						System.out.println("Invalind input");
					else
					{
						if(mat[newx][newy]!=null && (mat[newx][newy].equals("A-H1") || mat[newx][newy].equals("A-H2")  || mat[newx][newy].equals("A-p1") || mat[newx][newy].equals("A-p2") || mat[newx][newy].equals("A-p3") ||mat[newx][newy].equals("A-p4") || mat[newx][newy].equals("A-p5"))) {
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
						else if(mat[newx][newy]!=null && (mat[newx][newy].equals("B-H1") || mat[newx][newy].equals("B-H2")  || mat[newx][newy].equals("B-p1") ||mat[newx][newy].equals("B-p2") || mat[newx][newy].equals("B-p3")||mat[newx][newy].equals("B-p4") || mat[newx][newy].equals("B-p5"))) {
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
				
				if(player.equals("H2")) {
					if(ipaa[1].equals("FL")) {
						newx=xpos+2;
						newy=ypos-2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=1;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								setb.put(player,new Node(newx,newy));
								seta.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))) {
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
					else if(ipaa[1].equals("FR")) {
						newx=xpos+2;
						newy=ypos+2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=1;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								setb.put(player,new Node(newx,newy));
								seta.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))) {
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
					if(ipaa[1].equals("BL")) {
						newx=xpos-2;
						newy=ypos-2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=1;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								setb.put(player,new Node(newx,newy));
								seta.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))) {
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
					if(ipaa[1].equals("BR")) {
						newx=xpos-2;
						newy=ypos+2;
						if(newx<0 || newy<0 || newx>=5 || newy>=5)
							System.out.println("Invalid input");
						else
						{
							if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("A-H1") || mat2[newx][newy].equals("A-H2") ||
									mat2[newx][newy].equals("A-p1") || mat2[newx][newy].equals("A-p2") ||
									mat2[newx][newy].equals("A-p3") || mat2[newx][newy].equals("A-p4")|| mat2[newx][newy].equals("A-p5"))){
								String remplayer=mat2[newx][newy];
								mat2[newx][newy]=player;
								mat2[xpos][ypos]=null;
								flag=1;
								for(int i=0;i<5;i++) {
									for(int j=0;j<5;j++) {
										System.out.print(mat2[i][j]+" ");
									}
									System.out.println();
								}
								setb.put(player,new Node(newx,newy));
								seta.remove(remplayer);
							}
							else if(mat2[newx][newy]!=null && (mat2[newx][newy].equals("B-H1") || mat2[newx][newy].equals("B-H2") ||
									mat2[newx][newy].equals("B-p1") || mat2[newx][newy].equals("B-p2") ||
									mat2[newx][newy].equals("B-p3") || mat2[newx][newy].equals("B-p4")|| mat2[newx][newy].equals("B-p5"))) {
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
}

