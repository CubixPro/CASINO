import java.util.*;
class CASINO
{
    void input()
    {
        int high=0;
        String name2 ="";
        String name = "player_1";
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while(true)
        {
            int life  =3;
            int c1 = 1;
            int mon = 0;
            System.out.println("\nDo you want to enter your NAME ?");
            String chc1 = sc.next();
            chc1 = chc1.toLowerCase();
            if (chc1.equals("yes")||chc1.equals("yeah")||chc1.equals("ya")||chc1.equals("yup")||chc1.equals("yeai")||chc1.startsWith("y"))
            {
                System.out.println("Enter your name !");
                name = sc.next();
            }
            else 
            {
                name = "unknown_player";
            }
            System.out.println("\tW E L C O M E      "+"\t"+name);
            System.out.println(           " \n\n");
            System.out.println("Lives = <3 <3 <3");
            System.out.println("Level 1 Tickets:2");

            System.out.println("\nGet set go  ..... Best Of Luck ! ! ! ! ! ");

            while(life>0)

            {
                System.out.println("\nWhich level 1.level 1 = +-6 ..you get a life if you win!!!!");
                System.out.println("            2.level 2 = +-4 ..you get a 100 bucks if you win!!!!"); 
                System.out.println("            3.level 3 = +-2 ..you get a 300 bucks if you win!!!!");
                int ch = sc.nextInt();
                if((ch ==1))
                {
                    if(c1<=2)

                    {  

                        c1++;
                        int x = (int)(Math.random()*20);
                        System.out.println("\nthe computer has chosen.Choose your number-->");
                        int y = sc.nextInt() ;
                        System.out.println("\n the computer's number:"+x);
                        if(y==x)
                        {
                            System.out.println("\nyou won!!!!!and you got an exact value!!!!so you get extra 400 bucks");
                            mon+=400;
                            life+=1;
                        }
                        else if((Math.max(x,y)-Math.min(x,y))<=6)
                        {
                            System.out.println("\nyou won!!!!!you get a life!!!!!!");
                            life+=1;
                        }
                        else
                        {
                            System.out.println("\nI am sorry >_< ");life--;
                        }
                    }
                    else
                    {
                        System.out.println("\nyou used up your level 1 tickets!!!!!!");
                    }

                }
                else if(ch==2)
                {
                    int x = (int)(Math.random()*20);
                    System.out.println("\nthe computer has chosen.Choose your number-->");
                    int y = sc.nextInt();
                    System.out.println("\n the computer's number:"+x);
                    if(y==x)
                    {
                        System.out.println("\nyou won!!!!!and you got an exact value!!!!so you get extra 400 bucks");
                        mon+=500;

                    }
                    else if((Math.max(x,y)-Math.min(x,y))<=4)
                    {
                        System.out.println("\nyou won!!!!!you get 100 bucks!!!!!!");
                        mon+=100;
                    }
                    else
                    {
                        System.out.println("\nI am sorry >_< ");life--;
                    }
                }
                else if(ch == 3)
                {
                    int x = (int)(Math.random()*20);
                    System.out.println("\nthe computer has chosen.Choose your number-->");
                    int y = sc.nextInt();
                    System.out.println("\n the computer's number:"+x);
                    if(y==x)
                    {
                        System.out.println("\nyou won!!!!!and you got an exact value!!!!so you get extra 400 bucks");
                        mon+=400;
                        mon+=300;
                    }
                    else if((Math.max(x,y)-Math.min(x,y))<=2)
                    {
                        System.out.println("\nyou won!!!!!you get 300 bucks!!!!!!");
                        mon+=300;
                    }
                    else
                    {
                        System.out.println("\nI am sorry >_< ");life--;
                    }

                }
                if(life>=1)
                {
                    System.out.println("\n \n \nDo you want to view your status ?");
                    String chc = sc.next();
                    chc = chc.toLowerCase();
                    if(chc.equals("yes")||chc.equals("yeah")||chc.equals("ya")||chc.equals("yup")||chc.equals("yeai")||chc.equals("y")||chc.startsWith("y"))
                    {   
                        System.out.println("\n\nYOUR CURRENT STATUS -->");  /*this will go to the end */
                        System.out.println("name : "+name); 
                        if(life ==1)
                            System.out.println("life left : <3");
                        else if(life ==2)
                            System.out.println("life left : <3 <3");
                        else if
                        (life==3)
                            System.out.println("life left : <3 <3 <3");
                            else if(life==5)
                            {
                                System.out.println("life left : <3 <3 <3 <3 <3");
                            }
                            else if(life ==4)
                            {
                                System.out.println("life left : <3 <3 <3 <3");
                            }
                            
                                

                        System.out.println("current money : "+mon);    
                        System.out.println("level 1 tickets :"+(2-c1+1));
                        System.out.println("\n\n");
                        System.out.println("          A  D  V  A  N  C  E       \n\n ");
                    }
                    else if(chc.equals("no")||chc.equals("nope")||chc.equals("nah")||chc.equals("nay")||chc.equals("noppa")||chc.equals("n"))
                    {
                        System.out.println("           A  D  V  A  N  C  E       \n\n ");
                    }
                    else
                        System.out.println("           A  D  V  A  N  C  E       \n\n ");
                }   

                if(life==0)
                {
                    System.out.println(" \n\n               G A M E    O V E R              "); 
                    System.out.println("\nYou won : "+ mon+ " bucks");
                    String word[] = {"\nCongrats" , "Congratulations ", "Very Very Good" , " Excellent" , "Keep it Up",  "Awesome" , "Cool",   "Coolio ","Great Luck", "Fantastic", "Fabulous" , "Fantabulous" };
                    if(mon>0)
                    {
                        System.out.println( "Comments : "+word[(int)(Math.random()*word.length)]+"\n");
                    }
                    System.out.println("\n\tT H A N K   Y O U    "+ "\t"+name +"\n\n");

                }
            }

            if(mon>high)
            {
                high = mon;
                name2 = name;
            }
            System.out.println("\n HIGHSCORE-->");
            if(i==0)
            {
                name2 = name;
            }
            System.out.println("Player : "+name2);
            System.out.println("Score :"+high);

            System.out.println("\n\nWanna play again ? :D !!!!!!!!!!");
            String chc  = sc.next();
            if(chc.equals("yes")||chc.equals("yeah")||chc.equals("ya")||chc.equals("yup")||chc.equals("yeai")||chc.equals("y")||chc.startsWith("y"))

            {
                i++;
                continue;
            }
            else
            {
                break;
            }

        }

        System.out.println("\nIf you enjoyed playing please rate us out of five ->");
        double rate = sc.nextDouble();
        System.out.println("\n         Thanks Again ");

            
        System.out.println("\n\n"+(char)(169)+" Cubix Pro Enterprises Private Limited");
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
public static void main(String args[])
{
    CASINO c1 =new CASINO();
   c1.input() ;
}
}
                
            
          