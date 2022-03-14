
import java.util.Scanner;
import java.util.Random;

public class FirstGame{
	
	public static void main(String [] args){
		
		String menu="1:Defeat Goblins\n2:Defeat Dragons";
		int number = 0;
		Scanner user_input = new Scanner(System.in);
	
		System.out.println(" Welcome!! To Your Great Adventure!!!\n ");
		System.out.println("Please enter your name great adventurer!!: ");
		StringBuilder name =new StringBuilder(user_input.nextLine().toUpperCase());
	
		System.out.println(name + " --- Pick a number to choose your Adventure:\n " + menu);
		number = user_input.nextInt();
	
		switch(number)
		{
			case 1:
				System.out.println("You have chosen to defeat the goblins.\n");
				break;
				
			case 2:
				System.out.println("You have chosen to defeat the dragons.\n");
				break;
				
			default:
		}
		
		if(number != 1 && number != 2){
			System.out.println("ERROR");
		}
	
		if(number ==1){
		characterInfo();	
		goblinTrial();
			
		}else if(number ==2){
		characterInfo();
		dragonTrial();
		}
	}	
	
	
	public static void characterInfo()
	{
		String weapon ="1:Long Sword and Shield\n2:Bow and Arrow\n3:Spiked Club\n4:Dual Blades";
		int type=0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Before you start your quest, please pick out your type of weapon\n" + weapon);
		type = keyboard.nextInt();
		
			switch(type)
			{
				case 1:
					System.out.println( "Your weapons are the Long Sword and Shield.\n");
					break;		
					
				case 2:
					System.out.println( "Your weapon is the Bow and Arrow.\n");
					break;		
					
				case 3:
					System.out.println( "Your weapon is the Spiked Club.\n");
					break;
				
				case 4:
					System.out.println( "Your weapons are the Dual Blades.\n ");
					break;
				
				default:
			}
			if(type>4 || type <1){
			
			System.out.println("Error");
			System.exit(0);
			}
	}	
	
	
	public static void menu()
	{
		int dice =0;
		String diceMenu= "1:ROLL DICE\n2:QUIT";
		Scanner user_input = new Scanner(System.in);
		System.out.println("This game uses dice to make decisions. Pick to either roll the dice to travel or quit the game.\n" + diceMenu);
		dice = user_input.nextInt();
		
		if(dice == 2)
		{
			System.out.println("GAME OVER!!!! BYE");
			System.exit(0);
		}
		
		if(dice == 1)
		{
			roll();
		}	
	}	
	
	
	public static void roll()
	{
		int die1;
		int die2;
		int roll;
		
		Random random = new Random();
		die1 = random.nextInt(6) + 1;
		die2 = random.nextInt(6) + 1;
		roll = die1 * die2;
		
		System.out.println("The first die is " + die1 + "." + " The second die is " + die2 + ".");
		System.out.println("Total roll is " + roll+ ".\n");
		
		int count = 1;
		for( int i =roll; i<100;i++)
		{
			if(i %2 ==1){
				count +=1;
			}
		} 
		System.out.println("It took " + count + " days to travel to the area.\n"); 	
		
	}	
	

