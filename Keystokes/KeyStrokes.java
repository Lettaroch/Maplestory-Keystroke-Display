import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.net.URL;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

/**
 * @author javaQuery
 * Global Keyboard Listener
 */
public class KeyStrokes implements NativeKeyListener {
	
	static JLabel someLabel;
	static JFrame myJFrame;
	static String key_type = "";
	static int file_location = 0;
	static Icon userIcon;
	static boolean run = true; //pause variable
	static int lazy_counter = 1;
	Keystatus current_status = new Keystatus();
	static URL url2 = null;
	
    /* Key Pressed */
     public void nativeKeyPressed(NativeKeyEvent e){
    	 file_location = 0;
        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
      //Direction Keys 1
        if (e.getKeyCode() == NativeKeyEvent.VC_UP && current_status.UpArrow == 1) {
            System.out.println("Up Arrrow-Key is pressed!");
            file_location = 1;
            key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
        } else if (e.getKeyCode() == NativeKeyEvent.VC_DOWN && current_status.DownArrow == 1) {
            System.out.println("Down Arrrow-Key is pressed!");
            file_location = 1;
            key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
        } else if (e.getKeyCode() == NativeKeyEvent.VC_LEFT && current_status.LeftArrow == 1) {
            System.out.println("Left Arrrow-Key is pressed!");
            file_location = 1;
            key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
        } else if (e.getKeyCode() == NativeKeyEvent.VC_RIGHT && current_status.RightArrow == 1) {
            System.out.println("Right Arrrow-Key is pressed!");
            key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
            file_location = 1;
        } 
        //Alphabets 2
        else if (e.getKeyCode() == NativeKeyEvent.VC_A && current_status.A_Key == 1) {
            System.out.println("A-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_B  && current_status.B_Key == 1) {
            System.out.println("B-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_C  && current_status.C_Key == 1) {
            System.out.println("C-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_D  && current_status.D_Key == 1) {
            System.out.println("D-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_E && current_status.E_Key == 1) {
            System.out.println("E-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_F && current_status.F_Key == 1) {
            System.out.println("F-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_G && current_status.G_Key == 1) {
            System.out.println("G-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_H && current_status.H_Key == 1) {
            System.out.println("H-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_I && current_status.I_Key == 1) {
            System.out.println("I-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_J && current_status.J_Key == 1) {
            System.out.println("J-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_K && current_status.K_Key == 1) {
            System.out.println("K-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_L && current_status.L_Key == 1) {
            System.out.println("L-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_M && current_status.M_Key == 1) {
            System.out.println("M-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_N && current_status.N_Key == 1) {
            System.out.println("N-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_O && current_status.O_Key == 1) {
            System.out.println("O-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        }else if (e.getKeyCode() == NativeKeyEvent.VC_P && current_status.P_Key == 1) {
            System.out.println("P-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        }else if (e.getKeyCode() == NativeKeyEvent.VC_Q && current_status.Q_Key == 1) {
            System.out.println("Q-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_R && current_status.R_Key == 1) {
            System.out.println("R-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_S && current_status.S_Key == 1) {
            System.out.println("S-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_T && current_status.T_Key == 1) {
            System.out.println("T-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_U && current_status.U_Key == 1) {
            System.out.println("U-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_V && current_status.V_Key == 1) {
            System.out.println("V-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_W && current_status.W_Key == 1) {
            System.out.println("W-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_X && current_status.X_Key == 1) {
            System.out.println("X-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_Y && current_status.Y_Key == 1) {
            System.out.println("Y-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 2;
        } else if (e.getKeyCode() == NativeKeyEvent.VC_Z && current_status.Z_Key == 1) {
            System.out.println("Z-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 2;
        }
        
        //Number Keys 3
        else if (e.getKeyCode() == NativeKeyEvent.VC_0 && current_status.TypeWriter0 == 1) {
            System.out.println("0-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_1 && current_status.TypeWriter1 == 1) {
            System.out.println("1-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_2 && current_status.TypeWriter2 == 1) {
            System.out.println("2-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_3 && current_status.TypeWriter3 == 1) {
            System.out.println("3-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());  
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_4 && current_status.TypeWriter4 == 1) {
            System.out.println("4-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());  
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_5 && current_status.TypeWriter5 == 1) {
            System.out.println("5-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_6 && current_status.TypeWriter6 == 1) {
            System.out.println("6-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_7 && current_status.TypeWriter7 == 1) {
            System.out.println("7-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_8 && current_status.TypeWriter8 == 1) {
            System.out.println("8-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_9 && current_status.TypeWriter9 == 1) {
            System.out.println("9-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 3;
        }
        
        //Main Function 4
        else if (e.getKeyCode() == NativeKeyEvent.VC_ALT && current_status.TypeWriterAlt == 1) {
            System.out.println("ALT-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_BACKSPACE && current_status.TypeWriterBackSpace == 1) {
            System.out.println("BackSpace-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());  
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_CAPS_LOCK && current_status.TypeWriterCapsLock == 1) {
            System.out.println("CapsLock-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());  
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_CONTROL && current_status.TypeWriterCtrl == 1) {
            System.out.println("Control-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());  
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_DELETE && current_status.TypeWriterDelete == 1) {
            System.out.println("Delete-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_END && current_status.TypeWriterEnd == 1) {
            System.out.println("End-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_HOME && current_status.TypeWriterHome == 1) {
            System.out.println("Home-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_INSERT && current_status.TypeWriterInsert == 1) {
            System.out.println("Insert-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_NUM_LOCK && current_status.TypeWriterNumLock == 1) {
            System.out.println("NumLock-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_PAGE_DOWN && current_status.TypeWriterPageDown == 1) {
            System.out.println("PageDown-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_PAGE_UP && current_status.TypeWriterPageUp == 1) {
            System.out.println("Page_Up-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_PAUSE && current_status.TypeWriterPauseBreak == 1) {
            System.out.println("PauseBreak-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_PRINTSCREEN && current_status.TypeWriterPrintScreen == 1) {
            System.out.println("PrintScreen-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_SCROLL_LOCK && current_status.TypeWriterScrollLock == 1) {
            System.out.println("Scroll Lock-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_SHIFT && current_status.TypeWriterShift == 1) {
            System.out.println("Shift-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_TAB && current_status.TypeWriterTab == 1) {
            System.out.println("Tab-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 4;
        }
        
        //Function Keys 5
        else if (e.getKeyCode() == NativeKeyEvent.VC_F1 && current_status.F1_Key == 1) {
            System.out.println("F1-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F2 && current_status.F2_Key == 1) {
            System.out.println("F2-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F3 && current_status.F3_Key == 1) {
            System.out.println("F3-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F4 && current_status.F4_Key == 1) {
            System.out.println("F4-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F5 && current_status.F5_Key == 1) {
            System.out.println("F5-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F6 && current_status.F6_Key == 1) {
            System.out.println("F6-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F7 && current_status.F7_Key == 1) {
            System.out.println("F7-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode());
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F8 && current_status.F8_Key == 1) {
            System.out.println("F8-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F9 && current_status.F9_Key == 1) {
            System.out.println("F9-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F10 && current_status.F10_Key == 1) {
            System.out.println("F10-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F11 && current_status.F11_Key == 1) {
            System.out.println("F11-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_F12 && current_status.F12_Key == 1) {
            System.out.println("F12-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 5;
        }
        
        //Icons Symbols 6
        else if (e.getKeyCode() == NativeKeyEvent.VC_BACK_SLASH && current_status.TypeWriterBackSlash == 1) {
            System.out.println("BackSlash-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_QUOTE && current_status.TypeWriterClosedComma == 1) {
            System.out.println("DoubleQuote-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_COMMA && current_status.TypeWriterComma == 1) {
            System.out.println("Comma-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_PERIOD && current_status.TypeWriterFullStop == 1) {
            System.out.println("Full Stop-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_OPEN_BRACKET && current_status.TypeWriterLeftBracket == 1) {
            System.out.println("Left Bracket-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_CLOSE_BRACKET && current_status.TypeWriterRightBracket == 1) {
            System.out.println("Right Bracket-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_MINUS && current_status.TypeWriterMinus == 1) {
            System.out.println("Minus-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_EQUALS && current_status.TypeWriterPlus == 1) {
            System.out.println("BackSlash-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_SLASH && current_status.TypeWriterSlash == 1) {
            System.out.println("Slash-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_SEMICOLON && current_status.TypeWriterSemiColon == 1) {
            System.out.println("SemiColon-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }
        else if (e.getKeyCode() == NativeKeyEvent.VC_BACKQUOTE && current_status.TypeWriterTilde == 1) {
            System.out.println("Tilde-Key is pressed!");
			key_type = NativeKeyEvent.getKeyText(e.getKeyCode()); 
			file_location = 6;
        }

     }
    public static void main(String[] args) throws Exception{
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.exit(1);
        }
        
        GlobalScreen.addNativeKeyListener(new KeyStrokes());
        myJFrame = new JFrame("MapleStory Keyboard Display");
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setPreferredSize(new Dimension(400, 300));
        myJFrame.pack();
        myJFrame.setLocationRelativeTo(null);
        myJFrame.setVisible(true);

        JLabel someLabel = new JLabel(userIcon);
        
        myJFrame.add(someLabel);
        ImageIcon StartingIcon = new ImageIcon(KeyStrokes.class.getResource(
                "/Skill_Images/base_img.png"));
		someLabel.setIcon(StartingIcon);
        SwingUtilities.invokeLater(new Runnable() { 
            @Override
            public void run() {
                if(run){ //if not paused
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while(run){ //loop
                           	 try {
       							Thread.sleep(5);
       						} catch (InterruptedException e) {
       							// TODO Auto-generated catch block
       							e.printStackTrace();
       						}
                           	 	String flat_filelocation = "";

                           	 	if (file_location == 1) {
                           	 		flat_filelocation = "Skill_Images/Arrow Keys/";
                               	 	String image_path = flat_filelocation + key_type + ".png";
                               	 	url2 = KeyStrokes.class.getResource(image_path);
                           	 	}
                           	 	else if (file_location == 2) {
                           	 		flat_filelocation = "Skill_Images/Alphabets/";
                               	 	String image_path = flat_filelocation + key_type.toLowerCase() + ".png";
                               	 	url2 = KeyStrokes.class.getResource(image_path);
                           	 	}
                           	 	
                           	 	else if (file_location == 3) {
                           	 		flat_filelocation = "Skill_Images/Number Keys/";
                               	 	String image_path = flat_filelocation + key_type + ".png";
                               	 url2 = KeyStrokes.class.getResource(image_path);
                           	 	}
                           	 	else if (file_location == 4) {
                           	 		flat_filelocation = "Skill_Images/Main Functions/";
                               	 	String image_path = flat_filelocation + key_type + ".png";
                               	 	url2 = KeyStrokes.class.getResource(image_path);
                           	 	}
                           	 	else if (file_location == 5) {
                           	 		flat_filelocation = "Skill_Images/Function Keys/";
                               	 	String image_path = flat_filelocation + key_type + ".png";
                               	 	url2 = KeyStrokes.class.getResource(image_path);
                           	 	}
                           	 	else if (file_location == 6) {
                           	 		flat_filelocation = "Skill_Images/Icons/";
                               	 	String image_path = flat_filelocation + key_type + ".png";
                               	 	url2 = KeyStrokes.class.getResource(image_path);
                           	 	}
                           	 	if (url2 == null ) {
                               	 	ImageIcon XyIcon = new ImageIcon(KeyStrokes.class.getResource(
                                            "/Skill_Images/base_img.png"));
    								someLabel.setIcon(XyIcon);
                           	 	}
                           	 	else {
                               	 	ImageIcon XyIcon = new ImageIcon(url2);
    								someLabel.setIcon(XyIcon);
                           	 	}


                                
                            }
                        }
                    }).start();
                }
                
            }
        });

        

    }
}
