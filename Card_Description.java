import java.lang.Math;
class Card_Description
{
    public static void main(String[] args)
     {
        int card = (int)(Math.random()*52);
        
        String rank="",shape="";
        if(card <13)
        {
          shape="spades";
        }
        else if(card<26)
        {
            shape="hearts";
        }
        else if(card<39)
        {
            shape="clubs";
        }
        else
        {
          shape="diamonds";
        }
 
    int num = card %13;
    switch(num)
    {
        case 0 : rank="ACE"; break;
        case 1 : rank="two"; break;
        case 2 : rank="three"; break;
        case 3 : rank="four"; break;
        case 4 : rank="five"; break;
        case 5 : rank="six"; break;
        case 6 : rank="seven"; break;
        case 7 : rank="eight"; break;
        case 8 : rank="nine"; break;
        case 9 : rank="ten"; break;
        case 10 : rank="JACK"; break;
        case 11 : rank="Queen"; break;
        case 12 : rank="KING"; break;
        default : break;
    }
   
    System.err.println(rank + " of " + shape);

}
}
