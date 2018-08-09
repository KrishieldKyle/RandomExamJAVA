
package MP1;

import java.util.*;

public class Exam {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Scanner again = new Scanner(System.in);
    
        String Question0, Question1, Question2, Question3, Question4, 
                userInput0, userInput1, userInput2, userInput3, userInput4, sub0, sub1, sub2, sub3, sub4;
        
        Question0="To use classes from any package, you have to refer to them explicitly by issuing public static void main or import them on your source file.";
        Question1="The methods included in an interface do not define a behavior, that task  is left for the classes that implement the interface.";
        Question2="In Java and many other languages, a terminal interface is easier to implement than a GUI.";
        Question3="Objects of the same type have the same class.";
        Question4="Closing curly braces denote the start of the main() method and class declaration.";
        
        userInput0 ="FALSE";userInput1 ="TRUE";userInput2 ="TRUE";userInput3 ="TRUE";userInput4 ="FALSE";
        
        sub0="F";sub1="T";sub2="T";sub3="T";sub4="F";
        
        String tryAgain=" ";
        String tryAgainAns="Y";
        String tryAgainAns2="YES";
        System.out.println("                         MACHINE PROBLEM # 1         ");
        System.out.println("");
        System.out.print("Submitted by: ");
        System.out.println("        Krishield Kyle R. Santoyo       ");
        System.out.println("                              ACT 2I-G1               ");
        System.out.println("");
        int ctr1=0, ctr2=0, ctr3=5;
        do
        {
        ctr1=0;ctr2=0;
        System.out.println("List of Question: (T)RUE or (F)ALSE-");
        System.out.println("");
        String Ans;
        int num;
                for(int a=0; a<5; a++)
                {
                String copy, copyAns, copySub;
                num = a + (int)(Math.random()*(5 - a));
                if(a==0)
                {
                switch (num) {//first switch
                case 0:
                    {
                        break;
                    }
                case 1:
                    {
                        copy = Question0;
                        Question0 = Question1;
                        Question1 = copy;
                        
                        copyAns = userInput0;
                        userInput0=userInput1;
                        userInput1 =  copyAns;
                        
                        copySub = sub0;
                        sub0=sub1;
                        sub1=copySub;
                        break;
                    }
                case 2:
                    {
                        copy = Question0;
                        Question0 = Question2;
                        Question2 = copy;
                        
                        copyAns = userInput0;
                        userInput0=userInput2;
                        userInput2 = copyAns;
                        
                        copySub = sub0;
                        sub0=sub2;
                        sub2=copySub;
                        break;
                    }
                case 3:
                    {
                        copy = Question0;
                        Question0 = Question3;
                        Question3 = copy;
                        
                        copyAns = userInput0;
                        userInput0 = userInput3;
                        userInput3 = copyAns;
                        
                        copySub = sub0;
                        sub0=sub3;
                        sub3=copySub;
                        break;
                    }
                case 4:
                    {
                        copy = Question0;
                        Question0 = Question4;
                        Question4 = copy;
                        
                        copyAns = userInput0;
                        userInput0 = userInput4;
                        userInput4 = copyAns;
                        
                        copySub = sub0;
                        sub0=sub4;
                        sub4=copySub;
                        break;
                    } //end of first set   
            }//end of switch1
            }//first IF
                else if(a==1)
                {
                    switch (num) {//second switch
                case 0:
                    {
                        copy = Question1;
                        Question1 = Question0;
                        Question0 = copy;
                        
                        copyAns = userInput1;
                        userInput1 =userInput0;
                        userInput0 =  copyAns;
                        
                        copySub = sub1;
                        sub1=sub0;
                        sub0=copySub;
                        break;
                    }
                case 1:
                    {
                        break;
                    }
                case 2:
                    {
                        copy = Question1;
                        Question1 = Question2;
                        Question2 = copy;
                        
                        copyAns = userInput1;
                        userInput1=userInput2;
                        userInput2 = copyAns;
                        
                        copySub = sub1;
                        sub1=sub2;
                        sub2=copySub;
                        break;
                    }
                case 3:
                    {
                        copy = Question1;
                        Question1 = Question3;
                        Question3 = copy;
                        
                        copyAns = userInput1;
                        userInput1 = userInput3;
                        userInput3 = copyAns;
                        
                        copySub = sub1;
                        sub1=sub3;
                        sub3=copySub;
                        break;
                    }
                case 4:
                    {
                        copy = Question1;
                        Question1 = Question4;
                        Question4 = copy;
                        
                        copyAns = userInput1;
                        userInput1 = userInput4;
                        userInput4 = copyAns;
                        
                        copySub = sub1;
                        sub1=sub4;
                        sub4=copySub;
                        break;
                    } //end of Second set   
            }//end of switch2
                }//first else if end
                else if(a==2)
                {
                    switch (num) {//third switch
                case 0:
                    {
                        copy = Question2;
                        Question2 = Question0;
                        Question0 = copy;
                        
                        copyAns = userInput2;
                        userInput2 =userInput0;
                        userInput0 =  copyAns;
                        
                        copySub = sub2;
                        sub2=sub0;
                        sub0=copySub;
                        break;
                    }
                case 1:
                    {
                        copy = Question2;
                        Question2 = Question1;
                        Question1 = copy;
                        
                        copyAns = userInput2;
                        userInput2=userInput1;
                        userInput1 = copyAns;
                        
                        copySub = sub2;
                        sub2=sub1;
                        sub1=copySub;
                        break;
                    }
                case 2:
                    {
                        break;
                    }
                case 3:
                    {
                        copy = Question2;
                        Question2 = Question3;
                        Question3 = copy;
                        
                        copyAns = userInput2;
                        userInput2 = userInput3;
                        userInput3 = copyAns;
                        
                        copySub = sub2;
                        sub2=sub3;
                        sub3=copySub;
                        break;
                    }
                case 4:
                    {
                        copy = Question2;
                        Question2 = Question4;
                        Question4 = copy;
                        
                        copyAns = userInput2;
                        userInput2 = userInput4;
                        userInput4 = copyAns;
                        
                        copySub = sub2;
                        sub2=sub4;
                        sub4=copySub;
                        break;
                    } //end of 3rd set   
            }//end of switch3
                }//third else if end
                else if(a==3)
                {
                    switch (num) {//third switch
                case 0:
                    {
                        copy = Question3;
                        Question3 = Question0;
                        Question0 = copy;
                        
                        copyAns = userInput3;
                        userInput3 =userInput0;
                        userInput0 =  copyAns;
                        
                        copySub = sub3;
                        sub3=sub0;
                        sub0=copySub;
                        break;
                    }
                case 1:
                    {
                        copy = Question3;
                        Question3 = Question1;
                        Question1 = copy;
                        
                        copyAns = userInput3;
                        userInput3=userInput1;
                        userInput1 = copyAns;
                        
                        copySub = sub3;
                        sub3=sub1;
                        sub1=copySub;
                        break;
                    }
                case 2:
                    {
                        copy = Question3;
                        Question3 = Question2;
                        Question2 = copy;
                        
                        copyAns = userInput3;
                        userInput3=userInput2;
                        userInput2 = copyAns;
                        
                        copySub = sub3;
                        sub3=sub2;
                        sub2=copySub;
                        break;
                    }
                case 3:
                    {
                        break;
                    }
                case 4:
                    {
                        copy = Question3;
                        Question3 = Question4;
                        Question4 = copy;
                        
                        copyAns = userInput3;
                        userInput3 = userInput4;
                        userInput4 = copyAns;
                        
                        copySub = sub3;
                        sub3=sub4;
                        sub4=copySub;
                        break;
                    } //end of 4th set   
            }//end of switch4
                }//4th else if end
                else if(a==4)
                {
                    switch (num) {//third switch
                case 0:
                    {
                        copy = Question4;
                        Question4 = Question0;
                        Question0 = copy;
                        
                        copyAns = userInput4;
                        userInput4 =userInput0;
                        userInput0 =  copyAns;
                        
                        copySub = sub4;
                        sub4=sub0;
                        sub0=copySub;
                        break;
                    }
                case 1:
                    {
                        copy = Question4;
                        Question4 = Question1;
                        Question1 = copy;
                        
                        copyAns = userInput4;
                        userInput4=userInput1;
                        userInput1 = copyAns;
                        
                        copySub = sub4;
                        sub4=sub1;
                        sub1=copySub;
                        break;
                    }
                case 2:
                    {
                        copy = Question4;
                        Question4 = Question2;
                        Question2 = copy;
                        
                        copyAns = userInput4;
                        userInput4=userInput2;
                        userInput2 = copyAns;
                        
                        copySub = sub4;
                        sub4=sub2;
                        sub2=copySub;
                        break;
                    }
                case 3:
                    {
                        copy = Question4;
                        Question4 = Question3;
                        Question3 = copy;
                        
                        copyAns = userInput4;
                        userInput4 = userInput3;
                        userInput3 = copyAns;
                        
                        copySub = sub4;
                        sub4=sub3;
                        sub3=copySub;
                        break;
                    }
                case 4:
                    {
                        break;
                    } //end of 5ft set   
            }//end of switch5
                }//5ft else if end
            }//for loop
                tryAgain=" ";
            System.out.println("1. "+Question0);
            System.out.print("Answer: ");
            Ans = scan.nextLine();
            if(Ans.equalsIgnoreCase(userInput0) || Ans.equalsIgnoreCase(sub0))
            {
                ctr1++;
            }
            else
            {
                ctr2++;
            }
            System.out.println("2. "+Question1);
            System.out.print("Answer: ");
            Ans = scan.nextLine();
            if(Ans.equalsIgnoreCase(userInput1) || Ans.equalsIgnoreCase(sub1))
            {
                ctr1++;
            }
            else
            {
                ctr2++;
            }
            System.out.println("3. "+Question2);
            System.out.print("Answer: ");
            Ans = scan.nextLine();
            if(Ans.equalsIgnoreCase(userInput2) || Ans.equalsIgnoreCase(sub2))
            {
                ctr1++;
            }
            else
            {
                ctr2++;
            }
            if(ctr2==3)
            {
                System.out.println("");
                System.out.println("...YOUR SCORE...");
                System.out.println("Number of Correct Answer(s): "+ ctr1);
                System.out.println("Number of Wrong Answer(s): "+ ctr2);
                ctr3=ctr3-ctr2-ctr1;
                System.out.println("Number of Unanswered Question(s): " +ctr3);
                System.out.println("");
                System.out.println("You already got "+ctr2+" Wrong Answer....");
                System.out.println("Exam Ended...");
                System.exit(0);
            }
            System.out.println("4. "+Question3);
            System.out.print("Answer: ");
            Ans = scan.nextLine();
            if(Ans.equalsIgnoreCase(userInput3) || Ans.equalsIgnoreCase(sub3))
            {
                ctr1++;
            }
            else
            {
                ctr2++;
            }
            if(ctr2==3)
            {
                System.out.println("");
                System.out.println("...YOUR SCORE...");
                System.out.println("Number of Correct Answer(s): "+ ctr1);
                System.out.println("Number of Wrong Answer(s): "+ ctr2);
                ctr3=ctr3-ctr2-ctr1;
                System.out.println("Number of Unanswered Question(s): " +ctr3);
                System.out.println("");
                System.out.println("You already got "+ctr2+" Wrong Answer....");
                System.out.println("Exam Ended...");
                System.exit(0);
            }
            System.out.println("5. "+Question4);
            System.out.print("Answer: ");
            Ans = scan.nextLine();
            if(Ans.equalsIgnoreCase(userInput4) || Ans.equalsIgnoreCase(sub4))
            {
                ctr1++;
            }
            else
            {
                ctr2++;
            }
            if(ctr2==3)
            {
                System.out.println("");
                System.out.println("...YOUR SCORE...");
                System.out.println("Number of Correct Answer(s): "+ ctr1);
                System.out.println("Number of Wrong Answer(s): "+ ctr2);
                ctr3=ctr3-ctr2-ctr1;
                System.out.println("Number of Unanswered Question(s): " +ctr3);
                System.out.println("");
                System.out.println("You got "+ctr2+" Wrong Answer....");
                System.out.println("Exam Ended...");
                System.exit(0);
            }
        System.out.println("");
        System.out.println("");
                if(ctr1>=3)
                 {
                System.out.println("...YOUR SCORE...");
                System.out.println("Number of Correct Answer(s): "+ ctr1);
                System.out.println("Number of Wrong Answer(s): "+ ctr2);
                System.out.println("");
                System.out.println("");
                System.out.print("Another Try? [Y/y]: ");
                tryAgain = again.next();
                tryAgain = tryAgain.toUpperCase();
                System.out.println("");
                System.out.println("");
                }
        }//do
        while(tryAgain.equals(tryAgainAns) || tryAgain.equals(tryAgainAns2));
        System.out.println("");
        System.out.println("...YOUR SCORE...");
        System.out.println("Number of Correct Answer(s): "+ ctr1);
        System.out.println("Number of Wrong Answer(s): "+ ctr2);
        System.out.println("");
        System.out.println("Thanks!....");
        System.out.println("");
        System.out.println("Exam Ended...");
        System.out.println("");
        System.out.println("");
        System.exit(0);
    }//main
    
}//class
