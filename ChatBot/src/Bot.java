import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Bot extends JFrame {

	
	private JTextField txtEnter = new JTextField();
	

	private JTextArea txtChat = new JTextArea();
	
	public Bot() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Java AI");
		
		
		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590, 30);
		
		
		txtEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String uText = txtEnter.getText();
				txtChat.append("You: " + uText + "\n");
				
				if(uText.contains("hi")){
					botSay("Hello there!");                            
				}
                                else if(uText.contains("best engineering colleges in karnataka")){
					botSay("1.NITK"+"\n"+ "2.RVCE"+"\n"+
                                                 " 3.PES\n 4.BMS\n Which college information do you want");
                                }
                                 else if(uText.contains("1")){
					botSay("NAME:NITK\n Place:Mangaluru\n NIRF Ranking:22"); 
                                 }
                                         else if(uText.contains("2")){
					botSay("NAME:RVCE\n Place:Bengaluru\n NIRF Ranking:58"); 
                                         }
                                         else if(uText.contains("3")){
					botSay("NAME:PES\n Place:Bengaluru\n NIRF Ranking:87"); 
                                         }
                                         else if(uText.contains("4")){
					botSay("NAME:BMS\n Place:Bengaluru\n NIRF Ranking:67"); 
                                         }
                                            
				
                                else if(uText.contains("help")){
					botSay("Definitly , what help?");                            
				}
                                else if(uText.contains("thanks")){
					botSay("My pleasure");                            
				}                            
				else if(uText.contains("how are you")){
					int decider = (int) (Math.random()*2+1);
					if(decider == 1){
						botSay("I'm doing well, thanks");
					}
					else if(decider == 2){
						botSay("Not too bad");
					}
				}
				else{
					int decider = (int) (Math.random()*3+1);
					if(decider == 1){
						botSay("I didn't get that");
					}
					else if(decider == 2){
						botSay("Please rephrase that");
					}
					else if(decider == 3){
						botSay("???");
					}
				}
				txtEnter.setText("");
			}
		});
		
	
		txtChat.setLocation(15, 5);
		txtChat.setSize(560, 510);
		txtChat.setEditable(false);
		
		
		this.add(txtEnter);
		this.add(txtChat);
	}
	
	public void botSay(String s){
		txtChat.append("Alice: " + s + "\n");
	}
	
	public static void main(String[] args){
		new Bot();
	}

}