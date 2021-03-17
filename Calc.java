// calculator project ..............
//package swings;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
//import javax.swing.*;
public class Calc {
	static double first = 0,second=0,total=0;
	static int op=0,auto=0,equal=0,sop=0;
	static String [] autoReplay=new String[20];
	
	Calc()
	 {
		int y=0, x=0;
		int z=120,v=0;
		//int m=0;
	Frame fr=new Frame("Calculator");
	fr.setVisible(true);
	fr.setLayout(null);
	fr.setBounds(100,50,900,600);
	fr.addWindowListener(new WindowAdapter()
	{
	public void windowClosing(WindowEvent we){fr.dispose();}
	});

	String []s={ "+/-","7" ,"8","9","/","Auto R.","x^           (1/2)","4","5","6","*","%","x^2","1","2","3","+","-","1/x","0","00",".","=","C"};
	String Number;
	
	char[] ch=new char[15];
	TextField t=new TextField("0");
	t.setBounds(200,150,540,70);
	fr.add(t);
	Button [] b=new Button[s.length];
	
	for (int i = 0; i < s.length; i++) {
	    		b[i] = new Button(s[i]);
	}

	for (int i = 0; i < s.length; i++) {
	
			if(i%6==0) {
				y=y+60;
				z=0;
			}
			z++;						
			b[i].setBounds(130+90*z,200+y,70,40);
	    fr.add(b[i]);
	b[i].addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){
    	int m=0;
    	String s=e.getActionCommand();
    	String num="";
    	
    		if(s.equals("1")) {
    			if(t.getText().equals("0")  || op!=0)    				
    				num="1";
    			else
    				num=t.getText()+"1";    			
    			t.setText((num));  
    			
    		}
    		else if(s.equals("2"))
    		{  
    			if(t.getText().equals("0")  || op!=0)    				
        			num="2";
        			else
        				num=t.getText()+"2";    			
        			t.setText((num));  
    		}
    		else if(s.equals("3"))
    		{  
    			if(t.getText().equals("0") || op!=0)    				
        			num="3";
        			else
        				num=t.getText()+"3";    			
        			t.setText((num));  
    		}  
    		else if(s.equals("4"))
    		{  if(t.getText().equals("0") || op!=0)    				
    			num="4";
    			else
    				num=t.getText()+"4";    			
    			t.setText((num));    
    		}  
    		else if(s.equals("5"))
    		{  
    			if(t.getText().equals("0") || op!=0)    				
        			num="5";
        			else
        				num=t.getText()+"5";    			
        			t.setText((num));    
    		}  
    		else if(s.equals("6"))
    		{  
    			if(t.getText().equals("0") || op!=0)    				
        			num="6";
        			else
        				num=t.getText()+"6";    			
        			t.setText((num));    
    		}  
    		else if(s.equals("7"))
    		{  if(t.getText().equals("0") || op!=0)    				
    			num="7";
    			else
    				num=t.getText()+"7";    			
    			t.setText((num));    
    		}  
    		else if(s.equals("8"))
    		{  
    			if(t.getText().equals("0") || op!=0)    				
        			num="8";
        			else
        				num=t.getText()+"8";    			
        			t.setText((num));    
    		}
    		else if(s.equals("9"))
    		{  
    			if(t.getText().equals("0") || op!=0)    				
        			num="9";
        			else
        				num=t.getText()+"9";    			
        			t.setText((num));    
    		}
    		else if(s.equals("0"))
    		{      			
    			if(s.equals(t.getText()) || op!=0)  {
    				t.setText("0");
    			}
    			else {
    				
    			num=t.getText() + "0";
    				t.setText((num));
    			}
    		}
    		else if(s.equals("00"))
    		{  
    			if(t.getText().equals("0") || op!=0) {
    				t.setText("0");
    			}
    			else {
    				
    			num=t.getText() + "00";
    				t.setText((num));
    			}
    		}
    		else if(s.equals("."))
    		{  
    			num=t.getText() + ".";
    			t.setText((num));  
    		}
    		
    		else if(s.equals("+")) {
    			if(equal==0)  {
    				first=Double.parseDouble(t.getText());
    				equal=1;
    			}
    				
    			else
    			{    
    				//sop=1;
    				second=Double.parseDouble(t.getText());
    				first=first+second;    				    				
    			}
    			
    			t.setText(Double.toString(first));
    			num=t.getText() + "+";
    			op=1;
    			t.setText(num);
    			autoReplay[auto++]=num;
    			
    		}
    		else if(s.equals("=")) {
    			second=Double.parseDouble(t.getText());
    			if(op==1) {
    				total= first + second;    				
    			}
    			else if(op==2)
    				total= first - second;
    			else if(op==3)
    				total= first * second;
    			else if(op==4)
    				total= first / second;
    			else if(op==5)
    				total= first % second;
    			
    			
    			t.setText(Double.toString(total));
    			
    		}
    		else if(s.equals("-")) {
    			if(equal==0)  {
    				first=Double.parseDouble(t.getText());
    				equal=1;
    			}
    				
    			else
    			{    
    				//sop=1;
    				second=Double.parseDouble(t.getText());
    				if(second==0)
    					first=second- first;
    				else    					
    					first= first-second;
    				
    				t.setText(Double.toString(first));
    			}
    			
    			
    			
    			
    			//first=Double.parseDouble(t.getText());
    			num=t.getText() + "-";
    			op=2;
    			t.setText(num);
    			autoReplay[auto++]=num;
    		}
    		else if(s.equals("/")) {    			
    			first=Double.parseDouble(t.getText());
    			num=t.getText() + "/";
    			op=4;
    			t.setText(num);
    			autoReplay[auto++]=num;
    		}
    		else if(s.equals("*")) {    			
    			first=Double.parseDouble(t.getText());
    			num=t.getText() + "*";
    			op=3;
    			t.setText(num);
    			autoReplay[auto++]=num;
    		}
    			
    		else if(s.equals("%")) {    			
    			first=Double.parseDouble(t.getText());
    			num=t.getText() + "%";
    			op=5;
    			t.setText(num);    		
    			autoReplay[auto++]=num;
    		}
    		else if(s.equals("C")) {  
    			total=first=second=0;
    			t.setText("0");    			
    		}
    		else if(s.equals("x^2")) {
    			total=Double.parseDouble(t.getText());
    			total=total*total;
    			t.setText(Double.toString(total));
    		}
    		else if(s.equals("1/x")) {
    			total=Double.parseDouble(t.getText());
    			total=1/total;
    			t.setText(Double.toString(total));
    		}
    		else if(s.equals("x^(1/2)")) {
    			total=Double.parseDouble(t.getText());
    			total=Math.sqrt(total);
    			t.setText(Double.toString(total));
    		}
    		else if(s.equals("+/-")) {
    			total=Double.parseDouble(t.getText());
    			total=-total;
    			t.setText(Double.toString(total));
    		}
    		else if(s.equals("Auto R.")) {
    			 
    		
    				
    			
    				for(int i=0;i<autoReplay.length;i++) {    				
    					t.setText(autoReplay[i]);
    					try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e1) {							
							e1.printStackTrace();
						}
    				}
    			
    		}
        }  
    });  
	}
	
	
//	public void actionPerformed(ActionEvent a) {
			
	//}
	}
	public static void main(String[] args) { 
		new Calc();
	}	

}
      