package ch21_network;
import java.io.*;
import java.awt.*;
import java.net.*;
import java.util.*;

@SuppressWarnings("serial")
public class MiddleServer extends Frame{
	//����
	public TextArea ta1;
	
	//������
	public MiddleServer(){
		setTitle("ä�ù� ������");//â����
		
		this.add("Center",ta1=new TextArea());
		ta1.setFont(new Font("Dailog",Font.BOLD,15));
		ta1.setEditable(false);//�������ϰ� 
	}//cons end
	
	//�޼���
	
	//main
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("�Է� ��� ����, ����=>java ��Ű���̸�.MiddleServer ��Ʈ��ȣ");
//			System.out.println("�Է� ��� ����, ����=>java ch21_network.MiddleServer ��Ʈ��ȣ");
			System.exit(0);//���α׷� ���� 
		}//if
		//��Ʈ 0~65535, �չ�ȣ�� �̹� ������� , �츮�� 5555 ����� ���� 
		
		MiddleServer f=new MiddleServer();
		f.setSize(500,500);
		f.setVisible(true);
		
		int i=1;//������ �ο� ���� ���� 
		try{
			ServerSocket ss=new ServerSocket(Integer.parseInt(args[0]));
			System.out.println("���� ������ (^.^)");
			
			while(true){
				Socket sock=ss.accept();//Ŭ���̾�Ʈ ������ �޾Ƽ�, ���Ͽ��� ��Ų��
				f.ta1.append(i+"��° �մ��� �湮 ����\t"+sock+"\n");
				new Handler(sock, i, f.ta1).start();
				i++;//�ο� ����
			}//while
		}catch(Exception ex){}
		
	}//main
}//class
//------------------------------------------
class Handler extends Thread{
	//����
	private int number;//�ο��� ��������
	@SuppressWarnings("rawtypes")
	static private Vector vec=new Vector();
	private TextArea ta;
	
	private Socket sock;
	private DataInputStream in;
	private DataOutputStream out;
	
	//������
	public Handler(Socket s,int num, TextArea ta1) throws Exception{
		number=num;  //���������� �Ű����� �̸��� �޶� this���� �����ߴ� 
		sock=s;
		ta=ta1;
		in=new DataInputStream(sock.getInputStream());
		out=new DataOutputStream(sock.getOutputStream());
	}//cons end

	//run() �������̵�
	@SuppressWarnings("unchecked")
	public void run(){
		try{
			vec.add(this);//����(this) �����ڸ� vec�� �ִ´�
			
			while(true){
				String msg=in.readUTF();//Ŭ�����̾�Ʈ�� ������ ������ �޴´�
				toMsg(msg);//�޼��� ȣ�� , �� �޼ҵ忡�� ��� Ŭ���̾�Ʈ���� msg�� �ѷ��ش�
			}//while
		}catch(Exception ex2){
			ta.append(number+"��° �մ��� ��� �Ͽ����ϴ�");
			toMsg(number+" ���մ��� ���� �Ͽ����ϴ�");//��� Ŭ���̾�Ʈ ���� ������
			vec.remove(this);//����� ����� vec���� ���� 
			
			try{
				sock.close();//���� ����� Ŭ���̾�Ʈ ������ ���´� 
			}catch(IOException ie){
				System.out.println("���� �ݴ��� ���� �߻� :"+ie);
			}
		}//catch
	}//run
	
	//����� ���� �޼��� 
	//�޼���: Ŭ���̾�Ʈ�� ��ȭ ���� ������ �޼��� 
	@SuppressWarnings("rawtypes")
	private void toMsg(String msg){
		synchronized (vec) {
			Enumeration en=vec.elements();//Ŭ���̾�Ʈ�� ������ 
			while(en.hasMoreElements()){
				
				Handler temp=(Handler)en.nextElement();
				try{
					temp.out.writeUTF(msg);//Ŭ���̾�Ʈ�� ������
				}catch(IOException ie){
					
					try{
						sock.close();
					}catch(IOException ie2){}
					
					System.out.println("Ŭ���̾�Ʈ�� �޽����� ����ϴ��� ���� �߻� :"+ie);
				}//catch
			}//while end
		}//synchronized  
	}//toMsg()
	
}//class