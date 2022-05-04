# Maplestory-Keystroke-Display
Displays key presses with skill icons for OBS display or whatever streaming/recording tool you use. Doesn't really need to be for maple in particular as long as you know how to change the keys icons
![image](https://user-images.githubusercontent.com/52558820/166712788-f0e055eb-b65b-458a-a285-b6b696f270e5.png)

Edit the images inside here accordingly, please don't change the names of the pictures unless you are editting the source code (I know my code is terrible.)
![image](https://user-images.githubusercontent.com/52558820/166713631-ede3c288-f3a2-41d7-9558-3bab249402ef.png)

Edit the Keystatus class file to filter out keys that are not meant to be displayed (0 = Don't Display / 1 = Display)
![image](https://user-images.githubusercontent.com/52558820/166714014-c3db26cc-9190-4f79-bdd2-5bd22906bf94.png)

Follow these default settings (Eclipse IDE)
![Settings](https://user-images.githubusercontent.com/52558820/166714784-952f80d2-f65c-4c03-afdf-0c391beb6f78.png)

I used an IDE (Eclipse) to export into a JAR (Runnable) format. Remember to check for compatibility JDK version when running this, mine was 1.8.0_311.

Use the exported JAR files to replace the default one in the Example Folder, and run using the bat file. (Applications like these require the administrative rights, otherwise it can't detect keystrokes while being in other windows)

You can run the JAR inside the Example folder to see if the application suits your needs before attempting to edit the source code for yourself.

I  will try to update any of my crappy code if i encounter them.