	public static void kingGoblin()
	{
		System.out.println("You run off deeper into the woods until you spot a trail of blood. You decide to follow it and you are led to the king goblin."
		+ "He is sitting down with his back towards you.He is wearing full body armour, his only weakness is his neck. You can see a small chink in his armour. " +
		"If you can attack him from here, you can easily kill him off without using up too much strength.");
		
		System.out.println(" You charge up your weapon and wait to strike.");
			
			int die3;

			Random random = new Random();
			die3 = random.nextInt(6) + 1;
			
			System.out.println(" ----GET READY TO ROLL THE DICE----\n ");
			System.out.println("Press \"ENTER\" to continue...");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			int i =0;
			for(i = 10; i>1;i--){
				System.out.print("......\n");
			}	
			
			System.out.println("You rolled a " + die3 + ".\n");
			
			if(die3>=0 && die3<=5){
				System.out.println("You charge up your weapon and dash forward ready to attack. Just as you are getting close enough to attack....... He suddenly lunges forward!!"
				+ " Your attack misses and the goblin spins kicks you in the chest and you slam into a tree, knocking your weapon out of your hand." + " The goblin starts to charge"
				+ " you and you are unable to move still dazed from the attack. The goblin is only a few feet away from you and you try to roll out of the way towards your weapon.\n");
			
				int die4;
				die4 = random.nextInt(6)+1;
				System.out.println(" ----GET READY TO ROLL THE DICE----\n ");
				System.out.println("Press \"ENTER\" to continue...");
				scanner.nextLine();
			
				for(i = 10; i>1;i--){
					System.out.print("......\n");
				}	
			
				System.out.println("You rolled a " + die4 + ".\n");
				
				if(die4>0 && die4<3)
				{	
					System.out.println(" You are not able to dodge out of the way quick enough and the goblin slams into you!! Casuing you to fly in the air and land in a tree"
					+ " 10 ft away. You cannot reach you weapon in the tree and you leg is twisted at an odd angle. Just as the king goblin makes it to the tree, the king goblin"
					+ " flys backward into a group of trees. The wounded warrior from earlier is there to help!!");
					
					System.out.println("He has come to help you. You watch as he dodges and attacks the king goblin. You hope that he can hold his own for the next 5 minutes."+
					"That is how long it takes for the healing spell to complete. Thankfully he is able to hold him off and you jump down just in time to catch" + 
					" the warrior becasue the king goblin knocked him back. You tell him to run and dive for your weapon, which you successfully grab!!"+
					" The warrior is able to escape. You kick up some dirt into the king goblin's eyes and he is unable to see. You run behind him and see the chink in his armour"+
					" This may be your last chance to attack him!!");
	
					Scanner keyboard = new Scanner(System.in);
					int attack= 0;
					
					String finalAttack = "1:Burst Attack\n2:Normal Attack";
					System.out.println("Hurry attack him nowwwww!!\n" + finalAttack);
					attack = keyboard.nextInt();
					
					if(attack ==1){
						System.out.println(" You charge up the last of your energy to release a burst attack which sends the king goblin's head flying off into the distance.");
					}
					if(attack == 2){
						System.out.println("You use the last of your energy to attack the king goblin which sends his head flying!!! It bounces off of a tree" +
						" and lands a couple feet away from you. His body thuds on the ground and you take a sigh of relief. You walk over to reteive it but a" +
						" fox jumps out from behind a tree and drags the head off into the darkness.");
					
					}
				
				}else{
					System.out.println("You dodge at the last minute!!! You are able to roll towards your weapon and retrieve it. The king goblin knocks himself out on the tree" +
					" and is dazed. You quickly rolled behind the king goblin and see the opening on the back of his armour.");
					
					Scanner keyboard = new Scanner(System.in);
					int attack= 0;
					
					String finalAttack = "1:Burst Attack\n2:Normal Attack";
					System.out.println("Hurry attack him nowwwww!!\n" + finalAttack);
					attack = keyboard.nextInt();
					
					if(attack ==1){
						System.out.println(" You charge up the last of your energy to release a burst attack which sends the king goblin's head flying....."
						+ " as well as half the forest...ooppps.");
					}
					if(attack == 2){
						System.out.println("You use the last of your energy to attack the king goblin which sends his head flying!!! It bounces off of a tree" +
						" and lands a couple feet away from you. His body thuds on the ground and you take a sigh of relief");
					
					}
				}	
			}
		
	}	
	
	
	public static void smallGoblins()
	{
		System.out.println("You reach the lair and spot the goblins sleeping outisde by  a campfire. You count at least 15 sleeping goblins. "+
		"You decide that the best way to attack "+ "is bomb the goblins first and take out the ones that escape." +
		" You get your bomb out and throw it into the campfire and it goes off burning 10 of the goblins!!\n");

			System.out.println(" Roll dice to see if you can attack the other 5 in time.");
			
			int die3;
			Random random = new Random();
			die3 = random.nextInt(6) + 1;
			
			System.out.println(" ----GET READY TO ROLL THE DICE----\n ");
			System.out.println("Press \"ENTER\" to continue...");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			int i =0;
			for(i = 10; i>1;i--){
				System.out.print("......\n");
			}	
			
			System.out.println("You rolled a " + die3 + ".\n");
			
			if( die3>=0 && die3<=3){
				System.out.println(" Success!! You attack was effective and you easily take out the smaller 5.\n");
			}else{
				System.out.println(" You run out from your hiding place to attack the remaining goblins. You are able to take out four of them but cannot spot the last one."+
				" You turn around just to get a club to the back. The goblin knocks you off your feet and straddles you as it tries to rip your helmet off.\n");
				
				System.out.println(" Roll dice to push it off you!!");
				System.out.println(" ----GET READY TO ROLL THE DICE----\n ");
				System.out.println("Press \"ENTER\" to continue...");
				scanner.nextLine();
				
				int die4;
				die4= random.nextInt(6) + 1;
				
				System.out.println("You rolled a " + die4 + ".\n");
				
				if( die4 >=0 && die4 <= 4){
					System.out.println( "You successfully knock the goblin off you and defeat it!!\n");
				}else{
					System.out.println("He is able to pry your helmet off and bites your ear off! You quickly shove it off you and repeatedly stomp it's head into to the ground.\n");
				}
			}	

	}


