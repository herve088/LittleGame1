
/**
 *Game 
 */
import java.util.Scanner;
import java.util.Random;

public class Game{

	private static int choice;
	private static int size ;
	private static int count ;
	private static int wins ;
	private static Scanner sc;

	public  Game(){
		sc = new Scanner(System.in);

		System.out.println("Hello,My name is Robot and you will be playing QuickMath.");//#on imprime
    // System.out.println("Ne vous inquiétez pas, je ne peux pas voir vos cartes ni leur ordre.");//#pour le rassurer sur le fait que le jeu est equitable et
     //System.out.println("Maintenant défaussez toutes les paires de votre main. Je vais le faire moi aussi.");//#pour lui expliquez ce quil doit faire
     System.out.println("Press Enter to continue");
     waitForUserInput();

     
//System.out.print("Entrez un chiffre SVP");
     System.out.println("choose a number of operation you want to do quickmath on");
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();//on definit num comme etant la valeur entree par lutilisateur
choice=num;
 System.out.println("Considering that  the numbers choosed will be in a range of that goes from zero to another number, choose the end of  the range you will do quickmath on");
		num = in.nextInt();
		size= num;
		

		//sc = new Scanner(System.in);
		//generator = new Random();

		
	}

	

	

	private static void waitForUserInput(){
		sc.nextLine();
	}

	private static int getValidInput(){

// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
Scanner in = new Scanner(System.in);
System.out.print("Entrer a number please");

int num = in.nextInt();//on definit num comme etant la valeur entree par lutilisateur
//while (num < 1){
//System.out.println(" invalid value");
//System.out.println("Please Enter a valid value");
//num = getValidInput();
//}


return num;
	
	}


	public static void playGame(){

		count=0;
	    int answer=0;
     //# COMPLETEZ CETTE FONCTION EN CONFORMITE AVEC LA DESCRIPTION CI-DESSUS
     
    // #no=len(donneur)#on nomme une variable no comme etant len(donneur)
     while (count<5){  //#on fait une boucle si les carte de lhumain ou du robot ne sont pas terminnes 
         System.out.print("Round" + " "+(count+ 1));//#on dit a lhumain que cest son tour 
         	java.util.Random generator = new java.util.Random();
         	int result=0;

         System.out.print("Your hand:");//#on lui montre 
         System.out.println();//#NB:  a chaque fois quon print() cest pour faire un espace (ligne vide )
         int first=generator.nextInt(size);
         int second=generator.nextInt(size);
         int operation=generator.nextInt(choice);

         if(operation==0){
         	result=first+second;
         	System.out.print(first + "+" + second + " ?");//
}

      else if(operation==1){
         	result=first-second;
         	System.out.print(first + "-" + second + " ?");//
}

       else if(operation==2){
         	result=first*second;
         	System.out.print(first + "*" + second + " ?");//
}

      else  if(operation==3){
         	result=first/second;
         	System.out.print(first + "+" + second + " ?");//
}



 answer=getValidInput();

if (answer==result){
	System.out.print("Good Job");//
	wins=wins+1;


}

else{
	System.out.print("Wrong answer");//

}

count++;

System.out.println();//#NB:  a chaque fois quon print() cest pour faire un espace (ligne vide )

         
       
 
 }
		
	}





	public static void main(String[] args){
	//StudentInfo.display();
	
		Game game = new Game();		

		game.playGame();
		

	
		
	}








	
}