	public static void goblinTrial()
	{
		Scanner keyboard = new Scanner(System.in);
		int attack=0;
		
		System.out.println("You arrive to your home town and see it in shambles. You see dead animals,trampled fields,and burned buildings." + 
		" You head to the village elder and he tells you that a group of goblins attacked the village while you were away." + " You set out "+
		"to defeat the goblins.\n");
		
		System.out.println("One of the injured warriors comes and tell you that he found the goblins' cave 100 miles from town, "+ 
		"claiming that they will be back tonight. "+ "You must travel 100 miles to reach the cave.\n");
		menu();
		
		String attackMenu = "1:Attack small goblins first\n2:Attack King Goblin first\n3:Run Away";
		System.out.println("Before you leave ypu decide to plan your attack.You know that there is always a king goblin when there is a group of goblins."+
		"You have two ways to attack. You can either take out the king and then hunt down the other goblins or attack the smaller goblins " +
		 "and use that as a distraction to attack the king goblin.\n");
		
		System.out.println("How would you like to attack?\n" + attackMenu);
		attack=keyboard.nextInt();
		
		if(attack == 1)
		{
			smallGoblins();
			kingGoblin();
			System.out.println(" You defeated the small goblins and the king goblin. You are extremely tired and try to make it back to you village but faint on the way." +
			" You wake up in a tent, startled you lunge up to grab your weapon but it is not there. Suddenly the tent flap opens up and the wounded warrior from before is there."
			+ " He decided to turn back, only to find you in the woods passed out." + " You both return home and teh villagers allow you to rest while the wounded warrior leads"+
			" the town to repairing itself. Making sure to build a fennce or barrier of some sort to protect the town from now on.\n");
			System.out.println(" ##### YOU DEFEATED THE GOBLIN TRIAL #####");
		}
		if(attack == 2)
		{
			kingGoblin();
			smallGoblins();
			
			System.out.println(" You defeated the king goblin and the small goblins. You head home a hero and everyone welcomes you home." + " You decide" +
			" to celebrate later and start on rebuilding the village. Making sure to add a fence or barrier of some sort to protect the town from now on.\n");
			System.out.println(" ##### YOU DEFEATED THE GOBLIN TRIAL #####");
		}	
		if(attack == 3)
		{
			System.out.println( " You decided to run away. The goblins came back the next night as the wounded warrior said." + 
			" You and a few of the villagers are able to escape and must now look for a new home.");
			System.out.println("##### GAME OVER #####");
			System.exit(0);
		}	
	}
	
	
	public static void  dragonTrial()
	{
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		int dragons = 0;
		
		System.out.println("The dragons are laying siege on the nearby village.");
		System.out.println("You must travel 100 miles to reach the lair on foot.\n");
		menu();
		
		String attack ="1:Sneak Attack\n2:Jump Attack\n3:Run Away";
		System.out.println(" You reached the dragon's lair and spot three dragons. You duck behind a couple of jagged rocks.");
		System.out.println(" How would you like to attack the dragons?\n" + attack);
		dragons = keyboard.nextInt();
		
		if(dragons == 1){
			System.out.println( "You are able to carefully sneak up behind the dragons. You look between the bushes and see that they have still not noticed " +
			"you. You decide to charge up your weapon and attack the dragons. You only have one shot at this or they will all wake up and devour you." + 
			" With you dead ,the village will burn to the ground and the dragons will continue their rain of terror.\n");
			
			System.out.println(" You charge up your weapon and wait to strike.");
			
			int die3;

			Random random = new Random();
			die3 = random.nextInt(6) + 1;
			
			System.out.println(" ----GET READY TO ROLL THE DICE----\n ");
			System.out.println("Press \"ENTER\" to continue...");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			int i =0;
			for(i = 10; i>1;i--){
				System.out.print("......\n");
			}	
			
			System.out.println("You rolled a " + die3 + ".\n");
			
			if( die3>=0 && die3<=3){
				System.out.println(" Success!! You attacked at the right moment with the right amount of power to slay all three dragons in one blow!" +
				" Since you recieved no damage, you returned to the village with the dragons' heads and are welcomed home as a hero!\n");
				System.out.println("##### YOU BEAT THE DRAGON TRAIL #####");
			}else{
				System.out.println(" You wait patiently for your weapon to charge up just enough to attack the dragons. You feel something gently touch your check and you yelp! "+
				"You turn just in time to see that it was nothing more that a blade of grass moving in the wind.... but the dragons heard you and start to get up!!" + 
				" You hastily draw your weapon and attack. It was a long battle but you won!! You suffered 2 broken ribs, a black eye, and multiple cuts " +
				"and bruises on your legs and arms. You trudge your way to the village and are welcomed as a hero!!\n");
				System.out.println("##### YOU BEAT THE DRAGON TRIAL #####");
			}	
		}	
		
		if(dragons == 2){
			System.out.println("You decide to attack them head on. If you run up the rock that you are hiding behind, you will have a clear shot of the first dragon, "+
			"then quickly attack the other two dragons when you land. Nice and easy.... You decide to charge up your weapon. You only have one shot at this or they will"+
			" all wake up and devour you. With you dead ,the village will burn to the ground and the dragons will continue their rain of terror.\n");
			
			System.out.println(" You charge up your weapon and wait to strike.");
			
			int die3;

			Random random = new Random();
			die3 = random.nextInt(6) + 1;
			
			System.out.println(" ----GET READY TO ROLL THE DICE----\n ");
			System.out.println("Press \"ENTER\" to continue...");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			
			int i =0;
			for(i = 10; i>1;i--){
				System.out.print("......\n");
			}	
			
			System.out.println("You rolled a " + die3 + ".\n");
			
			if( die3>=0 && die3<5){
				System.out.println("Success!! Your attack worked perfectly. You ran up the rock and slammed down on the middle dragon's head." + " You alerted the other"+
				" two drgaons but you were able to quickly attack and kill the other dragons!!! You recieved no damage and returned to the village with the dragons' heads" 
				+ " and are welcomed home as a hero!\n");
				System.out.println("###### YOU BEAT THE DRAGON TRIAL ######");
			}else{
				System.out.println("You wait patiently for your weapon to charge up just enough to attack the dragons." + " You run up the rock but slip right near the end!!!"
				+ " You tumble over the edge of the rock and clumsily land on top of the middle dragon's head. They all wake up and start to attack you!!" + " The right dragon"
				+" drowsily claws at you, but you roll off the dragon causing it to slash at the middle dragon's neck, killing it instantly." + " You slash at the legs of "
				+"the right dragon causing it to stumble forward and impale itself on one of the jagged rocks you fell from. Lastly you defeat the last dragon in an " 
				+"intense battle.You suffered a sevred arm, a black eye, and mutiple cuts and bruises. You trudge your way to the village and are welcomed "+ "as a hero!!\n");
				System.out.println("##### YOU BEAT THE DRAGON TRIAL #####");
			}	
		}	
			
		if(dragons == 3){
			System.out.println(" You decided to run away. The dragons lay seige on the village and the people in your home town shun you.");
			System.out.println(" ##### GAME OVER #####");
			System.exit(0);
			
		}		
	}	
}